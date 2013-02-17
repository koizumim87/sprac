package jp.co.partin.sprac

package bobsrockets {
  package navigation {
    class Navigator {
      // bobsrockets.navigation
      val map = new StarMap

    }
    class StarMap
  }
  class Ship {
    val nav = new navigation.Navigator
  }
}