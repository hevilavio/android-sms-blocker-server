package net.hevilavio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by hevilavio on 10/6/15.
 */
@Entity
public class Sms {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName; // usuario que recebeu a msg
    private String fromNumber; // numero que enviou
    private String body; // conteudo da mensagem

    public Sms() {
    }

    public Sms(String userName, String fromNumber, String body) {
        this.userName = userName;
        this.fromNumber = fromNumber;
        this.body = body;
    }

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getFromNumber() {
        return fromNumber;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sms{");
        sb.append("id=").append(id);
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", fromNumber='").append(fromNumber).append('\'');
        sb.append(", body='").append(body).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
