def list = [1, 2, 3]
def newList = list.collect{it}
newList.eachWithIndex { item, index ->
    println "Item: $item, Index: $index"
}

println newList

println list