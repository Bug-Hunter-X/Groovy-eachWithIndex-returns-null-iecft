def list = [1, 2, 3]
println list.eachWithIndex { item, index ->
    println "Item: $item, Index: $index"
}

println list