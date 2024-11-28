package groovy

static void main(String[] args) {

  def list = [1, 3, 4, 5, 1, 5, 4]
  def elementCount = countElements(list)
  println elementCount
}

static Map countElements(List list) {
  def elementCount = [:]
  list.each { element ->
    elementCount[element] = elementCount.getOrDefault(element, 0) + 1
  }
  return elementCount
}