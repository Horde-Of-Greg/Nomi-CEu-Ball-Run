package post.balling.zbgt

import static gregtech.api.GTValues.*
import static post.classes.Common.*

mods.jei.category.with {
    hideCategory('gregtech:molecular_transformer')
    hideCategory('gregtech:circuit_assembly_line_recipes')
    hideCategory('gregtech:precise_assembler_recipes')
}

for (var tier: ['uev', 'uiv', 'uxv', 'opv', 'max', 'max.1', 'final']) {
    var metaname = metaitem("zbgt:parallel_hatch.${tier}")
    mods.jei.ingredient.hide(metaname)
    mods.gregtech.precise_assembler_recipes.removeByOutput([metaname], null)
}

for (var tier: getVoltageNames(ULV, UHV)) {
    for (var type: ['input', 'output']) {
        var metaname = metaitem("zbgt:rf_${type}_hatch_${tier.value}")
        mods.jei.ingredient.hide(metaname)
        mods.gregtech.assembler.removeByOutput([metaname], null)
    }
    mods.jei.ingredient.hide(metaitem("zbgt:wrapped.circuit.${tier.value}"))
    mods.gregtech.assembler.removeByOutput([metaitem("zbgt:wrapped.circuit.${tier.value}")], null)
}

var craftingItemsToNuke = [
    metaitem('zbgt:pyrotheum_heating_hatch'),
    metaitem('zbgt:cryotheum_cooling_hatch'),
    metaitem('zbgt:volcanus'),
    metaitem('zbgt:cryogenic_freezer'),
    metaitem('zbgt:industrial_pbf'),
    metaitem('zbgt:yottank'),
    metaitem('zbgt:large_alloy_smelter')
]

var assemblerItemsToNuke = [
    metaitem('zbgt:yottank_me_hatch'),
    metaitem('zbgt:single_item_input_bus'),
    metaitem('zbgt:super_input_bus'),
    metaitem('zbgt:mega_ebf'),
    metaitem('zbgt:mega_vf'),
    metaitem('zbgt:mega_abs'),
    metaitem('zbgt:mega_ocu'),
    metaitem('zbgt:mega_lcr'),
    metaitem('zbgt:wrapped.smd.capacitor'),
    metaitem('zbgt:wrapped.smd.diode'),
    metaitem('zbgt:wrapped.smd.inductor'),
    metaitem('zbgt:wrapped.smd.resistor'),
    metaitem('zbgt:wrapped.smd.transistor'),
    metaitem('zbgt:wrapped.smd.advanced_capacitor'),
    metaitem('zbgt:wrapped.smd.advanced_diode'),
    metaitem('zbgt:wrapped.smd.advanced_inductor'),
    metaitem('zbgt:wrapped.smd.advanced_resistor'),
    metaitem('zbgt:wrapped.smd.advanced_transistor'),
    metaitem('zbgt:wrapped.board.coated'),
    metaitem('zbgt:wrapped.board.phenolic'),
    metaitem('zbgt:wrapped.board.plastic'),
    metaitem('zbgt:wrapped.board.epoxy'),
    metaitem('zbgt:wrapped.board.fiber_reinforced'),
    metaitem('zbgt:wrapped.board.multilayer_fiber_reinforced'),
    metaitem('zbgt:wrapped.board.wetware'),
    metaitem('zbgt:wrapped.circuit_board.basic'),
    metaitem('zbgt:wrapped.circuit_board.good'),
    metaitem('zbgt:wrapped.circuit_board.plastic'),
    metaitem('zbgt:wrapped.circuit_board.advanced'),
    metaitem('zbgt:wrapped.circuit_board.elite'),
    metaitem('zbgt:wrapped.circuit_board.extreme'),
    metaitem('zbgt:wrapped.circuit_board.master'),
    metaitem('zbgt:wrapped.chip.soc_simple'),
    metaitem('zbgt:wrapped.chip.soc'),
    metaitem('zbgt:wrapped.chip.soc_advanced'),
    metaitem('zbgt:wrapped.chip.soc_highly_advanced'),
    metaitem('zbgt:wrapped.chip.cpu'),
    metaitem('zbgt:wrapped.chip.cpu_nano'),
    metaitem('zbgt:wrapped.chip.cpu_qubit'),
    metaitem('zbgt:wrapped.chip.pic_ultra_low'),
    metaitem('zbgt:wrapped.chip.pic_low'),
    metaitem('zbgt:wrapped.chip.pic'),
    metaitem('zbgt:wrapped.chip.pic_high'),
    metaitem('zbgt:wrapped.chip.pic_ultra_high'),
    metaitem('zbgt:wrapped.chip.ram'),
    metaitem('zbgt:wrapped.chip.nor'),
    metaitem('zbgt:wrapped.chip.nand'),
    metaitem('zbgt:wrapped.chip.integrated_logic'),
    metaitem('zbgt:wrapped.misc.neuro_processor'),
    metaitem('zbgt:wrapped.misc.engraved_crystal_chip'),
    metaitem('zbgt:wrapped.misc.crystal_cpu'),
    metaitem('zbgt:wrapped.misc.crystal_soc'),
    metaitem('zbgt:precise_assembler')
]

var assemblyLineItemsToNuke = [
    metaitem('zbgt:cal'),
    metaitem('zbgt:energy_infuser'),
    metaitem('zbgt:molecular_transformer')
]

for (var metaname: craftingItemsToNuke) {
    mods.jei.ingredient.removeAndHide(metaname)
}

for (var metaname: assemblerItemsToNuke) {
    mods.jei.ingredient.hide(metaname)
    mods.gregtech.assembler.removeByOutput([metaname], null)
}

for (var metaname: assemblyLineItemsToNuke) {
    mods.jei.ingredient.hide(metaname)
    mods.gregtech.assembly_line.removeByOutput([metaname], null)
}
