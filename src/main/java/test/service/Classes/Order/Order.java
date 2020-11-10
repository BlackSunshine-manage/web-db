package test.service.Classes.Order;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ORDERS_IN_APP")

public class Order {

    @Column(name = "ORDERER_NAME", length = 50, nullable = false)
    private String orderName;

    @Column(name = "ORDERER_ADDRESS", length = 50, nullable = false)
    private String orderAddress;

    @Column(name = "SUMM", nullable = false)
    private BigDecimal sumOrder;

    @Column(name = "ORDER_DATE", nullable = false)
    private Date data;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<DetailOrder> detailsOrder;


    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }


    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }


    public BigDecimal getSumOrder() {
        return sumOrder;
    }

    public void setSumOrder(BigDecimal sumOrder) {
        this.sumOrder = sumOrder;
    }


    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }


    public List<DetailOrder> getDetailsOrder() {
        return detailsOrder;
    }

    public void setDetailsOrder(List<DetailOrder> detailsOrder) {
        this.detailsOrder = detailsOrder;
    }


    public long getId() {
        return id;
    }
}
