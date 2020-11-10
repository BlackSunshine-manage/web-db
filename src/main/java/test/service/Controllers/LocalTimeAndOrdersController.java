package test.service.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import test.service.Classes.LocalTimeService.LocalTimeService;
import test.service.Classes.Order.Order;
import test.service.Repository.OrderRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Controller for 2 service:
 * @see LocalTimeService
 * and connect to database
 * */
@Controller
public class LocalTimeAndOrdersController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private LocalTimeService localTimeService;

    @RequestMapping(value = "/red", method = RequestMethod.GET)
    public String test(Model model) {

        List<Order> orders = new ArrayList<>();
        Iterator<Order> orderIterator = orderRepository.findAll().iterator();
        while (orderIterator.hasNext()) {
            orders.add(orderIterator.next());
        }

        model.addAttribute("orders", orders);

        model.addAttribute("local_time", localTimeService.getNowDate());

        return "orders_and_details_page";
    }
}
