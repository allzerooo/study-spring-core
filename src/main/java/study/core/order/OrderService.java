package study.core.order;

// 주문 서비스 역할
public interface OrderService {

    /**
     * 주문 생성
     * @param memberId 회원 ID
     * @param itemName 상품명
     * @param itemPrice 상품 가격
     * @return 주문 결과
     */
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
