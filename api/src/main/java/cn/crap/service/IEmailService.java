package cn.crap.service;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;

import cn.crap.dto.MailBean;

public interface IEmailService {

    void sendMail(MailBean mailBean) throws UnsupportedEncodingException, MessagingException;

    void sendRegisterEmail(String email, String id, String emailPasswd) throws UnsupportedEncodingException, MessagingException;

    void sendFindPwdEmail(String email) throws UnsupportedEncodingException, MessagingException;

    boolean sendMail(String subject, String toEmail, String context);

}
