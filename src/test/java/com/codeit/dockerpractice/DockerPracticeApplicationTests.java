package com.codeit.dockerpractice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// S3 설정은 실행할 때 환경 변수(AWS_REGION 등)로 넣습니다. 테스트에서는 실제 AWS에 접속하지 않으므로 임시 값을 넣어 컨텍스트만 확인합니다.
@SpringBootTest(properties = {"aws.region=ap-northeast-2", "aws.credentials.access-key=test", "aws.credentials.secret-key=test", "aws.s3.bucket=test-bucket"})
class DockerPracticeApplicationTests {

    @Test
    void contextLoads() {
    }

}
