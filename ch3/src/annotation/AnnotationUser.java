package annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
//=@Component（“annotationUser”）,annotationUser是Bean的id
public class AnnotationUser {
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Value("chenheng")//只注入简单的值
    private String uname;

}
