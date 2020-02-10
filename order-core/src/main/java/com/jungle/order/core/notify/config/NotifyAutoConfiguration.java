package com.jungle.order.core.notify.config;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.profile.DefaultProfile;
import com.jungle.order.core.notify.AliyunSmsSender;
import com.jungle.order.core.notify.NotifyService;
import com.jungle.order.core.notify.SmsSender;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(NotifyProperties.class)
public class NotifyAutoConfiguration {

    private final NotifyProperties properties;
    private final Log logger = LogFactory.getLog(NotifyAutoConfiguration.class);

    public NotifyAutoConfiguration(NotifyProperties properties) {
        this.properties = properties;
    }

    @Bean
    public NotifyService notifyService() {
        NotifyService notifyService = new NotifyService();

        /**
         * 阿里云短信服务
         */
        NotifyProperties.AliyunSms aliyunSmsConfig = properties.getAliyunsms();
        if (aliyunSmsConfig.isEnable()) {
            notifyService.setSmsSender(aliyunSmsSender());
            notifyService.setSmsTemplate(aliyunSmsConfig.getTemplate());
        }

        /*NotifyProperties.Wx wxConfig = properties.getWx();*/
        /*if (wxConfig.isEnable()) {
            notifyService.setWxTemplateSender(wxTemplateSender());
            notifyService.setWxTemplate(wxConfig.getTemplate());
        }*/
        return notifyService;
    }


    /*@Bean
    public WxTemplateSender wxTemplateSender() {
        WxTemplateSender wxTemplateSender = new WxTemplateSender();
        return wxTemplateSender;
    }*/

    /**
     * 阿里云短信服务
     * @return
     */
    @Bean
    public SmsSender aliyunSmsSender() {
        NotifyProperties.AliyunSms aliyunSmsConfig = properties.getAliyunsms();
        AliyunSmsSender smsSender = new AliyunSmsSender();
        DefaultProfile profile = DefaultProfile.getProfile(aliyunSmsConfig.getLocation(), aliyunSmsConfig.getAccessKeyId(), aliyunSmsConfig.getSecret());
        smsSender.setSender(new DefaultAcsClient(profile));
        logger.info("阿里云短信Bean注册成功");
        return smsSender;
    }
}
