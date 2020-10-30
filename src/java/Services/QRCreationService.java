/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Philip
 */
public class QRCreationService {
    public void createQR(int id, String data){
        try {
            String qrCodeData = "tikee.com";
//            String filepath = "D:\\New folder\\tikeeqr.png";
            String filepath = "QRs\\tikeeqr.png";
            String charset = "UTF-8";
            Map <EncodeHintType, ErrorCorrectionLevel> hintMap = new HashMap <EncodeHintType, ErrorCorrectionLevel>();
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            BitMatrix matrix = new MultiFormatWriter().encode(
                    new String(qrCodeData.getBytes(charset), charset),
                    BarcodeFormat.QR_CODE, 200, 200, hintMap);
            MatrixToImageWriter.writeToFile(matrix, filepath.substring(filepath
                    .lastIndexOf('.')+1), new File(filepath));
            System.out.println("QR code image created successfully");
        } catch (WriterException | IOException e) {
            System.err.println(e);
        }
    }
}
