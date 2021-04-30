package hello.core.order;

public interface OrderService {
    //주문 요청(회원 아이디, 상품 이름, 상품 가격)
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
