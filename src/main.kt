fun main() {
var product=getProduct(arrayOf(1,2,3,4))
    println(product)
    var Numbers= getSum(arrayOf(5.0,8.15F,7.667F,"Esther",9))
    println(Numbers)
    var addInteger=getArrays(arrayOf('a','e','b','c','o','e','u'))
    println(addInteger)
}
fun getProduct(numbers:Array<Int>):Int{
    var Product=1
    numbers.forEach { num->
        Product*=num

    }
return Product
}
fun getSum(nums:Array<Any>):Double {
    var Sum = 0.0
    nums.forEach { num ->
        if (num is Float || num is Double)
            Sum+=num.toString().toDouble()
    }
          return Sum
}
fun getArrays(vowels:Array<Char>):Int{
    var jina=0
    vowels.forEach { vowel->
        if (vowel=='a'|| vowel=='e'|| vowel=='i'|| vowel=='o'|| vowel=='u'){
        jina++

    }
   return jina
}
