package com.knoldus

import org.scalatest._

class CurrencyConverterSpec extends FlatSpec with BeforeAndAfterAll {
  var currencyConverter: CurrencyConverter = new CurrencyConverter{}

  override def beforeAll(): Unit = {
    currencyConverter = new CurrencyConverter{}
  }

  override def afterAll(): Unit = {
    if (currencyConverter != null) {
      currencyConverter = null
    }
  }

  "Currency conversion method" should "should convert Indian Rupee (INR) to U.S. Dollar (USD)" in {
    val actualResult = currencyConverter.currencyConversion("inr", 50, "usd")
    val expectedResult = 0.7000000000000001
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Indian Rupee (INR) to European Euro (EUR)" in {
    val actualResult = currencyConverter.currencyConversion("INR", 100, "EUR")
    val expectedResult = 1.3
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Indian Rupee (INR) to Japanese Yen (JPY)" in {
    val actualResult = currencyConverter.currencyConversion("INR", 150, "JPY")
    val expectedResult = 229.5
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Indian Rupee (INR) to British Pound (GBP)" in {
    val actualResult = currencyConverter.currencyConversion("INR", 200, "GBP")
    val expectedResult = 2.1999999999999997
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Indian Rupee (INR) to Swiss Franc (CHF)" in {
    val actualResult = currencyConverter.currencyConversion("INR", 250, "CHF")
    val expectedResult = 3.5
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Indian Rupee (INR) to Canadian Dollar (CAD)" in {
    val actualResult = currencyConverter.currencyConversion("INR", 300, "CAD")
    val expectedResult = 5.7
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Indian Rupee (INR) to South African Rand (ZAR)" in {
    val actualResult = currencyConverter.currencyConversion("INR", 350, "ZAR")
    val expectedResult = 73.5
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Indian Rupee (INR) to Australian Dollar (AUD)" in {
    val actualResult = currencyConverter.currencyConversion("INR", 400, "AUD")
    val expectedResult = 8.4
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Indian Rupee (INR) to Kuwaiti Dinar (KWD)" in {
    val actualResult = currencyConverter.currencyConversion("INR", 450, "KWD")
    val expectedResult = 1.935
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert U.S. Dollar (USD) to Indian Rupee (INR)" in {
    val actualResult = currencyConverter.currencyConversion("USD", 50, "INR")
    val expectedResult = 3576.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert U.S. Dollar (USD) to European Euro (EUR)" in {
    val actualResult = currencyConverter.currencyConversion("USD", 100, "EUR")
    val expectedResult = 91.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert U.S. Dollar (USD) to Japanese Yen (JPY)" in {
    val actualResult = currencyConverter.currencyConversion("USD", 150, "JPY")
    val expectedResult = 16459.5
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert U.S. Dollar (USD) to British Pound (GBP)" in {
    val actualResult = currencyConverter.currencyConversion("USD", 200, "GBP")
    val expectedResult = 156.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert U.S. Dollar (USD) to Swiss Franc (CHF)" in {
    val actualResult = currencyConverter.currencyConversion("USD", 250, "CHF")
    val expectedResult = 245.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert U.S. Dollar (USD) to Canadian Dollar (CAD)" in {
    val actualResult = currencyConverter.currencyConversion("USD", 300, "CAD")
    val expectedResult = 399.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert U.S. Dollar (USD) to South African Rand (ZAR)" in {
    val actualResult = currencyConverter.currencyConversion("USD", 350, "ZAR")
    val expectedResult = 5278.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert U.S. Dollar (USD) to Australian Dollar (AUD)" in {
    val actualResult = currencyConverter.currencyConversion("USD", 400, "AUD")
    val expectedResult = 600.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert U.S. Dollar (USD) to Kuwaiti Dinar (KWD)" in {
    val actualResult = currencyConverter.currencyConversion("USD", 450, "KWD")
    val expectedResult = 135.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert European Euro (EUR) to U.S. Dollar (USD)" in {
    val actualResult = currencyConverter.currencyConversion("EUR", 50, "USD")
    val expectedResult = 54.50000000000001
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert European Euro (EUR) to Indian Rupee (INR)" in {
    val actualResult = currencyConverter.currencyConversion("EUR", 100, "INR")
    val expectedResult = 7828.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert European Euro (EUR) to Japanese Yen (JPY)" in {
    val actualResult = currencyConverter.currencyConversion("EUR", 150, "JPY")
    val expectedResult = 18016.5
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert European Euro (EUR) to British Pound (GBP)" in {
    val actualResult = currencyConverter.currencyConversion("EUR", 200, "GBP")
    val expectedResult = 170.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert European Euro (EUR) to Swiss Franc (CHF)" in {
    val actualResult = currencyConverter.currencyConversion("EUR", 250, "CHF")
    val expectedResult = 267.5
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert European Euro (EUR) to Canadian Dollar (CAD)" in {
    val actualResult = currencyConverter.currencyConversion("EUR", 300, "CAD")
    val expectedResult = 438.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert European Euro (EUR) to South African Rand (ZAR)" in {
    val actualResult = currencyConverter.currencyConversion("EUR", 350, "ZAR")
    val expectedResult = 5775.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert European Euro (EUR) to Australian Dollar (AUD)" in {
    val actualResult = currencyConverter.currencyConversion("EUR", 400, "AUD")
    val expectedResult = 656.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert European Euro (EUR) to Kuwaiti Dinar (KWD)" in {
    val actualResult = currencyConverter.currencyConversion("EUR", 450, "KWD")
    val expectedResult = 148.5
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Japanese Yen (JPY) to U.S. Dollar (USD)" in {
    val actualResult = currencyConverter.currencyConversion("JPY", 50, "USD")
    val expectedResult = 0.455
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Japanese Yen (JPY) to European Euro (EUR)" in {
    val actualResult = currencyConverter.currencyConversion("JPY", 100, "EUR")
    val expectedResult = 0.83
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Japanese Yen (JPY) to Indian Rupee (INR)" in {
    val actualResult = currencyConverter.currencyConversion("JPY", 150, "INR")
    val expectedResult = 97.5
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Japanese Yen (JPY) to British Pound (GBP)" in {
    val actualResult = currencyConverter.currencyConversion("JPY", 200, "GBP")
    val expectedResult = 1.4200000000000002
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Japanese Yen (JPY) to Swiss Franc (CHF)" in {
    val actualResult = currencyConverter.currencyConversion("JPY", 250, "CHF")
    val expectedResult = 2.225
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Japanese Yen (JPY) to Canadian Dollar (CAD)" in {
    val actualResult = currencyConverter.currencyConversion("JPY", 300, "CAD")
    val expectedResult = 3.6
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Japanese Yen (JPY) to South African Rand (ZAR)" in {
    val actualResult = currencyConverter.currencyConversion("JPY", 350, "ZAR")
    val expectedResult = 49.00000000000001
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Japanese Yen (JPY) to Australian Dollar (AUD)" in {
    val actualResult = currencyConverter.currencyConversion("JPY", 400, "AUD")
    val expectedResult = 5.6000000000000005
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Japanese Yen (JPY) to Kuwaiti Dinar (KWD)" in {
    val actualResult = currencyConverter.currencyConversion("JPY", 450, "KWD")
    val expectedResult = 1.26
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert British Pound (GBP) to U.S. Dollar (USD)" in {
    val actualResult = currencyConverter.currencyConversion("GBP", 50, "USD")
    val expectedResult = 64.5
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert British Pound (GBP) to European Euro (EUR)" in {
    val actualResult = currencyConverter.currencyConversion("GBP", 100, "EUR")
    val expectedResult = 118.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert British Pound (GBP) to Japanese Yen (JPY)" in {
    val actualResult = currencyConverter.currencyConversion("GBP", 150, "JPY")
    val expectedResult = 21220.5
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert British Pound (GBP) to Indian Rupee (INR)" in {
    val actualResult = currencyConverter.currencyConversion("GBP", 200, "INR")
    val expectedResult = 18440.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert British Pound (GBP) to Swiss Franc (CHF)" in {
    val actualResult = currencyConverter.currencyConversion("GBP", 250, "CHF")
    val expectedResult = 315.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert British Pound (GBP) to Canadian Dollar (CAD)" in {
    val actualResult = currencyConverter.currencyConversion("GBP", 300, "CAD")
    val expectedResult = 516.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert British Pound (GBP) to South African Rand (ZAR)" in {
    val actualResult = currencyConverter.currencyConversion("GBP", 350, "ZAR")
    val expectedResult = 6804.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert British Pound (GBP) to Australian Dollar (AUD)" in {
    val actualResult = currencyConverter.currencyConversion("GBP", 400, "AUD")
    val expectedResult = 772.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert British Pound (GBP) to Kuwaiti Dinar (KWD)" in {
    val actualResult = currencyConverter.currencyConversion("GBP", 450, "KWD")
    val expectedResult = 175.5
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Swiss Franc (CHF) to U.S. Dollar (USD)" in {
    val actualResult = currencyConverter.currencyConversion("CHF", 50, "USD")
    val expectedResult = 51.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Swiss Franc (CHF) to European Euro (EUR)" in {
    val actualResult = currencyConverter.currencyConversion("CHF", 100, "EUR")
    val expectedResult = 93.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Swiss Franc (CHF) to Japanese Yen (JPY)" in {
    val actualResult = currencyConverter.currencyConversion("CHF", 150, "JPY")
    val expectedResult = 16834.5
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Swiss Franc (CHF) to British Pound (GBP)" in {
    val actualResult = currencyConverter.currencyConversion("CHF", 200, "GBP")
    val expectedResult = 158.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Swiss Franc (CHF) to Indian Rupee (INR)" in {
    val actualResult = currencyConverter.currencyConversion("CHF", 250, "INR")
    val expectedResult = 18287.5
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Swiss Franc (CHF) to Canadian Dollar (CAD)" in {
    val actualResult = currencyConverter.currencyConversion("CHF", 300, "CAD")
    val expectedResult = 408.00000000000006
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Swiss Franc (CHF) to South African Rand (ZAR)" in {
    val actualResult = currencyConverter.currencyConversion("CHF", 350, "ZAR")
    val expectedResult = 5393.5
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Swiss Franc (CHF) to Australian Dollar (AUD)" in {
    val actualResult = currencyConverter.currencyConversion("CHF", 400, "AUD")
    val expectedResult = 612.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Swiss Franc (CHF) to Kuwaiti Dinar (KWD)" in {
    val actualResult = currencyConverter.currencyConversion("CHF", 450, "KWD")
    val expectedResult = 139.5
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Canadian Dollar (CAD) to U.S. Dollar (USD)" in {
    val actualResult = currencyConverter.currencyConversion("CAD", 50, "USD")
    val expectedResult = 37.5
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Canadian Dollar (CAD) to European Euro (EUR)" in {
    val actualResult = currencyConverter.currencyConversion("CAD", 100, "EUR")
    val expectedResult = 69.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Canadian Dollar (CAD) to Japanese Yen (JPY)" in {
    val actualResult = currencyConverter.currencyConversion("CAD", 150, "JPY")
    val expectedResult = 12366.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Canadian Dollar (CAD) to British Pound (GBP)" in {
    val actualResult = currencyConverter.currencyConversion("CAD", 200, "GBP")
    val expectedResult = 115.99999999999999
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Canadian Dollar (CAD) to Swiss Franc (CHF)" in {
    val actualResult = currencyConverter.currencyConversion("CAD", 250, "CHF")
    val expectedResult = 182.5
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Canadian Dollar (CAD) to Indian Rupee (INR)" in {
    val actualResult = currencyConverter.currencyConversion("CAD", 300, "INR")
    val expectedResult = 16118.999999999998
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Canadian Dollar (CAD) to South African Rand (ZAR)" in {
    val actualResult = currencyConverter.currencyConversion("CAD", 350, "ZAR")
    val expectedResult = 3965.5
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Canadian Dollar (CAD) to Australian Dollar (AUD)" in {
    val actualResult = currencyConverter.currencyConversion("CAD", 400, "AUD")
    val expectedResult = 451.99999999999994
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Canadian Dollar (CAD) to Kuwaiti Dinar (KWD)" in {
    val actualResult = currencyConverter.currencyConversion("CAD", 450, "KWD")
    val expectedResult = 103.5
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert South African Rand (ZAR) to U.S. Dollar (USD)" in {
    val actualResult = currencyConverter.currencyConversion("ZAR", 50, "USD")
    val expectedResult = 3.3000000000000003
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert South African Rand (ZAR) to European Euro (EUR)" in {
    val actualResult = currencyConverter.currencyConversion("ZAR", 100, "EUR")
    val expectedResult = 6.1
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert South African Rand (ZAR) to Japanese Yen (JPY)" in {
    val actualResult = currencyConverter.currencyConversion("ZAR", 150, "JPY")
    val expectedResult = 1092.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert South African Rand (ZAR) to British Pound (GBP)" in {
    val actualResult = currencyConverter.currencyConversion("ZAR", 200, "GBP")
    val expectedResult = 10.2
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert South African Rand (ZAR) to Swiss Franc (CHF)" in {
    val actualResult = currencyConverter.currencyConversion("ZAR", 250, "CHF")
    val expectedResult = 16.25
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert South African Rand (ZAR) to Canadian Dollar (CAD)" in {
    val actualResult = currencyConverter.currencyConversion("ZAR", 300, "CAD")
    val expectedResult = 26.4
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert South African Rand (ZAR) to Indian Rupee (INR)" in {
    val actualResult = currencyConverter.currencyConversion("ZAR", 350, "INR")
    val expectedResult = 1659.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert South African Rand (ZAR) to Australian Dollar (AUD)" in {
    val actualResult = currencyConverter.currencyConversion("ZAR", 400, "AUD")
    val expectedResult = 39.6
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert South African Rand (ZAR) to Kuwaiti Dinar (KWD)" in {
    val actualResult = currencyConverter.currencyConversion("ZAR", 450, "KWD")
    val expectedResult = 9.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Australian Dollar (AUD) to U.S. Dollar (USD)" in {
    val actualResult = currencyConverter.currencyConversion("AUD", 50, "USD")
    val expectedResult = 3.35
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Australian Dollar (AUD) to European Euro (EUR)" in {
    val actualResult = currencyConverter.currencyConversion("AUD", 100, "EUR")
    val expectedResult = 61.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Australian Dollar (AUD) to Japanese Yen (JPY)" in {
    val actualResult = currencyConverter.currencyConversion("AUD", 150, "JPY")
    val expectedResult = 10986.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Australian Dollar (AUD) to British Pound (GBP)" in {
    val actualResult = currencyConverter.currencyConversion("AUD", 200, "GBP")
    val expectedResult = 104.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Australian Dollar (AUD) to Swiss Franc (CHF)" in {
    val actualResult = currencyConverter.currencyConversion("AUD", 250, "CHF")
    val expectedResult = 162.5
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Australian Dollar (AUD) to Canadian Dollar (CAD)" in {
    val actualResult = currencyConverter.currencyConversion("AUD", 300, "CAD")
    val expectedResult = 267.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Australian Dollar (AUD) to South African Rand (ZAR)" in {
    val actualResult = currencyConverter.currencyConversion("AUD", 350, "ZAR")
    val expectedResult = 3521.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Australian Dollar (AUD) to Indian Rupee (INR)" in {
    val actualResult = currencyConverter.currencyConversion("AUD", 400, "INR")
    val expectedResult = 19088.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Australian Dollar (AUD) to Kuwaiti Dinar (KWD)" in {
    val actualResult = currencyConverter.currencyConversion("AUD", 450, "KWD")
    val expectedResult = 90.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Kuwaiti Dinar (KWD) to U.S. Dollar (USD)" in {
    val actualResult = currencyConverter.currencyConversion("KWD", 50, "USD")
    val expectedResult = 164.5
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Kuwaiti Dinar (KWD) to European Euro (EUR)" in {
    val actualResult = currencyConverter.currencyConversion("KWD", 100, "EUR")
    val expectedResult = 300.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Kuwaiti Dinar (KWD) to Japanese Yen (JPY)" in {
    val actualResult = currencyConverter.currencyConversion("KWD", 150, "JPY")
    val expectedResult = 54106.5
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Kuwaiti Dinar (KWD) to British Pound (GBP)" in {
    val actualResult = currencyConverter.currencyConversion("KWD", 200, "GBP")
    val expectedResult = 509.99999999999994
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Kuwaiti Dinar (KWD) to Swiss Franc (CHF)" in {
    val actualResult = currencyConverter.currencyConversion("KWD", 250, "CHF")
    val expectedResult = 802.5
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Kuwaiti Dinar (KWD) to Canadian Dollar (CAD)" in {
    val actualResult = currencyConverter.currencyConversion("KWD", 300, "CAD")
    val expectedResult = 1311.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Kuwaiti Dinar (KWD) to South African Rand (ZAR)" in {
    val actualResult = currencyConverter.currencyConversion("KWD", 350, "ZAR")
    val expectedResult = 17346.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Kuwaiti Dinar (KWD) to Australian Dollar (AUD)" in {
    val actualResult = currencyConverter.currencyConversion("KWD", 400, "AUD")
    val expectedResult = 1972.0
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "should convert Kuwaiti Dinar (KWD) to Indian Rupee (INR)" in {
    val actualResult = currencyConverter.currencyConversion("KWD", 450, "INR")
    val expectedResult = 105790.5
    assert(expectedResult == actualResult)
  }

  "Currency conversion method" should "throw Exception when invalid currency type given" in {
    try {
      currencyConverter.currencyConversion("ABC", 50, "KWD")
    } catch {
      case ex:Exception =>
        assert(ex.getMessage == "Not a valid currency type!")
    }
  }

  "Currency conversion method" should "throw Exception when negative amount given" in {
    try {
      currencyConverter.currencyConversion("DZD", -100, "INR")
    } catch {
      case ex:Exception =>
        assert(ex.getMessage == "Amount cannot be negative!")
    }
  }

  "Currency conversion from INR method" should "throw Exception when invalid currency type given" in {
    try {
      currencyConverter.convertFromINR(150, "BCD")
    } catch {
      case ex:Exception =>
        assert(ex.getMessage == "Not a valid currency type!")
    }
  }

  "Currency conversion from USD method" should "throw Exception when invalid currency type given" in {
    try {
      currencyConverter.convertFromUSD(200, "CDE")
    } catch {
      case ex:Exception =>
        assert(ex.getMessage == "Not a valid currency type!")
    }
  }

  "Currency conversion from EUR method" should "throw Exception when invalid currency type given" in {
    try {
      currencyConverter.convertFromEUR(250, "DEF")
    } catch {
      case ex:Exception =>
        assert(ex.getMessage == "Not a valid currency type!")
    }
  }

  "Currency conversion from JPY method" should "throw Exception when invalid currency type given" in {
    try {
      currencyConverter.convertFromJPY(300, "EFG")
    } catch {
      case ex:Exception =>
        assert(ex.getMessage == "Not a valid currency type!")
    }
  }

  "Currency conversion from GBP method" should "throw Exception when invalid currency type given" in {
    try {
      currencyConverter.convertFromGBP(350, "FGH")
    } catch {
      case ex:Exception =>
        assert(ex.getMessage == "Not a valid currency type!")
    }
  }

  "Currency conversion from CHF method" should "throw Exception when invalid currency type given" in {
    try {
      currencyConverter.convertFromCHF(400, "GHI")
    } catch {
      case ex:Exception =>
        assert(ex.getMessage == "Not a valid currency type!")
    }
  }

  "Currency conversion from CAD method" should "throw Exception when invalid currency type given" in {
    try {
      currencyConverter.convertFromCAD(450, "HIJ")
    } catch {
      case ex:Exception =>
        assert(ex.getMessage == "Not a valid currency type!")
    }
  }

  "Currency conversion from ZAR method" should "throw Exception when invalid currency type given" in {
    try {
      currencyConverter.convertFromZAR(500, "IJK")
    } catch {
      case ex:Exception =>
        assert(ex.getMessage == "Not a valid currency type!")
    }
  }

  "Currency conversion from AUD method" should "throw Exception when invalid currency type given" in {
    try {
      currencyConverter.convertFromAUD(550, "JKL")
    } catch {
      case ex:Exception =>
        assert(ex.getMessage == "Not a valid currency type!")
    }
  }

  "Currency conversion from KWD method" should "throw Exception when invalid currency type given" in {
    try {
      currencyConverter.convertFromKWD(600, "KLM")
    } catch {
      case ex:Exception =>
        assert(ex.getMessage == "Not a valid currency type!")
    }
  }
}
