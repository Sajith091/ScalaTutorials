object Q01 extends App{
    var shift=1

    def cipherEncrypt(str:String):String={
      var res=""
      for (c<-str){
          if (!c.isLetter){res = res + c}
          else if(c.isUpper) {res=res+((((c-65+shift)%26)+65).toChar)}
          else if(c.isLower){res=res+((((c-97+shift)%26)+97).toChar)}
      }
      res
    }
    def cipherDecrypt(str:String):String={
      var res = ""
      for (c <- str) {
          if (!c.isLetter) res=res+c
          else if (c.isUpper){
            if(c-65 - shift<0)res = res + ((((c - 65 - shift)) + 91).toChar)
            else res = res + ((c- shift).toChar)
          }
          else if(c.isLower){
            if (c - 97 - shift < 0) res = res + ((((c - 97 - shift)) + 122).toChar)
            else res = res + ((c - shift).toChar)
          }
      }
      res
    }
    def cipherMethod(str:String)(Func:String):Unit={
      if(Func=="Encrypt"){
        println("Encrypted Message is  => "+'"'+cipherEncrypt(str)+'"')
      }else if (Func == "Decrypt") {
        println("Decrypted Message of  is  " +'"'+ cipherDecrypt(str)+'"')
      }
    }

    cipherMethod("1234 AbcD")("Encrypt")
    cipherMethod("1234 AbcD")("Decrypt")

  }


