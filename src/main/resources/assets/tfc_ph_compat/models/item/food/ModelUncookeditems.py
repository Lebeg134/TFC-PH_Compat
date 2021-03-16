import json

foodlist = ["uncookedanchovypepperonipizzaitem","uncookedapplepieitem","uncookedbbqchickenpizzaitem","uncookedbiscuititem","uncookedblackberrycobbleritem","uncookedblueberrymuffinitem","uncookedblueberrypieitem","uncookedbriochebunitem","uncookedbuttercookieitem","uncookedbuttertartitem","uncookedcaramelcupcakeitem","uncookedcarrotcupcakeitem","uncookedchaoscookieitem","uncookedcherrypieitem","uncookedchickenpotpieitem","uncookedchilicupcakeitem","uncookedchocolatecupcakeitem","uncookedcinnamonbreaditem","uncookedcinnamonrollitem","uncookedcoffeecupcakeitem","uncookedcottagepieitem","uncookedcrackeritem","uncookedcrackersitem","uncookedcroissantitem","uncookeddamperitem","uncookedeggtartitem","uncookedfruitcrumbleitem","uncookedgarlicchickenitem","uncookedgingerbreaditem","uncookedgingersnapsitem","uncookedgooseberrypieitem","uncookedhoneybunitem","uncookedhoneylemonlambitem","uncookedhoneysoyribsitem","uncookedlambwithmintsauceitem","uncookedlemonchickenitem","uncookedlemoncupcakeitem","uncookedmeatpieitem","uncookedmincepieitem","uncookedmintcupcakeitem","uncookedmochicakeitem","uncookedorangeduckitem","uncookedpeaandhamsoupitem","uncookedpeanutbuttercookiesitem","uncookedpeanutbuttercupcakeitem","uncookedpekingduckitem","uncookedpizzaitem","uncookedpumpkinbreaditem","uncookedpumpkinmuffinitem","uncookedpumpkinoatsconesitem","uncookedpumpkinpieitem","uncookedrainbowcurryitem","uncookedraspberrypieitem","uncookedredvelvetcupcakeitem","uncookedricecakeitem","uncookedrivermudcakeitem","uncookedroastchickenitem","uncookedroastpotatoesitem","uncookedsalisburysteakitem","uncookedshepardspieitem","uncookedsoftpretzelitem","uncookedspinachpieitem","uncookedsprinklescupcakeitem","uncookedstrawberrycupcakeitem","uncookedstrawberrypieitem","uncookedstuffedduckitem","uncookedsugarcookieitem","uncookedsunflowerwheatrollsitem","uncookedsweetpotatopieitem","uncookedtimpanoitem","uncookedtiropitaitem","uncookedtoastitem","uncookedtomatoherbchickenitem","uncookedvanillacupcakeitem"]

for currentfood in foodlist:
    item = {
    "parent": "item/generated",
    "textures": {
        "layer0": "tfc_ph_compat:items/food/token"
    }
    }
    item["textures"]["layer0"]=item["textures"]["layer0"].replace("token",currentfood)
     
    with open(currentfood+'.json', 'w') as outfile:
        json.dump(item, outfile)
