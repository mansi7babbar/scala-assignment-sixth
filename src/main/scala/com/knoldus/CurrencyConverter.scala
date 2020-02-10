package com.knoldus

/**
 * trait CurrencyConverter allows code to convert amount given in one type of currency to another type of currency.
 */

trait CurrencyConverter {

  /**
   * converts amount given in one type of currency to another type of currency.
   * @param inputCurrencyType type of currency in which amount is given
   * @param inputCurrency amount which is to be converted into another type of currency
   * @param outputCurrencyType type of currency in which amount is required
   * @return amount in the required form of currency
   */

  def currencyConversion(inputCurrencyType: String, inputCurrency: Double, outputCurrencyType: String): Double = {
    if (inputCurrency < 0) {
      throw new Exception("Amount cannot be negative!")
    }
    else {
      inputCurrencyType.toUpperCase match {
        case "INR" => convertFromINR(inputCurrency, outputCurrencyType)

        case "USD" => convertFromUSD(inputCurrency, outputCurrencyType)

        case "EUR" => convertFromEUR(inputCurrency, outputCurrencyType)

        case "JPY" => convertFromJPY(inputCurrency, outputCurrencyType)

        case "GBP" => convertFromGBP(inputCurrency, outputCurrencyType)

        case _ => currencyConversionPrivate(inputCurrencyType, inputCurrency, outputCurrencyType)
      }
    }
  }

  private def currencyConversionPrivate(inputCurrencyType: String, inputCurrency: Double, outputCurrencyType: String): Double = {
    inputCurrencyType.toUpperCase match {
      case "CHF" => convertFromCHF(inputCurrency, outputCurrencyType)

      case "CAD" => convertFromCAD(inputCurrency, outputCurrencyType)

      case "ZAR" => convertFromZAR(inputCurrency, outputCurrencyType)

      case "AUD" => convertFromAUD(inputCurrency, outputCurrencyType)

      case "KWD" => convertFromKWD(inputCurrency, outputCurrencyType)

      case _ => throw new Exception("Not a valid currency type!")
    }
  }

  /**
   * converts amount given in Indian Rupee (INR) to another type of currency.
   * @param inputCurrency amount which is to be converted into another type of currency
   * @param outputCurrencyType type of currency in which amount is required
   * @return amount in the required form of currency
   */

  def convertFromINR(inputCurrency: Double, outputCurrencyType: String): Double = {
    outputCurrencyType.toUpperCase match {
      case "USD" => inputCurrency * 0.014
      case "EUR" => inputCurrency * 0.013
      case "JPY" => inputCurrency * 1.53
      case "GBP" => inputCurrency * 0.011
      case "CHF" => inputCurrency * 0.014
      case _ => convertFromINRPrivate(inputCurrency, outputCurrencyType)
    }
  }

  private def convertFromINRPrivate(inputCurrency: Double, outputCurrencyType: String): Double = {
    outputCurrencyType.toUpperCase match {
      case "CAD" => inputCurrency * 0.019
      case "ZAR" => inputCurrency * 0.21
      case "AUD" => inputCurrency * 0.021
      case "KWD" => inputCurrency * 0.0043
      case _ => throw new Exception("Not a valid currency type!")
    }
  }

  /**
   * converts amount given in U.S. Dollar (USD) to another type of currency.
   * @param inputCurrency amount which is to be converted into another type of currency
   * @param outputCurrencyType type of currency in which amount is required
   * @return amount in the required form of currency
   */

  def convertFromUSD(inputCurrency: Double, outputCurrencyType: String): Double = {
    outputCurrencyType.toUpperCase match {
      case "INR" => inputCurrency * 71.52
      case "EUR" => inputCurrency * 0.91
      case "JPY" => inputCurrency * 109.73
      case "GBP" => inputCurrency * 0.78
      case "CHF" => inputCurrency * 0.98
      case _ => convertFromUSDPrivate(inputCurrency, outputCurrencyType)
    }
  }

  private def convertFromUSDPrivate(inputCurrency: Double, outputCurrencyType: String): Double = {
    outputCurrencyType.toUpperCase match {
      case "CAD" => inputCurrency * 1.33
      case "ZAR" => inputCurrency * 15.08
      case "AUD" => inputCurrency * 1.50
      case "KWD" => inputCurrency * 0.30
      case _ => throw new Exception("Not a valid currency type!")
    }
  }

  /**
   * converts amount given in European Euro (EUR) to another type of currency.
   * @param inputCurrency amount which is to be converted into another type of currency
   * @param outputCurrencyType type of currency in which amount is required
   * @return amount in the required form of currency
   */

