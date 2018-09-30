class BitInsertion {

  def insertNIntoM(n: Int, m: Int, i: Int, j: Int) = {
    //1. clear bits j through i in n
    val left = ~0 << (j+1) //1s before position j then 0s
    println((~0 << (j+1)).toBinaryString) //11111111111111111111111110000000
    println((1 << (j+1)).toBinaryString) //10000000
    val right = (1 << i) - 1 //1s after position i
    println(((1 << i) - 1).toBinaryString) //00000000000000000000000000000011
    val mask = left|right //all 1s except for 0s between i and j
    println((left|right).toBinaryString) //11111111111111111111111110000011

    //2. shift m so that it lines up
    val shiftedM = m << i

    //3. merge m and n
    (n & mask)|(shiftedM)
  }
}