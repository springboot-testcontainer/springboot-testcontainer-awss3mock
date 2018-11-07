package com.avides.springboot.testcontainer.awss3mock;

import org.springframework.boot.context.properties.ConfigurationProperties;

import com.avides.springboot.testcontainer.common.container.AbstractEmbeddedContainerProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ConfigurationProperties("embedded.container.awss3mock")
@Getter
@Setter
@ToString(callSuper = true)
public class AwsS3MockProperties extends AbstractEmbeddedContainerProperties
{
    public static final String BEAN_NAME = "embeddedAwsS3MockContainer";

    private int httpPort = 9090;

    private int httpsPort = 9191;

    private String logLevel = "ERROR";

    public AwsS3MockProperties()
    {
        setDockerImage("adobe/s3mock:2.1.0");
    }
}