  def convertFromEUR(inputCurrency: Double, outputCurrencyType: String): Double = {
    outputCurrencyType.toUpperCase match {
      case "USD" => inputCurrency * 1.09
      case "INR" => inputCurrency * 78.28
      case "JPY" => inputCurrency * 120.11
      case "GBP" => inputCurrency * 0.85
      case "CHF" => inputCurrency * 1.07
      case _ => convertFromEURPrivate(inputCurrency, outputCurrencyType)
    }
  }

  private def convertFromEURPrivate(inputCurrency: Double, outputCurrencyType: String): Double = {
    outputCurrencyType.toUpperCase match {
      case "CAD" => inputCurrency * 1.46
      case "ZAR" => inputCurrency * 16.50
      case "AUD" => inputCurrency * 1.64
      case "KWD" => inputCurrency * 0.33
      case _ => throw new Exception("Not a valid currency type!")
    }
  }

  /**
   * converts amount given in Japanese Yen (JPY) to another type of currency.
   * @param inputCurrency amount which is to be converted into another type of currency
   * @param outputCurrencyType type of currency in which amount is required
   * @return amount in the required form of currency
   */

  def convertFromJPY(inputCurrency: Double, outputCurrencyType: String): Double = {
    outputCurrencyType.toUpperCase match {
      case "USD" => inputCurrency * 0.0091
      case "EUR" => inputCurrency * 0.0083
      case "INR" => inputCurrency * 0.65
      case "GBP" => inputCurrency * 0.0071
      case "CHF" => inputCurrency * 0.0089
      case _ => convertFromJPYPrivate(inputCurrency, outputCurrencyType)
    }
  }

  private def convertFromJPYPrivate(inputCurrency: Double, outputCurrencyType: String): Double = {
    outputCurrencyType.toUpperCase match {
      case "CAD" => inputCurrency * 0.012
      case "ZAR" => inputCurrency * 0.14
      case "AUD" => inputCurrency * 0.014
      case "KWD" => inputCurrency * 0.0028
      case _ => throw new Exception("Not a valid currency type!")
    }
  }

  /**
   * converts amount given in British Pound (GBP) to another type of currency.
   * @param inputCurrency amount which is to be converted into another type of currency
   * @param outputCurrencyType type of currency in which amount is required
   * @return amount in the required form of currency
   */

  def convertFromGBP(inputCurrency: Double, outputCurrencyType: String): Double = {
    outputCurrencyType.toUpperCase match {
      case "USD" => inputCurrency * 1.29
      case "EUR" => inputCurrency * 1.18
      case "JPY" => inputCurrency * 141.47
      case "INR" => inputCurrency * 92.20
      case "CHF" => inputCurrency * 1.26
      case _ => convertFromGBPPrivate(inputCurrency, outputCurrencyType)
    }
  }

  private def convertFromGBPPrivate(inputCurrency: Double, outputCurrencyType: String): Double = {
    outputCurrencyType.toUpperCase match {
      case "CAD" => inputCurrency * 1.72
      case "ZAR" => inputCurrency * 19.44
      case "AUD" => inputCurrency * 1.93
      case "KWD" => inputCurrency * 0.39
      case _ => throw new Exception("Not a valid currency type!")
    }
  }

  /**
   * converts amount given in Swiss Franc (CHF) to another type of currency.
   * @param inputCurrency amount which is to be converted into another type of currency
   * @param outputCurrencyType type of currency in which amount is required
   * @return amount in the required form of currency
   */

  def convertFromCHF(inputCurrency: Double, outputCurrencyType: String): Double = {
    outputCurrencyType.toUpperCase match {
      case "USD" => inputCurrency * 1.02
      case "EUR" => inputCurrency * 0.93
      case "JPY" => inputCurrency * 112.23
      case "GBP" => inputCurrency * 0.79
      case "INR" => inputCurrency * 73.15
      case _ => convertFromCHFPrivate(inputCurrency, outputCurrencyType)
    }
  }

  private def convertFromCHFPrivate(inputCurrency: Double, outputCurrencyType: String): Double = {
    outputCurrencyType.toUpperCase match {
      case "CAD" => inputCurrency * 1.36
      case "ZAR" => inputCurrency * 15.41
      case "AUD" => inputCurrency * 1.53
      case "KWD" => inputCurrency * 0.31
      case _ => throw new Exception("Not a valid currency type!")
    }
  }

