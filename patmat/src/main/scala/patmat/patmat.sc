package patmat

import Huffman._

object patmat {
  val ct = createCodeTree("hola".toList)          //> ct  : patmat.Huffman.CodeTree = Fork(Fork(Fork(Leaf(h,1),Leaf(a,1),List(h, a)
                                                  //| ,2),Leaf(l,1),List(h, a, l),3),Leaf(o,1),List(h, a, l, o),4)
  val ct2 = createCodeTree("mundo".toList)        //> ct2  : patmat.Huffman.CodeTree = Fork(Fork(Fork(Fork(Leaf(n,1),Leaf(d,1),Lis
                                                  //| t(n, d),2),Leaf(m,1),List(n, d, m),3),Leaf(u,1),List(n, d, m, u),4),Leaf(o,1
                                                  //| ),List(n, d, m, u, o),5)
  def quickEncode(tree: CodeTree)(text: List[Char]): List[Bit] = {
    val ct = convert(tree).toMap
    text.map(x => ct(x)).flatten
  }                                               //> quickEncode: (tree: patmat.Huffman.CodeTree)(text: List[Char])List[patmat.Hu
                                                  //| ffman.Bit]
  quickEncode(ct)("hola".toList)                  //> res0: List[patmat.Huffman.Bit] = List(0, 0, 0, 1, 0, 1, 0, 0, 1)
}