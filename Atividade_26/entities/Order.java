package Atividade_26.entities;

import java.sql.Date;
import Atividade_26.EntitiesEnum.OrderStatus;

public class Order {
    private int id; 
    private Date moment;
    private OrderStatus status;

    // Construtor padrão
    public Order() {
    }

    // Construtor com parâmetros
    public Order(int id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    // Método toString para exibir o status do pedido
    @Override
    public String toString() {
        return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
    }
}
