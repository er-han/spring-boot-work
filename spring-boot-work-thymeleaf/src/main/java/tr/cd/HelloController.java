package tr.cd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by coskun.deniz on 09.02.2017.
 */
@Controller
public class HelloController {

  @RequestMapping("/")
  public String getIndex() {
    return "index";
  }

}
