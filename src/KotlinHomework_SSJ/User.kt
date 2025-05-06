package KotlinHomework_SSJ

class User(
    var name: String,
    var phone: String,
    var membershipLevel: MembershipLevel
) {

    fun getDiscountRate(): Double {
        return membershipLevel.discountRate
    }
}