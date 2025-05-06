package KotlinHomework_SSJ

enum class OrderStatus (val description : String){
    PENDING("결제 대기 중"),
    PAID("결제 완료"),
    CANCELLED("주문 취소됨")
}