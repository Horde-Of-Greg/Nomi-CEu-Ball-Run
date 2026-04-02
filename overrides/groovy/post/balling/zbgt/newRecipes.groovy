package post.balling.zbgt

import static gregtech.api.GTValues.*
import static post.classes.Common.*

import gregtech.api.items.metaitem.MetaItem
import gregtech.api.recipes.Recipe
import gregtech.api.recipes.RecipeBuilder

/* Replace Precise Ass Recipes */
mods.gregtech.assembler.recipeBuilder()
    .inputs(metaitem('maintenance_hatch_cleanroom_auto'), metaitem('blacklight') * 4, metaitem('rotorNaquadahAlloy'))
    .fluidInputs(fluid('naquadria') * 288)
    .outputs(metaitem('zbgt:sterile_cleaning_hatch'))
    .duration(15 * 20).EUt(VA[UHV])
    .buildAndRegister()

mods.gregtech.assembly_line.recipeBuilder()
    .inputs(
        item('gregtech:fusion_casing') * 3,
        ore('circuitZpm') * 4,
        metaitem('plateDenseIridium') * 2
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1152,
        fluid('mar_200') * 1152,
        fluid('chrome') * 288
    )
    .outputs(item('zbgt:misc_casing', 1))
    .stationResearch(b -> b.researchStack(item('gregtech:fusion_casing')).CWUt(16))
    .duration(45 * 20).EUt(VA[LuV])
    .buildAndRegister()

mods.gregtech.assembly_line.recipeBuilder()
    .inputs(
        item('gregtech:fusion_casing', 1) * 3,
        ore('circuitZpm') * 4,
        metaitem('plateDenseTrinaquadalloy') * 2
    )
    .fluidInputs(
        fluid('soldering_alloy') * (1152 * 2),
        fluid('artherium_sn') * 576,
        fluid('tanmolyium_beta_c') * 144
    )
    .outputs(item('zbgt:misc_casing', 2))
    .stationResearch(b -> b.researchStack(item('gregtech:fusion_casing', 1)).CWUt(32))
    .duration(45 * 20).EUt(VA[ZPM])
    .buildAndRegister()

mods.gregtech.assembly_line.recipeBuilder()
    .inputs(
        item('zbgt:misc_casing', 2),
        ore('circuitUv') * 4,
        item('nomilabs:quantumfluxedeterniumplating'),
        metaitem('quantumstar') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * (1152 * 4),
        fluid('dalisenite') * 576,
        fluid('hikarium') * 144
    )
    .outputs(item('zbgt:misc_casing', 3))
    .stationResearch(b -> b.researchStack(item('zbgt:misc_casing', 2)).CWUt(64))
    .duration(35 * 20).EUt(VA[UV])
    .buildAndRegister()
