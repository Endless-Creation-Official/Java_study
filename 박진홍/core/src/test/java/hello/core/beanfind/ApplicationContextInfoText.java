package hello.core.beanfind;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextInfoText {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("애플리케이션 빈 출력하기")
    void findApplicationBean() {

        // 스프링에 등록된 모든 빈 이름을 조회
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();


        for (String beanDefinitionName : beanDefinitionNames) {
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);

            // getRole()로 구분
            //Role ROLE_APPLICATION: 직접 등록한 애플리케이션 빈
            //Role ROLE_INFRASTRUCTURE: 스프링이 내부에서 사용하는 빈

            if (beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {

                // getBean() : 빈 이름으로 빈 객체(인스턴스) 조회
                // getBean(빈 이름, 타입)
                Object bean = ac.getBean(beanDefinitionName);
                System.out.println("name = " + beanDefinitionName + " object = " + bean);
            }

        }

    }
}
