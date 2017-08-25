import org.apache.commons.math3.fitting.{PolynomialCurveFitter, WeightedObservedPoints}

/**
  * Created by hjn on 2016/7/28.
  */
object Regression {
  def main(args: Array[String]) {
    testLeastSquareMethodFromApache
  }

  def testLeastSquareMethodFromApache() {
    val obs = new WeightedObservedPoints()
    obs.add(-3, 4)
    obs.add(-2, 2)
    obs.add(-1, 3)
    obs.add(0, 0)
    obs.add(1, -1)
    obs.add(2, -2)
    obs.add(3, -5)

    // Instantiate a third-degree polynomial fitter.
    val fitter = PolynomialCurveFitter.create(4)

    // Retrieve fitted parameters (coefficients of the polynomial function).
   val coeff = fitter.fit(obs.toList())
    for ( c <- coeff) {
      System.out.println(c)
    }
  }

}
