package post.balling.zbgt

import static gregtech.api.GTValues.*
import static post.classes.Common.*

mods.jei.category.with {
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
    metaitem('zbgt:large_alloy_smelter'),
    item('zbgt:misc_casing'),
    item('zbgt:misc_casing', 6),
    item('zbgt:misc_casing', 7),
    item('zbgt:yottank_cell'),
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
    metaitem('zbgt:coolant_cell.60k'),
    metaitem('zbgt:gregtech_computer_cube'),
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
    metaitem('zbgt:wrapped.circuit_board.wetware'),
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
    metaitem('zbgt:precise_assembler'),
    metaitem('zbgt:gg_circuit_1'),
    item('zbgt:yottank_cell', 1),
    item('zbgt:yottank_cell', 2),
    item('zbgt:misc_casing', 8),
    item('zbgt:precise_casing'),
    item('zbgt:precise_casing', 1),
    item('zbgt:precise_casing', 2),
    item('zbgt:precise_casing', 3),
    item('zbgt:precise_casing', 4),
]

var assemblyLineItemsToNuke = [
    metaitem('zbgt:cal'),
    metaitem('zbgt:energy_infuser'),
    item('zbgt:misc_casing', 9),
    item('zbgt:misc_casing', 10),
    item('zbgt:yottank_cell', 3),
]

var engraverItemsToNuke = [
    metaitem('zbgt:engraved_gold_chip'),
    metaitem('zbgt:engraved_diamond_chip'),
    metaitem('zbgt:engraved_energy_chip'),
    metaitem('zbgt:engraved_manyullyn_chip'),
]

var extruderItemsToNuke = [
    metaitem('zbgt:special_ceramics_plate'),
]

var cannerItemsToNuke = [
    metaitem('zbgt:coolant_cell.360k.nak'),
    metaitem('zbgt:coolant_cell.360k.he'),
]

var justHide = [
    metaitem('zbgt:gg_circuit_2'),
    metaitem('zbgt:gg_circuit_3'),
    metaitem('zbgt:gg_circuit_4'),
    metaitem('zbgt:gg_circuit_5'),
    metaitem('zbgt:micro_heater'),
    metaitem('zbgt:quartz_crystal_resonator'),
    item('zbgt:misc_casing', 4),
    item('zbgt:misc_casing', 5),
]

for (var item: craftingItemsToNuke) {
    mods.jei.ingredient.removeAndHide(item)
}

for (var item: assemblerItemsToNuke) {
    mods.jei.ingredient.hide(item)
    mods.gregtech.assembler.removeByOutput([item], null)
}

for (var item: assemblyLineItemsToNuke) {
    mods.jei.ingredient.hide(item)
    mods.gregtech.assembly_line.removeByOutput([item], null)
}

for (var item: engraverItemsToNuke) {
    mods.jei.ingredient.hide(item)
    mods.gregtech.laser_engraver.removeByOutput([item], null)
}

for (var item: extruderItemsToNuke) {
    mods.jei.ingredient.hide(item)
    mods.gregtech.extruder.removeByOutput([item], null)
}

for (var item: cannerItemsToNuke) {
    mods.jei.ingredient.hide(item)
    mods.gregtech.canner.removeByOutput([item], null)
}

for (var item: justHide) {
    mods.jei.ingredient.hide(item)
}

// Misc recipes
mods.jei.ingredient.hide(metaitem('zbgt:quartz_wafer'))
mods.gregtech.autoclave.removeByInput(
    30, [metaitem('plateQuartzite'), metaitem('dustSodium') * 4], [fluid('distilled_water') * 1000 * 1000]
)
mods.gregtech.autoclave.removeByInput(
    30, [metaitem('plateQuartzite'), metaitem('dustSodium') * 4], [fluid('water') * 1000 * 1000]
)
