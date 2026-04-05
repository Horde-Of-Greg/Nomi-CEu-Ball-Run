package pre.balling

mods.gregtech.materialEvent {
        materialBuilder(32000, 'cross_linked_polyethylene')
            .ingot().liquid().polymer()
            .flags('disable_decomposition')
            .iconSet('fine')
            .components(material('plastic') * 1)
            .colorAverage()
            .fluidPipeProperties(Integer.MAX_VALUE, 13421772, true, true, true, true)
            .build()
}
