package KotlinHomework_SSJ

enum class PaymentMethod(val processingFee: Double) {
    CREDIT_CARD(0.02),
    BANK_TRANSFER(0.01),
    POINT(0.0);

    fun calculateFee(amount: Double): Double {
        return amount * processingFee
    }

    fun description() : String {
        return when (this) {
            CREDIT_CARD -> "신용카드 결제"
            BANK_TRANSFER -> "계좌이체"
            POINT -> "포인트 결제"
        }
    }
}

