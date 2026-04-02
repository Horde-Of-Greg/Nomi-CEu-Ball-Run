package post.balling

import static post.classes.Common.*

mods.jei.ingredient.removeAndHide(metaitem('power_substation'))
mods.jei.ingredient.removeAndHide(item('gregtech:metal_casing', 11)) // Palladium sub

// Capacitors
mods.jei.ingredient.removeAndHide(item('gregtech:battery_block'))

for (var meta : 0..8) {
    mods.jei.ingredient.removeAndHide(item('gregtech:battery_block', meta))
}

mods.jei.ingredient.removeAndHide(metaitem('active_transformer'))

for (var type: ['source', 'target']) {
    for (var tier: ['iv', 'luv', 'zpm', 'uv']) {
        for (var amps: ['256', '1024', '4096']) {
            mods.jei.ingredient.removeAndHide(metaitem("laser_hatch.${type}_${amps}a.${tier}"))
        }
    }
}

mods.jei.ingredient.removeAndHide(item('gregtech:laser_pipe_normal'))
