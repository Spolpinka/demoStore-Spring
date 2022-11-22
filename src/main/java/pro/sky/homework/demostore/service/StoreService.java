package pro.sky.homework.demostore.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.homework.demostore.model.Order;

import javax.websocket.Session;
import java.util.ArrayList;
import java.util.List;

@Service
@Scope("prototype")
public class StoreService {
    private final List<Order> ordersList = new ArrayList<>();

    public void addOrders(Integer[] integers) {
        for (Integer i :
                integers) {
            ordersList.add(new Order(i));
        }
    }

    public List<Integer> getOrdersId() {
        List<Integer> result = new ArrayList<>();
        for (Order order : ordersList) {
            result.add(order.getId());
        }
        return result;
    }
}
