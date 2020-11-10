package test.service.Classes.Order;

import javax.persistence.*;


@Entity
@Table(name = "DETAILS_ORDER")
public class DetailOrder {

    @ManyToOne
    @JoinColumn(name = "ID_ORDER")
    private Order order;

    @Column(name = "PRODUCT_SERIAL_NUMBER", length = 100, nullable = false)
    private String productSerialNumber;

    @Column(name = "PRODUCT_NAME", length = 100, nullable = false)
    private String productName;

    @Column(name = "PRODUCT_QUANTITY", length = 100, nullable = false)
    private long productQuantity;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getProductSerialNumber() {
        return productSerialNumber;
    }

    public void setProductSerialNumber(String productSerialNumber) {
        this.productSerialNumber = productSerialNumber;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public long getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(long productQuantity) {
        this.productQuantity = productQuantity;
    }
}
