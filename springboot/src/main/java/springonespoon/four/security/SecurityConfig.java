package springonespoon.four.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.List;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
    private final JwtAuthFilter jwtAuthFilter;
    private final TokenProvider tokenProvider;
    private final String[] allowedUrls = {"/**"};

    public SecurityConfig(JwtAuthFilter jwtAuthFilter, TokenProvider tokenProvider) {
        this.jwtAuthFilter = jwtAuthFilter;
        this.tokenProvider = tokenProvider;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                //jwt를 사용하므로 해제
                .httpBasic(AbstractHttpConfigurer::disable)
                //jwt를 사용하므로 해제
                .csrf(AbstractHttpConfigurer::disable)
                //cors 함수 선언하여 설정
                .cors(cors -> corsConfigurationSource())
                //jwt를 사용하므로 해제
                .headers(AbstractHttpConfigurer::disable)
                //필터 설정하여 권한 검사
                .addFilterBefore(jwtAuthFilter, BasicAuthenticationFilter.class)
                //권한 검사할 파라미터 설정
                .authorizeHttpRequests(request ->
                        //이 파라미터는 권한 검사 안하는 곳
                        request.requestMatchers(allowedUrls).permitAll()
                        //나머지 모두 권한 검사
                                .anyRequest().authenticated())
                //jwt 사용하므로 세션 끄기
                .sessionManagement(sessionManagement ->
                        sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .apply(new JwtConfig(tokenProvider));
        return http.build();
    }

    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowCredentials(false);
        configuration.setAllowedOrigins(Arrays.asList("*", "http://localhost:8080/"));
        configuration.setAllowedOriginPatterns(List.of("*"));
        configuration.setAllowedHeaders(List.of("*"));
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS"));
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
}

