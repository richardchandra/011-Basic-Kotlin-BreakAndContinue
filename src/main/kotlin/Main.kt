fun main(args: Array<String>) {
    //Break
    var i = 0
    while(true){
        println("Break Me!")
        i++
        if(i>10){
            break
        }
    }

    //Continue
    for(i in 1..10){
        if(i%2 == 0){
            continue
        }
        println(i)
    }
}