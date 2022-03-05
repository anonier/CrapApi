package cn.crap.dto;

import lombok.Data;

@Data
public class MailBean {
    private String toEmail;
    private String subject;
    private String context;
    private String emailPasswd;

}