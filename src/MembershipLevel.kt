enum class MembershipLevel (val discountRate : Double) {
    REGULAR(0.0),
    SILVER(0.05),
    GOLD(0.1),
    VIP(0.2);

    fun getDescription() : String{
        return when(this){
            REGULAR -> "레귤러 회원 (${(discountRate * 100).toInt()}% 할인)"
            SILVER -> "실버 회원 (${(discountRate * 100).toInt()}% 할인)"
            GOLD -> "골드 회원 (${(discountRate * 100).toInt()}% 할인)"
            VIP -> "VIP 회원 (${(discountRate * 100).toInt()}% 할인)"
        }
    }
}