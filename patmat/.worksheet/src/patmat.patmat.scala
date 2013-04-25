package patmat

import Huffman._

object patmat {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(92); 
  val ct = createCodeTree("hola".toList);System.out.println("""ct  : patmat.Huffman.CodeTree = """ + $show(ct ));$skip(43); 
  val ct2 = createCodeTree("mundo".toList);System.out.println("""ct2  : patmat.Huffman.CodeTree = """ + $show(ct2 ));$skip(137); 
  def quickEncode(tree: CodeTree)(text: List[Char]): List[Bit] = {
    val ct = convert(tree).toMap
    text.map(x => ct(x)).flatten
  };System.out.println("""quickEncode: (tree: patmat.Huffman.CodeTree)(text: List[Char])List[patmat.Huffman.Bit]""");$skip(33); val res$0 = 
  quickEncode(ct)("hola".toList);System.out.println("""res0: List[patmat.Huffman.Bit] = """ + $show(res$0))}
}
