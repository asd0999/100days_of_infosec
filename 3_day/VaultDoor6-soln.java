import java.util.*;

class VaultDoor6soln {
    public static void main(String args[]) {
      byte[] myBytes = {
          0x3b, 0x65, 0x21, 0xa , 0x38, 0x0 , 0x36, 0x1d,
          0xa , 0x3d, 0x61, 0x27, 0x11, 0x66, 0x27, 0xa ,
          0x21, 0x1d, 0x61, 0x3b, 0xa , 0x2d, 0x65, 0x27,
          0xa , 0x65, 0x36, 0x66, 0x34, 0x67, 0x31, 0x30,
      };

      char[] flag = new char[32];

      for(int i=0; i<myBytes.length; i++){
        int x = myBytes[i] ^ 0x55;
        char c = (char) x;
        flag[i] = c;
      }      
      System.out.println(flag);
    }
}

//flag = picoCTF{n0t_mUcH_h4rD3r_tH4n_x0r_0c3a2de}
