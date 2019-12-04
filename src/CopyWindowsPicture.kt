import java.io.File

fun main(args: Array<String>) {

    //Windows Picture Absoluth Path
    val filePath = "C:\\Users\\Set Your Account Name\\AppData\\Local\\Packages\\Microsoft.Windows.ContentDeliveryManager_cw5n1h2txyewy\\LocalState\\Assets\\"
    //toCopy Path
    val filePathTo = "C:\\Users\\Set Your Account Name\\Pictures\\"

    File(filePath).walkTopDown().forEach {
        val fileName:String = it.toString()
        val token: List<String> =fileName.split(filePath)

        for (i in 0 until token.size){
            if (i == 0) {
                continue
            }

            println(token.get(i))
            File(fileName).copyTo(File(filePathTo.plus(token.get(i).plus(".jpg"))),false)

        }

    }


}