object ReadFileToSparkApp extends App {

  import org.apache.spark.sql.SparkSession
  val spark = SparkSession
    .builder()
    .appName("ReadFileToSparkApp")
    .master("local[*]")
    .getOrCreate()

  val df = spark
    .read
    .option("header", true)
    .option("inferSchema", true)
    .csv("/opt/spark/work-dir/stocks.csv")

  df.show()
}
