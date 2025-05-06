package KotlinHomework_SSJ

class Order (
    val user : User,
    val product: Product,
    val paymentMethod: PaymentMethod,
    val status: OrderStatus
){

    fun calculateSubtotal(): Double{
        val discountRate = user.getDiscountRate()
        val discountedPrice = product.price * (1 - discountRate)
        val fee = paymentMethod.calculateFee(discountedPrice)
        return discountedPrice + fee

    }
    val amount = calculateSubtotal()

    fun printOrderDetails(){
        println("고객정보: \n  이름: ${user.name} (${user.membershipLevel.getDescription()}), 연락처: ${user.phone}\n")
        println("주문 상품: \n  상품명: ${product.name} , 단가: ${product.price}\n")
        println("결제정보: \n  결제 방법: ${paymentMethod.description()} - 수수료 ${paymentMethod.processingFee}")
        println("  결제 상태: ${status.description}")
        println("  결제 금액: ${String.format("%,.0f", amount)} 원")
    }
}