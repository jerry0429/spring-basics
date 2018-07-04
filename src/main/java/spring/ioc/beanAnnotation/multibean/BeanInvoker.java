package main.java.spring.ioc.beanAnnotation.multibean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class BeanInvoker {

    @Autowired
    private List<BeanInterface> list;

    @Autowired
    private Map<String, BeanInterface> map;

    @Autowired
    @Qualifier("beanImplTwo")
    private BeanInterface beanInterface;

    public void say() {
        if (null != list && 0 != list.size()) {
            System.out.println("list");
            for (BeanInterface beanInterface : list) {
                System.out.println(beanInterface.getClass().getName());
            }
        } else {
            System.out.println("List<BeanInterface> list is null!!!");
        }

        System.out.println("");

        if (null != map && 0 != map.size()) {
            System.out.println("map");
            for (Map.Entry<String, BeanInterface> entry : map.entrySet()) {
                System.out.println(entry.getKey() + "    " + entry.getValue().getClass().getName());
            }
        } else {
            System.out.println("Map<String, BeanInterface> map is null!!!!!!!");
        }

        System.out.println("");

        if (null != beanInterface) {
            System.out.println("beanInterface: " + beanInterface.getClass().getName());
        } else {
            System.out.println("beanInterface is null!!!!!!!");
        }

    }
}
