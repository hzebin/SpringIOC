package cn.hzebin.demo2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bean2")
@Scope("prototype")  //多例，默认单例
public class Bean2 {

}
