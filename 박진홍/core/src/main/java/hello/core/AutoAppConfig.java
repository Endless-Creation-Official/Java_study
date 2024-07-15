package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
/*
        컴포넌트 스캔 탐색할 패키지의 시작 위치 지정
        basePackages = "hello.core",
        basePackageClasses = AppConfig.class,
*/

        // CoreApplication을 실행했을 때,

/*
        ***************************
        APPLICATION FAILED TO START
        ***************************

        Description:

        Parameter 0 of constructor in hello.core.member.MemberServiceImpl required a single bean, but 2 were found:
        - memoryMemberRepository: defined in file [/Users/parkjinhong/Documents/GitHub/EC_Java_study/박진홍/core/out/production/classes/hello/core/member/MemoryMemberRepository.class]
        - memberRepository: defined by method 'memberRepository' in class path resource [hello/core/AppConfig.class]

        This may be due to missing parameter name information
*/

        // 이런 오류가 뜨는데 왜 그런건지? 분명히 아래에서 Filter로 Configuration 제외시켰는데?
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,
                classes = Configuration.class)
        // excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = AppConfig.class)
)
public class AutoAppConfig {

/*    @Bean(name = "MemoryMemberRepository")
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }*/
}