  /**
   * converts amount given in Canadian Dollar (CAD) to another type of currency.
   * @param inputCurrency amount which is to be converted into another type of currency
   * @param outputCurrencyType type of currency in which amount is required
   * @return amount in the required form of currency
   */

  def convertFromCAD(inputCurrency: Double, outputCurrencyType: String): Double = {
    outputCurrencyType.toUpperCase match {
      case "USD" => inputCurrency * 0.75
      case "EUR" => inputCurrency * 0.69
      case "JPY" => inputCurrency * 82.44
      case "GBP" => inputCurrency * 0.58
      case "CHF" => inputCurrency * 0.73
      case _ => convertFromCADPrivate(inputCurrency, outputCurrencyType)
    }
  }

  private def convertFromCADPrivate(inputCurrency: Double, outputCurrencyType: String): Double = {
    outputCurrencyType.toUpperCase match {
      case "INR" => inputCurrency * 53.73
      case "ZAR" => inputCurrency * 11.33
      case "AUD" => inputCurrency * 1.13
      case "KWD" => inputCurrency * 0.23
      case _ => throw new Exception("Not a valid currency type!")
    }
  }

  /**
   * converts amount given in South African Rand (ZAR) to another type of currency.
   * @param inputCurrency amount which is to be converted into another type of currency
   * @param outputCurrencyType type of currency in which amount is required
   * @return amount in the required form of currency
   */

  def convertFromZAR(inputCurrency: Double, outputCurrencyType: String): Double = {
    outputCurrencyType.toUpperCase match {
      case "USD" => inputCurrency * 0.066
      case "EUR" => inputCurrency * 0.061
      case "JPY" => inputCurrency * 7.28
      case "GBP" => inputCurrency * 0.051
      case "CHF" => inputCurrency * 0.065
      case _ => convertFromZARPrivate(inputCurrency, outputCurrencyType)
    }
  }

  private def convertFromZARPrivate(inputCurrency: Double, outputCurrencyType: String): Double = {
    outputCurrencyType.toUpperCase match {
      case "CAD" => inputCurrency * 0.088
      case "INR" => inputCurrency * 4.74
      case "AUD" => inputCurrency * 0.099
      case "KWD" => inputCurrency * 0.020
      case _ => throw new Exception("Not a valid currency type!")
    }
  }

  /**
   * converts amount given in Australian Dollar (AUD) to another type of currency.
   * @param inputCurrency amount which is to be converted into another type of currency
   * @param outputCurrencyType type of currency in which amount is required
   * @return amount in the required form of currency
   */

  def convertFromAUD(inputCurrency: Double, outputCurrencyType: String): Double = {
    outputCurrencyType.toUpperCase match {
      case "USD" => inputCurrency * 0.067
      case "EUR" => inputCurrency * 0.61
      case "JPY" => inputCurrency * 73.24
      case "GBP" => inputCurrency * 0.52
      case "CHF" => inputCurrency * 0.65
      case _ => convertFromAUDPrivate(inputCurrency, outputCurrencyType)
    }
  }

  private def convertFromAUDPrivate(inputCurrency: Double, outputCurrencyType: String): Double = {
    outputCurrencyType.toUpperCase match {
      case "CAD" => inputCurrency * 0.89
      case "ZAR" => inputCurrency * 10.06
      case "INR" => inputCurrency * 47.72
      case "KWD" => inputCurrency * 0.20
      case _ => throw new Exception("Not a valid currency type!")
    }
  }

  /**
   * converts amount given in Kuwaiti Dinar (KWD) to another type of currency.
   * @param inputCurrency amount which is to be converted into another type of currency
   * @param outputCurrencyType type of currency in which amount is required
   * @return amount in the required form of currency
   */

  def convertFromKWD(inputCurrency: Double, outputCurrencyType: String): Double = {
    outputCurrencyType.toUpperCase match {
      case "USD" => inputCurrency * 3.29
      case "EUR" => inputCurrency * 3.00
      case "JPY" => inputCurrency * 360.71
      case "GBP" => inputCurrency * 2.55
      case "CHF" => inputCurrency * 3.21
      case _ => convertFromKWDPrivate(inputCurrency, outputCurrencyType)
    }
  }

  private def convertFromKWDPrivate(inputCurrency: Double, outputCurrencyType: String): Double = {
    outputCurrencyType.toUpperCase match {
      case "CAD" => inputCurrency * 4.37
      case "ZAR" => inputCurrency * 49.56
      case "AUD" => inputCurrency * 4.93
      case "INR" => inputCurrency * 235.09
      case _ => throw new Exception("Not a valid currency type!")
    }
  }
}
