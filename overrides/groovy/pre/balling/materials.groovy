mods.gregtech.materialEvent {
        materialBuilder(32000, 'cross_linked_polyethylene')
            .ingot().liquid().polymer()
            .flags('disable_decomposition')
            .iconSet('fine')
            .components(material('polyethylene') * 1)
            .colorAverage()
            .fluidPipeProperties(Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, true, true)
            .build()
}
