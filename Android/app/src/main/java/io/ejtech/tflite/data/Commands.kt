package io.ejtech.tflite.data

import io.ejtech.tflite.data.Commands.Action.RPLFBC
import io.ejtech.tflite.data.Commands.Action.RPLRRM

object Commands {

    object Action {
        //Actions that have a number or extra commands after it
        const val RESTARTSERVER = "746"
        const val RPR = "Repair "
        const val RPRFBC = "Repair front bumper cover"
        const val RPRRBC = "Repair rear bumper cover"
        const val RPRLF = "Repair left fender"
        const val RPRRF = "Repair right fender"
        const val RPRLFW = "Repair left front wheel"
        const val RPRRFW = "Repair right front wheel"
        const val RPRLFD = "Repair left front door"
        const val RPRRFD = "Repair right front door"
        const val RPRLRD = "Repair left rear door"
        const val RPRRRD = "Repair right rear door"
        const val RPRLSLD = "Repair left side loading door"
        const val RPRRSLD = "Repair right side loading door"
        const val RPRLRM = "Repair left rocker molding"
        const val RPRRRM = "Repair right rocker molding"
        const val RPRLQP = "Repair left quarter panel"
        const val RPRRQP = "Repair right quarter panel"
        const val RPRLSP = "Repair left side panel"
        const val RPRRSP = "Repair right side panel"
        const val RPRLPP = "Repair left pickup panel"
        const val RPRRPP = "Repair right pickup panel"
        const val RPRLRW = "Repair left rear wheel"
        const val RPRRRW = "Repair right rear wheel"
        const val RPRHOOD = "Repair hood"
        const val RPRROOF = "Repair roof"
        const val RPRTRUNKLID = "Repair trunk lid"
        const val RPRLIFTGATE = "Repair lift gate"
        const val RPRBACKDOOR = "Repair back door"

        const val RNI = "R and i "

        const val RPL = "Replace "
        const val RPLFBC = "Replace front bumper cover"
        const val RPLRBC = "Replace rear bumper cover"
        const val RPLLF = "Replace left fender"
        const val RPLRF = "Replace right fender"
        const val RPLLFW = "Replace left front wheel"
        const val RPLRFW = "Replace right front wheel"
        const val RPLLFD = "Replace left front door"
        const val RPLRFD = "Replace right front door"
        const val RPLLRD = "Replace left rear door"
        const val RPLRRD = "Replace right rear door"
        const val RPLLSLD = "Replace left side loading door"
        const val RPLRSLD = "Replace right side loading door"
        const val RPLLRM = "Replace left rocker molding"
        const val RPLRRM = "Replace right rocker molding"
        const val RPLLQP = "Replace left quarter panel"
        const val RPLRQP = "Replace right quarter panel"
        const val RPLLSP = "Replace left side panel"
        const val RPLRSP = "Replace right side panel"
        const val RPLLPP = "Replace left pickup panel"
        const val RPLRPP = "Replace right pickup panel"
        const val RPLLRW = "Replace left rear wheel"
        const val RPLRRW = "Replace right rear wheel"
        const val RPLHOOD = "Replace hood"
        const val RPLROOF = "Replace roof"
        const val RPLTRUNKLID = "Replace trunk lid"
        const val RPLLIFTGATE = "Replace lift gate"
        const val RPLBACKDOOR = "Replace back door"
        const val RPLLHL = "Replace left headlamp"
        const val RPLRHL = "Replace right headlamp"
        const val RPLLTL = "Replace left tail lamp"
        const val RPLRTL = "Replace right tail lamp"

        /** USED FOR CONVERSIONS **/
        const val RPRFB = "Repair front bumper"
        const val RPRRB = "Repair rear bumper"
        const val RPRBB = "Repair back bumper"
        const val RPLFB = "Replace front bumper"
        const val RPLRB = "Replace rear bumper"
        const val RPLBB = "Replace back bumper"
        const val RPRLR = "Repair left rocker"
        const val RPRRR = "Repair right rocker"
        const val RPLLR = "Replace left rocker"
        const val RPLRR = "Replace right rocker"
        const val RPRLQ = "Repair left quarter"
        const val RPRRQ = "Repair right quarter"
        const val RPLLQ = "Replace left quarter"
        const val RPLRQ = "Replace right quarter"
        const val RPRTRUNK = "Repair trunk"
        const val RPLTRUNK = "Replace trunk"
        /** USED FOR CONVERSIONS **/

        const val BLD = "Blend "
        const val RFN = "Refinish "
        const val GGL = "Google "
        const val NL = "Note line "
        const val DEL = "Delete line "
        const val INL = "Insert line "
        const val UPL = "Update line "

        const val INNL = "Insert new line"
        const val SP = "Show parts"
        const val SE = "Show estimate"
        const val ADDPART = "Add part"
        const val CL = "Cancel"
        const val GT = "Go to "
        const val OK = "Ok"
        const val SA = "Save"
        const val SAC = "Save and close"
        const val YES = "Yes"
        const val NO = "No"
        const val NW = "New workfile"
        const val LOG = "login"
        const val OPEN = "Open workfile"
        const val PRINT = "Print"
        const val PRINTPARTSLIST = "Print parts list"

        const val NUM = "number"
        const val PND = "#"

        //All the above actions in a list used to findClosestAction
        val list = listOf(
            RESTARTSERVER, SP, SE, ADDPART, CL, GT, OK, RPR, RNI, BLD, RFN, GGL, RPL, SA, SAC, YES, NO, NW, DEL, NUM, PND, INL, INNL, LOG, OPEN, NL, UPL,
            PRINT, PRINTPARTSLIST,
            RPRFBC,
            RPRRBC,
            RPRLF,
            RPRRF,
            RPRLFW,
            RPRRFW,
            RPRLFD,
            RPRRFD,
            RPRLRD,
            RPRRRD,
            RPRLSLD,
            RPRRSLD,
            RPRLRM,
            RPRRRM,
            RPRLQP,
            RPRRQP,
            RPRLSP,
            RPRRSP,
            RPRLPP,
            RPRRPP,
            RPRLRW,
            RPRRRW,
            RPRHOOD,
            RPRROOF,
            RPRTRUNKLID,
            RPRLIFTGATE,
            RPRBACKDOOR,
            RPLFBC,
            RPLRBC,
            RPLLF,
            RPLRF,
            RPLLFD,
            RPLRFD,
            RPLLRD,
            RPLRRD,
            RPLLSLD,
            RPLRSLD,
            RPLLRM,
            RPLRRM,
            RPLLQP,
            RPLRQP,
            RPLLSP,
            RPLRSP,
            RPLLPP,
            RPLRPP,
            RPRLRW,
            RPRRRW,
            RPLHOOD,
            RPLROOF,
            RPLTRUNKLID,
            RPLLIFTGATE,
            RPLBACKDOOR,
            RPLLHL,
            RPLRHL,
            RPLLTL,
            RPLRTL,

            RPRFB, /** Conversions **/
            RPRRB,
            RPRBB,
            RPLFB,
            RPLRB,
            RPLBB,
            RPRLR,
            RPRRR,
            RPLLR,
            RPLRR,
            RPRLQ,
            RPRRQ,
            RPLLQ,
            RPLRQ,
            RPRTRUNK,
            RPLTRUNK,
        )

    }

    object Position {
        const val LT = " left"
        const val RT = " right"
    }

    object PartType {
        const val OEM = "oem"
        const val CHEAPEST = "cheapest"
    }

    object PartGroup {
        const val CONTACTS = "contacts"
        const val INSURANCE = "insurance"
        const val VEHICLE = "vehicle"
        const val ESTIMATE = "estimate"
        const val ATTACHMENTS = "attachments"
        const val MOTOR = "motor"
        const val PARTGROUPS = "part groups"
        const val PARTCODES = "part codes"
        const val WORKFILES = "workfiles"

        const val AIRCONDITIONERANDHEATER = "air conditioner and heater"
        const val BACKDOOR = "back door"
        const val BACKGLASS = "back glass"
        const val BODYSHELL = "body shell"   //merc bmw
        const val CAB = "cab"
        const val CABCREWCAB = "cab crew cab"
        const val CONSOLE = "console"
        const val CONVERTIBLE = "convertible"   //camaro corvette
        const val CONVERTIBLESOFTTOP = "convertible soft top"  //camaro corvette
        const val COOLING = "cooling"
        const val COWL = "cowl"
        const val DOOR = "door"
        const val ELECTRICAL = "electrical"
        const val EMISSIONSYSTEM = "emission system"
        const val ENGINE = "engine"
        const val ENGINELID = "engine lid"   //corvette
        const val EXHAUSTSYSTEM = "exhaust system"
        const val FENDER = "fender"
        const val FLUIDS = "fluids"
        const val FRAME = "frame"
        const val FRONTBUMPER = "front bumper"
        const val FRONTBUMPERANDGRILLE = "front bumper and grille"
        const val FRONTDOOR = "front door"
        const val FRONTLAMPS = "front lamps"
        const val FRONTPANELS = "front panels"
        const val FRONTSUSPENSION = "front suspension"
        const val FUELSYSTEM = "fuel system"
        const val GRILLE = "grille"
        const val HOOD = "hood"
        const val INFORMATIONLABELS = "information labels"
        const val INSTRUMENTPANEL = "instrument panel"
        const val LIFTGATE = "lift gate"
        const val MISCELLANEOUSOPERATIONS = "miscellaneous operations"
        const val PAINTIDENTIFICATION = "paint identification"
        const val PICKUPBOX = "pick up box"
        const val PILLARSROCKERANDFLOOR = "pillars rocker and floor"
        const val QUARTERPANEL = "quarter panel"
        const val RADIATORSUPPORT = "radiator support"
        const val REARBODY = "rear body"
        const val REARBODYANDFLOOR = "rear body and floor"
        const val REARBUMPER = "rear bumper"
        const val REARDOOR = "rear door"
        const val REARLAMPS = "rear lamps"
        const val REARSUSPENSION = "rear suspension"
        const val RECYCLEDASSEMBLIES = "recycled assemblies"
        const val REMOVABLETOP = "removable top"
        const val REMOVABLETOPHARDTOP = "removable top hard top"
        const val RESTRAINTSYSTEMS = "restraint systems"
        const val ROLLBARANDCOMPONENTS = "roll bar and components"
        const val ROOF = "roof"
        const val SEATSANDTRACKS = "seats and tracks"
        const val SIDELOADINGDOOR = "side loading door"
        const val SIDEPANEL = "side panel"
        const val SPARETIRECARRIER = "spare tire carrier"
        const val STEERINGCOLUMN = "steering column"
        const val STEERINGGEARANDLINKAGE = "steering gear and linkage"
        const val STEERINGWHEEL = "steering wheel"
        const val STRIPETAPE = "stripe tape"
        const val STRIPETAPEANDECALS = "stripe tape and decals"
        const val TAILGATE = "tail gate"
        const val TRANSMISSION = "transmission"
        const val TRUNKLID = "trunk lid"
        const val VEHICLEDIAGNOSTICS = "vehicle diagnostics"
        const val WHEELS = "wheels"
        const val WINDSHIELD = "windshield"
    }

    object Numbers {
        const val NUMBER_1 = "#1"
        const val NUMBER_2 = "#2"
        const val NUMBER_3 = "#3"
        const val NUMBER_4 = "#4"
        const val NUMBER_5 = "#5"
        const val NUMBER_6 = "#6"
        const val NUMBER_7 = "#7"
        const val NUMBER_8 = "#8"
        const val NUMBER_9 = "#9"
        const val NUMBER_10 = "#10"
        const val NUMBER_11 = "#11"
        const val NUMBER_12 = "#12"
        const val NUMBER_13 = "#13"
        const val NUMBER_14 = "#14"
        const val NUMBER_15 = "#15"
        const val NUMBER_16 = "#16"
        const val NUMBER_17 = "#17"
        const val NUMBER_18 = "#18"
        const val NUMBER_19 = "#19"
        const val NUMBER_20 = "#20"
        const val NUMBER_21 = "#21"
        const val NUMBER_22 = "#22"
        const val NUMBER_23 = "#23"
        const val NUMBER_24 = "#24"
        const val NUMBER_25 = "#25"
        const val NUMBER_26 = "#26"
        const val NUMBER_27 = "#27"
        const val NUMBER_28 = "#28"
        const val NUMBER_29 = "#29"
        const val NUMBER_30 = "#30"
        const val NUMBER_31 = "#31"
        const val NUMBER_32 = "#32"
        const val NUMBER_33 = "#33"
        const val NUMBER_34 = "#34"
        const val NUMBER_35 = "#35"
        const val NUMBER_36 = "#36"
        const val NUMBER_37 = "#37"
        const val NUMBER_38 = "#38"
        const val NUMBER_39 = "#39"
        const val NUMBER_40 = "#40"
        const val NUMBER_41 = "#41"
        const val NUMBER_42 = "#42"
        const val NUMBER_43 = "#43"
        const val NUMBER_44 = "#44"
        const val NUMBER_45 = "#45"
        const val NUMBER_46 = "#46"
        const val NUMBER_47 = "#47"
        const val NUMBER_48 = "#48"
        const val NUMBER_49 = "#49"
        const val NUMBER_50 = "#50"
        const val NUMBER_51 = "#51"
        const val NUMBER_52 = "#52"
        const val NUMBER_53 = "#53"
        const val NUMBER_54 = "#54"
        const val NUMBER_55 = "#55"
        const val NUMBER_56 = "#56"
        const val NUMBER_57 = "#57"
        const val NUMBER_58 = "#58"
        const val NUMBER_59 = "#59"
        const val NUMBER_60 = "#60"
        const val NUMBER_61 = "#61"
        const val NUMBER_62 = "#62"
        const val NUMBER_63 = "#63"
        const val NUMBER_64 = "#64"
        const val NUMBER_65 = "#65"
        const val NUMBER_66 = "#66"
        const val NUMBER_67 = "#67"
        const val NUMBER_68 = "#68"
        const val NUMBER_69 = "#69"
        const val NUMBER_70 = "#70"
        const val NUMBER_71 = "#71"
        const val NUMBER_72 = "#72"
        const val NUMBER_73 = "#73"
        const val NUMBER_74 = "#74"
        const val NUMBER_75 = "#75"
        const val NUMBER_76 = "#76"
        const val NUMBER_77 = "#77"
        const val NUMBER_78 = "#78"
        const val NUMBER_79 = "#79"
        const val NUMBER_80 = "#80"
        const val NUMBER_81 = "#81"
        const val NUMBER_82 = "#82"
        const val NUMBER_83 = "#83"
        const val NUMBER_84 = "#84"
        const val NUMBER_85 = "#85"
        const val NUMBER_86 = "#86"
        const val NUMBER_87 = "#87"
        const val NUMBER_88 = "#88"
        const val NUMBER_89 = "#89"
        const val NUMBER_90 = "#90"
        const val NUMBER_91 = "#91"
        const val NUMBER_92 = "#92"
        const val NUMBER_93 = "#93"
        const val NUMBER_94 = "#94"
        const val NUMBER_95 = "#95"
        const val NUMBER_96 = "#96"
        const val NUMBER_97 = "#97"
        const val NUMBER_98 = "#98"
        const val NUMBER_99 = "#99"
        const val NUMBER_100 = "#100"
    }

    object Labor {
        const val HALF_HR = " .5 hour"
        const val ONE_HR = " 1 hour"
        const val ONE_HALF_HR = " 1.5 hours"
        const val TWO_HR = " 2 hours"
        const val TWO_HALF_HR = " 2.5 hours"
        const val THREE_HR = " 3 hours"
        const val THREE_HALF_HR = " 3.5 hours"
        const val FOUR_HR = " 4 hours"
        const val FOUR_HALF_HR = " 4.5 hours"
        const val FIVE_HR = " 5 hours"
        const val FIVE_HALF_HR = " 5.5 hours"
        const val SIX_HR = " 6 hours"
        const val SIX_HALF_HR = " 6.5 hours"
        const val SEVEN_HR = " 7 hours"
        const val SEVEN_HALF_HR = " 7.5 hours"
        const val EIGHT_HR = " 8 hours"
        const val EIGHT_HALF_HR = " 8.5 hours"
        const val NINE_HR = " 9 hours"
        const val NINE_HALF_HR = " 9.5 hours"
        const val TEN_HR = " 10 hours"
    }

    /** Go to part groups page and to the individual part groups **/
    private const val GT_CONTACTS = Action.GT + PartGroup.CONTACTS
    private const val GT_INSURANCE = Action.GT + PartGroup.INSURANCE
    private const val GT_VEHICLE = Action.GT + PartGroup.VEHICLE
    private const val GT_ESTIMATE = Action.GT + PartGroup.ESTIMATE
    private const val GT_ATTACHMENTS = Action.GT + PartGroup.ATTACHMENTS
    private const val GT_MOTOR = Action.GT + PartGroup.MOTOR
    private const val GT_PART_GROUPS = Action.GT + PartGroup.PARTGROUPS
    private const val GT_PART_CODES = Action.GT + PartGroup.PARTCODES
    private const val GT_WORKFILES = Action.GT + PartGroup.WORKFILES

    private const val GT_AIR_CONDITIONER_AND_HEATER = Action.GT + PartGroup.AIRCONDITIONERANDHEATER
    private const val GT_BACK_DOOR = Action.GT + PartGroup.BACKDOOR
    private const val GT_BACK_GLASS = Action.GT + PartGroup.BACKGLASS
    private const val GT_BODY_SHELL = Action.GT + PartGroup.BODYSHELL
    private const val GT_CAB = Action.GT + PartGroup.CAB
    private const val GT_CAB_CREW_CAB = Action.GT + PartGroup.CABCREWCAB
    private const val GT_CONSOLE = Action.GT + PartGroup.CONSOLE
    private const val GT_CONVERTIBLE = Action.GT + PartGroup.CONVERTIBLE
    private const val GT_CONVERTIBLESOFTTOP = Action.GT + PartGroup.CONVERTIBLESOFTTOP
    private const val GT_COOLING = Action.GT + PartGroup.COOLING
    private const val GT_COWL = Action.GT + PartGroup.COWL
    private const val GT_DOOR = Action.GT + PartGroup.DOOR
    private const val GT_ELECTRICAL = Action.GT + PartGroup.ELECTRICAL
    private const val GT_EMISSION_SYSTEM = Action.GT + PartGroup.EMISSIONSYSTEM
    private const val GT_ENGINE = Action.GT + PartGroup.ENGINE
    private const val GT_ENGINELID = Action.GT + PartGroup.ENGINELID
    private const val GT_EXHAUST_SYSTEM = Action.GT + PartGroup.EXHAUSTSYSTEM
    private const val GT_FENDER = Action.GT + PartGroup.FENDER
    private const val GT_FLUIDS = Action.GT + PartGroup.FLUIDS
    private const val GT_FRAME = Action.GT + PartGroup.FRAME
    private const val GT_FRONT_BUMPER = Action.GT + PartGroup.FRONTBUMPER
    private const val GT_FRONT_BUMPER_AND_GRILLE = Action.GT + PartGroup.FRONTBUMPERANDGRILLE
    private const val GT_FRONT_DOOR = Action.GT + PartGroup.FRONTDOOR
    private const val GT_FRONT_LAMPS = Action.GT + PartGroup.FRONTLAMPS
    private const val GT_FRONT_PANELS = Action.GT + PartGroup.FRONTPANELS
    private const val GT_FRONT_SUSPENSION = Action.GT + PartGroup.FRONTSUSPENSION
    private const val GT_FUEL_SYSTEM = Action.GT + PartGroup.FUELSYSTEM
    private const val GT_GRILLE = Action.GT + PartGroup.GRILLE
    private const val GT_HOOD = Action.GT + PartGroup.HOOD
    private const val GT_INFORMATION_LABELS = Action.GT + PartGroup.INFORMATIONLABELS
    private const val GT_INSTRUMENT_PANEL = Action.GT + PartGroup.INSTRUMENTPANEL
    private const val GT_LIFT_GATE = Action.GT + PartGroup.LIFTGATE
    private const val GT_MISCELLANEOUS_OPERATIONS = Action.GT + PartGroup.MISCELLANEOUSOPERATIONS
    private const val GT_PAINT_IDENTIFICATION = Action.GT + PartGroup.PAINTIDENTIFICATION
    private const val GT_PICKUPBOX = Action.GT + PartGroup.PICKUPBOX
    private const val GT_PILLARS_ROCKER_AND_FLOOR = Action.GT + PartGroup.PILLARSROCKERANDFLOOR
    private const val GT_QUARTER_PANEL = Action.GT + PartGroup.QUARTERPANEL
    private const val GT_RADIATOR_SUPPORT = Action.GT + PartGroup.RADIATORSUPPORT
    private const val GT_REAR_BODY = Action.GT + PartGroup.REARBODY
    private const val GT_REAR_BODY_AND_FLOOR = Action.GT + PartGroup.REARBODYANDFLOOR
    private const val GT_REAR_BUMPER = Action.GT + PartGroup.REARBUMPER
    private const val GT_REAR_DOOR = Action.GT + PartGroup.REARDOOR
    private const val GT_REAR_LAMPS = Action.GT + PartGroup.REARLAMPS
    private const val GT_REAR_SUSPENSION = Action.GT + PartGroup.REARSUSPENSION
    private const val GT_RECYCLED_ASSEMBLIES = Action.GT + PartGroup.RECYCLEDASSEMBLIES
    private const val GT_REMOVABLETOP = Action.GT + PartGroup.REMOVABLETOP
    private const val GT_REMOVABLETOPHARDTOP = Action.GT + PartGroup.REMOVABLETOPHARDTOP
    private const val GT_RESTRAINT_SYSTEMS = Action.GT + PartGroup.RESTRAINTSYSTEMS
    private const val GT_ROLLBARANDCOMPONENTS = Action.GT + PartGroup.ROLLBARANDCOMPONENTS
    private const val GT_ROOF = Action.GT + PartGroup.ROOF
    private const val GT_SEATS_AND_TRACKS = Action.GT + PartGroup.SEATSANDTRACKS
    private const val GT_SIDE_LOADING_DOOR = Action.GT + PartGroup.SIDELOADINGDOOR
    private const val GT_SIDE_PANEL = Action.GT + PartGroup.SIDEPANEL
    private const val GT_SPARE_TIRE_CARRIER = Action.GT + PartGroup.SPARETIRECARRIER
    private const val GT_STEERING_COLUMN = Action.GT + PartGroup.STEERINGCOLUMN
    private const val GT_STEERING_GEAR_AND_LINKAGE = Action.GT + PartGroup.STEERINGGEARANDLINKAGE
    private const val GT_STEERING_WHEEL = Action.GT + PartGroup.STEERINGWHEEL
    private const val GT_STRIPE_TAPE = Action.GT + PartGroup.STRIPETAPE
    private const val GT_STRIPE_TAPE_AND_DECALS = Action.GT + PartGroup.STRIPETAPEANDECALS
    private const val GT_TAILGATE = Action.GT + PartGroup.TAILGATE
    private const val GT_TRANSMISSION = Action.GT + PartGroup.TRANSMISSION
    private const val GT_TRUNK_LID = Action.GT + PartGroup.TRUNKLID
    private const val GT_VEHICLE_DIAGNOSTICS = Action.GT + PartGroup.VEHICLEDIAGNOSTICS
    private const val GT_WHEELS = Action.GT + PartGroup.WHEELS
    private const val GT_WINDSHIELD = Action.GT + PartGroup.WINDSHIELD

    /** Perform repair on a given part based by diagram number **/
    private const val RPR_NUMBER_1_1HR = Action.RPR + Numbers.NUMBER_1 + Labor.ONE_HR
    private const val RPR_NUMBER_1_2HR = Action.RPR + Numbers.NUMBER_1 + Labor.TWO_HR
    private const val RPR_NUMBER_1_3HR = Action.RPR + Numbers.NUMBER_1 + Labor.THREE_HR
    private const val RPR_NUMBER_1_4HR = Action.RPR + Numbers.NUMBER_1 + Labor.FOUR_HR
    private const val RPR_NUMBER_1_5HR = Action.RPR + Numbers.NUMBER_1 + Labor.FIVE_HR
    private const val RPR_NUMBER_1_6HR = Action.RPR + Numbers.NUMBER_1 + Labor.SIX_HR
    private const val RPR_NUMBER_1_7HR = Action.RPR + Numbers.NUMBER_1 + Labor.SEVEN_HR
    private const val RPR_NUMBER_1_8HR = Action.RPR + Numbers.NUMBER_1 + Labor.EIGHT_HR
    private const val RPR_NUMBER_1_9HR = Action.RPR + Numbers.NUMBER_1 + Labor.NINE_HR
    private const val RPR_NUMBER_1_10HR = Action.RPR + Numbers.NUMBER_1 + Labor.TEN_HR
    private const val RPR_NUMBER_2_1HR = Action.RPR + Numbers.NUMBER_2 + Labor.ONE_HR
    private const val RPR_NUMBER_2_2HR = Action.RPR + Numbers.NUMBER_2 + Labor.TWO_HR
    private const val RPR_NUMBER_2_3HR = Action.RPR + Numbers.NUMBER_2 + Labor.THREE_HR
    private const val RPR_NUMBER_2_4HR = Action.RPR + Numbers.NUMBER_2 + Labor.FOUR_HR
    private const val RPR_NUMBER_2_5HR = Action.RPR + Numbers.NUMBER_2 + Labor.FIVE_HR
    private const val RPR_NUMBER_2_6HR = Action.RPR + Numbers.NUMBER_2 + Labor.SIX_HR
    private const val RPR_NUMBER_2_7HR = Action.RPR + Numbers.NUMBER_2 + Labor.SEVEN_HR
    private const val RPR_NUMBER_2_8HR = Action.RPR + Numbers.NUMBER_2 + Labor.EIGHT_HR
    private const val RPR_NUMBER_2_9HR = Action.RPR + Numbers.NUMBER_2 + Labor.NINE_HR
    private const val RPR_NUMBER_2_10HR = Action.RPR + Numbers.NUMBER_2 + Labor.TEN_HR
    private const val RPR_NUMBER_3_1HR = Action.RPR + Numbers.NUMBER_3 + Labor.ONE_HR
    private const val RPR_NUMBER_3_2HR = Action.RPR + Numbers.NUMBER_3 + Labor.TWO_HR
    private const val RPR_NUMBER_3_3HR = Action.RPR + Numbers.NUMBER_3 + Labor.THREE_HR
    private const val RPR_NUMBER_3_4HR = Action.RPR + Numbers.NUMBER_3 + Labor.FOUR_HR
    private const val RPR_NUMBER_3_5HR = Action.RPR + Numbers.NUMBER_3 + Labor.FIVE_HR
    private const val RPR_NUMBER_3_6HR = Action.RPR + Numbers.NUMBER_3 + Labor.SIX_HR
    private const val RPR_NUMBER_3_7HR = Action.RPR + Numbers.NUMBER_3 + Labor.SEVEN_HR
    private const val RPR_NUMBER_3_8HR = Action.RPR + Numbers.NUMBER_3 + Labor.EIGHT_HR
    private const val RPR_NUMBER_3_9HR = Action.RPR + Numbers.NUMBER_3 + Labor.NINE_HR
    private const val RPR_NUMBER_3_10HR = Action.RPR + Numbers.NUMBER_3 + Labor.TEN_HR
    private const val RPR_NUMBER_4_1HR = Action.RPR + Numbers.NUMBER_4 + Labor.ONE_HR
    private const val RPR_NUMBER_4_2HR = Action.RPR + Numbers.NUMBER_4 + Labor.TWO_HR
    private const val RPR_NUMBER_4_3HR = Action.RPR + Numbers.NUMBER_4 + Labor.THREE_HR
    private const val RPR_NUMBER_4_4HR = Action.RPR + Numbers.NUMBER_4 + Labor.FOUR_HR
    private const val RPR_NUMBER_4_5HR = Action.RPR + Numbers.NUMBER_4 + Labor.FIVE_HR
    private const val RPR_NUMBER_4_6HR = Action.RPR + Numbers.NUMBER_4 + Labor.SIX_HR
    private const val RPR_NUMBER_4_7HR = Action.RPR + Numbers.NUMBER_4 + Labor.SEVEN_HR
    private const val RPR_NUMBER_4_8HR = Action.RPR + Numbers.NUMBER_4 + Labor.EIGHT_HR
    private const val RPR_NUMBER_4_9HR = Action.RPR + Numbers.NUMBER_4 + Labor.NINE_HR
    private const val RPR_NUMBER_4_10HR = Action.RPR + Numbers.NUMBER_4 + Labor.TEN_HR
    private const val RPR_NUMBER_5_1HR = Action.RPR + Numbers.NUMBER_5 + Labor.ONE_HR
    private const val RPR_NUMBER_5_2HR = Action.RPR + Numbers.NUMBER_5 + Labor.TWO_HR
    private const val RPR_NUMBER_5_3HR = Action.RPR + Numbers.NUMBER_5 + Labor.THREE_HR
    private const val RPR_NUMBER_5_4HR = Action.RPR + Numbers.NUMBER_5 + Labor.FOUR_HR
    private const val RPR_NUMBER_5_5HR = Action.RPR + Numbers.NUMBER_5 + Labor.FIVE_HR
    private const val RPR_NUMBER_5_6HR = Action.RPR + Numbers.NUMBER_5 + Labor.SIX_HR
    private const val RPR_NUMBER_5_7HR = Action.RPR + Numbers.NUMBER_5 + Labor.SEVEN_HR
    private const val RPR_NUMBER_5_8HR = Action.RPR + Numbers.NUMBER_5 + Labor.EIGHT_HR
    private const val RPR_NUMBER_5_9HR = Action.RPR + Numbers.NUMBER_5 + Labor.NINE_HR
    private const val RPR_NUMBER_5_10HR = Action.RPR + Numbers.NUMBER_5 + Labor.TEN_HR
    private const val RPR_NUMBER_6_1HR = Action.RPR + Numbers.NUMBER_6 + Labor.ONE_HR
    private const val RPR_NUMBER_6_2HR = Action.RPR + Numbers.NUMBER_6 + Labor.TWO_HR
    private const val RPR_NUMBER_6_3HR = Action.RPR + Numbers.NUMBER_6 + Labor.THREE_HR
    private const val RPR_NUMBER_6_4HR = Action.RPR + Numbers.NUMBER_6 + Labor.FOUR_HR
    private const val RPR_NUMBER_6_5HR = Action.RPR + Numbers.NUMBER_6 + Labor.FIVE_HR
    private const val RPR_NUMBER_6_6HR = Action.RPR + Numbers.NUMBER_6 + Labor.SIX_HR
    private const val RPR_NUMBER_6_7HR = Action.RPR + Numbers.NUMBER_6 + Labor.SEVEN_HR
    private const val RPR_NUMBER_6_8HR = Action.RPR + Numbers.NUMBER_6 + Labor.EIGHT_HR
    private const val RPR_NUMBER_6_9HR = Action.RPR + Numbers.NUMBER_6 + Labor.NINE_HR
    private const val RPR_NUMBER_6_10HR = Action.RPR + Numbers.NUMBER_6 + Labor.TEN_HR
    private const val RPR_NUMBER_7_1HR = Action.RPR + Numbers.NUMBER_7 + Labor.ONE_HR
    private const val RPR_NUMBER_7_2HR = Action.RPR + Numbers.NUMBER_7 + Labor.TWO_HR
    private const val RPR_NUMBER_7_3HR = Action.RPR + Numbers.NUMBER_7 + Labor.THREE_HR
    private const val RPR_NUMBER_7_4HR = Action.RPR + Numbers.NUMBER_7 + Labor.FOUR_HR
    private const val RPR_NUMBER_7_5HR = Action.RPR + Numbers.NUMBER_7 + Labor.FIVE_HR
    private const val RPR_NUMBER_7_6HR = Action.RPR + Numbers.NUMBER_7 + Labor.SIX_HR
    private const val RPR_NUMBER_7_7HR = Action.RPR + Numbers.NUMBER_7 + Labor.SEVEN_HR
    private const val RPR_NUMBER_7_8HR = Action.RPR + Numbers.NUMBER_7 + Labor.EIGHT_HR
    private const val RPR_NUMBER_7_9HR = Action.RPR + Numbers.NUMBER_7 + Labor.NINE_HR
    private const val RPR_NUMBER_7_10HR = Action.RPR + Numbers.NUMBER_7 + Labor.TEN_HR
    private const val RPR_NUMBER_8_1HR = Action.RPR + Numbers.NUMBER_8 + Labor.ONE_HR
    private const val RPR_NUMBER_8_2HR = Action.RPR + Numbers.NUMBER_8 + Labor.TWO_HR
    private const val RPR_NUMBER_8_3HR = Action.RPR + Numbers.NUMBER_8 + Labor.THREE_HR
    private const val RPR_NUMBER_8_4HR = Action.RPR + Numbers.NUMBER_8 + Labor.FOUR_HR
    private const val RPR_NUMBER_8_5HR = Action.RPR + Numbers.NUMBER_8 + Labor.FIVE_HR
    private const val RPR_NUMBER_8_6HR = Action.RPR + Numbers.NUMBER_8 + Labor.SIX_HR
    private const val RPR_NUMBER_8_7HR = Action.RPR + Numbers.NUMBER_8 + Labor.SEVEN_HR
    private const val RPR_NUMBER_8_8HR = Action.RPR + Numbers.NUMBER_8 + Labor.EIGHT_HR
    private const val RPR_NUMBER_8_9HR = Action.RPR + Numbers.NUMBER_8 + Labor.NINE_HR
    private const val RPR_NUMBER_8_10HR = Action.RPR + Numbers.NUMBER_8 + Labor.TEN_HR
    private const val RPR_NUMBER_9_1HR = Action.RPR + Numbers.NUMBER_9 + Labor.ONE_HR
    private const val RPR_NUMBER_9_2HR = Action.RPR + Numbers.NUMBER_9 + Labor.TWO_HR
    private const val RPR_NUMBER_9_3HR = Action.RPR + Numbers.NUMBER_9 + Labor.THREE_HR
    private const val RPR_NUMBER_9_4HR = Action.RPR + Numbers.NUMBER_9 + Labor.FOUR_HR
    private const val RPR_NUMBER_9_5HR = Action.RPR + Numbers.NUMBER_9 + Labor.FIVE_HR
    private const val RPR_NUMBER_9_6HR = Action.RPR + Numbers.NUMBER_9 + Labor.SIX_HR
    private const val RPR_NUMBER_9_7HR = Action.RPR + Numbers.NUMBER_9 + Labor.SEVEN_HR
    private const val RPR_NUMBER_9_8HR = Action.RPR + Numbers.NUMBER_9 + Labor.EIGHT_HR
    private const val RPR_NUMBER_9_9HR = Action.RPR + Numbers.NUMBER_9 + Labor.NINE_HR
    private const val RPR_NUMBER_9_10HR = Action.RPR + Numbers.NUMBER_9 + Labor.TEN_HR
    private const val RPR_NUMBER_10_1HR = Action.RPR + Numbers.NUMBER_10 + Labor.ONE_HR
    private const val RPR_NUMBER_10_2HR = Action.RPR + Numbers.NUMBER_10 + Labor.TWO_HR
    private const val RPR_NUMBER_10_3HR = Action.RPR + Numbers.NUMBER_10 + Labor.THREE_HR
    private const val RPR_NUMBER_10_4HR = Action.RPR + Numbers.NUMBER_10 + Labor.FOUR_HR
    private const val RPR_NUMBER_10_5HR = Action.RPR + Numbers.NUMBER_10 + Labor.FIVE_HR
    private const val RPR_NUMBER_10_6HR = Action.RPR + Numbers.NUMBER_10 + Labor.SIX_HR
    private const val RPR_NUMBER_10_7HR = Action.RPR + Numbers.NUMBER_10 + Labor.SEVEN_HR
    private const val RPR_NUMBER_10_8HR = Action.RPR + Numbers.NUMBER_10 + Labor.EIGHT_HR
    private const val RPR_NUMBER_10_9HR = Action.RPR + Numbers.NUMBER_10 + Labor.NINE_HR
    private const val RPR_NUMBER_10_10HR = Action.RPR + Numbers.NUMBER_10 + Labor.TEN_HR
    private const val RPR_NUMBER_11_1HR = Action.RPR + Numbers.NUMBER_11 + Labor.ONE_HR
    private const val RPR_NUMBER_11_2HR = Action.RPR + Numbers.NUMBER_11 + Labor.TWO_HR
    private const val RPR_NUMBER_11_3HR = Action.RPR + Numbers.NUMBER_11 + Labor.THREE_HR
    private const val RPR_NUMBER_11_4HR = Action.RPR + Numbers.NUMBER_11 + Labor.FOUR_HR
    private const val RPR_NUMBER_11_5HR = Action.RPR + Numbers.NUMBER_11 + Labor.FIVE_HR
    private const val RPR_NUMBER_11_6HR = Action.RPR + Numbers.NUMBER_11 + Labor.SIX_HR
    private const val RPR_NUMBER_11_7HR = Action.RPR + Numbers.NUMBER_11 + Labor.SEVEN_HR
    private const val RPR_NUMBER_11_8HR = Action.RPR + Numbers.NUMBER_11 + Labor.EIGHT_HR
    private const val RPR_NUMBER_11_9HR = Action.RPR + Numbers.NUMBER_11 + Labor.NINE_HR
    private const val RPR_NUMBER_11_10HR = Action.RPR + Numbers.NUMBER_11 + Labor.TEN_HR
    private const val RPR_NUMBER_12_1HR = Action.RPR + Numbers.NUMBER_12 + Labor.ONE_HR
    private const val RPR_NUMBER_12_2HR = Action.RPR + Numbers.NUMBER_12 + Labor.TWO_HR
    private const val RPR_NUMBER_12_3HR = Action.RPR + Numbers.NUMBER_12 + Labor.THREE_HR
    private const val RPR_NUMBER_12_4HR = Action.RPR + Numbers.NUMBER_12 + Labor.FOUR_HR
    private const val RPR_NUMBER_12_5HR = Action.RPR + Numbers.NUMBER_12 + Labor.FIVE_HR
    private const val RPR_NUMBER_12_6HR = Action.RPR + Numbers.NUMBER_12 + Labor.SIX_HR
    private const val RPR_NUMBER_12_7HR = Action.RPR + Numbers.NUMBER_12 + Labor.SEVEN_HR
    private const val RPR_NUMBER_12_8HR = Action.RPR + Numbers.NUMBER_12 + Labor.EIGHT_HR
    private const val RPR_NUMBER_12_9HR = Action.RPR + Numbers.NUMBER_12 + Labor.NINE_HR
    private const val RPR_NUMBER_12_10HR = Action.RPR + Numbers.NUMBER_12 + Labor.TEN_HR
    private const val RPR_NUMBER_13_1HR = Action.RPR + Numbers.NUMBER_13 + Labor.ONE_HR
    private const val RPR_NUMBER_13_2HR = Action.RPR + Numbers.NUMBER_13 + Labor.TWO_HR
    private const val RPR_NUMBER_13_3HR = Action.RPR + Numbers.NUMBER_13 + Labor.THREE_HR
    private const val RPR_NUMBER_13_4HR = Action.RPR + Numbers.NUMBER_13 + Labor.FOUR_HR
    private const val RPR_NUMBER_13_5HR = Action.RPR + Numbers.NUMBER_13 + Labor.FIVE_HR
    private const val RPR_NUMBER_13_6HR = Action.RPR + Numbers.NUMBER_13 + Labor.SIX_HR
    private const val RPR_NUMBER_13_7HR = Action.RPR + Numbers.NUMBER_13 + Labor.SEVEN_HR
    private const val RPR_NUMBER_13_8HR = Action.RPR + Numbers.NUMBER_13 + Labor.EIGHT_HR
    private const val RPR_NUMBER_13_9HR = Action.RPR + Numbers.NUMBER_13 + Labor.NINE_HR
    private const val RPR_NUMBER_13_10HR = Action.RPR + Numbers.NUMBER_13 + Labor.TEN_HR
    private const val RPR_NUMBER_14_1HR = Action.RPR + Numbers.NUMBER_14 + Labor.ONE_HR
    private const val RPR_NUMBER_14_2HR = Action.RPR + Numbers.NUMBER_14 + Labor.TWO_HR
    private const val RPR_NUMBER_14_3HR = Action.RPR + Numbers.NUMBER_14 + Labor.THREE_HR
    private const val RPR_NUMBER_14_4HR = Action.RPR + Numbers.NUMBER_14 + Labor.FOUR_HR
    private const val RPR_NUMBER_14_5HR = Action.RPR + Numbers.NUMBER_14 + Labor.FIVE_HR
    private const val RPR_NUMBER_14_6HR = Action.RPR + Numbers.NUMBER_14 + Labor.SIX_HR
    private const val RPR_NUMBER_14_7HR = Action.RPR + Numbers.NUMBER_14 + Labor.SEVEN_HR
    private const val RPR_NUMBER_14_8HR = Action.RPR + Numbers.NUMBER_14 + Labor.EIGHT_HR
    private const val RPR_NUMBER_14_9HR = Action.RPR + Numbers.NUMBER_14 + Labor.NINE_HR
    private const val RPR_NUMBER_14_10HR = Action.RPR + Numbers.NUMBER_14 + Labor.TEN_HR
    private const val RPR_NUMBER_15_1HR = Action.RPR + Numbers.NUMBER_15 + Labor.ONE_HR
    private const val RPR_NUMBER_15_2HR = Action.RPR + Numbers.NUMBER_15 + Labor.TWO_HR
    private const val RPR_NUMBER_15_3HR = Action.RPR + Numbers.NUMBER_15 + Labor.THREE_HR
    private const val RPR_NUMBER_15_4HR = Action.RPR + Numbers.NUMBER_15 + Labor.FOUR_HR
    private const val RPR_NUMBER_15_5HR = Action.RPR + Numbers.NUMBER_15 + Labor.FIVE_HR
    private const val RPR_NUMBER_15_6HR = Action.RPR + Numbers.NUMBER_15 + Labor.SIX_HR
    private const val RPR_NUMBER_15_7HR = Action.RPR + Numbers.NUMBER_15 + Labor.SEVEN_HR
    private const val RPR_NUMBER_15_8HR = Action.RPR + Numbers.NUMBER_15 + Labor.EIGHT_HR
    private const val RPR_NUMBER_15_9HR = Action.RPR + Numbers.NUMBER_15 + Labor.NINE_HR
    private const val RPR_NUMBER_15_10HR = Action.RPR + Numbers.NUMBER_15 + Labor.TEN_HR
    private const val RPR_NUMBER_16_1HR = Action.RPR + Numbers.NUMBER_16 + Labor.ONE_HR
    private const val RPR_NUMBER_16_2HR = Action.RPR + Numbers.NUMBER_16 + Labor.TWO_HR
    private const val RPR_NUMBER_16_3HR = Action.RPR + Numbers.NUMBER_16 + Labor.THREE_HR
    private const val RPR_NUMBER_16_4HR = Action.RPR + Numbers.NUMBER_16 + Labor.FOUR_HR
    private const val RPR_NUMBER_16_5HR = Action.RPR + Numbers.NUMBER_16 + Labor.FIVE_HR
    private const val RPR_NUMBER_16_6HR = Action.RPR + Numbers.NUMBER_16 + Labor.SIX_HR
    private const val RPR_NUMBER_16_7HR = Action.RPR + Numbers.NUMBER_16 + Labor.SEVEN_HR
    private const val RPR_NUMBER_16_8HR = Action.RPR + Numbers.NUMBER_16 + Labor.EIGHT_HR
    private const val RPR_NUMBER_16_9HR = Action.RPR + Numbers.NUMBER_16 + Labor.NINE_HR
    private const val RPR_NUMBER_16_10HR = Action.RPR + Numbers.NUMBER_16 + Labor.TEN_HR
    private const val RPR_NUMBER_17_1HR = Action.RPR + Numbers.NUMBER_17 + Labor.ONE_HR
    private const val RPR_NUMBER_17_2HR = Action.RPR + Numbers.NUMBER_17 + Labor.TWO_HR
    private const val RPR_NUMBER_17_3HR = Action.RPR + Numbers.NUMBER_17 + Labor.THREE_HR
    private const val RPR_NUMBER_17_4HR = Action.RPR + Numbers.NUMBER_17 + Labor.FOUR_HR
    private const val RPR_NUMBER_17_5HR = Action.RPR + Numbers.NUMBER_17 + Labor.FIVE_HR
    private const val RPR_NUMBER_17_6HR = Action.RPR + Numbers.NUMBER_17 + Labor.SIX_HR
    private const val RPR_NUMBER_17_7HR = Action.RPR + Numbers.NUMBER_17 + Labor.SEVEN_HR
    private const val RPR_NUMBER_17_8HR = Action.RPR + Numbers.NUMBER_17 + Labor.EIGHT_HR
    private const val RPR_NUMBER_17_9HR = Action.RPR + Numbers.NUMBER_17 + Labor.NINE_HR
    private const val RPR_NUMBER_17_10HR = Action.RPR + Numbers.NUMBER_17 + Labor.TEN_HR
    private const val RPR_NUMBER_18_1HR = Action.RPR + Numbers.NUMBER_18 + Labor.ONE_HR
    private const val RPR_NUMBER_18_2HR = Action.RPR + Numbers.NUMBER_18 + Labor.TWO_HR
    private const val RPR_NUMBER_18_3HR = Action.RPR + Numbers.NUMBER_18 + Labor.THREE_HR
    private const val RPR_NUMBER_18_4HR = Action.RPR + Numbers.NUMBER_18 + Labor.FOUR_HR
    private const val RPR_NUMBER_18_5HR = Action.RPR + Numbers.NUMBER_18 + Labor.FIVE_HR
    private const val RPR_NUMBER_18_6HR = Action.RPR + Numbers.NUMBER_18 + Labor.SIX_HR
    private const val RPR_NUMBER_18_7HR = Action.RPR + Numbers.NUMBER_18 + Labor.SEVEN_HR
    private const val RPR_NUMBER_18_8HR = Action.RPR + Numbers.NUMBER_18 + Labor.EIGHT_HR
    private const val RPR_NUMBER_18_9HR = Action.RPR + Numbers.NUMBER_18 + Labor.NINE_HR
    private const val RPR_NUMBER_18_10HR = Action.RPR + Numbers.NUMBER_18 + Labor.TEN_HR
    private const val RPR_NUMBER_19_1HR = Action.RPR + Numbers.NUMBER_19 + Labor.ONE_HR
    private const val RPR_NUMBER_19_2HR = Action.RPR + Numbers.NUMBER_19 + Labor.TWO_HR
    private const val RPR_NUMBER_19_3HR = Action.RPR + Numbers.NUMBER_19 + Labor.THREE_HR
    private const val RPR_NUMBER_19_4HR = Action.RPR + Numbers.NUMBER_19 + Labor.FOUR_HR
    private const val RPR_NUMBER_19_5HR = Action.RPR + Numbers.NUMBER_19 + Labor.FIVE_HR
    private const val RPR_NUMBER_19_6HR = Action.RPR + Numbers.NUMBER_19 + Labor.SIX_HR
    private const val RPR_NUMBER_19_7HR = Action.RPR + Numbers.NUMBER_19 + Labor.SEVEN_HR
    private const val RPR_NUMBER_19_8HR = Action.RPR + Numbers.NUMBER_19 + Labor.EIGHT_HR
    private const val RPR_NUMBER_19_9HR = Action.RPR + Numbers.NUMBER_19 + Labor.NINE_HR
    private const val RPR_NUMBER_19_10HR = Action.RPR + Numbers.NUMBER_19 + Labor.TEN_HR
    private const val RPR_NUMBER_20_1HR = Action.RPR + Numbers.NUMBER_20 + Labor.ONE_HR
    private const val RPR_NUMBER_20_2HR = Action.RPR + Numbers.NUMBER_20 + Labor.TWO_HR
    private const val RPR_NUMBER_20_3HR = Action.RPR + Numbers.NUMBER_20 + Labor.THREE_HR
    private const val RPR_NUMBER_20_4HR = Action.RPR + Numbers.NUMBER_20 + Labor.FOUR_HR
    private const val RPR_NUMBER_20_5HR = Action.RPR + Numbers.NUMBER_20 + Labor.FIVE_HR
    private const val RPR_NUMBER_20_6HR = Action.RPR + Numbers.NUMBER_20 + Labor.SIX_HR
    private const val RPR_NUMBER_20_7HR = Action.RPR + Numbers.NUMBER_20 + Labor.SEVEN_HR
    private const val RPR_NUMBER_20_8HR = Action.RPR + Numbers.NUMBER_20 + Labor.EIGHT_HR
    private const val RPR_NUMBER_20_9HR = Action.RPR + Numbers.NUMBER_20 + Labor.NINE_HR
    private const val RPR_NUMBER_20_10HR = Action.RPR + Numbers.NUMBER_20 + Labor.TEN_HR
    private const val RPR_NUMBER_21_1HR = Action.RPR + Numbers.NUMBER_21 + Labor.ONE_HR
    private const val RPR_NUMBER_21_2HR = Action.RPR + Numbers.NUMBER_21 + Labor.TWO_HR
    private const val RPR_NUMBER_21_3HR = Action.RPR + Numbers.NUMBER_21 + Labor.THREE_HR
    private const val RPR_NUMBER_21_4HR = Action.RPR + Numbers.NUMBER_21 + Labor.FOUR_HR
    private const val RPR_NUMBER_21_5HR = Action.RPR + Numbers.NUMBER_21 + Labor.FIVE_HR
    private const val RPR_NUMBER_21_6HR = Action.RPR + Numbers.NUMBER_21 + Labor.SIX_HR
    private const val RPR_NUMBER_21_7HR = Action.RPR + Numbers.NUMBER_21 + Labor.SEVEN_HR
    private const val RPR_NUMBER_21_8HR = Action.RPR + Numbers.NUMBER_21 + Labor.EIGHT_HR
    private const val RPR_NUMBER_21_9HR = Action.RPR + Numbers.NUMBER_21 + Labor.NINE_HR
    private const val RPR_NUMBER_21_10HR = Action.RPR + Numbers.NUMBER_21 + Labor.TEN_HR
    private const val RPR_NUMBER_22_1HR = Action.RPR + Numbers.NUMBER_22 + Labor.ONE_HR
    private const val RPR_NUMBER_22_2HR = Action.RPR + Numbers.NUMBER_22 + Labor.TWO_HR
    private const val RPR_NUMBER_22_3HR = Action.RPR + Numbers.NUMBER_22 + Labor.THREE_HR
    private const val RPR_NUMBER_22_4HR = Action.RPR + Numbers.NUMBER_22 + Labor.FOUR_HR
    private const val RPR_NUMBER_22_5HR = Action.RPR + Numbers.NUMBER_22 + Labor.FIVE_HR
    private const val RPR_NUMBER_22_6HR = Action.RPR + Numbers.NUMBER_22 + Labor.SIX_HR
    private const val RPR_NUMBER_22_7HR = Action.RPR + Numbers.NUMBER_22 + Labor.SEVEN_HR
    private const val RPR_NUMBER_22_8HR = Action.RPR + Numbers.NUMBER_22 + Labor.EIGHT_HR
    private const val RPR_NUMBER_22_9HR = Action.RPR + Numbers.NUMBER_22 + Labor.NINE_HR
    private const val RPR_NUMBER_22_10HR = Action.RPR + Numbers.NUMBER_22 + Labor.TEN_HR
    private const val RPR_NUMBER_23_1HR = Action.RPR + Numbers.NUMBER_23 + Labor.ONE_HR
    private const val RPR_NUMBER_23_2HR = Action.RPR + Numbers.NUMBER_23 + Labor.TWO_HR
    private const val RPR_NUMBER_23_3HR = Action.RPR + Numbers.NUMBER_23 + Labor.THREE_HR
    private const val RPR_NUMBER_23_4HR = Action.RPR + Numbers.NUMBER_23 + Labor.FOUR_HR
    private const val RPR_NUMBER_23_5HR = Action.RPR + Numbers.NUMBER_23 + Labor.FIVE_HR
    private const val RPR_NUMBER_23_6HR = Action.RPR + Numbers.NUMBER_23 + Labor.SIX_HR
    private const val RPR_NUMBER_23_7HR = Action.RPR + Numbers.NUMBER_23 + Labor.SEVEN_HR
    private const val RPR_NUMBER_23_8HR = Action.RPR + Numbers.NUMBER_23 + Labor.EIGHT_HR
    private const val RPR_NUMBER_23_9HR = Action.RPR + Numbers.NUMBER_23 + Labor.NINE_HR
    private const val RPR_NUMBER_23_10HR = Action.RPR + Numbers.NUMBER_23 + Labor.TEN_HR
    private const val RPR_NUMBER_24_1HR = Action.RPR + Numbers.NUMBER_24 + Labor.ONE_HR
    private const val RPR_NUMBER_24_2HR = Action.RPR + Numbers.NUMBER_24 + Labor.TWO_HR
    private const val RPR_NUMBER_24_3HR = Action.RPR + Numbers.NUMBER_24 + Labor.THREE_HR
    private const val RPR_NUMBER_24_4HR = Action.RPR + Numbers.NUMBER_24 + Labor.FOUR_HR
    private const val RPR_NUMBER_24_5HR = Action.RPR + Numbers.NUMBER_24 + Labor.FIVE_HR
    private const val RPR_NUMBER_24_6HR = Action.RPR + Numbers.NUMBER_24 + Labor.SIX_HR
    private const val RPR_NUMBER_24_7HR = Action.RPR + Numbers.NUMBER_24 + Labor.SEVEN_HR
    private const val RPR_NUMBER_24_8HR = Action.RPR + Numbers.NUMBER_24 + Labor.EIGHT_HR
    private const val RPR_NUMBER_24_9HR = Action.RPR + Numbers.NUMBER_24 + Labor.NINE_HR
    private const val RPR_NUMBER_24_10HR = Action.RPR + Numbers.NUMBER_24 + Labor.TEN_HR
    private const val RPR_NUMBER_25_1HR = Action.RPR + Numbers.NUMBER_25 + Labor.ONE_HR
    private const val RPR_NUMBER_25_2HR = Action.RPR + Numbers.NUMBER_25 + Labor.TWO_HR
    private const val RPR_NUMBER_25_3HR = Action.RPR + Numbers.NUMBER_25 + Labor.THREE_HR
    private const val RPR_NUMBER_25_4HR = Action.RPR + Numbers.NUMBER_25 + Labor.FOUR_HR
    private const val RPR_NUMBER_25_5HR = Action.RPR + Numbers.NUMBER_25 + Labor.FIVE_HR
    private const val RPR_NUMBER_25_6HR = Action.RPR + Numbers.NUMBER_25 + Labor.SIX_HR
    private const val RPR_NUMBER_25_7HR = Action.RPR + Numbers.NUMBER_25 + Labor.SEVEN_HR
    private const val RPR_NUMBER_25_8HR = Action.RPR + Numbers.NUMBER_25 + Labor.EIGHT_HR
    private const val RPR_NUMBER_25_9HR = Action.RPR + Numbers.NUMBER_25 + Labor.NINE_HR
    private const val RPR_NUMBER_25_10HR = Action.RPR + Numbers.NUMBER_25 + Labor.TEN_HR
    private const val RPR_NUMBER_26_1HR = Action.RPR + Numbers.NUMBER_26 + Labor.ONE_HR
    private const val RPR_NUMBER_26_2HR = Action.RPR + Numbers.NUMBER_26 + Labor.TWO_HR
    private const val RPR_NUMBER_26_3HR = Action.RPR + Numbers.NUMBER_26 + Labor.THREE_HR
    private const val RPR_NUMBER_26_4HR = Action.RPR + Numbers.NUMBER_26 + Labor.FOUR_HR
    private const val RPR_NUMBER_26_5HR = Action.RPR + Numbers.NUMBER_26 + Labor.FIVE_HR
    private const val RPR_NUMBER_26_6HR = Action.RPR + Numbers.NUMBER_26 + Labor.SIX_HR
    private const val RPR_NUMBER_26_7HR = Action.RPR + Numbers.NUMBER_26 + Labor.SEVEN_HR
    private const val RPR_NUMBER_26_8HR = Action.RPR + Numbers.NUMBER_26 + Labor.EIGHT_HR
    private const val RPR_NUMBER_26_9HR = Action.RPR + Numbers.NUMBER_26 + Labor.NINE_HR
    private const val RPR_NUMBER_26_10HR = Action.RPR + Numbers.NUMBER_26 + Labor.TEN_HR
    private const val RPR_NUMBER_27_1HR = Action.RPR + Numbers.NUMBER_27 + Labor.ONE_HR
    private const val RPR_NUMBER_27_2HR = Action.RPR + Numbers.NUMBER_27 + Labor.TWO_HR
    private const val RPR_NUMBER_27_3HR = Action.RPR + Numbers.NUMBER_27 + Labor.THREE_HR
    private const val RPR_NUMBER_27_4HR = Action.RPR + Numbers.NUMBER_27 + Labor.FOUR_HR
    private const val RPR_NUMBER_27_5HR = Action.RPR + Numbers.NUMBER_27 + Labor.FIVE_HR
    private const val RPR_NUMBER_27_6HR = Action.RPR + Numbers.NUMBER_27 + Labor.SIX_HR
    private const val RPR_NUMBER_27_7HR = Action.RPR + Numbers.NUMBER_27 + Labor.SEVEN_HR
    private const val RPR_NUMBER_27_8HR = Action.RPR + Numbers.NUMBER_27 + Labor.EIGHT_HR
    private const val RPR_NUMBER_27_9HR = Action.RPR + Numbers.NUMBER_27 + Labor.NINE_HR
    private const val RPR_NUMBER_27_10HR = Action.RPR + Numbers.NUMBER_27 + Labor.TEN_HR
    private const val RPR_NUMBER_28_1HR = Action.RPR + Numbers.NUMBER_28 + Labor.ONE_HR
    private const val RPR_NUMBER_28_2HR = Action.RPR + Numbers.NUMBER_28 + Labor.TWO_HR
    private const val RPR_NUMBER_28_3HR = Action.RPR + Numbers.NUMBER_28 + Labor.THREE_HR
    private const val RPR_NUMBER_28_4HR = Action.RPR + Numbers.NUMBER_28 + Labor.FOUR_HR
    private const val RPR_NUMBER_28_5HR = Action.RPR + Numbers.NUMBER_28 + Labor.FIVE_HR
    private const val RPR_NUMBER_28_6HR = Action.RPR + Numbers.NUMBER_28 + Labor.SIX_HR
    private const val RPR_NUMBER_28_7HR = Action.RPR + Numbers.NUMBER_28 + Labor.SEVEN_HR
    private const val RPR_NUMBER_28_8HR = Action.RPR + Numbers.NUMBER_28 + Labor.EIGHT_HR
    private const val RPR_NUMBER_28_9HR = Action.RPR + Numbers.NUMBER_28 + Labor.NINE_HR
    private const val RPR_NUMBER_28_10HR = Action.RPR + Numbers.NUMBER_28 + Labor.TEN_HR
    private const val RPR_NUMBER_29_1HR = Action.RPR + Numbers.NUMBER_29 + Labor.ONE_HR
    private const val RPR_NUMBER_29_2HR = Action.RPR + Numbers.NUMBER_29 + Labor.TWO_HR
    private const val RPR_NUMBER_29_3HR = Action.RPR + Numbers.NUMBER_29 + Labor.THREE_HR
    private const val RPR_NUMBER_29_4HR = Action.RPR + Numbers.NUMBER_29 + Labor.FOUR_HR
    private const val RPR_NUMBER_29_5HR = Action.RPR + Numbers.NUMBER_29 + Labor.FIVE_HR
    private const val RPR_NUMBER_29_6HR = Action.RPR + Numbers.NUMBER_29 + Labor.SIX_HR
    private const val RPR_NUMBER_29_7HR = Action.RPR + Numbers.NUMBER_29 + Labor.SEVEN_HR
    private const val RPR_NUMBER_29_8HR = Action.RPR + Numbers.NUMBER_29 + Labor.EIGHT_HR
    private const val RPR_NUMBER_29_9HR = Action.RPR + Numbers.NUMBER_29 + Labor.NINE_HR
    private const val RPR_NUMBER_29_10HR = Action.RPR + Numbers.NUMBER_29 + Labor.TEN_HR
    private const val RPR_NUMBER_30_1HR = Action.RPR + Numbers.NUMBER_30 + Labor.ONE_HR
    private const val RPR_NUMBER_30_2HR = Action.RPR + Numbers.NUMBER_30 + Labor.TWO_HR
    private const val RPR_NUMBER_30_3HR = Action.RPR + Numbers.NUMBER_30 + Labor.THREE_HR
    private const val RPR_NUMBER_30_4HR = Action.RPR + Numbers.NUMBER_30 + Labor.FOUR_HR
    private const val RPR_NUMBER_30_5HR = Action.RPR + Numbers.NUMBER_30 + Labor.FIVE_HR
    private const val RPR_NUMBER_30_6HR = Action.RPR + Numbers.NUMBER_30 + Labor.SIX_HR
    private const val RPR_NUMBER_30_7HR = Action.RPR + Numbers.NUMBER_30 + Labor.SEVEN_HR
    private const val RPR_NUMBER_30_8HR = Action.RPR + Numbers.NUMBER_30 + Labor.EIGHT_HR
    private const val RPR_NUMBER_30_9HR = Action.RPR + Numbers.NUMBER_30 + Labor.NINE_HR
    private const val RPR_NUMBER_30_10HR = Action.RPR + Numbers.NUMBER_30 + Labor.TEN_HR
    private const val RPR_NUMBER_31_1HR = Action.RPR + Numbers.NUMBER_31 + Labor.ONE_HR
    private const val RPR_NUMBER_31_2HR = Action.RPR + Numbers.NUMBER_31 + Labor.TWO_HR
    private const val RPR_NUMBER_31_3HR = Action.RPR + Numbers.NUMBER_31 + Labor.THREE_HR
    private const val RPR_NUMBER_31_4HR = Action.RPR + Numbers.NUMBER_31 + Labor.FOUR_HR
    private const val RPR_NUMBER_31_5HR = Action.RPR + Numbers.NUMBER_31 + Labor.FIVE_HR
    private const val RPR_NUMBER_31_6HR = Action.RPR + Numbers.NUMBER_31 + Labor.SIX_HR
    private const val RPR_NUMBER_31_7HR = Action.RPR + Numbers.NUMBER_31 + Labor.SEVEN_HR
    private const val RPR_NUMBER_31_8HR = Action.RPR + Numbers.NUMBER_31 + Labor.EIGHT_HR
    private const val RPR_NUMBER_31_9HR = Action.RPR + Numbers.NUMBER_31 + Labor.NINE_HR
    private const val RPR_NUMBER_31_10HR = Action.RPR + Numbers.NUMBER_31 + Labor.TEN_HR
    private const val RPR_NUMBER_32_1HR = Action.RPR + Numbers.NUMBER_32 + Labor.ONE_HR
    private const val RPR_NUMBER_32_2HR = Action.RPR + Numbers.NUMBER_32 + Labor.TWO_HR
    private const val RPR_NUMBER_32_3HR = Action.RPR + Numbers.NUMBER_32 + Labor.THREE_HR
    private const val RPR_NUMBER_32_4HR = Action.RPR + Numbers.NUMBER_32 + Labor.FOUR_HR
    private const val RPR_NUMBER_32_5HR = Action.RPR + Numbers.NUMBER_32 + Labor.FIVE_HR
    private const val RPR_NUMBER_32_6HR = Action.RPR + Numbers.NUMBER_32 + Labor.SIX_HR
    private const val RPR_NUMBER_32_7HR = Action.RPR + Numbers.NUMBER_32 + Labor.SEVEN_HR
    private const val RPR_NUMBER_32_8HR = Action.RPR + Numbers.NUMBER_32 + Labor.EIGHT_HR
    private const val RPR_NUMBER_32_9HR = Action.RPR + Numbers.NUMBER_32 + Labor.NINE_HR
    private const val RPR_NUMBER_32_10HR = Action.RPR + Numbers.NUMBER_32 + Labor.TEN_HR
    private const val RPR_NUMBER_33_1HR = Action.RPR + Numbers.NUMBER_33 + Labor.ONE_HR
    private const val RPR_NUMBER_33_2HR = Action.RPR + Numbers.NUMBER_33 + Labor.TWO_HR
    private const val RPR_NUMBER_33_3HR = Action.RPR + Numbers.NUMBER_33 + Labor.THREE_HR
    private const val RPR_NUMBER_33_4HR = Action.RPR + Numbers.NUMBER_33 + Labor.FOUR_HR
    private const val RPR_NUMBER_33_5HR = Action.RPR + Numbers.NUMBER_33 + Labor.FIVE_HR
    private const val RPR_NUMBER_33_6HR = Action.RPR + Numbers.NUMBER_33 + Labor.SIX_HR
    private const val RPR_NUMBER_33_7HR = Action.RPR + Numbers.NUMBER_33 + Labor.SEVEN_HR
    private const val RPR_NUMBER_33_8HR = Action.RPR + Numbers.NUMBER_33 + Labor.EIGHT_HR
    private const val RPR_NUMBER_33_9HR = Action.RPR + Numbers.NUMBER_33 + Labor.NINE_HR
    private const val RPR_NUMBER_33_10HR = Action.RPR + Numbers.NUMBER_33 + Labor.TEN_HR
    private const val RPR_NUMBER_34_1HR = Action.RPR + Numbers.NUMBER_34 + Labor.ONE_HR
    private const val RPR_NUMBER_34_2HR = Action.RPR + Numbers.NUMBER_34 + Labor.TWO_HR
    private const val RPR_NUMBER_34_3HR = Action.RPR + Numbers.NUMBER_34 + Labor.THREE_HR
    private const val RPR_NUMBER_34_4HR = Action.RPR + Numbers.NUMBER_34 + Labor.FOUR_HR
    private const val RPR_NUMBER_34_5HR = Action.RPR + Numbers.NUMBER_34 + Labor.FIVE_HR
    private const val RPR_NUMBER_34_6HR = Action.RPR + Numbers.NUMBER_34 + Labor.SIX_HR
    private const val RPR_NUMBER_34_7HR = Action.RPR + Numbers.NUMBER_34 + Labor.SEVEN_HR
    private const val RPR_NUMBER_34_8HR = Action.RPR + Numbers.NUMBER_34 + Labor.EIGHT_HR
    private const val RPR_NUMBER_34_9HR = Action.RPR + Numbers.NUMBER_34 + Labor.NINE_HR
    private const val RPR_NUMBER_34_10HR = Action.RPR + Numbers.NUMBER_34 + Labor.TEN_HR
    private const val RPR_NUMBER_35_1HR = Action.RPR + Numbers.NUMBER_35 + Labor.ONE_HR
    private const val RPR_NUMBER_35_2HR = Action.RPR + Numbers.NUMBER_35 + Labor.TWO_HR
    private const val RPR_NUMBER_35_3HR = Action.RPR + Numbers.NUMBER_35 + Labor.THREE_HR
    private const val RPR_NUMBER_35_4HR = Action.RPR + Numbers.NUMBER_35 + Labor.FOUR_HR
    private const val RPR_NUMBER_35_5HR = Action.RPR + Numbers.NUMBER_35 + Labor.FIVE_HR
    private const val RPR_NUMBER_35_6HR = Action.RPR + Numbers.NUMBER_35 + Labor.SIX_HR
    private const val RPR_NUMBER_35_7HR = Action.RPR + Numbers.NUMBER_35 + Labor.SEVEN_HR
    private const val RPR_NUMBER_35_8HR = Action.RPR + Numbers.NUMBER_35 + Labor.EIGHT_HR
    private const val RPR_NUMBER_35_9HR = Action.RPR + Numbers.NUMBER_35 + Labor.NINE_HR
    private const val RPR_NUMBER_35_10HR = Action.RPR + Numbers.NUMBER_35 + Labor.TEN_HR
    private const val RPR_NUMBER_36_1HR = Action.RPR + Numbers.NUMBER_36 + Labor.ONE_HR
    private const val RPR_NUMBER_36_2HR = Action.RPR + Numbers.NUMBER_36 + Labor.TWO_HR
    private const val RPR_NUMBER_36_3HR = Action.RPR + Numbers.NUMBER_36 + Labor.THREE_HR
    private const val RPR_NUMBER_36_4HR = Action.RPR + Numbers.NUMBER_36 + Labor.FOUR_HR
    private const val RPR_NUMBER_36_5HR = Action.RPR + Numbers.NUMBER_36 + Labor.FIVE_HR
    private const val RPR_NUMBER_36_6HR = Action.RPR + Numbers.NUMBER_36 + Labor.SIX_HR
    private const val RPR_NUMBER_36_7HR = Action.RPR + Numbers.NUMBER_36 + Labor.SEVEN_HR
    private const val RPR_NUMBER_36_8HR = Action.RPR + Numbers.NUMBER_36 + Labor.EIGHT_HR
    private const val RPR_NUMBER_36_9HR = Action.RPR + Numbers.NUMBER_36 + Labor.NINE_HR
    private const val RPR_NUMBER_36_10HR = Action.RPR + Numbers.NUMBER_36 + Labor.TEN_HR
    private const val RPR_NUMBER_37_1HR = Action.RPR + Numbers.NUMBER_37 + Labor.ONE_HR
    private const val RPR_NUMBER_37_2HR = Action.RPR + Numbers.NUMBER_37 + Labor.TWO_HR
    private const val RPR_NUMBER_37_3HR = Action.RPR + Numbers.NUMBER_37 + Labor.THREE_HR
    private const val RPR_NUMBER_37_4HR = Action.RPR + Numbers.NUMBER_37 + Labor.FOUR_HR
    private const val RPR_NUMBER_37_5HR = Action.RPR + Numbers.NUMBER_37 + Labor.FIVE_HR
    private const val RPR_NUMBER_37_6HR = Action.RPR + Numbers.NUMBER_37 + Labor.SIX_HR
    private const val RPR_NUMBER_37_7HR = Action.RPR + Numbers.NUMBER_37 + Labor.SEVEN_HR
    private const val RPR_NUMBER_37_8HR = Action.RPR + Numbers.NUMBER_37 + Labor.EIGHT_HR
    private const val RPR_NUMBER_37_9HR = Action.RPR + Numbers.NUMBER_37 + Labor.NINE_HR
    private const val RPR_NUMBER_37_10HR = Action.RPR + Numbers.NUMBER_37 + Labor.TEN_HR

    private const val RPR_NUMBER_1_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_2_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_3_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_4_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_5_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_6_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_7_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_8_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_9_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_10_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_11_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_12_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_13_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_14_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_15_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_16_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_17_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_18_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_19_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_20_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_21_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_22_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_23_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_24_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_25_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_26_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_27_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_28_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_29_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_30_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_31_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_32_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_33_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_34_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_35_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_36_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_37_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Labor.HALF_HR

    private const val RPR_NUMBER_1_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_1_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_1_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_1_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_1_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_1_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_1_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_1_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_1_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_2_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_2_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_2_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_2_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_2_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_2_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_2_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_2_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_2_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_3_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_3_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_3_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_3_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_3_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_3_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_3_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_3_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_3_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_4_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_4_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_4_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_4_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_4_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_4_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_4_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_4_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_4_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_5_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_5_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_5_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_5_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_5_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_5_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_5_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_5_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_5_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_6_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_6_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_6_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_6_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_6_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_6_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_6_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_6_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_6_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_7_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_7_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_7_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_7_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_7_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_7_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_7_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_7_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_7_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_8_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_8_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_8_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_8_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_8_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_8_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_8_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_8_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_8_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_9_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_9_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_9_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_9_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_9_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_9_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_9_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_9_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_9_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_10_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_10_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_10_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_10_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_10_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_10_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_10_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_10_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_10_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_11_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_11_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_11_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_11_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_11_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_11_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_11_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_11_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_11_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_12_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_12_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_12_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_12_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_12_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_12_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_12_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_12_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_12_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_13_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_13_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_13_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_13_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_13_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_13_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_13_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_13_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_13_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_14_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_14_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_14_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_14_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_14_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_14_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_14_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_14_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_14_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_15_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_15_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_15_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_15_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_15_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_15_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_15_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_15_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_15_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_16_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_16_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_16_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_16_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_16_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_16_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_16_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_16_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_16_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_17_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_17_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_17_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_17_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_17_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_17_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_17_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_17_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_17_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_18_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_18_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_18_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_18_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_18_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_18_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_18_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_18_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_18_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_19_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_19_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_19_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_19_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_19_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_19_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_19_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_19_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_19_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_20_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_20_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_20_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_20_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_20_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_20_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_20_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_20_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_20_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_21_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_21_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_21_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_21_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_21_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_21_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_21_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_21_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_21_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_22_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_22_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_22_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_22_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_22_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_22_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_22_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_22_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_22_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_23_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_23_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_23_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_23_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_23_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_23_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_23_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_23_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_23_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_24_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_24_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_24_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_24_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_24_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_24_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_24_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_24_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_24_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_25_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_25_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_25_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_25_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_25_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_25_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_25_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_25_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_25_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_26_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_26_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_26_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_26_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_26_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_26_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_26_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_26_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_26_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_27_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_27_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_27_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_27_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_27_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_27_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_27_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_27_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_27_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_28_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_28_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_28_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_28_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_28_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_28_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_28_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_28_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_28_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_29_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_29_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_29_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_29_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_29_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_29_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_29_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_29_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_29_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_30_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_30_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_30_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_30_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_30_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_30_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_30_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_30_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_30_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_31_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_31_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_31_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_31_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_31_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_31_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_31_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_31_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_31_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_32_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_32_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_32_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_32_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_32_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_32_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_32_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_32_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_32_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_33_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_33_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_33_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_33_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_33_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_33_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_33_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_33_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_33_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_34_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_34_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_34_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_34_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_34_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_34_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_34_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_34_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_34_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_35_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_35_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_35_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_35_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_35_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_35_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_35_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_35_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_35_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_36_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_36_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_36_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_36_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_36_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_36_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_36_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_36_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_36_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_37_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_37_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_37_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_37_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_37_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_37_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_37_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_37_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_37_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Labor.NINE_HALF_HR

    /** Repairs for left side parts **/
    private const val RPR_NUMBER_1_LEFT_1HR = Action.RPR + Numbers.NUMBER_1 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_1_LEFT_2HR = Action.RPR + Numbers.NUMBER_1 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_1_LEFT_3HR = Action.RPR + Numbers.NUMBER_1 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_1_LEFT_4HR = Action.RPR + Numbers.NUMBER_1 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_1_LEFT_5HR = Action.RPR + Numbers.NUMBER_1 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_1_LEFT_6HR = Action.RPR + Numbers.NUMBER_1 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_1_LEFT_7HR = Action.RPR + Numbers.NUMBER_1 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_1_LEFT_8HR = Action.RPR + Numbers.NUMBER_1 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_1_LEFT_9HR = Action.RPR + Numbers.NUMBER_1 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_1_LEFT_10HR = Action.RPR + Numbers.NUMBER_1 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_2_LEFT_1HR = Action.RPR + Numbers.NUMBER_2 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_2_LEFT_2HR = Action.RPR + Numbers.NUMBER_2 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_2_LEFT_3HR = Action.RPR + Numbers.NUMBER_2 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_2_LEFT_4HR = Action.RPR + Numbers.NUMBER_2 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_2_LEFT_5HR = Action.RPR + Numbers.NUMBER_2 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_2_LEFT_6HR = Action.RPR + Numbers.NUMBER_2 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_2_LEFT_7HR = Action.RPR + Numbers.NUMBER_2 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_2_LEFT_8HR = Action.RPR + Numbers.NUMBER_2 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_2_LEFT_9HR = Action.RPR + Numbers.NUMBER_2 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_2_LEFT_10HR = Action.RPR + Numbers.NUMBER_2 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_3_LEFT_1HR = Action.RPR + Numbers.NUMBER_3 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_3_LEFT_2HR = Action.RPR + Numbers.NUMBER_3 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_3_LEFT_3HR = Action.RPR + Numbers.NUMBER_3 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_3_LEFT_4HR = Action.RPR + Numbers.NUMBER_3 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_3_LEFT_5HR = Action.RPR + Numbers.NUMBER_3 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_3_LEFT_6HR = Action.RPR + Numbers.NUMBER_3 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_3_LEFT_7HR = Action.RPR + Numbers.NUMBER_3 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_3_LEFT_8HR = Action.RPR + Numbers.NUMBER_3 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_3_LEFT_9HR = Action.RPR + Numbers.NUMBER_3 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_3_LEFT_10HR = Action.RPR + Numbers.NUMBER_3 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_4_LEFT_1HR = Action.RPR + Numbers.NUMBER_4 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_4_LEFT_2HR = Action.RPR + Numbers.NUMBER_4 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_4_LEFT_3HR = Action.RPR + Numbers.NUMBER_4 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_4_LEFT_4HR = Action.RPR + Numbers.NUMBER_4 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_4_LEFT_5HR = Action.RPR + Numbers.NUMBER_4 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_4_LEFT_6HR = Action.RPR + Numbers.NUMBER_4 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_4_LEFT_7HR = Action.RPR + Numbers.NUMBER_4 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_4_LEFT_8HR = Action.RPR + Numbers.NUMBER_4 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_4_LEFT_9HR = Action.RPR + Numbers.NUMBER_4 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_4_LEFT_10HR = Action.RPR + Numbers.NUMBER_4 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_5_LEFT_1HR = Action.RPR + Numbers.NUMBER_5 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_5_LEFT_2HR = Action.RPR + Numbers.NUMBER_5 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_5_LEFT_3HR = Action.RPR + Numbers.NUMBER_5 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_5_LEFT_4HR = Action.RPR + Numbers.NUMBER_5 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_5_LEFT_5HR = Action.RPR + Numbers.NUMBER_5 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_5_LEFT_6HR = Action.RPR + Numbers.NUMBER_5 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_5_LEFT_7HR = Action.RPR + Numbers.NUMBER_5 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_5_LEFT_8HR = Action.RPR + Numbers.NUMBER_5 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_5_LEFT_9HR = Action.RPR + Numbers.NUMBER_5 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_5_LEFT_10HR = Action.RPR + Numbers.NUMBER_5 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_6_LEFT_1HR = Action.RPR + Numbers.NUMBER_6 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_6_LEFT_2HR = Action.RPR + Numbers.NUMBER_6 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_6_LEFT_3HR = Action.RPR + Numbers.NUMBER_6 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_6_LEFT_4HR = Action.RPR + Numbers.NUMBER_6 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_6_LEFT_5HR = Action.RPR + Numbers.NUMBER_6 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_6_LEFT_6HR = Action.RPR + Numbers.NUMBER_6 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_6_LEFT_7HR = Action.RPR + Numbers.NUMBER_6 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_6_LEFT_8HR = Action.RPR + Numbers.NUMBER_6 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_6_LEFT_9HR = Action.RPR + Numbers.NUMBER_6 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_6_LEFT_10HR = Action.RPR + Numbers.NUMBER_6 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_7_LEFT_1HR = Action.RPR + Numbers.NUMBER_7 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_7_LEFT_2HR = Action.RPR + Numbers.NUMBER_7 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_7_LEFT_3HR = Action.RPR + Numbers.NUMBER_7 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_7_LEFT_4HR = Action.RPR + Numbers.NUMBER_7 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_7_LEFT_5HR = Action.RPR + Numbers.NUMBER_7 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_7_LEFT_6HR = Action.RPR + Numbers.NUMBER_7 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_7_LEFT_7HR = Action.RPR + Numbers.NUMBER_7 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_7_LEFT_8HR = Action.RPR + Numbers.NUMBER_7 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_7_LEFT_9HR = Action.RPR + Numbers.NUMBER_7 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_7_LEFT_10HR = Action.RPR + Numbers.NUMBER_7 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_8_LEFT_1HR = Action.RPR + Numbers.NUMBER_8 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_8_LEFT_2HR = Action.RPR + Numbers.NUMBER_8 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_8_LEFT_3HR = Action.RPR + Numbers.NUMBER_8 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_8_LEFT_4HR = Action.RPR + Numbers.NUMBER_8 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_8_LEFT_5HR = Action.RPR + Numbers.NUMBER_8 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_8_LEFT_6HR = Action.RPR + Numbers.NUMBER_8 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_8_LEFT_7HR = Action.RPR + Numbers.NUMBER_8 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_8_LEFT_8HR = Action.RPR + Numbers.NUMBER_8 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_8_LEFT_9HR = Action.RPR + Numbers.NUMBER_8 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_8_LEFT_10HR = Action.RPR + Numbers.NUMBER_8 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_9_LEFT_1HR = Action.RPR + Numbers.NUMBER_9 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_9_LEFT_2HR = Action.RPR + Numbers.NUMBER_9 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_9_LEFT_3HR = Action.RPR + Numbers.NUMBER_9 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_9_LEFT_4HR = Action.RPR + Numbers.NUMBER_9 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_9_LEFT_5HR = Action.RPR + Numbers.NUMBER_9 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_9_LEFT_6HR = Action.RPR + Numbers.NUMBER_9 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_9_LEFT_7HR = Action.RPR + Numbers.NUMBER_9 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_9_LEFT_8HR = Action.RPR + Numbers.NUMBER_9 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_9_LEFT_9HR = Action.RPR + Numbers.NUMBER_9 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_9_LEFT_10HR = Action.RPR + Numbers.NUMBER_9 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_10_LEFT_1HR = Action.RPR + Numbers.NUMBER_10 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_10_LEFT_2HR = Action.RPR + Numbers.NUMBER_10 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_10_LEFT_3HR = Action.RPR + Numbers.NUMBER_10 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_10_LEFT_4HR = Action.RPR + Numbers.NUMBER_10 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_10_LEFT_5HR = Action.RPR + Numbers.NUMBER_10 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_10_LEFT_6HR = Action.RPR + Numbers.NUMBER_10 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_10_LEFT_7HR = Action.RPR + Numbers.NUMBER_10 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_10_LEFT_8HR = Action.RPR + Numbers.NUMBER_10 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_10_LEFT_9HR = Action.RPR + Numbers.NUMBER_10 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_10_LEFT_10HR = Action.RPR + Numbers.NUMBER_10 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_11_LEFT_1HR = Action.RPR + Numbers.NUMBER_11 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_11_LEFT_2HR = Action.RPR + Numbers.NUMBER_11 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_11_LEFT_3HR = Action.RPR + Numbers.NUMBER_11 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_11_LEFT_4HR = Action.RPR + Numbers.NUMBER_11 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_11_LEFT_5HR = Action.RPR + Numbers.NUMBER_11 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_11_LEFT_6HR = Action.RPR + Numbers.NUMBER_11 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_11_LEFT_7HR = Action.RPR + Numbers.NUMBER_11 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_11_LEFT_8HR = Action.RPR + Numbers.NUMBER_11 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_11_LEFT_9HR = Action.RPR + Numbers.NUMBER_11 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_11_LEFT_10HR = Action.RPR + Numbers.NUMBER_11 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_12_LEFT_1HR = Action.RPR + Numbers.NUMBER_12 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_12_LEFT_2HR = Action.RPR + Numbers.NUMBER_12 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_12_LEFT_3HR = Action.RPR + Numbers.NUMBER_12 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_12_LEFT_4HR = Action.RPR + Numbers.NUMBER_12 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_12_LEFT_5HR = Action.RPR + Numbers.NUMBER_12 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_12_LEFT_6HR = Action.RPR + Numbers.NUMBER_12 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_12_LEFT_7HR = Action.RPR + Numbers.NUMBER_12 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_12_LEFT_8HR = Action.RPR + Numbers.NUMBER_12 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_12_LEFT_9HR = Action.RPR + Numbers.NUMBER_12 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_12_LEFT_10HR = Action.RPR + Numbers.NUMBER_12 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_13_LEFT_1HR = Action.RPR + Numbers.NUMBER_13 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_13_LEFT_2HR = Action.RPR + Numbers.NUMBER_13 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_13_LEFT_3HR = Action.RPR + Numbers.NUMBER_13 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_13_LEFT_4HR = Action.RPR + Numbers.NUMBER_13 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_13_LEFT_5HR = Action.RPR + Numbers.NUMBER_13 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_13_LEFT_6HR = Action.RPR + Numbers.NUMBER_13 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_13_LEFT_7HR = Action.RPR + Numbers.NUMBER_13 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_13_LEFT_8HR = Action.RPR + Numbers.NUMBER_13 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_13_LEFT_9HR = Action.RPR + Numbers.NUMBER_13 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_13_LEFT_10HR = Action.RPR + Numbers.NUMBER_13 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_14_LEFT_1HR = Action.RPR + Numbers.NUMBER_14 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_14_LEFT_2HR = Action.RPR + Numbers.NUMBER_14 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_14_LEFT_3HR = Action.RPR + Numbers.NUMBER_14 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_14_LEFT_4HR = Action.RPR + Numbers.NUMBER_14 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_14_LEFT_5HR = Action.RPR + Numbers.NUMBER_14 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_14_LEFT_6HR = Action.RPR + Numbers.NUMBER_14 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_14_LEFT_7HR = Action.RPR + Numbers.NUMBER_14 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_14_LEFT_8HR = Action.RPR + Numbers.NUMBER_14 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_14_LEFT_9HR = Action.RPR + Numbers.NUMBER_14 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_14_LEFT_10HR = Action.RPR + Numbers.NUMBER_14 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_15_LEFT_1HR = Action.RPR + Numbers.NUMBER_15 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_15_LEFT_2HR = Action.RPR + Numbers.NUMBER_15 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_15_LEFT_3HR = Action.RPR + Numbers.NUMBER_15 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_15_LEFT_4HR = Action.RPR + Numbers.NUMBER_15 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_15_LEFT_5HR = Action.RPR + Numbers.NUMBER_15 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_15_LEFT_6HR = Action.RPR + Numbers.NUMBER_15 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_15_LEFT_7HR = Action.RPR + Numbers.NUMBER_15 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_15_LEFT_8HR = Action.RPR + Numbers.NUMBER_15 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_15_LEFT_9HR = Action.RPR + Numbers.NUMBER_15 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_15_LEFT_10HR = Action.RPR + Numbers.NUMBER_15 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_16_LEFT_1HR = Action.RPR + Numbers.NUMBER_16 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_16_LEFT_2HR = Action.RPR + Numbers.NUMBER_16 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_16_LEFT_3HR = Action.RPR + Numbers.NUMBER_16 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_16_LEFT_4HR = Action.RPR + Numbers.NUMBER_16 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_16_LEFT_5HR = Action.RPR + Numbers.NUMBER_16 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_16_LEFT_6HR = Action.RPR + Numbers.NUMBER_16 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_16_LEFT_7HR = Action.RPR + Numbers.NUMBER_16 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_16_LEFT_8HR = Action.RPR + Numbers.NUMBER_16 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_16_LEFT_9HR = Action.RPR + Numbers.NUMBER_16 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_16_LEFT_10HR = Action.RPR + Numbers.NUMBER_16 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_17_LEFT_1HR = Action.RPR + Numbers.NUMBER_17 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_17_LEFT_2HR = Action.RPR + Numbers.NUMBER_17 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_17_LEFT_3HR = Action.RPR + Numbers.NUMBER_17 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_17_LEFT_4HR = Action.RPR + Numbers.NUMBER_17 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_17_LEFT_5HR = Action.RPR + Numbers.NUMBER_17 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_17_LEFT_6HR = Action.RPR + Numbers.NUMBER_17 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_17_LEFT_7HR = Action.RPR + Numbers.NUMBER_17 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_17_LEFT_8HR = Action.RPR + Numbers.NUMBER_17 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_17_LEFT_9HR = Action.RPR + Numbers.NUMBER_17 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_17_LEFT_10HR = Action.RPR + Numbers.NUMBER_17 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_18_LEFT_1HR = Action.RPR + Numbers.NUMBER_18 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_18_LEFT_2HR = Action.RPR + Numbers.NUMBER_18 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_18_LEFT_3HR = Action.RPR + Numbers.NUMBER_18 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_18_LEFT_4HR = Action.RPR + Numbers.NUMBER_18 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_18_LEFT_5HR = Action.RPR + Numbers.NUMBER_18 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_18_LEFT_6HR = Action.RPR + Numbers.NUMBER_18 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_18_LEFT_7HR = Action.RPR + Numbers.NUMBER_18 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_18_LEFT_8HR = Action.RPR + Numbers.NUMBER_18 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_18_LEFT_9HR = Action.RPR + Numbers.NUMBER_18 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_18_LEFT_10HR = Action.RPR + Numbers.NUMBER_18 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_19_LEFT_1HR = Action.RPR + Numbers.NUMBER_19 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_19_LEFT_2HR = Action.RPR + Numbers.NUMBER_19 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_19_LEFT_3HR = Action.RPR + Numbers.NUMBER_19 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_19_LEFT_4HR = Action.RPR + Numbers.NUMBER_19 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_19_LEFT_5HR = Action.RPR + Numbers.NUMBER_19 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_19_LEFT_6HR = Action.RPR + Numbers.NUMBER_19 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_19_LEFT_7HR = Action.RPR + Numbers.NUMBER_19 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_19_LEFT_8HR = Action.RPR + Numbers.NUMBER_19 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_19_LEFT_9HR = Action.RPR + Numbers.NUMBER_19 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_19_LEFT_10HR = Action.RPR + Numbers.NUMBER_19 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_20_LEFT_1HR = Action.RPR + Numbers.NUMBER_20 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_20_LEFT_2HR = Action.RPR + Numbers.NUMBER_20 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_20_LEFT_3HR = Action.RPR + Numbers.NUMBER_20 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_20_LEFT_4HR = Action.RPR + Numbers.NUMBER_20 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_20_LEFT_5HR = Action.RPR + Numbers.NUMBER_20 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_20_LEFT_6HR = Action.RPR + Numbers.NUMBER_20 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_20_LEFT_7HR = Action.RPR + Numbers.NUMBER_20 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_20_LEFT_8HR = Action.RPR + Numbers.NUMBER_20 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_20_LEFT_9HR = Action.RPR + Numbers.NUMBER_20 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_20_LEFT_10HR = Action.RPR + Numbers.NUMBER_20 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_21_LEFT_1HR = Action.RPR + Numbers.NUMBER_21 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_21_LEFT_2HR = Action.RPR + Numbers.NUMBER_21 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_21_LEFT_3HR = Action.RPR + Numbers.NUMBER_21 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_21_LEFT_4HR = Action.RPR + Numbers.NUMBER_21 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_21_LEFT_5HR = Action.RPR + Numbers.NUMBER_21 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_21_LEFT_6HR = Action.RPR + Numbers.NUMBER_21 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_21_LEFT_7HR = Action.RPR + Numbers.NUMBER_21 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_21_LEFT_8HR = Action.RPR + Numbers.NUMBER_21 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_21_LEFT_9HR = Action.RPR + Numbers.NUMBER_21 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_21_LEFT_10HR = Action.RPR + Numbers.NUMBER_21 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_22_LEFT_1HR = Action.RPR + Numbers.NUMBER_22 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_22_LEFT_2HR = Action.RPR + Numbers.NUMBER_22 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_22_LEFT_3HR = Action.RPR + Numbers.NUMBER_22 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_22_LEFT_4HR = Action.RPR + Numbers.NUMBER_22 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_22_LEFT_5HR = Action.RPR + Numbers.NUMBER_22 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_22_LEFT_6HR = Action.RPR + Numbers.NUMBER_22 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_22_LEFT_7HR = Action.RPR + Numbers.NUMBER_22 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_22_LEFT_8HR = Action.RPR + Numbers.NUMBER_22 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_22_LEFT_9HR = Action.RPR + Numbers.NUMBER_22 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_22_LEFT_10HR = Action.RPR + Numbers.NUMBER_22 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_23_LEFT_1HR = Action.RPR + Numbers.NUMBER_23 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_23_LEFT_2HR = Action.RPR + Numbers.NUMBER_23 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_23_LEFT_3HR = Action.RPR + Numbers.NUMBER_23 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_23_LEFT_4HR = Action.RPR + Numbers.NUMBER_23 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_23_LEFT_5HR = Action.RPR + Numbers.NUMBER_23 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_23_LEFT_6HR = Action.RPR + Numbers.NUMBER_23 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_23_LEFT_7HR = Action.RPR + Numbers.NUMBER_23 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_23_LEFT_8HR = Action.RPR + Numbers.NUMBER_23 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_23_LEFT_9HR = Action.RPR + Numbers.NUMBER_23 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_23_LEFT_10HR = Action.RPR + Numbers.NUMBER_23 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_24_LEFT_1HR = Action.RPR + Numbers.NUMBER_24 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_24_LEFT_2HR = Action.RPR + Numbers.NUMBER_24 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_24_LEFT_3HR = Action.RPR + Numbers.NUMBER_24 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_24_LEFT_4HR = Action.RPR + Numbers.NUMBER_24 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_24_LEFT_5HR = Action.RPR + Numbers.NUMBER_24 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_24_LEFT_6HR = Action.RPR + Numbers.NUMBER_24 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_24_LEFT_7HR = Action.RPR + Numbers.NUMBER_24 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_24_LEFT_8HR = Action.RPR + Numbers.NUMBER_24 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_24_LEFT_9HR = Action.RPR + Numbers.NUMBER_24 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_24_LEFT_10HR = Action.RPR + Numbers.NUMBER_24 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_25_LEFT_1HR = Action.RPR + Numbers.NUMBER_25 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_25_LEFT_2HR = Action.RPR + Numbers.NUMBER_25 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_25_LEFT_3HR = Action.RPR + Numbers.NUMBER_25 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_25_LEFT_4HR = Action.RPR + Numbers.NUMBER_25 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_25_LEFT_5HR = Action.RPR + Numbers.NUMBER_25 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_25_LEFT_6HR = Action.RPR + Numbers.NUMBER_25 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_25_LEFT_7HR = Action.RPR + Numbers.NUMBER_25 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_25_LEFT_8HR = Action.RPR + Numbers.NUMBER_25 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_25_LEFT_9HR = Action.RPR + Numbers.NUMBER_25 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_25_LEFT_10HR = Action.RPR + Numbers.NUMBER_25 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_26_LEFT_1HR = Action.RPR + Numbers.NUMBER_26 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_26_LEFT_2HR = Action.RPR + Numbers.NUMBER_26 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_26_LEFT_3HR = Action.RPR + Numbers.NUMBER_26 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_26_LEFT_4HR = Action.RPR + Numbers.NUMBER_26 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_26_LEFT_5HR = Action.RPR + Numbers.NUMBER_26 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_26_LEFT_6HR = Action.RPR + Numbers.NUMBER_26 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_26_LEFT_7HR = Action.RPR + Numbers.NUMBER_26 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_26_LEFT_8HR = Action.RPR + Numbers.NUMBER_26 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_26_LEFT_9HR = Action.RPR + Numbers.NUMBER_26 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_26_LEFT_10HR = Action.RPR + Numbers.NUMBER_26 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_27_LEFT_1HR = Action.RPR + Numbers.NUMBER_27 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_27_LEFT_2HR = Action.RPR + Numbers.NUMBER_27 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_27_LEFT_3HR = Action.RPR + Numbers.NUMBER_27 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_27_LEFT_4HR = Action.RPR + Numbers.NUMBER_27 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_27_LEFT_5HR = Action.RPR + Numbers.NUMBER_27 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_27_LEFT_6HR = Action.RPR + Numbers.NUMBER_27 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_27_LEFT_7HR = Action.RPR + Numbers.NUMBER_27 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_27_LEFT_8HR = Action.RPR + Numbers.NUMBER_27 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_27_LEFT_9HR = Action.RPR + Numbers.NUMBER_27 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_27_LEFT_10HR = Action.RPR + Numbers.NUMBER_27 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_28_LEFT_1HR = Action.RPR + Numbers.NUMBER_28 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_28_LEFT_2HR = Action.RPR + Numbers.NUMBER_28 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_28_LEFT_3HR = Action.RPR + Numbers.NUMBER_28 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_28_LEFT_4HR = Action.RPR + Numbers.NUMBER_28 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_28_LEFT_5HR = Action.RPR + Numbers.NUMBER_28 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_28_LEFT_6HR = Action.RPR + Numbers.NUMBER_28 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_28_LEFT_7HR = Action.RPR + Numbers.NUMBER_28 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_28_LEFT_8HR = Action.RPR + Numbers.NUMBER_28 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_28_LEFT_9HR = Action.RPR + Numbers.NUMBER_28 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_28_LEFT_10HR = Action.RPR + Numbers.NUMBER_28 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_29_LEFT_1HR = Action.RPR + Numbers.NUMBER_29 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_29_LEFT_2HR = Action.RPR + Numbers.NUMBER_29 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_29_LEFT_3HR = Action.RPR + Numbers.NUMBER_29 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_29_LEFT_4HR = Action.RPR + Numbers.NUMBER_29 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_29_LEFT_5HR = Action.RPR + Numbers.NUMBER_29 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_29_LEFT_6HR = Action.RPR + Numbers.NUMBER_29 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_29_LEFT_7HR = Action.RPR + Numbers.NUMBER_29 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_29_LEFT_8HR = Action.RPR + Numbers.NUMBER_29 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_29_LEFT_9HR = Action.RPR + Numbers.NUMBER_29 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_29_LEFT_10HR = Action.RPR + Numbers.NUMBER_29 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_30_LEFT_1HR = Action.RPR + Numbers.NUMBER_30 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_30_LEFT_2HR = Action.RPR + Numbers.NUMBER_30 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_30_LEFT_3HR = Action.RPR + Numbers.NUMBER_30 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_30_LEFT_4HR = Action.RPR + Numbers.NUMBER_30 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_30_LEFT_5HR = Action.RPR + Numbers.NUMBER_30 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_30_LEFT_6HR = Action.RPR + Numbers.NUMBER_30 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_30_LEFT_7HR = Action.RPR + Numbers.NUMBER_30 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_30_LEFT_8HR = Action.RPR + Numbers.NUMBER_30 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_30_LEFT_9HR = Action.RPR + Numbers.NUMBER_30 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_30_LEFT_10HR = Action.RPR + Numbers.NUMBER_30 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_31_LEFT_1HR = Action.RPR + Numbers.NUMBER_31 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_31_LEFT_2HR = Action.RPR + Numbers.NUMBER_31 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_31_LEFT_3HR = Action.RPR + Numbers.NUMBER_31 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_31_LEFT_4HR = Action.RPR + Numbers.NUMBER_31 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_31_LEFT_5HR = Action.RPR + Numbers.NUMBER_31 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_31_LEFT_6HR = Action.RPR + Numbers.NUMBER_31 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_31_LEFT_7HR = Action.RPR + Numbers.NUMBER_31 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_31_LEFT_8HR = Action.RPR + Numbers.NUMBER_31 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_31_LEFT_9HR = Action.RPR + Numbers.NUMBER_31 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_31_LEFT_10HR = Action.RPR + Numbers.NUMBER_31 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_32_LEFT_1HR = Action.RPR + Numbers.NUMBER_32 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_32_LEFT_2HR = Action.RPR + Numbers.NUMBER_32 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_32_LEFT_3HR = Action.RPR + Numbers.NUMBER_32 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_32_LEFT_4HR = Action.RPR + Numbers.NUMBER_32 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_32_LEFT_5HR = Action.RPR + Numbers.NUMBER_32 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_32_LEFT_6HR = Action.RPR + Numbers.NUMBER_32 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_32_LEFT_7HR = Action.RPR + Numbers.NUMBER_32 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_32_LEFT_8HR = Action.RPR + Numbers.NUMBER_32 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_32_LEFT_9HR = Action.RPR + Numbers.NUMBER_32 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_32_LEFT_10HR = Action.RPR + Numbers.NUMBER_32 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_33_LEFT_1HR = Action.RPR + Numbers.NUMBER_33 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_33_LEFT_2HR = Action.RPR + Numbers.NUMBER_33 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_33_LEFT_3HR = Action.RPR + Numbers.NUMBER_33 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_33_LEFT_4HR = Action.RPR + Numbers.NUMBER_33 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_33_LEFT_5HR = Action.RPR + Numbers.NUMBER_33 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_33_LEFT_6HR = Action.RPR + Numbers.NUMBER_33 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_33_LEFT_7HR = Action.RPR + Numbers.NUMBER_33 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_33_LEFT_8HR = Action.RPR + Numbers.NUMBER_33 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_33_LEFT_9HR = Action.RPR + Numbers.NUMBER_33 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_33_LEFT_10HR = Action.RPR + Numbers.NUMBER_33 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_34_LEFT_1HR = Action.RPR + Numbers.NUMBER_34 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_34_LEFT_2HR = Action.RPR + Numbers.NUMBER_34 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_34_LEFT_3HR = Action.RPR + Numbers.NUMBER_34 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_34_LEFT_4HR = Action.RPR + Numbers.NUMBER_34 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_34_LEFT_5HR = Action.RPR + Numbers.NUMBER_34 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_34_LEFT_6HR = Action.RPR + Numbers.NUMBER_34 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_34_LEFT_7HR = Action.RPR + Numbers.NUMBER_34 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_34_LEFT_8HR = Action.RPR + Numbers.NUMBER_34 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_34_LEFT_9HR = Action.RPR + Numbers.NUMBER_34 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_34_LEFT_10HR = Action.RPR + Numbers.NUMBER_34 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_35_LEFT_1HR = Action.RPR + Numbers.NUMBER_35 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_35_LEFT_2HR = Action.RPR + Numbers.NUMBER_35 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_35_LEFT_3HR = Action.RPR + Numbers.NUMBER_35 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_35_LEFT_4HR = Action.RPR + Numbers.NUMBER_35 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_35_LEFT_5HR = Action.RPR + Numbers.NUMBER_35 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_35_LEFT_6HR = Action.RPR + Numbers.NUMBER_35 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_35_LEFT_7HR = Action.RPR + Numbers.NUMBER_35 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_35_LEFT_8HR = Action.RPR + Numbers.NUMBER_35 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_35_LEFT_9HR = Action.RPR + Numbers.NUMBER_35 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_35_LEFT_10HR = Action.RPR + Numbers.NUMBER_35 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_36_LEFT_1HR = Action.RPR + Numbers.NUMBER_36 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_36_LEFT_2HR = Action.RPR + Numbers.NUMBER_36 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_36_LEFT_3HR = Action.RPR + Numbers.NUMBER_36 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_36_LEFT_4HR = Action.RPR + Numbers.NUMBER_36 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_36_LEFT_5HR = Action.RPR + Numbers.NUMBER_36 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_36_LEFT_6HR = Action.RPR + Numbers.NUMBER_36 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_36_LEFT_7HR = Action.RPR + Numbers.NUMBER_36 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_36_LEFT_8HR = Action.RPR + Numbers.NUMBER_36 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_36_LEFT_9HR = Action.RPR + Numbers.NUMBER_36 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_36_LEFT_10HR = Action.RPR + Numbers.NUMBER_36 + Position.LT + Labor.TEN_HR
    private const val RPR_NUMBER_37_LEFT_1HR = Action.RPR + Numbers.NUMBER_37 + Position.LT + Labor.ONE_HR
    private const val RPR_NUMBER_37_LEFT_2HR = Action.RPR + Numbers.NUMBER_37 + Position.LT + Labor.TWO_HR
    private const val RPR_NUMBER_37_LEFT_3HR = Action.RPR + Numbers.NUMBER_37 + Position.LT + Labor.THREE_HR
    private const val RPR_NUMBER_37_LEFT_4HR = Action.RPR + Numbers.NUMBER_37 + Position.LT + Labor.FOUR_HR
    private const val RPR_NUMBER_37_LEFT_5HR = Action.RPR + Numbers.NUMBER_37 + Position.LT + Labor.FIVE_HR
    private const val RPR_NUMBER_37_LEFT_6HR = Action.RPR + Numbers.NUMBER_37 + Position.LT + Labor.SIX_HR
    private const val RPR_NUMBER_37_LEFT_7HR = Action.RPR + Numbers.NUMBER_37 + Position.LT + Labor.SEVEN_HR
    private const val RPR_NUMBER_37_LEFT_8HR = Action.RPR + Numbers.NUMBER_37 + Position.LT + Labor.EIGHT_HR
    private const val RPR_NUMBER_37_LEFT_9HR = Action.RPR + Numbers.NUMBER_37 + Position.LT + Labor.NINE_HR
    private const val RPR_NUMBER_37_LEFT_10HR = Action.RPR + Numbers.NUMBER_37 + Position.LT + Labor.TEN_HR

    private const val RPR_NUMBER_1_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_2_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_3_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_4_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_5_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_6_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_7_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_8_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_9_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_10_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_11_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_12_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_13_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_14_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_15_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_16_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_17_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_18_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_19_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_20_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_21_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_22_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_23_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_24_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_25_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_26_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_27_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_28_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_29_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_30_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_31_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_32_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_33_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_34_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_35_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_36_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Position.LT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_37_LEFT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Position.LT + Commands.Labor.HALF_HR

    private const val RPR_NUMBER_1_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_1_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_1_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_1_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_1_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_1_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_1_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_1_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_1_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_2_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_2_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_2_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_2_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_2_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_2_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_2_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_2_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_2_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_3_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_3_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_3_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_3_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_3_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_3_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_3_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_3_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_3_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_4_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_4_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_4_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_4_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_4_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_4_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_4_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_4_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_4_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_5_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_5_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_5_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_5_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_5_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_5_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_5_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_5_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_5_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_6_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_6_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_6_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_6_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_6_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_6_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_6_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_6_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_6_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_7_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_7_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_7_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_7_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_7_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_7_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_7_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_7_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_7_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_8_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_8_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_8_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_8_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_8_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_8_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_8_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_8_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_8_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_9_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_9_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_9_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_9_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_9_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_9_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_9_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_9_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_9_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_10_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_10_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_10_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_10_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_10_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_10_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_10_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_10_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_10_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_11_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_11_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_11_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_11_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_11_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_11_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_11_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_11_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_11_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_12_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_12_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_12_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_12_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_12_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_12_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_12_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_12_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_12_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_13_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_13_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_13_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_13_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_13_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_13_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_13_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_13_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_13_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_14_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_14_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_14_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_14_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_14_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_14_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_14_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_14_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_14_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_15_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_15_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_15_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_15_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_15_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_15_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_15_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_15_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_15_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_16_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_16_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_16_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_16_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_16_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_16_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_16_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_16_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_16_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_17_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_17_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_17_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_17_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_17_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_17_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_17_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_17_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_17_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_18_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_18_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_18_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_18_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_18_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_18_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_18_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_18_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_18_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_19_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_19_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_19_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_19_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_19_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_19_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_19_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_19_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_19_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_20_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_20_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_20_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_20_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_20_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_20_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_20_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_20_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_20_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_21_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_21_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_21_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_21_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_21_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_21_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_21_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_21_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_21_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_22_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_22_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_22_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_22_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_22_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_22_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_22_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_22_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_22_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_23_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_23_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_23_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_23_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_23_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_23_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_23_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_23_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_23_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_24_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_24_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_24_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_24_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_24_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_24_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_24_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_24_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_24_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_25_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_25_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_25_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_25_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_25_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_25_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_25_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_25_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_25_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_26_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_26_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_26_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_26_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_26_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_26_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_26_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_26_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_26_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_27_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_27_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_27_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_27_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_27_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_27_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_27_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_27_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_27_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_28_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_28_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_28_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_28_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_28_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_28_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_28_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_28_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_28_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_29_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_29_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_29_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_29_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_29_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_29_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_29_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_29_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_29_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_30_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_30_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_30_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_30_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_30_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_30_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_30_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_30_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_30_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_31_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_31_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_31_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_31_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_31_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_31_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_31_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_31_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_31_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_32_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_32_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_32_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_32_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_32_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_32_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_32_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_32_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_32_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_33_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_33_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_33_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_33_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_33_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_33_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_33_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_33_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_33_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_34_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_34_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_34_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_34_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_34_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_34_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_34_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_34_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_34_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_35_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_35_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_35_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_35_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_35_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_35_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_35_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_35_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_35_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_36_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_36_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_36_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_36_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_36_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_36_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_36_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_36_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_36_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_37_LEFT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Position.LT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_37_LEFT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Position.LT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_37_LEFT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Position.LT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_37_LEFT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Position.LT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_37_LEFT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Position.LT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_37_LEFT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Position.LT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_37_LEFT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Position.LT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_37_LEFT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Position.LT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_37_LEFT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Position.LT + Commands.Labor.NINE_HALF_HR

    /** Repairs for right side parts **/
    private const val RPR_NUMBER_1_RIGHT_1HR = Action.RPR + Numbers.NUMBER_1 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_1_RIGHT_2HR = Action.RPR + Numbers.NUMBER_1 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_1_RIGHT_3HR = Action.RPR + Numbers.NUMBER_1 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_1_RIGHT_4HR = Action.RPR + Numbers.NUMBER_1 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_1_RIGHT_5HR = Action.RPR + Numbers.NUMBER_1 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_1_RIGHT_6HR = Action.RPR + Numbers.NUMBER_1 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_1_RIGHT_7HR = Action.RPR + Numbers.NUMBER_1 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_1_RIGHT_8HR = Action.RPR + Numbers.NUMBER_1 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_1_RIGHT_9HR = Action.RPR + Numbers.NUMBER_1 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_1_RIGHT_10HR = Action.RPR + Numbers.NUMBER_1 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_2_RIGHT_1HR = Action.RPR + Numbers.NUMBER_2 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_2_RIGHT_2HR = Action.RPR + Numbers.NUMBER_2 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_2_RIGHT_3HR = Action.RPR + Numbers.NUMBER_2 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_2_RIGHT_4HR = Action.RPR + Numbers.NUMBER_2 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_2_RIGHT_5HR = Action.RPR + Numbers.NUMBER_2 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_2_RIGHT_6HR = Action.RPR + Numbers.NUMBER_2 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_2_RIGHT_7HR = Action.RPR + Numbers.NUMBER_2 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_2_RIGHT_8HR = Action.RPR + Numbers.NUMBER_2 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_2_RIGHT_9HR = Action.RPR + Numbers.NUMBER_2 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_2_RIGHT_10HR = Action.RPR + Numbers.NUMBER_2 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_3_RIGHT_1HR = Action.RPR + Numbers.NUMBER_3 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_3_RIGHT_2HR = Action.RPR + Numbers.NUMBER_3 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_3_RIGHT_3HR = Action.RPR + Numbers.NUMBER_3 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_3_RIGHT_4HR = Action.RPR + Numbers.NUMBER_3 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_3_RIGHT_5HR = Action.RPR + Numbers.NUMBER_3 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_3_RIGHT_6HR = Action.RPR + Numbers.NUMBER_3 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_3_RIGHT_7HR = Action.RPR + Numbers.NUMBER_3 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_3_RIGHT_8HR = Action.RPR + Numbers.NUMBER_3 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_3_RIGHT_9HR = Action.RPR + Numbers.NUMBER_3 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_3_RIGHT_10HR = Action.RPR + Numbers.NUMBER_3 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_4_RIGHT_1HR = Action.RPR + Numbers.NUMBER_4 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_4_RIGHT_2HR = Action.RPR + Numbers.NUMBER_4 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_4_RIGHT_3HR = Action.RPR + Numbers.NUMBER_4 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_4_RIGHT_4HR = Action.RPR + Numbers.NUMBER_4 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_4_RIGHT_5HR = Action.RPR + Numbers.NUMBER_4 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_4_RIGHT_6HR = Action.RPR + Numbers.NUMBER_4 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_4_RIGHT_7HR = Action.RPR + Numbers.NUMBER_4 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_4_RIGHT_8HR = Action.RPR + Numbers.NUMBER_4 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_4_RIGHT_9HR = Action.RPR + Numbers.NUMBER_4 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_4_RIGHT_10HR = Action.RPR + Numbers.NUMBER_4 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_5_RIGHT_1HR = Action.RPR + Numbers.NUMBER_5 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_5_RIGHT_2HR = Action.RPR + Numbers.NUMBER_5 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_5_RIGHT_3HR = Action.RPR + Numbers.NUMBER_5 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_5_RIGHT_4HR = Action.RPR + Numbers.NUMBER_5 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_5_RIGHT_5HR = Action.RPR + Numbers.NUMBER_5 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_5_RIGHT_6HR = Action.RPR + Numbers.NUMBER_5 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_5_RIGHT_7HR = Action.RPR + Numbers.NUMBER_5 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_5_RIGHT_8HR = Action.RPR + Numbers.NUMBER_5 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_5_RIGHT_9HR = Action.RPR + Numbers.NUMBER_5 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_5_RIGHT_10HR = Action.RPR + Numbers.NUMBER_5 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_6_RIGHT_1HR = Action.RPR + Numbers.NUMBER_6 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_6_RIGHT_2HR = Action.RPR + Numbers.NUMBER_6 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_6_RIGHT_3HR = Action.RPR + Numbers.NUMBER_6 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_6_RIGHT_4HR = Action.RPR + Numbers.NUMBER_6 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_6_RIGHT_5HR = Action.RPR + Numbers.NUMBER_6 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_6_RIGHT_6HR = Action.RPR + Numbers.NUMBER_6 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_6_RIGHT_7HR = Action.RPR + Numbers.NUMBER_6 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_6_RIGHT_8HR = Action.RPR + Numbers.NUMBER_6 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_6_RIGHT_9HR = Action.RPR + Numbers.NUMBER_6 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_6_RIGHT_10HR = Action.RPR + Numbers.NUMBER_6 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_7_RIGHT_1HR = Action.RPR + Numbers.NUMBER_7 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_7_RIGHT_2HR = Action.RPR + Numbers.NUMBER_7 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_7_RIGHT_3HR = Action.RPR + Numbers.NUMBER_7 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_7_RIGHT_4HR = Action.RPR + Numbers.NUMBER_7 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_7_RIGHT_5HR = Action.RPR + Numbers.NUMBER_7 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_7_RIGHT_6HR = Action.RPR + Numbers.NUMBER_7 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_7_RIGHT_7HR = Action.RPR + Numbers.NUMBER_7 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_7_RIGHT_8HR = Action.RPR + Numbers.NUMBER_7 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_7_RIGHT_9HR = Action.RPR + Numbers.NUMBER_7 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_7_RIGHT_10HR = Action.RPR + Numbers.NUMBER_7 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_8_RIGHT_1HR = Action.RPR + Numbers.NUMBER_8 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_8_RIGHT_2HR = Action.RPR + Numbers.NUMBER_8 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_8_RIGHT_3HR = Action.RPR + Numbers.NUMBER_8 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_8_RIGHT_4HR = Action.RPR + Numbers.NUMBER_8 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_8_RIGHT_5HR = Action.RPR + Numbers.NUMBER_8 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_8_RIGHT_6HR = Action.RPR + Numbers.NUMBER_8 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_8_RIGHT_7HR = Action.RPR + Numbers.NUMBER_8 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_8_RIGHT_8HR = Action.RPR + Numbers.NUMBER_8 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_8_RIGHT_9HR = Action.RPR + Numbers.NUMBER_8 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_8_RIGHT_10HR = Action.RPR + Numbers.NUMBER_8 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_9_RIGHT_1HR = Action.RPR + Numbers.NUMBER_9 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_9_RIGHT_2HR = Action.RPR + Numbers.NUMBER_9 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_9_RIGHT_3HR = Action.RPR + Numbers.NUMBER_9 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_9_RIGHT_4HR = Action.RPR + Numbers.NUMBER_9 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_9_RIGHT_5HR = Action.RPR + Numbers.NUMBER_9 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_9_RIGHT_6HR = Action.RPR + Numbers.NUMBER_9 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_9_RIGHT_7HR = Action.RPR + Numbers.NUMBER_9 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_9_RIGHT_8HR = Action.RPR + Numbers.NUMBER_9 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_9_RIGHT_9HR = Action.RPR + Numbers.NUMBER_9 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_9_RIGHT_10HR = Action.RPR + Numbers.NUMBER_9 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_10_RIGHT_1HR = Action.RPR + Numbers.NUMBER_10 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_10_RIGHT_2HR = Action.RPR + Numbers.NUMBER_10 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_10_RIGHT_3HR = Action.RPR + Numbers.NUMBER_10 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_10_RIGHT_4HR = Action.RPR + Numbers.NUMBER_10 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_10_RIGHT_5HR = Action.RPR + Numbers.NUMBER_10 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_10_RIGHT_6HR = Action.RPR + Numbers.NUMBER_10 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_10_RIGHT_7HR = Action.RPR + Numbers.NUMBER_10 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_10_RIGHT_8HR = Action.RPR + Numbers.NUMBER_10 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_10_RIGHT_9HR = Action.RPR + Numbers.NUMBER_10 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_10_RIGHT_10HR = Action.RPR + Numbers.NUMBER_10 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_11_RIGHT_1HR = Action.RPR + Numbers.NUMBER_11 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_11_RIGHT_2HR = Action.RPR + Numbers.NUMBER_11 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_11_RIGHT_3HR = Action.RPR + Numbers.NUMBER_11 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_11_RIGHT_4HR = Action.RPR + Numbers.NUMBER_11 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_11_RIGHT_5HR = Action.RPR + Numbers.NUMBER_11 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_11_RIGHT_6HR = Action.RPR + Numbers.NUMBER_11 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_11_RIGHT_7HR = Action.RPR + Numbers.NUMBER_11 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_11_RIGHT_8HR = Action.RPR + Numbers.NUMBER_11 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_11_RIGHT_9HR = Action.RPR + Numbers.NUMBER_11 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_11_RIGHT_10HR = Action.RPR + Numbers.NUMBER_11 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_12_RIGHT_1HR = Action.RPR + Numbers.NUMBER_12 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_12_RIGHT_2HR = Action.RPR + Numbers.NUMBER_12 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_12_RIGHT_3HR = Action.RPR + Numbers.NUMBER_12 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_12_RIGHT_4HR = Action.RPR + Numbers.NUMBER_12 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_12_RIGHT_5HR = Action.RPR + Numbers.NUMBER_12 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_12_RIGHT_6HR = Action.RPR + Numbers.NUMBER_12 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_12_RIGHT_7HR = Action.RPR + Numbers.NUMBER_12 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_12_RIGHT_8HR = Action.RPR + Numbers.NUMBER_12 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_12_RIGHT_9HR = Action.RPR + Numbers.NUMBER_12 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_12_RIGHT_10HR = Action.RPR + Numbers.NUMBER_12 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_13_RIGHT_1HR = Action.RPR + Numbers.NUMBER_13 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_13_RIGHT_2HR = Action.RPR + Numbers.NUMBER_13 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_13_RIGHT_3HR = Action.RPR + Numbers.NUMBER_13 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_13_RIGHT_4HR = Action.RPR + Numbers.NUMBER_13 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_13_RIGHT_5HR = Action.RPR + Numbers.NUMBER_13 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_13_RIGHT_6HR = Action.RPR + Numbers.NUMBER_13 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_13_RIGHT_7HR = Action.RPR + Numbers.NUMBER_13 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_13_RIGHT_8HR = Action.RPR + Numbers.NUMBER_13 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_13_RIGHT_9HR = Action.RPR + Numbers.NUMBER_13 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_13_RIGHT_10HR = Action.RPR + Numbers.NUMBER_13 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_14_RIGHT_1HR = Action.RPR + Numbers.NUMBER_14 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_14_RIGHT_2HR = Action.RPR + Numbers.NUMBER_14 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_14_RIGHT_3HR = Action.RPR + Numbers.NUMBER_14 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_14_RIGHT_4HR = Action.RPR + Numbers.NUMBER_14 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_14_RIGHT_5HR = Action.RPR + Numbers.NUMBER_14 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_14_RIGHT_6HR = Action.RPR + Numbers.NUMBER_14 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_14_RIGHT_7HR = Action.RPR + Numbers.NUMBER_14 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_14_RIGHT_8HR = Action.RPR + Numbers.NUMBER_14 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_14_RIGHT_9HR = Action.RPR + Numbers.NUMBER_14 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_14_RIGHT_10HR = Action.RPR + Numbers.NUMBER_14 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_15_RIGHT_1HR = Action.RPR + Numbers.NUMBER_15 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_15_RIGHT_2HR = Action.RPR + Numbers.NUMBER_15 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_15_RIGHT_3HR = Action.RPR + Numbers.NUMBER_15 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_15_RIGHT_4HR = Action.RPR + Numbers.NUMBER_15 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_15_RIGHT_5HR = Action.RPR + Numbers.NUMBER_15 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_15_RIGHT_6HR = Action.RPR + Numbers.NUMBER_15 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_15_RIGHT_7HR = Action.RPR + Numbers.NUMBER_15 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_15_RIGHT_8HR = Action.RPR + Numbers.NUMBER_15 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_15_RIGHT_9HR = Action.RPR + Numbers.NUMBER_15 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_15_RIGHT_10HR = Action.RPR + Numbers.NUMBER_15 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_16_RIGHT_1HR = Action.RPR + Numbers.NUMBER_16 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_16_RIGHT_2HR = Action.RPR + Numbers.NUMBER_16 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_16_RIGHT_3HR = Action.RPR + Numbers.NUMBER_16 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_16_RIGHT_4HR = Action.RPR + Numbers.NUMBER_16 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_16_RIGHT_5HR = Action.RPR + Numbers.NUMBER_16 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_16_RIGHT_6HR = Action.RPR + Numbers.NUMBER_16 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_16_RIGHT_7HR = Action.RPR + Numbers.NUMBER_16 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_16_RIGHT_8HR = Action.RPR + Numbers.NUMBER_16 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_16_RIGHT_9HR = Action.RPR + Numbers.NUMBER_16 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_16_RIGHT_10HR = Action.RPR + Numbers.NUMBER_16 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_17_RIGHT_1HR = Action.RPR + Numbers.NUMBER_17 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_17_RIGHT_2HR = Action.RPR + Numbers.NUMBER_17 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_17_RIGHT_3HR = Action.RPR + Numbers.NUMBER_17 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_17_RIGHT_4HR = Action.RPR + Numbers.NUMBER_17 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_17_RIGHT_5HR = Action.RPR + Numbers.NUMBER_17 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_17_RIGHT_6HR = Action.RPR + Numbers.NUMBER_17 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_17_RIGHT_7HR = Action.RPR + Numbers.NUMBER_17 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_17_RIGHT_8HR = Action.RPR + Numbers.NUMBER_17 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_17_RIGHT_9HR = Action.RPR + Numbers.NUMBER_17 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_17_RIGHT_10HR = Action.RPR + Numbers.NUMBER_17 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_18_RIGHT_1HR = Action.RPR + Numbers.NUMBER_18 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_18_RIGHT_2HR = Action.RPR + Numbers.NUMBER_18 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_18_RIGHT_3HR = Action.RPR + Numbers.NUMBER_18 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_18_RIGHT_4HR = Action.RPR + Numbers.NUMBER_18 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_18_RIGHT_5HR = Action.RPR + Numbers.NUMBER_18 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_18_RIGHT_6HR = Action.RPR + Numbers.NUMBER_18 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_18_RIGHT_7HR = Action.RPR + Numbers.NUMBER_18 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_18_RIGHT_8HR = Action.RPR + Numbers.NUMBER_18 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_18_RIGHT_9HR = Action.RPR + Numbers.NUMBER_18 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_18_RIGHT_10HR = Action.RPR + Numbers.NUMBER_18 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_19_RIGHT_1HR = Action.RPR + Numbers.NUMBER_19 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_19_RIGHT_2HR = Action.RPR + Numbers.NUMBER_19 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_19_RIGHT_3HR = Action.RPR + Numbers.NUMBER_19 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_19_RIGHT_4HR = Action.RPR + Numbers.NUMBER_19 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_19_RIGHT_5HR = Action.RPR + Numbers.NUMBER_19 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_19_RIGHT_6HR = Action.RPR + Numbers.NUMBER_19 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_19_RIGHT_7HR = Action.RPR + Numbers.NUMBER_19 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_19_RIGHT_8HR = Action.RPR + Numbers.NUMBER_19 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_19_RIGHT_9HR = Action.RPR + Numbers.NUMBER_19 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_19_RIGHT_10HR = Action.RPR + Numbers.NUMBER_19 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_20_RIGHT_1HR = Action.RPR + Numbers.NUMBER_20 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_20_RIGHT_2HR = Action.RPR + Numbers.NUMBER_20 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_20_RIGHT_3HR = Action.RPR + Numbers.NUMBER_20 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_20_RIGHT_4HR = Action.RPR + Numbers.NUMBER_20 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_20_RIGHT_5HR = Action.RPR + Numbers.NUMBER_20 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_20_RIGHT_6HR = Action.RPR + Numbers.NUMBER_20 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_20_RIGHT_7HR = Action.RPR + Numbers.NUMBER_20 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_20_RIGHT_8HR = Action.RPR + Numbers.NUMBER_20 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_20_RIGHT_9HR = Action.RPR + Numbers.NUMBER_20 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_20_RIGHT_10HR = Action.RPR + Numbers.NUMBER_20 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_21_RIGHT_1HR = Action.RPR + Numbers.NUMBER_21 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_21_RIGHT_2HR = Action.RPR + Numbers.NUMBER_21 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_21_RIGHT_3HR = Action.RPR + Numbers.NUMBER_21 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_21_RIGHT_4HR = Action.RPR + Numbers.NUMBER_21 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_21_RIGHT_5HR = Action.RPR + Numbers.NUMBER_21 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_21_RIGHT_6HR = Action.RPR + Numbers.NUMBER_21 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_21_RIGHT_7HR = Action.RPR + Numbers.NUMBER_21 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_21_RIGHT_8HR = Action.RPR + Numbers.NUMBER_21 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_21_RIGHT_9HR = Action.RPR + Numbers.NUMBER_21 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_21_RIGHT_10HR = Action.RPR + Numbers.NUMBER_21 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_22_RIGHT_1HR = Action.RPR + Numbers.NUMBER_22 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_22_RIGHT_2HR = Action.RPR + Numbers.NUMBER_22 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_22_RIGHT_3HR = Action.RPR + Numbers.NUMBER_22 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_22_RIGHT_4HR = Action.RPR + Numbers.NUMBER_22 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_22_RIGHT_5HR = Action.RPR + Numbers.NUMBER_22 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_22_RIGHT_6HR = Action.RPR + Numbers.NUMBER_22 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_22_RIGHT_7HR = Action.RPR + Numbers.NUMBER_22 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_22_RIGHT_8HR = Action.RPR + Numbers.NUMBER_22 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_22_RIGHT_9HR = Action.RPR + Numbers.NUMBER_22 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_22_RIGHT_10HR = Action.RPR + Numbers.NUMBER_22 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_23_RIGHT_1HR = Action.RPR + Numbers.NUMBER_23 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_23_RIGHT_2HR = Action.RPR + Numbers.NUMBER_23 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_23_RIGHT_3HR = Action.RPR + Numbers.NUMBER_23 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_23_RIGHT_4HR = Action.RPR + Numbers.NUMBER_23 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_23_RIGHT_5HR = Action.RPR + Numbers.NUMBER_23 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_23_RIGHT_6HR = Action.RPR + Numbers.NUMBER_23 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_23_RIGHT_7HR = Action.RPR + Numbers.NUMBER_23 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_23_RIGHT_8HR = Action.RPR + Numbers.NUMBER_23 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_23_RIGHT_9HR = Action.RPR + Numbers.NUMBER_23 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_23_RIGHT_10HR = Action.RPR + Numbers.NUMBER_23 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_24_RIGHT_1HR = Action.RPR + Numbers.NUMBER_24 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_24_RIGHT_2HR = Action.RPR + Numbers.NUMBER_24 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_24_RIGHT_3HR = Action.RPR + Numbers.NUMBER_24 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_24_RIGHT_4HR = Action.RPR + Numbers.NUMBER_24 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_24_RIGHT_5HR = Action.RPR + Numbers.NUMBER_24 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_24_RIGHT_6HR = Action.RPR + Numbers.NUMBER_24 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_24_RIGHT_7HR = Action.RPR + Numbers.NUMBER_24 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_24_RIGHT_8HR = Action.RPR + Numbers.NUMBER_24 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_24_RIGHT_9HR = Action.RPR + Numbers.NUMBER_24 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_24_RIGHT_10HR = Action.RPR + Numbers.NUMBER_24 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_25_RIGHT_1HR = Action.RPR + Numbers.NUMBER_25 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_25_RIGHT_2HR = Action.RPR + Numbers.NUMBER_25 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_25_RIGHT_3HR = Action.RPR + Numbers.NUMBER_25 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_25_RIGHT_4HR = Action.RPR + Numbers.NUMBER_25 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_25_RIGHT_5HR = Action.RPR + Numbers.NUMBER_25 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_25_RIGHT_6HR = Action.RPR + Numbers.NUMBER_25 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_25_RIGHT_7HR = Action.RPR + Numbers.NUMBER_25 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_25_RIGHT_8HR = Action.RPR + Numbers.NUMBER_25 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_25_RIGHT_9HR = Action.RPR + Numbers.NUMBER_25 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_25_RIGHT_10HR = Action.RPR + Numbers.NUMBER_25 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_26_RIGHT_1HR = Action.RPR + Numbers.NUMBER_26 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_26_RIGHT_2HR = Action.RPR + Numbers.NUMBER_26 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_26_RIGHT_3HR = Action.RPR + Numbers.NUMBER_26 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_26_RIGHT_4HR = Action.RPR + Numbers.NUMBER_26 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_26_RIGHT_5HR = Action.RPR + Numbers.NUMBER_26 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_26_RIGHT_6HR = Action.RPR + Numbers.NUMBER_26 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_26_RIGHT_7HR = Action.RPR + Numbers.NUMBER_26 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_26_RIGHT_8HR = Action.RPR + Numbers.NUMBER_26 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_26_RIGHT_9HR = Action.RPR + Numbers.NUMBER_26 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_26_RIGHT_10HR = Action.RPR + Numbers.NUMBER_26 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_27_RIGHT_1HR = Action.RPR + Numbers.NUMBER_27 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_27_RIGHT_2HR = Action.RPR + Numbers.NUMBER_27 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_27_RIGHT_3HR = Action.RPR + Numbers.NUMBER_27 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_27_RIGHT_4HR = Action.RPR + Numbers.NUMBER_27 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_27_RIGHT_5HR = Action.RPR + Numbers.NUMBER_27 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_27_RIGHT_6HR = Action.RPR + Numbers.NUMBER_27 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_27_RIGHT_7HR = Action.RPR + Numbers.NUMBER_27 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_27_RIGHT_8HR = Action.RPR + Numbers.NUMBER_27 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_27_RIGHT_9HR = Action.RPR + Numbers.NUMBER_27 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_27_RIGHT_10HR = Action.RPR + Numbers.NUMBER_27 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_28_RIGHT_1HR = Action.RPR + Numbers.NUMBER_28 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_28_RIGHT_2HR = Action.RPR + Numbers.NUMBER_28 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_28_RIGHT_3HR = Action.RPR + Numbers.NUMBER_28 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_28_RIGHT_4HR = Action.RPR + Numbers.NUMBER_28 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_28_RIGHT_5HR = Action.RPR + Numbers.NUMBER_28 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_28_RIGHT_6HR = Action.RPR + Numbers.NUMBER_28 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_28_RIGHT_7HR = Action.RPR + Numbers.NUMBER_28 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_28_RIGHT_8HR = Action.RPR + Numbers.NUMBER_28 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_28_RIGHT_9HR = Action.RPR + Numbers.NUMBER_28 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_28_RIGHT_10HR = Action.RPR + Numbers.NUMBER_28 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_29_RIGHT_1HR = Action.RPR + Numbers.NUMBER_29 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_29_RIGHT_2HR = Action.RPR + Numbers.NUMBER_29 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_29_RIGHT_3HR = Action.RPR + Numbers.NUMBER_29 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_29_RIGHT_4HR = Action.RPR + Numbers.NUMBER_29 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_29_RIGHT_5HR = Action.RPR + Numbers.NUMBER_29 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_29_RIGHT_6HR = Action.RPR + Numbers.NUMBER_29 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_29_RIGHT_7HR = Action.RPR + Numbers.NUMBER_29 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_29_RIGHT_8HR = Action.RPR + Numbers.NUMBER_29 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_29_RIGHT_9HR = Action.RPR + Numbers.NUMBER_29 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_29_RIGHT_10HR = Action.RPR + Numbers.NUMBER_29 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_30_RIGHT_1HR = Action.RPR + Numbers.NUMBER_30 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_30_RIGHT_2HR = Action.RPR + Numbers.NUMBER_30 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_30_RIGHT_3HR = Action.RPR + Numbers.NUMBER_30 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_30_RIGHT_4HR = Action.RPR + Numbers.NUMBER_30 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_30_RIGHT_5HR = Action.RPR + Numbers.NUMBER_30 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_30_RIGHT_6HR = Action.RPR + Numbers.NUMBER_30 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_30_RIGHT_7HR = Action.RPR + Numbers.NUMBER_30 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_30_RIGHT_8HR = Action.RPR + Numbers.NUMBER_30 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_30_RIGHT_9HR = Action.RPR + Numbers.NUMBER_30 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_30_RIGHT_10HR = Action.RPR + Numbers.NUMBER_30 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_31_RIGHT_1HR = Action.RPR + Numbers.NUMBER_31 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_31_RIGHT_2HR = Action.RPR + Numbers.NUMBER_31 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_31_RIGHT_3HR = Action.RPR + Numbers.NUMBER_31 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_31_RIGHT_4HR = Action.RPR + Numbers.NUMBER_31 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_31_RIGHT_5HR = Action.RPR + Numbers.NUMBER_31 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_31_RIGHT_6HR = Action.RPR + Numbers.NUMBER_31 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_31_RIGHT_7HR = Action.RPR + Numbers.NUMBER_31 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_31_RIGHT_8HR = Action.RPR + Numbers.NUMBER_31 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_31_RIGHT_9HR = Action.RPR + Numbers.NUMBER_31 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_31_RIGHT_10HR = Action.RPR + Numbers.NUMBER_31 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_32_RIGHT_1HR = Action.RPR + Numbers.NUMBER_32 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_32_RIGHT_2HR = Action.RPR + Numbers.NUMBER_32 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_32_RIGHT_3HR = Action.RPR + Numbers.NUMBER_32 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_32_RIGHT_4HR = Action.RPR + Numbers.NUMBER_32 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_32_RIGHT_5HR = Action.RPR + Numbers.NUMBER_32 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_32_RIGHT_6HR = Action.RPR + Numbers.NUMBER_32 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_32_RIGHT_7HR = Action.RPR + Numbers.NUMBER_32 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_32_RIGHT_8HR = Action.RPR + Numbers.NUMBER_32 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_32_RIGHT_9HR = Action.RPR + Numbers.NUMBER_32 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_32_RIGHT_10HR = Action.RPR + Numbers.NUMBER_32 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_33_RIGHT_1HR = Action.RPR + Numbers.NUMBER_33 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_33_RIGHT_2HR = Action.RPR + Numbers.NUMBER_33 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_33_RIGHT_3HR = Action.RPR + Numbers.NUMBER_33 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_33_RIGHT_4HR = Action.RPR + Numbers.NUMBER_33 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_33_RIGHT_5HR = Action.RPR + Numbers.NUMBER_33 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_33_RIGHT_6HR = Action.RPR + Numbers.NUMBER_33 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_33_RIGHT_7HR = Action.RPR + Numbers.NUMBER_33 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_33_RIGHT_8HR = Action.RPR + Numbers.NUMBER_33 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_33_RIGHT_9HR = Action.RPR + Numbers.NUMBER_33 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_33_RIGHT_10HR = Action.RPR + Numbers.NUMBER_33 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_34_RIGHT_1HR = Action.RPR + Numbers.NUMBER_34 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_34_RIGHT_2HR = Action.RPR + Numbers.NUMBER_34 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_34_RIGHT_3HR = Action.RPR + Numbers.NUMBER_34 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_34_RIGHT_4HR = Action.RPR + Numbers.NUMBER_34 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_34_RIGHT_5HR = Action.RPR + Numbers.NUMBER_34 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_34_RIGHT_6HR = Action.RPR + Numbers.NUMBER_34 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_34_RIGHT_7HR = Action.RPR + Numbers.NUMBER_34 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_34_RIGHT_8HR = Action.RPR + Numbers.NUMBER_34 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_34_RIGHT_9HR = Action.RPR + Numbers.NUMBER_34 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_34_RIGHT_10HR = Action.RPR + Numbers.NUMBER_34 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_35_RIGHT_1HR = Action.RPR + Numbers.NUMBER_35 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_35_RIGHT_2HR = Action.RPR + Numbers.NUMBER_35 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_35_RIGHT_3HR = Action.RPR + Numbers.NUMBER_35 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_35_RIGHT_4HR = Action.RPR + Numbers.NUMBER_35 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_35_RIGHT_5HR = Action.RPR + Numbers.NUMBER_35 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_35_RIGHT_6HR = Action.RPR + Numbers.NUMBER_35 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_35_RIGHT_7HR = Action.RPR + Numbers.NUMBER_35 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_35_RIGHT_8HR = Action.RPR + Numbers.NUMBER_35 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_35_RIGHT_9HR = Action.RPR + Numbers.NUMBER_35 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_35_RIGHT_10HR = Action.RPR + Numbers.NUMBER_35 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_36_RIGHT_1HR = Action.RPR + Numbers.NUMBER_36 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_36_RIGHT_2HR = Action.RPR + Numbers.NUMBER_36 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_36_RIGHT_3HR = Action.RPR + Numbers.NUMBER_36 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_36_RIGHT_4HR = Action.RPR + Numbers.NUMBER_36 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_36_RIGHT_5HR = Action.RPR + Numbers.NUMBER_36 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_36_RIGHT_6HR = Action.RPR + Numbers.NUMBER_36 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_36_RIGHT_7HR = Action.RPR + Numbers.NUMBER_36 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_36_RIGHT_8HR = Action.RPR + Numbers.NUMBER_36 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_36_RIGHT_9HR = Action.RPR + Numbers.NUMBER_36 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_36_RIGHT_10HR = Action.RPR + Numbers.NUMBER_36 + Position.RT + Labor.TEN_HR
    private const val RPR_NUMBER_37_RIGHT_1HR = Action.RPR + Numbers.NUMBER_37 + Position.RT + Labor.ONE_HR
    private const val RPR_NUMBER_37_RIGHT_2HR = Action.RPR + Numbers.NUMBER_37 + Position.RT + Labor.TWO_HR
    private const val RPR_NUMBER_37_RIGHT_3HR = Action.RPR + Numbers.NUMBER_37 + Position.RT + Labor.THREE_HR
    private const val RPR_NUMBER_37_RIGHT_4HR = Action.RPR + Numbers.NUMBER_37 + Position.RT + Labor.FOUR_HR
    private const val RPR_NUMBER_37_RIGHT_5HR = Action.RPR + Numbers.NUMBER_37 + Position.RT + Labor.FIVE_HR
    private const val RPR_NUMBER_37_RIGHT_6HR = Action.RPR + Numbers.NUMBER_37 + Position.RT + Labor.SIX_HR
    private const val RPR_NUMBER_37_RIGHT_7HR = Action.RPR + Numbers.NUMBER_37 + Position.RT + Labor.SEVEN_HR
    private const val RPR_NUMBER_37_RIGHT_8HR = Action.RPR + Numbers.NUMBER_37 + Position.RT + Labor.EIGHT_HR
    private const val RPR_NUMBER_37_RIGHT_9HR = Action.RPR + Numbers.NUMBER_37 + Position.RT + Labor.NINE_HR
    private const val RPR_NUMBER_37_RIGHT_10HR = Action.RPR + Numbers.NUMBER_37 + Position.RT + Labor.TEN_HR

    private const val RPR_NUMBER_1_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_2_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_3_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_4_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_5_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_6_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_7_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_8_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_9_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_10_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_11_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_12_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_13_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_14_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_15_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_16_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_17_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_18_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_19_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_20_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_21_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_22_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_23_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_24_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_25_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_26_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_27_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_28_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_29_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_30_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_31_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_32_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_33_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_34_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_35_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_36_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Position.RT + Commands.Labor.HALF_HR
    private const val RPR_NUMBER_37_RIGHT_HALFHR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Position.RT + Commands.Labor.HALF_HR

    private const val RPR_NUMBER_1_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_1_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_1_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_1_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_1_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_1_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_1_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_1_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_1_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_1 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_2_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_2_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_2_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_2_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_2_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_2_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_2_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_2_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_2_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_2 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_3_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_3_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_3_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_3_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_3_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_3_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_3_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_3_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_3_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_3 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_4_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_4_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_4_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_4_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_4_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_4_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_4_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_4_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_4_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_4 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_5_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_5_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_5_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_5_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_5_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_5_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_5_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_5_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_5_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_5 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_6_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_6_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_6_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_6_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_6_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_6_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_6_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_6_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_6_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_6 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_7_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_7_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_7_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_7_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_7_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_7_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_7_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_7_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_7_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_7 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_8_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_8_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_8_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_8_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_8_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_8_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_8_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_8_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_8_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_8 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_9_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_9_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_9_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_9_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_9_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_9_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_9_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_9_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_9_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_9 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_10_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_10_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_10_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_10_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_10_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_10_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_10_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_10_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_10_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_10 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_11_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_11_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_11_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_11_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_11_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_11_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_11_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_11_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_11_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_11 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_12_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_12_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_12_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_12_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_12_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_12_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_12_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_12_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_12_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_12 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_13_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_13_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_13_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_13_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_13_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_13_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_13_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_13_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_13_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_13 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_14_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_14_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_14_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_14_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_14_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_14_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_14_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_14_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_14_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_14 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_15_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_15_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_15_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_15_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_15_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_15_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_15_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_15_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_15_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_15 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_16_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_16_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_16_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_16_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_16_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_16_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_16_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_16_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_16_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_16 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_17_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_17_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_17_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_17_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_17_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_17_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_17_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_17_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_17_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_17 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_18_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_18_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_18_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_18_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_18_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_18_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_18_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_18_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_18_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_18 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_19_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_19_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_19_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_19_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_19_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_19_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_19_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_19_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_19_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_19 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_20_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_20_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_20_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_20_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_20_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_20_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_20_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_20_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_20_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_20 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_21_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_21_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_21_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_21_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_21_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_21_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_21_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_21_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_21_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_21 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_22_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_22_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_22_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_22_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_22_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_22_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_22_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_22_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_22_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_22 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_23_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_23_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_23_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_23_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_23_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_23_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_23_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_23_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_23_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_23 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_24_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_24_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_24_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_24_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_24_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_24_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_24_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_24_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_24_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_24 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_25_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_25_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_25_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_25_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_25_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_25_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_25_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_25_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_25_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_25 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_26_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_26_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_26_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_26_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_26_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_26_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_26_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_26_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_26_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_26 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_27_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_27_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_27_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_27_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_27_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_27_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_27_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_27_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_27_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_27 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_28_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_28_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_28_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_28_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_28_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_28_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_28_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_28_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_28_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_28 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_29_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_29_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_29_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_29_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_29_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_29_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_29_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_29_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_29_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_29 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_30_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_30_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_30_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_30_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_30_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_30_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_30_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_30_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_30_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_30 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_31_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_31_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_31_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_31_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_31_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_31_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_31_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_31_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_31_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_31 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_32_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_32_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_32_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_32_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_32_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_32_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_32_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_32_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_32_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_32 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_33_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_33_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_33_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_33_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_33_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_33_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_33_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_33_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_33_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_33 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_34_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_34_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_34_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_34_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_34_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_34_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_34_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_34_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_34_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_34 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_35_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_35_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_35_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_35_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_35_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_35_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_35_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_35_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_35_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_35 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_36_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_36_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_36_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_36_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_36_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_36_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_36_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_36_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_36_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_36 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR
    private const val RPR_NUMBER_37_RIGHT_1_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Position.RT + Commands.Labor.ONE_HALF_HR
    private const val RPR_NUMBER_37_RIGHT_2_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Position.RT + Commands.Labor.TWO_HALF_HR
    private const val RPR_NUMBER_37_RIGHT_3_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Position.RT + Commands.Labor.THREE_HALF_HR
    private const val RPR_NUMBER_37_RIGHT_4_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Position.RT + Commands.Labor.FOUR_HALF_HR
    private const val RPR_NUMBER_37_RIGHT_5_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Position.RT + Commands.Labor.FIVE_HALF_HR
    private const val RPR_NUMBER_37_RIGHT_6_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Position.RT + Commands.Labor.SIX_HALF_HR
    private const val RPR_NUMBER_37_RIGHT_7_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Position.RT + Commands.Labor.SEVEN_HALF_HR
    private const val RPR_NUMBER_37_RIGHT_8_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Position.RT + Commands.Labor.EIGHT_HALF_HR
    private const val RPR_NUMBER_37_RIGHT_9_5HR = Commands.Action.RPR + Commands.Numbers.NUMBER_37 + Commands.Position.RT + Commands.Labor.NINE_HALF_HR

    /** Perform repair on front bumper cover **/
    private const val RPRFBC_1HR = Action.RPRFBC + Labor.ONE_HR
    private const val RPRFBC_2HR = Action.RPRFBC + Labor.TWO_HR
    private const val RPRFBC_3HR = Action.RPRFBC + Labor.THREE_HR
    private const val RPRFBC_4HR = Action.RPRFBC + Labor.FOUR_HR
    private const val RPRFBC_5HR = Action.RPRFBC + Labor.FIVE_HR
    private const val RPRFBC_6HR = Action.RPRFBC + Labor.SIX_HR
    private const val RPRFBC_7HR = Action.RPRFBC + Labor.SEVEN_HR
    private const val RPRFBC_8HR = Action.RPRFBC + Labor.EIGHT_HR
    private const val RPRFBC_9HR = Action.RPRFBC + Labor.NINE_HR
    private const val RPRFBC_10HR = Action.RPRFBC + Labor.TEN_HR
    private const val RPRFBC_HALFHR = Action.RPRFBC + Labor.HALF_HR
    private const val RPRFBC_1_5HR = Action.RPRFBC + Labor.ONE_HALF_HR
    private const val RPRFBC_2_5HR = Action.RPRFBC + Labor.TWO_HALF_HR
    private const val RPRFBC_3_5HR = Action.RPRFBC + Labor.THREE_HALF_HR
    private const val RPRFBC_4_5HR = Action.RPRFBC + Labor.FOUR_HALF_HR
    private const val RPRFBC_5_5HR = Action.RPRFBC + Labor.FIVE_HALF_HR
    private const val RPRFBC_6_5HR = Action.RPRFBC + Labor.SIX_HALF_HR
    private const val RPRFBC_7_5HR = Action.RPRFBC + Labor.SEVEN_HALF_HR
    private const val RPRFBC_8_5HR = Action.RPRFBC + Labor.EIGHT_HALF_HR
    private const val RPRFBC_9_5HR = Action.RPRFBC + Labor.NINE_HALF_HR

    private const val RPRFB_1HR = Action.RPRFB + Labor.ONE_HR
    private const val RPRFB_2HR = Action.RPRFB + Labor.TWO_HR
    private const val RPRFB_3HR = Action.RPRFB + Labor.THREE_HR
    private const val RPRFB_4HR = Action.RPRFB + Labor.FOUR_HR
    private const val RPRFB_5HR = Action.RPRFB + Labor.FIVE_HR
    private const val RPRFB_6HR = Action.RPRFB + Labor.SIX_HR
    private const val RPRFB_7HR = Action.RPRFB + Labor.SEVEN_HR
    private const val RPRFB_8HR = Action.RPRFB + Labor.EIGHT_HR
    private const val RPRFB_9HR = Action.RPRFB + Labor.NINE_HR
    private const val RPRFB_10HR = Action.RPRFB + Labor.TEN_HR
    private const val RPRFB_HALFHR = Action.RPRFB + Labor.HALF_HR
    private const val RPRFB_1_5HR = Action.RPRFB + Labor.ONE_HALF_HR
    private const val RPRFB_2_5HR = Action.RPRFB + Labor.TWO_HALF_HR
    private const val RPRFB_3_5HR = Action.RPRFB + Labor.THREE_HALF_HR
    private const val RPRFB_4_5HR = Action.RPRFB + Labor.FOUR_HALF_HR
    private const val RPRFB_5_5HR = Action.RPRFB + Labor.FIVE_HALF_HR
    private const val RPRFB_6_5HR = Action.RPRFB + Labor.SIX_HALF_HR
    private const val RPRFB_7_5HR = Action.RPRFB + Labor.SEVEN_HALF_HR
    private const val RPRFB_8_5HR = Action.RPRFB + Labor.EIGHT_HALF_HR
    private const val RPRFB_9_5HR = Action.RPRFB + Labor.NINE_HALF_HR

    /** Perform repair on left fender **/
    private const val RPRLF_1HR = Commands.Action.RPRLF + Commands.Labor.ONE_HR
    private const val RPRLF_2HR = Commands.Action.RPRLF + Commands.Labor.TWO_HR
    private const val RPRLF_3HR = Commands.Action.RPRLF + Commands.Labor.THREE_HR
    private const val RPRLF_4HR = Commands.Action.RPRLF + Commands.Labor.FOUR_HR
    private const val RPRLF_5HR = Commands.Action.RPRLF + Commands.Labor.FIVE_HR
    private const val RPRLF_6HR = Commands.Action.RPRLF + Commands.Labor.SIX_HR
    private const val RPRLF_7HR = Commands.Action.RPRLF + Commands.Labor.SEVEN_HR
    private const val RPRLF_8HR = Commands.Action.RPRLF + Commands.Labor.EIGHT_HR
    private const val RPRLF_9HR = Commands.Action.RPRLF + Commands.Labor.NINE_HR
    private const val RPRLF_10HR = Commands.Action.RPRLF + Commands.Labor.TEN_HR
    private const val RPRLF_HALFHR = Action.RPRLF + Labor.HALF_HR
    private const val RPRLF_1_5HR = Commands.Action.RPRLF + Commands.Labor.ONE_HALF_HR
    private const val RPRLF_2_5HR = Commands.Action.RPRLF + Commands.Labor.TWO_HALF_HR
    private const val RPRLF_3_5HR = Commands.Action.RPRLF + Commands.Labor.THREE_HALF_HR
    private const val RPRLF_4_5HR = Commands.Action.RPRLF + Commands.Labor.FOUR_HALF_HR
    private const val RPRLF_5_5HR = Commands.Action.RPRLF + Commands.Labor.FIVE_HALF_HR
    private const val RPRLF_6_5HR = Commands.Action.RPRLF + Commands.Labor.SIX_HALF_HR
    private const val RPRLF_7_5HR = Commands.Action.RPRLF + Commands.Labor.SEVEN_HALF_HR
    private const val RPRLF_8_5HR = Commands.Action.RPRLF + Commands.Labor.EIGHT_HALF_HR
    private const val RPRLF_9_5HR = Commands.Action.RPRLF + Commands.Labor.NINE_HALF_HR

    /** Perform repair on right fender **/
    private const val RPRRF_1HR = Commands.Action.RPRRF + Commands.Labor.ONE_HR
    private const val RPRRF_2HR = Commands.Action.RPRRF + Commands.Labor.TWO_HR
    private const val RPRRF_3HR = Commands.Action.RPRRF + Commands.Labor.THREE_HR
    private const val RPRRF_4HR = Commands.Action.RPRRF + Commands.Labor.FOUR_HR
    private const val RPRRF_5HR = Commands.Action.RPRRF + Commands.Labor.FIVE_HR
    private const val RPRRF_6HR = Commands.Action.RPRRF + Commands.Labor.SIX_HR
    private const val RPRRF_7HR = Commands.Action.RPRRF + Commands.Labor.SEVEN_HR
    private const val RPRRF_8HR = Commands.Action.RPRRF + Commands.Labor.EIGHT_HR
    private const val RPRRF_9HR = Commands.Action.RPRRF + Commands.Labor.NINE_HR
    private const val RPRRF_10HR = Commands.Action.RPRRF + Commands.Labor.TEN_HR
    private const val RPRRF_HALFHR = Action.RPRRF + Labor.HALF_HR
    private const val RPRRF_1_5HR = Commands.Action.RPRRF + Commands.Labor.ONE_HALF_HR
    private const val RPRRF_2_5HR = Commands.Action.RPRRF + Commands.Labor.TWO_HALF_HR
    private const val RPRRF_3_5HR = Commands.Action.RPRRF + Commands.Labor.THREE_HALF_HR
    private const val RPRRF_4_5HR = Commands.Action.RPRRF + Commands.Labor.FOUR_HALF_HR
    private const val RPRRF_5_5HR = Commands.Action.RPRRF + Commands.Labor.FIVE_HALF_HR
    private const val RPRRF_6_5HR = Commands.Action.RPRRF + Commands.Labor.SIX_HALF_HR
    private const val RPRRF_7_5HR = Commands.Action.RPRRF + Commands.Labor.SEVEN_HALF_HR
    private const val RPRRF_8_5HR = Commands.Action.RPRRF + Commands.Labor.EIGHT_HALF_HR
    private const val RPRRF_9_5HR = Commands.Action.RPRRF + Commands.Labor.NINE_HALF_HR

    /** Perform repair on left front door **/
    private const val RPRLFD_1HR = Commands.Action.RPRLFD + Commands.Labor.ONE_HR
    private const val RPRLFD_2HR = Commands.Action.RPRLFD + Commands.Labor.TWO_HR
    private const val RPRLFD_3HR = Commands.Action.RPRLFD + Commands.Labor.THREE_HR
    private const val RPRLFD_4HR = Commands.Action.RPRLFD + Commands.Labor.FOUR_HR
    private const val RPRLFD_5HR = Commands.Action.RPRLFD + Commands.Labor.FIVE_HR
    private const val RPRLFD_6HR = Commands.Action.RPRLFD + Commands.Labor.SIX_HR
    private const val RPRLFD_7HR = Commands.Action.RPRLFD + Commands.Labor.SEVEN_HR
    private const val RPRLFD_8HR = Commands.Action.RPRLFD + Commands.Labor.EIGHT_HR
    private const val RPRLFD_9HR = Commands.Action.RPRLFD + Commands.Labor.NINE_HR
    private const val RPRLFD_10HR = Commands.Action.RPRLFD + Commands.Labor.TEN_HR
    private const val RPRLFD_HALFHR = Action.RPRLFD + Labor.HALF_HR
    private const val RPRLFD_1_5HR = Commands.Action.RPRLFD + Commands.Labor.ONE_HALF_HR
    private const val RPRLFD_2_5HR = Commands.Action.RPRLFD + Commands.Labor.TWO_HALF_HR
    private const val RPRLFD_3_5HR = Commands.Action.RPRLFD + Commands.Labor.THREE_HALF_HR
    private const val RPRLFD_4_5HR = Commands.Action.RPRLFD + Commands.Labor.FOUR_HALF_HR
    private const val RPRLFD_5_5HR = Commands.Action.RPRLFD + Commands.Labor.FIVE_HALF_HR
    private const val RPRLFD_6_5HR = Commands.Action.RPRLFD + Commands.Labor.SIX_HALF_HR
    private const val RPRLFD_7_5HR = Commands.Action.RPRLFD + Commands.Labor.SEVEN_HALF_HR
    private const val RPRLFD_8_5HR = Commands.Action.RPRLFD + Commands.Labor.EIGHT_HALF_HR
    private const val RPRLFD_9_5HR = Commands.Action.RPRLFD + Commands.Labor.NINE_HALF_HR

    /** Perform repair on right front door **/
    private const val RPRRFD_1HR = Commands.Action.RPRRFD + Commands.Labor.ONE_HR
    private const val RPRRFD_2HR = Commands.Action.RPRRFD + Commands.Labor.TWO_HR
    private const val RPRRFD_3HR = Commands.Action.RPRRFD + Commands.Labor.THREE_HR
    private const val RPRRFD_4HR = Commands.Action.RPRRFD + Commands.Labor.FOUR_HR
    private const val RPRRFD_5HR = Commands.Action.RPRRFD + Commands.Labor.FIVE_HR
    private const val RPRRFD_6HR = Commands.Action.RPRRFD + Commands.Labor.SIX_HR
    private const val RPRRFD_7HR = Commands.Action.RPRRFD + Commands.Labor.SEVEN_HR
    private const val RPRRFD_8HR = Commands.Action.RPRRFD + Commands.Labor.EIGHT_HR
    private const val RPRRFD_9HR = Commands.Action.RPRRFD + Commands.Labor.NINE_HR
    private const val RPRRFD_10HR = Commands.Action.RPRRFD + Commands.Labor.TEN_HR
    private const val RPRRFD_HALFHR = Action.RPRRFD + Labor.HALF_HR
    private const val RPRRFD_1_5HR = Commands.Action.RPRRFD + Commands.Labor.ONE_HALF_HR
    private const val RPRRFD_2_5HR = Commands.Action.RPRRFD + Commands.Labor.TWO_HALF_HR
    private const val RPRRFD_3_5HR = Commands.Action.RPRRFD + Commands.Labor.THREE_HALF_HR
    private const val RPRRFD_4_5HR = Commands.Action.RPRRFD + Commands.Labor.FOUR_HALF_HR
    private const val RPRRFD_5_5HR = Commands.Action.RPRRFD + Commands.Labor.FIVE_HALF_HR
    private const val RPRRFD_6_5HR = Commands.Action.RPRRFD + Commands.Labor.SIX_HALF_HR
    private const val RPRRFD_7_5HR = Commands.Action.RPRRFD + Commands.Labor.SEVEN_HALF_HR
    private const val RPRRFD_8_5HR = Commands.Action.RPRRFD + Commands.Labor.EIGHT_HALF_HR
    private const val RPRRFD_9_5HR = Commands.Action.RPRRFD + Commands.Labor.NINE_HALF_HR

    /** Perform repair on left rear door **/
    private const val RPRLRD_1HR = Commands.Action.RPRLRD + Commands.Labor.ONE_HR
    private const val RPRLRD_2HR = Commands.Action.RPRLRD + Commands.Labor.TWO_HR
    private const val RPRLRD_3HR = Commands.Action.RPRLRD + Commands.Labor.THREE_HR
    private const val RPRLRD_4HR = Commands.Action.RPRLRD + Commands.Labor.FOUR_HR
    private const val RPRLRD_5HR = Commands.Action.RPRLRD + Commands.Labor.FIVE_HR
    private const val RPRLRD_6HR = Commands.Action.RPRLRD + Commands.Labor.SIX_HR
    private const val RPRLRD_7HR = Commands.Action.RPRLRD + Commands.Labor.SEVEN_HR
    private const val RPRLRD_8HR = Commands.Action.RPRLRD + Commands.Labor.EIGHT_HR
    private const val RPRLRD_9HR = Commands.Action.RPRLRD + Commands.Labor.NINE_HR
    private const val RPRLRD_10HR = Commands.Action.RPRLRD + Commands.Labor.TEN_HR
    private const val RPRLRD_HALFHR = Action.RPRLRD + Labor.HALF_HR
    private const val RPRLRD_1_5HR = Commands.Action.RPRLRD + Commands.Labor.ONE_HALF_HR
    private const val RPRLRD_2_5HR = Commands.Action.RPRLRD + Commands.Labor.TWO_HALF_HR
    private const val RPRLRD_3_5HR = Commands.Action.RPRLRD + Commands.Labor.THREE_HALF_HR
    private const val RPRLRD_4_5HR = Commands.Action.RPRLRD + Commands.Labor.FOUR_HALF_HR
    private const val RPRLRD_5_5HR = Commands.Action.RPRLRD + Commands.Labor.FIVE_HALF_HR
    private const val RPRLRD_6_5HR = Commands.Action.RPRLRD + Commands.Labor.SIX_HALF_HR
    private const val RPRLRD_7_5HR = Commands.Action.RPRLRD + Commands.Labor.SEVEN_HALF_HR
    private const val RPRLRD_8_5HR = Commands.Action.RPRLRD + Commands.Labor.EIGHT_HALF_HR
    private const val RPRLRD_9_5HR = Commands.Action.RPRLRD + Commands.Labor.NINE_HALF_HR

    /** Perform repair on right rear door **/
    private const val RPRRRD_1HR = Commands.Action.RPRRRD + Commands.Labor.ONE_HR
    private const val RPRRRD_2HR = Commands.Action.RPRRRD + Commands.Labor.TWO_HR
    private const val RPRRRD_3HR = Commands.Action.RPRRRD + Commands.Labor.THREE_HR
    private const val RPRRRD_4HR = Commands.Action.RPRRRD + Commands.Labor.FOUR_HR
    private const val RPRRRD_5HR = Commands.Action.RPRRRD + Commands.Labor.FIVE_HR
    private const val RPRRRD_6HR = Commands.Action.RPRRRD + Commands.Labor.SIX_HR
    private const val RPRRRD_7HR = Commands.Action.RPRRRD + Commands.Labor.SEVEN_HR
    private const val RPRRRD_8HR = Commands.Action.RPRRRD + Commands.Labor.EIGHT_HR
    private const val RPRRRD_9HR = Commands.Action.RPRRRD + Commands.Labor.NINE_HR
    private const val RPRRRD_10HR = Commands.Action.RPRRRD + Commands.Labor.TEN_HR
    private const val RPRRRD_HALFHR = Action.RPRRRD + Labor.HALF_HR
    private const val RPRRRD_1_5HR = Commands.Action.RPRRRD + Commands.Labor.ONE_HALF_HR
    private const val RPRRRD_2_5HR = Commands.Action.RPRRRD + Commands.Labor.TWO_HALF_HR
    private const val RPRRRD_3_5HR = Commands.Action.RPRRRD + Commands.Labor.THREE_HALF_HR
    private const val RPRRRD_4_5HR = Commands.Action.RPRRRD + Commands.Labor.FOUR_HALF_HR
    private const val RPRRRD_5_5HR = Commands.Action.RPRRRD + Commands.Labor.FIVE_HALF_HR
    private const val RPRRRD_6_5HR = Commands.Action.RPRRRD + Commands.Labor.SIX_HALF_HR
    private const val RPRRRD_7_5HR = Commands.Action.RPRRRD + Commands.Labor.SEVEN_HALF_HR
    private const val RPRRRD_8_5HR = Commands.Action.RPRRRD + Commands.Labor.EIGHT_HALF_HR
    private const val RPRRRD_9_5HR = Commands.Action.RPRRRD + Commands.Labor.NINE_HALF_HR

    /** Perform repair on left side loading door **/
    private const val RPRLSLD_1HR = Commands.Action.RPRLSLD + Commands.Labor.ONE_HR
    private const val RPRLSLD_2HR = Commands.Action.RPRLSLD + Commands.Labor.TWO_HR
    private const val RPRLSLD_3HR = Commands.Action.RPRLSLD + Commands.Labor.THREE_HR
    private const val RPRLSLD_4HR = Commands.Action.RPRLSLD + Commands.Labor.FOUR_HR
    private const val RPRLSLD_5HR = Commands.Action.RPRLSLD + Commands.Labor.FIVE_HR
    private const val RPRLSLD_6HR = Commands.Action.RPRLSLD + Commands.Labor.SIX_HR
    private const val RPRLSLD_7HR = Commands.Action.RPRLSLD + Commands.Labor.SEVEN_HR
    private const val RPRLSLD_8HR = Commands.Action.RPRLSLD + Commands.Labor.EIGHT_HR
    private const val RPRLSLD_9HR = Commands.Action.RPRLSLD + Commands.Labor.NINE_HR
    private const val RPRLSLD_10HR = Commands.Action.RPRLSLD + Commands.Labor.TEN_HR
    private const val RPRLSLD_HALFHR = Action.RPRLSLD + Labor.HALF_HR
    private const val RPRLSLD_1_5HR = Commands.Action.RPRLSLD + Commands.Labor.ONE_HALF_HR
    private const val RPRLSLD_2_5HR = Commands.Action.RPRLSLD + Commands.Labor.TWO_HALF_HR
    private const val RPRLSLD_3_5HR = Commands.Action.RPRLSLD + Commands.Labor.THREE_HALF_HR
    private const val RPRLSLD_4_5HR = Commands.Action.RPRLSLD + Commands.Labor.FOUR_HALF_HR
    private const val RPRLSLD_5_5HR = Commands.Action.RPRLSLD + Commands.Labor.FIVE_HALF_HR
    private const val RPRLSLD_6_5HR = Commands.Action.RPRLSLD + Commands.Labor.SIX_HALF_HR
    private const val RPRLSLD_7_5HR = Commands.Action.RPRLSLD + Commands.Labor.SEVEN_HALF_HR
    private const val RPRLSLD_8_5HR = Commands.Action.RPRLSLD + Commands.Labor.EIGHT_HALF_HR
    private const val RPRLSLD_9_5HR = Commands.Action.RPRLSLD + Commands.Labor.NINE_HALF_HR

    /** Perform repair on right side loading door **/
    private const val RPRRSLD_1HR = Commands.Action.RPRRSLD + Commands.Labor.ONE_HR
    private const val RPRRSLD_2HR = Commands.Action.RPRRSLD + Commands.Labor.TWO_HR
    private const val RPRRSLD_3HR = Commands.Action.RPRRSLD + Commands.Labor.THREE_HR
    private const val RPRRSLD_4HR = Commands.Action.RPRRSLD + Commands.Labor.FOUR_HR
    private const val RPRRSLD_5HR = Commands.Action.RPRRSLD + Commands.Labor.FIVE_HR
    private const val RPRRSLD_6HR = Commands.Action.RPRRSLD + Commands.Labor.SIX_HR
    private const val RPRRSLD_7HR = Commands.Action.RPRRSLD + Commands.Labor.SEVEN_HR
    private const val RPRRSLD_8HR = Commands.Action.RPRRSLD + Commands.Labor.EIGHT_HR
    private const val RPRRSLD_9HR = Commands.Action.RPRRSLD + Commands.Labor.NINE_HR
    private const val RPRRSLD_10HR = Commands.Action.RPRRSLD + Commands.Labor.TEN_HR
    private const val RPRRSLD_HALFHR = Commands.Action.RPRRSLD + Commands.Labor.HALF_HR
    private const val RPRRSLD_1_5HR = Commands.Action.RPRRSLD + Commands.Labor.ONE_HALF_HR
    private const val RPRRSLD_2_5HR = Commands.Action.RPRRSLD + Commands.Labor.TWO_HALF_HR
    private const val RPRRSLD_3_5HR = Commands.Action.RPRRSLD + Commands.Labor.THREE_HALF_HR
    private const val RPRRSLD_4_5HR = Commands.Action.RPRRSLD + Commands.Labor.FOUR_HALF_HR
    private const val RPRRSLD_5_5HR = Commands.Action.RPRRSLD + Commands.Labor.FIVE_HALF_HR
    private const val RPRRSLD_6_5HR = Commands.Action.RPRRSLD + Commands.Labor.SIX_HALF_HR
    private const val RPRRSLD_7_5HR = Commands.Action.RPRRSLD + Commands.Labor.SEVEN_HALF_HR
    private const val RPRRSLD_8_5HR = Commands.Action.RPRRSLD + Commands.Labor.EIGHT_HALF_HR
    private const val RPRRSLD_9_5HR = Commands.Action.RPRRSLD + Commands.Labor.NINE_HALF_HR

    /** Perform repair on left rocker molding **/
    private const val RPRLRM_1HR = Commands.Action.RPRLRM + Commands.Labor.ONE_HR
    private const val RPRLRM_2HR = Commands.Action.RPRLRM + Commands.Labor.TWO_HR
    private const val RPRLRM_3HR = Commands.Action.RPRLRM + Commands.Labor.THREE_HR
    private const val RPRLRM_4HR = Commands.Action.RPRLRM + Commands.Labor.FOUR_HR
    private const val RPRLRM_5HR = Commands.Action.RPRLRM + Commands.Labor.FIVE_HR
    private const val RPRLRM_6HR = Commands.Action.RPRLRM + Commands.Labor.SIX_HR
    private const val RPRLRM_7HR = Commands.Action.RPRLRM + Commands.Labor.SEVEN_HR
    private const val RPRLRM_8HR = Commands.Action.RPRLRM + Commands.Labor.EIGHT_HR
    private const val RPRLRM_9HR = Commands.Action.RPRLRM + Commands.Labor.NINE_HR
    private const val RPRLRM_10HR = Commands.Action.RPRLRM + Commands.Labor.TEN_HR
    private const val RPRLRM_HALFHR = Commands.Action.RPRLRM + Commands.Labor.HALF_HR
    private const val RPRLRM_1_5HR = Commands.Action.RPRLRM + Commands.Labor.ONE_HALF_HR
    private const val RPRLRM_2_5HR = Commands.Action.RPRLRM + Commands.Labor.TWO_HALF_HR
    private const val RPRLRM_3_5HR = Commands.Action.RPRLRM + Commands.Labor.THREE_HALF_HR
    private const val RPRLRM_4_5HR = Commands.Action.RPRLRM + Commands.Labor.FOUR_HALF_HR
    private const val RPRLRM_5_5HR = Commands.Action.RPRLRM + Commands.Labor.FIVE_HALF_HR
    private const val RPRLRM_6_5HR = Commands.Action.RPRLRM + Commands.Labor.SIX_HALF_HR
    private const val RPRLRM_7_5HR = Commands.Action.RPRLRM + Commands.Labor.SEVEN_HALF_HR
    private const val RPRLRM_8_5HR = Commands.Action.RPRLRM + Commands.Labor.EIGHT_HALF_HR
    private const val RPRLRM_9_5HR = Commands.Action.RPRLRM + Commands.Labor.NINE_HALF_HR

    private const val RPRLR_1HR = Commands.Action.RPRLR + Commands.Labor.ONE_HR
    private const val RPRLR_2HR = Commands.Action.RPRLR + Commands.Labor.TWO_HR
    private const val RPRLR_3HR = Commands.Action.RPRLR + Commands.Labor.THREE_HR
    private const val RPRLR_4HR = Commands.Action.RPRLR + Commands.Labor.FOUR_HR
    private const val RPRLR_5HR = Commands.Action.RPRLR + Commands.Labor.FIVE_HR
    private const val RPRLR_6HR = Commands.Action.RPRLR + Commands.Labor.SIX_HR
    private const val RPRLR_7HR = Commands.Action.RPRLR + Commands.Labor.SEVEN_HR
    private const val RPRLR_8HR = Commands.Action.RPRLR + Commands.Labor.EIGHT_HR
    private const val RPRLR_9HR = Commands.Action.RPRLR + Commands.Labor.NINE_HR
    private const val RPRLR_10HR = Commands.Action.RPRLR + Commands.Labor.TEN_HR
    private const val RPRLR_HALFHR = Commands.Action.RPRLR + Commands.Labor.HALF_HR
    private const val RPRLR_1_5HR = Commands.Action.RPRLR + Commands.Labor.ONE_HALF_HR
    private const val RPRLR_2_5HR = Commands.Action.RPRLR + Commands.Labor.TWO_HALF_HR
    private const val RPRLR_3_5HR = Commands.Action.RPRLR + Commands.Labor.THREE_HALF_HR
    private const val RPRLR_4_5HR = Commands.Action.RPRLR + Commands.Labor.FOUR_HALF_HR
    private const val RPRLR_5_5HR = Commands.Action.RPRLR + Commands.Labor.FIVE_HALF_HR
    private const val RPRLR_6_5HR = Commands.Action.RPRLR + Commands.Labor.SIX_HALF_HR
    private const val RPRLR_7_5HR = Commands.Action.RPRLR + Commands.Labor.SEVEN_HALF_HR
    private const val RPRLR_8_5HR = Commands.Action.RPRLR + Commands.Labor.EIGHT_HALF_HR
    private const val RPRLR_9_5HR = Commands.Action.RPRLR + Commands.Labor.NINE_HALF_HR

    /** Perform repair on right rocker molding **/
    private const val RPRRRM_1HR = Commands.Action.RPRRRM + Commands.Labor.ONE_HR
    private const val RPRRRM_2HR = Commands.Action.RPRRRM + Commands.Labor.TWO_HR
    private const val RPRRRM_3HR = Commands.Action.RPRRRM + Commands.Labor.THREE_HR
    private const val RPRRRM_4HR = Commands.Action.RPRRRM + Commands.Labor.FOUR_HR
    private const val RPRRRM_5HR = Commands.Action.RPRRRM + Commands.Labor.FIVE_HR
    private const val RPRRRM_6HR = Commands.Action.RPRRRM + Commands.Labor.SIX_HR
    private const val RPRRRM_7HR = Commands.Action.RPRRRM + Commands.Labor.SEVEN_HR
    private const val RPRRRM_8HR = Commands.Action.RPRRRM + Commands.Labor.EIGHT_HR
    private const val RPRRRM_9HR = Commands.Action.RPRRRM + Commands.Labor.NINE_HR
    private const val RPRRRM_10HR = Commands.Action.RPRRRM + Commands.Labor.TEN_HR
    private const val RPRRRM_HALFHR = Commands.Action.RPRRRM + Commands.Labor.HALF_HR
    private const val RPRRRM_1_5HR = Commands.Action.RPRRRM + Commands.Labor.ONE_HALF_HR
    private const val RPRRRM_2_5HR = Commands.Action.RPRRRM + Commands.Labor.TWO_HALF_HR
    private const val RPRRRM_3_5HR = Commands.Action.RPRRRM + Commands.Labor.THREE_HALF_HR
    private const val RPRRRM_4_5HR = Commands.Action.RPRRRM + Commands.Labor.FOUR_HALF_HR
    private const val RPRRRM_5_5HR = Commands.Action.RPRRRM + Commands.Labor.FIVE_HALF_HR
    private const val RPRRRM_6_5HR = Commands.Action.RPRRRM + Commands.Labor.SIX_HALF_HR
    private const val RPRRRM_7_5HR = Commands.Action.RPRRRM + Commands.Labor.SEVEN_HALF_HR
    private const val RPRRRM_8_5HR = Commands.Action.RPRRRM + Commands.Labor.EIGHT_HALF_HR
    private const val RPRRRM_9_5HR = Commands.Action.RPRRRM + Commands.Labor.NINE_HALF_HR

    private const val RPRRR_1HR = Commands.Action.RPRRR + Commands.Labor.ONE_HR
    private const val RPRRR_2HR = Commands.Action.RPRRR + Commands.Labor.TWO_HR
    private const val RPRRR_3HR = Commands.Action.RPRRR + Commands.Labor.THREE_HR
    private const val RPRRR_4HR = Commands.Action.RPRRR + Commands.Labor.FOUR_HR
    private const val RPRRR_5HR = Commands.Action.RPRRR + Commands.Labor.FIVE_HR
    private const val RPRRR_6HR = Commands.Action.RPRRR + Commands.Labor.SIX_HR
    private const val RPRRR_7HR = Commands.Action.RPRRR + Commands.Labor.SEVEN_HR
    private const val RPRRR_8HR = Commands.Action.RPRRR + Commands.Labor.EIGHT_HR
    private const val RPRRR_9HR = Commands.Action.RPRRR + Commands.Labor.NINE_HR
    private const val RPRRR_10HR = Commands.Action.RPRRR + Commands.Labor.TEN_HR
    private const val RPRRR_HALFHR = Commands.Action.RPRRR + Commands.Labor.HALF_HR
    private const val RPRRR_1_5HR = Commands.Action.RPRRR + Commands.Labor.ONE_HALF_HR
    private const val RPRRR_2_5HR = Commands.Action.RPRRR + Commands.Labor.TWO_HALF_HR
    private const val RPRRR_3_5HR = Commands.Action.RPRRR + Commands.Labor.THREE_HALF_HR
    private const val RPRRR_4_5HR = Commands.Action.RPRRR + Commands.Labor.FOUR_HALF_HR
    private const val RPRRR_5_5HR = Commands.Action.RPRRR + Commands.Labor.FIVE_HALF_HR
    private const val RPRRR_6_5HR = Commands.Action.RPRRR + Commands.Labor.SIX_HALF_HR
    private const val RPRRR_7_5HR = Commands.Action.RPRRR + Commands.Labor.SEVEN_HALF_HR
    private const val RPRRR_8_5HR = Commands.Action.RPRRR + Commands.Labor.EIGHT_HALF_HR
    private const val RPRRR_9_5HR = Commands.Action.RPRRR + Commands.Labor.NINE_HALF_HR

    /** Perform repair on left quarter panel **/
    private const val RPRLQP_1HR = Commands.Action.RPRLQP + Commands.Labor.ONE_HR
    private const val RPRLQP_2HR = Commands.Action.RPRLQP + Commands.Labor.TWO_HR
    private const val RPRLQP_3HR = Commands.Action.RPRLQP + Commands.Labor.THREE_HR
    private const val RPRLQP_4HR = Commands.Action.RPRLQP + Commands.Labor.FOUR_HR
    private const val RPRLQP_5HR = Commands.Action.RPRLQP + Commands.Labor.FIVE_HR
    private const val RPRLQP_6HR = Commands.Action.RPRLQP + Commands.Labor.SIX_HR
    private const val RPRLQP_7HR = Commands.Action.RPRLQP + Commands.Labor.SEVEN_HR
    private const val RPRLQP_8HR = Commands.Action.RPRLQP + Commands.Labor.EIGHT_HR
    private const val RPRLQP_9HR = Commands.Action.RPRLQP + Commands.Labor.NINE_HR
    private const val RPRLQP_10HR = Commands.Action.RPRLQP + Commands.Labor.TEN_HR
    private const val RPRLQP_HALFHR = Commands.Action.RPRLQP + Commands.Labor.HALF_HR
    private const val RPRLQP_1_5HR = Commands.Action.RPRLQP + Commands.Labor.ONE_HALF_HR
    private const val RPRLQP_2_5HR = Commands.Action.RPRLQP + Commands.Labor.TWO_HALF_HR
    private const val RPRLQP_3_5HR = Commands.Action.RPRLQP + Commands.Labor.THREE_HALF_HR
    private const val RPRLQP_4_5HR = Commands.Action.RPRLQP + Commands.Labor.FOUR_HALF_HR
    private const val RPRLQP_5_5HR = Commands.Action.RPRLQP + Commands.Labor.FIVE_HALF_HR
    private const val RPRLQP_6_5HR = Commands.Action.RPRLQP + Commands.Labor.SIX_HALF_HR
    private const val RPRLQP_7_5HR = Commands.Action.RPRLQP + Commands.Labor.SEVEN_HALF_HR
    private const val RPRLQP_8_5HR = Commands.Action.RPRLQP + Commands.Labor.EIGHT_HALF_HR
    private const val RPRLQP_9_5HR = Commands.Action.RPRLQP + Commands.Labor.NINE_HALF_HR

    /** Perform repair on left quarter CONVERSION **/
    private const val RPRLQ_1HR = Commands.Action.RPRLQ + Commands.Labor.ONE_HR
    private const val RPRLQ_2HR = Commands.Action.RPRLQ + Commands.Labor.TWO_HR
    private const val RPRLQ_3HR = Commands.Action.RPRLQ + Commands.Labor.THREE_HR
    private const val RPRLQ_4HR = Commands.Action.RPRLQ + Commands.Labor.FOUR_HR
    private const val RPRLQ_5HR = Commands.Action.RPRLQ + Commands.Labor.FIVE_HR
    private const val RPRLQ_6HR = Commands.Action.RPRLQ + Commands.Labor.SIX_HR
    private const val RPRLQ_7HR = Commands.Action.RPRLQ + Commands.Labor.SEVEN_HR
    private const val RPRLQ_8HR = Commands.Action.RPRLQ + Commands.Labor.EIGHT_HR
    private const val RPRLQ_9HR = Commands.Action.RPRLQ + Commands.Labor.NINE_HR
    private const val RPRLQ_10HR = Commands.Action.RPRLQ + Commands.Labor.TEN_HR
    private const val RPRLQ_HALFHR = Commands.Action.RPRLQ + Commands.Labor.HALF_HR
    private const val RPRLQ_1_5HR = Commands.Action.RPRLQ + Commands.Labor.ONE_HALF_HR
    private const val RPRLQ_2_5HR = Commands.Action.RPRLQ + Commands.Labor.TWO_HALF_HR
    private const val RPRLQ_3_5HR = Commands.Action.RPRLQ + Commands.Labor.THREE_HALF_HR
    private const val RPRLQ_4_5HR = Commands.Action.RPRLQ + Commands.Labor.FOUR_HALF_HR
    private const val RPRLQ_5_5HR = Commands.Action.RPRLQ + Commands.Labor.FIVE_HALF_HR
    private const val RPRLQ_6_5HR = Commands.Action.RPRLQ + Commands.Labor.SIX_HALF_HR
    private const val RPRLQ_7_5HR = Commands.Action.RPRLQ + Commands.Labor.SEVEN_HALF_HR
    private const val RPRLQ_8_5HR = Commands.Action.RPRLQ + Commands.Labor.EIGHT_HALF_HR
    private const val RPRLQ_9_5HR = Commands.Action.RPRLQ + Commands.Labor.NINE_HALF_HR

    /** Perform repair on right quarter panel **/
    private const val RPRRQP_1HR = Commands.Action.RPRRQP + Commands.Labor.ONE_HR
    private const val RPRRQP_2HR = Commands.Action.RPRRQP + Commands.Labor.TWO_HR
    private const val RPRRQP_3HR = Commands.Action.RPRRQP + Commands.Labor.THREE_HR
    private const val RPRRQP_4HR = Commands.Action.RPRRQP + Commands.Labor.FOUR_HR
    private const val RPRRQP_5HR = Commands.Action.RPRRQP + Commands.Labor.FIVE_HR
    private const val RPRRQP_6HR = Commands.Action.RPRRQP + Commands.Labor.SIX_HR
    private const val RPRRQP_7HR = Commands.Action.RPRRQP + Commands.Labor.SEVEN_HR
    private const val RPRRQP_8HR = Commands.Action.RPRRQP + Commands.Labor.EIGHT_HR
    private const val RPRRQP_9HR = Commands.Action.RPRRQP + Commands.Labor.NINE_HR
    private const val RPRRQP_10HR = Commands.Action.RPRRQP + Commands.Labor.TEN_HR
    private const val RPRRQP_HALFHR = Commands.Action.RPRRQP + Commands.Labor.HALF_HR
    private const val RPRRQP_1_5HR = Commands.Action.RPRRQP + Commands.Labor.ONE_HALF_HR
    private const val RPRRQP_2_5HR = Commands.Action.RPRRQP + Commands.Labor.TWO_HALF_HR
    private const val RPRRQP_3_5HR = Commands.Action.RPRRQP + Commands.Labor.THREE_HALF_HR
    private const val RPRRQP_4_5HR = Commands.Action.RPRRQP + Commands.Labor.FOUR_HALF_HR
    private const val RPRRQP_5_5HR = Commands.Action.RPRRQP + Commands.Labor.FIVE_HALF_HR
    private const val RPRRQP_6_5HR = Commands.Action.RPRRQP + Commands.Labor.SIX_HALF_HR
    private const val RPRRQP_7_5HR = Commands.Action.RPRRQP + Commands.Labor.SEVEN_HALF_HR
    private const val RPRRQP_8_5HR = Commands.Action.RPRRQP + Commands.Labor.EIGHT_HALF_HR
    private const val RPRRQP_9_5HR = Commands.Action.RPRRQP + Commands.Labor.NINE_HALF_HR

    /** Perform repair on right quarter CONVERSION **/
    private const val RPRRQ_1HR = Commands.Action.RPRRQ + Commands.Labor.ONE_HR
    private const val RPRRQ_2HR = Commands.Action.RPRRQ + Commands.Labor.TWO_HR
    private const val RPRRQ_3HR = Commands.Action.RPRRQ + Commands.Labor.THREE_HR
    private const val RPRRQ_4HR = Commands.Action.RPRRQ + Commands.Labor.FOUR_HR
    private const val RPRRQ_5HR = Commands.Action.RPRRQ + Commands.Labor.FIVE_HR
    private const val RPRRQ_6HR = Commands.Action.RPRRQ + Commands.Labor.SIX_HR
    private const val RPRRQ_7HR = Commands.Action.RPRRQ + Commands.Labor.SEVEN_HR
    private const val RPRRQ_8HR = Commands.Action.RPRRQ + Commands.Labor.EIGHT_HR
    private const val RPRRQ_9HR = Commands.Action.RPRRQ + Commands.Labor.NINE_HR
    private const val RPRRQ_10HR = Commands.Action.RPRRQ + Commands.Labor.TEN_HR
    private const val RPRRQ_HALFHR = Commands.Action.RPRRQ + Commands.Labor.HALF_HR
    private const val RPRRQ_1_5HR = Commands.Action.RPRRQ + Commands.Labor.ONE_HALF_HR
    private const val RPRRQ_2_5HR = Commands.Action.RPRRQ + Commands.Labor.TWO_HALF_HR
    private const val RPRRQ_3_5HR = Commands.Action.RPRRQ + Commands.Labor.THREE_HALF_HR
    private const val RPRRQ_4_5HR = Commands.Action.RPRRQ + Commands.Labor.FOUR_HALF_HR
    private const val RPRRQ_5_5HR = Commands.Action.RPRRQ + Commands.Labor.FIVE_HALF_HR
    private const val RPRRQ_6_5HR = Commands.Action.RPRRQ + Commands.Labor.SIX_HALF_HR
    private const val RPRRQ_7_5HR = Commands.Action.RPRRQ + Commands.Labor.SEVEN_HALF_HR
    private const val RPRRQ_8_5HR = Commands.Action.RPRRQ + Commands.Labor.EIGHT_HALF_HR
    private const val RPRRQ_9_5HR = Commands.Action.RPRRQ + Commands.Labor.NINE_HALF_HR

    /** Perform repair on left side panel **/
    private const val RPRLSP_1HR = Commands.Action.RPRLSP + Commands.Labor.ONE_HR
    private const val RPRLSP_2HR = Commands.Action.RPRLSP + Commands.Labor.TWO_HR
    private const val RPRLSP_3HR = Commands.Action.RPRLSP + Commands.Labor.THREE_HR
    private const val RPRLSP_4HR = Commands.Action.RPRLSP + Commands.Labor.FOUR_HR
    private const val RPRLSP_5HR = Commands.Action.RPRLSP + Commands.Labor.FIVE_HR
    private const val RPRLSP_6HR = Commands.Action.RPRLSP + Commands.Labor.SIX_HR
    private const val RPRLSP_7HR = Commands.Action.RPRLSP + Commands.Labor.SEVEN_HR
    private const val RPRLSP_8HR = Commands.Action.RPRLSP + Commands.Labor.EIGHT_HR
    private const val RPRLSP_9HR = Commands.Action.RPRLSP + Commands.Labor.NINE_HR
    private const val RPRLSP_10HR = Commands.Action.RPRLSP + Commands.Labor.TEN_HR
    private const val RPRLSP_HALFHR = Commands.Action.RPRLSP + Commands.Labor.HALF_HR
    private const val RPRLSP_1_5HR = Commands.Action.RPRLSP + Commands.Labor.ONE_HALF_HR
    private const val RPRLSP_2_5HR = Commands.Action.RPRLSP + Commands.Labor.TWO_HALF_HR
    private const val RPRLSP_3_5HR = Commands.Action.RPRLSP + Commands.Labor.THREE_HALF_HR
    private const val RPRLSP_4_5HR = Commands.Action.RPRLSP + Commands.Labor.FOUR_HALF_HR
    private const val RPRLSP_5_5HR = Commands.Action.RPRLSP + Commands.Labor.FIVE_HALF_HR
    private const val RPRLSP_6_5HR = Commands.Action.RPRLSP + Commands.Labor.SIX_HALF_HR
    private const val RPRLSP_7_5HR = Commands.Action.RPRLSP + Commands.Labor.SEVEN_HALF_HR
    private const val RPRLSP_8_5HR = Commands.Action.RPRLSP + Commands.Labor.EIGHT_HALF_HR
    private const val RPRLSP_9_5HR = Commands.Action.RPRLSP + Commands.Labor.NINE_HALF_HR

    /** Perform repair on right side panel **/
    private const val RPRRSP_1HR = Commands.Action.RPRRSP + Commands.Labor.ONE_HR
    private const val RPRRSP_2HR = Commands.Action.RPRRSP + Commands.Labor.TWO_HR
    private const val RPRRSP_3HR = Commands.Action.RPRRSP + Commands.Labor.THREE_HR
    private const val RPRRSP_4HR = Commands.Action.RPRRSP + Commands.Labor.FOUR_HR
    private const val RPRRSP_5HR = Commands.Action.RPRRSP + Commands.Labor.FIVE_HR
    private const val RPRRSP_6HR = Commands.Action.RPRRSP + Commands.Labor.SIX_HR
    private const val RPRRSP_7HR = Commands.Action.RPRRSP + Commands.Labor.SEVEN_HR
    private const val RPRRSP_8HR = Commands.Action.RPRRSP + Commands.Labor.EIGHT_HR
    private const val RPRRSP_9HR = Commands.Action.RPRRSP + Commands.Labor.NINE_HR
    private const val RPRRSP_10HR = Commands.Action.RPRRSP + Commands.Labor.TEN_HR
    private const val RPRRSP_HALFHR = Commands.Action.RPRRSP + Commands.Labor.HALF_HR
    private const val RPRRSP_1_5HR = Commands.Action.RPRRSP + Commands.Labor.ONE_HALF_HR
    private const val RPRRSP_2_5HR = Commands.Action.RPRRSP + Commands.Labor.TWO_HALF_HR
    private const val RPRRSP_3_5HR = Commands.Action.RPRRSP + Commands.Labor.THREE_HALF_HR
    private const val RPRRSP_4_5HR = Commands.Action.RPRRSP + Commands.Labor.FOUR_HALF_HR
    private const val RPRRSP_5_5HR = Commands.Action.RPRRSP + Commands.Labor.FIVE_HALF_HR
    private const val RPRRSP_6_5HR = Commands.Action.RPRRSP + Commands.Labor.SIX_HALF_HR
    private const val RPRRSP_7_5HR = Commands.Action.RPRRSP + Commands.Labor.SEVEN_HALF_HR
    private const val RPRRSP_8_5HR = Commands.Action.RPRRSP + Commands.Labor.EIGHT_HALF_HR
    private const val RPRRSP_9_5HR = Commands.Action.RPRRSP + Commands.Labor.NINE_HALF_HR

    /** Perform repair on left pickup panel **/
    private const val RPRLPP_1HR = Commands.Action.RPRLPP + Commands.Labor.ONE_HR
    private const val RPRLPP_2HR = Commands.Action.RPRLPP + Commands.Labor.TWO_HR
    private const val RPRLPP_3HR = Commands.Action.RPRLPP + Commands.Labor.THREE_HR
    private const val RPRLPP_4HR = Commands.Action.RPRLPP + Commands.Labor.FOUR_HR
    private const val RPRLPP_5HR = Commands.Action.RPRLPP + Commands.Labor.FIVE_HR
    private const val RPRLPP_6HR = Commands.Action.RPRLPP + Commands.Labor.SIX_HR
    private const val RPRLPP_7HR = Commands.Action.RPRLPP + Commands.Labor.SEVEN_HR
    private const val RPRLPP_8HR = Commands.Action.RPRLPP + Commands.Labor.EIGHT_HR
    private const val RPRLPP_9HR = Commands.Action.RPRLPP + Commands.Labor.NINE_HR
    private const val RPRLPP_10HR = Commands.Action.RPRLPP + Commands.Labor.TEN_HR
    private const val RPRLPP_HALFHR = Commands.Action.RPRLPP + Commands.Labor.HALF_HR
    private const val RPRLPP_1_5HR = Commands.Action.RPRLPP + Commands.Labor.ONE_HALF_HR
    private const val RPRLPP_2_5HR = Commands.Action.RPRLPP + Commands.Labor.TWO_HALF_HR
    private const val RPRLPP_3_5HR = Commands.Action.RPRLPP + Commands.Labor.THREE_HALF_HR
    private const val RPRLPP_4_5HR = Commands.Action.RPRLPP + Commands.Labor.FOUR_HALF_HR
    private const val RPRLPP_5_5HR = Commands.Action.RPRLPP + Commands.Labor.FIVE_HALF_HR
    private const val RPRLPP_6_5HR = Commands.Action.RPRLPP + Commands.Labor.SIX_HALF_HR
    private const val RPRLPP_7_5HR = Commands.Action.RPRLPP + Commands.Labor.SEVEN_HALF_HR
    private const val RPRLPP_8_5HR = Commands.Action.RPRLPP + Commands.Labor.EIGHT_HALF_HR
    private const val RPRLPP_9_5HR = Commands.Action.RPRLPP + Commands.Labor.NINE_HALF_HR

    /** Perform repair on right pickup panel **/
    private const val RPRRPP_1HR = Commands.Action.RPRRPP + Commands.Labor.ONE_HR
    private const val RPRRPP_2HR = Commands.Action.RPRRPP + Commands.Labor.TWO_HR
    private const val RPRRPP_3HR = Commands.Action.RPRRPP + Commands.Labor.THREE_HR
    private const val RPRRPP_4HR = Commands.Action.RPRRPP + Commands.Labor.FOUR_HR
    private const val RPRRPP_5HR = Commands.Action.RPRRPP + Commands.Labor.FIVE_HR
    private const val RPRRPP_6HR = Commands.Action.RPRRPP + Commands.Labor.SIX_HR
    private const val RPRRPP_7HR = Commands.Action.RPRRPP + Commands.Labor.SEVEN_HR
    private const val RPRRPP_8HR = Commands.Action.RPRRPP + Commands.Labor.EIGHT_HR
    private const val RPRRPP_9HR = Commands.Action.RPRRPP + Commands.Labor.NINE_HR
    private const val RPRRPP_10HR = Commands.Action.RPRRPP + Commands.Labor.TEN_HR
    private const val RPRRPP_HALFHR = Commands.Action.RPRRPP + Commands.Labor.HALF_HR
    private const val RPRRPP_1_5HR = Commands.Action.RPRRPP + Commands.Labor.ONE_HALF_HR
    private const val RPRRPP_2_5HR = Commands.Action.RPRRPP + Commands.Labor.TWO_HALF_HR
    private const val RPRRPP_3_5HR = Commands.Action.RPRRPP + Commands.Labor.THREE_HALF_HR
    private const val RPRRPP_4_5HR = Commands.Action.RPRRPP + Commands.Labor.FOUR_HALF_HR
    private const val RPRRPP_5_5HR = Commands.Action.RPRRPP + Commands.Labor.FIVE_HALF_HR
    private const val RPRRPP_6_5HR = Commands.Action.RPRRPP + Commands.Labor.SIX_HALF_HR
    private const val RPRRPP_7_5HR = Commands.Action.RPRRPP + Commands.Labor.SEVEN_HALF_HR
    private const val RPRRPP_8_5HR = Commands.Action.RPRRPP + Commands.Labor.EIGHT_HALF_HR
    private const val RPRRPP_9_5HR = Commands.Action.RPRRPP + Commands.Labor.NINE_HALF_HR

    /** Perform repair on hood **/
    private const val RPRHOOD_1HR = Commands.Action.RPRHOOD + Commands.Labor.ONE_HR
    private const val RPRHOOD_2HR = Commands.Action.RPRHOOD + Commands.Labor.TWO_HR
    private const val RPRHOOD_3HR = Commands.Action.RPRHOOD + Commands.Labor.THREE_HR
    private const val RPRHOOD_4HR = Commands.Action.RPRHOOD + Commands.Labor.FOUR_HR
    private const val RPRHOOD_5HR = Commands.Action.RPRHOOD + Commands.Labor.FIVE_HR
    private const val RPRHOOD_6HR = Commands.Action.RPRHOOD + Commands.Labor.SIX_HR
    private const val RPRHOOD_7HR= Commands.Action.RPRHOOD + Commands.Labor.SEVEN_HR
    private const val RPRHOOD_8HR = Commands.Action.RPRHOOD + Commands.Labor.EIGHT_HR
    private const val RPRHOOD_9HR = Commands.Action.RPRHOOD + Commands.Labor.NINE_HR
    private const val RPRHOOD_10HR = Commands.Action.RPRHOOD + Commands.Labor.TEN_HR
    private const val RPRHOOD_HALFHR = Commands.Action.RPRHOOD + Commands.Labor.HALF_HR
    private const val RPRHOOD_1_5HR = Commands.Action.RPRHOOD + Commands.Labor.ONE_HALF_HR
    private const val RPRHOOD_2_5HR = Commands.Action.RPRHOOD + Commands.Labor.TWO_HALF_HR
    private const val RPRHOOD_3_5HR = Commands.Action.RPRHOOD + Commands.Labor.THREE_HALF_HR
    private const val RPRHOOD_4_5HR = Commands.Action.RPRHOOD + Commands.Labor.FOUR_HALF_HR
    private const val RPRHOOD_5_5HR = Commands.Action.RPRHOOD + Commands.Labor.FIVE_HALF_HR
    private const val RPRHOOD_6_5HR = Commands.Action.RPRHOOD + Commands.Labor.SIX_HALF_HR
    private const val RPRHOOD_7_5HR = Commands.Action.RPRHOOD + Commands.Labor.SEVEN_HALF_HR
    private const val RPRHOOD_8_5HR = Commands.Action.RPRHOOD + Commands.Labor.EIGHT_HALF_HR
    private const val RPRHOOD_9_5HR = Commands.Action.RPRHOOD + Commands.Labor.NINE_HALF_HR

    /** Perform repair on ROOF **/
    private const val RPRROOF_1HR = Commands.Action.RPRROOF + Commands.Labor.ONE_HR
    private const val RPRROOF_2HR = Commands.Action.RPRROOF + Commands.Labor.TWO_HR
    private const val RPRROOF_3HR = Commands.Action.RPRROOF + Commands.Labor.THREE_HR
    private const val RPRROOF_4HR = Commands.Action.RPRROOF + Commands.Labor.FOUR_HR
    private const val RPRROOF_5HR = Commands.Action.RPRROOF + Commands.Labor.FIVE_HR
    private const val RPRROOF_6HR = Commands.Action.RPRROOF + Commands.Labor.SIX_HR
    private const val RPRROOF_7HR = Commands.Action.RPRROOF + Commands.Labor.SEVEN_HR
    private const val RPRROOF_8HR = Commands.Action.RPRROOF + Commands.Labor.EIGHT_HR
    private const val RPRROOF_9HR = Commands.Action.RPRROOF + Commands.Labor.NINE_HR
    private const val RPRROOF_10HR = Commands.Action.RPRROOF + Commands.Labor.TEN_HR
    private const val RPRROOF_HALFHR= Commands.Action.RPRROOF + Commands.Labor.HALF_HR
    private const val RPRROOF_1_5HR = Commands.Action.RPRROOF + Commands.Labor.ONE_HALF_HR
    private const val RPRROOF_2_5HR = Commands.Action.RPRROOF + Commands.Labor.TWO_HALF_HR
    private const val RPRROOF_3_5HR = Commands.Action.RPRROOF + Commands.Labor.THREE_HALF_HR
    private const val RPRROOF_4_5HR = Commands.Action.RPRROOF + Commands.Labor.FOUR_HALF_HR
    private const val RPRROOF_5_5HR = Commands.Action.RPRROOF + Commands.Labor.FIVE_HALF_HR
    private const val RPRROOF_6_5HR = Commands.Action.RPRROOF + Commands.Labor.SIX_HALF_HR
    private const val RPRROOF_7_5HR = Commands.Action.RPRROOF + Commands.Labor.SEVEN_HALF_HR
    private const val RPRROOF_8_5HR = Commands.Action.RPRROOF + Commands.Labor.EIGHT_HALF_HR
    private const val RPRROOF_9_5HR = Commands.Action.RPRROOF + Commands.Labor.NINE_HALF_HR

    /** Perform repair on TRUNK LID **/
    private const val RPRTRUNKLID_1HR = Commands.Action.RPRTRUNKLID + Commands.Labor.ONE_HR
    private const val RPRTRUNKLID_2HR = Commands.Action.RPRTRUNKLID + Commands.Labor.TWO_HR
    private const val RPRTRUNKLID_3HR = Commands.Action.RPRTRUNKLID + Commands.Labor.THREE_HR
    private const val RPRTRUNKLID_4HR = Commands.Action.RPRTRUNKLID + Commands.Labor.FOUR_HR
    private const val RPRTRUNKLID_5HR = Commands.Action.RPRTRUNKLID + Commands.Labor.FIVE_HR
    private const val RPRTRUNKLID_6HR = Commands.Action.RPRTRUNKLID + Commands.Labor.SIX_HR
    private const val RPRTRUNKLID_7HR = Commands.Action.RPRTRUNKLID + Commands.Labor.SEVEN_HR
    private const val RPRTRUNKLID_8HR = Commands.Action.RPRTRUNKLID + Commands.Labor.EIGHT_HR
    private const val RPRTRUNKLID_9HR = Commands.Action.RPRTRUNKLID + Commands.Labor.NINE_HR
    private const val RPRTRUNKLID_10HR = Commands.Action.RPRTRUNKLID + Commands.Labor.TEN_HR
    private const val RPRTRUNKLID_HALFHR= Commands.Action.RPRTRUNKLID + Commands.Labor.HALF_HR
    private const val RPRTRUNKLID_1_5HR = Commands.Action.RPRTRUNKLID + Commands.Labor.ONE_HALF_HR
    private const val RPRTRUNKLID_2_5HR = Commands.Action.RPRTRUNKLID + Commands.Labor.TWO_HALF_HR
    private const val RPRTRUNKLID_3_5HR = Commands.Action.RPRTRUNKLID + Commands.Labor.THREE_HALF_HR
    private const val RPRTRUNKLID_4_5HR = Commands.Action.RPRTRUNKLID + Commands.Labor.FOUR_HALF_HR
    private const val RPRTRUNKLID_5_5HR = Commands.Action.RPRTRUNKLID + Commands.Labor.FIVE_HALF_HR
    private const val RPRTRUNKLID_6_5HR = Commands.Action.RPRTRUNKLID + Commands.Labor.SIX_HALF_HR
    private const val RPRTRUNKLID_7_5HR = Commands.Action.RPRTRUNKLID + Commands.Labor.SEVEN_HALF_HR
    private const val RPRTRUNKLID_8_5HR = Commands.Action.RPRTRUNKLID + Commands.Labor.EIGHT_HALF_HR
    private const val RPRTRUNKLID_9_5HR = Commands.Action.RPRTRUNKLID + Commands.Labor.NINE_HALF_HR

    private const val RPRTRUNK_1HR = Commands.Action.RPRTRUNK + Commands.Labor.ONE_HR
    private const val RPRTRUNK_2HR = Commands.Action.RPRTRUNK + Commands.Labor.TWO_HR
    private const val RPRTRUNK_3HR = Commands.Action.RPRTRUNK + Commands.Labor.THREE_HR
    private const val RPRTRUNK_4HR = Commands.Action.RPRTRUNK + Commands.Labor.FOUR_HR
    private const val RPRTRUNK_5HR = Commands.Action.RPRTRUNK + Commands.Labor.FIVE_HR
    private const val RPRTRUNK_6HR = Commands.Action.RPRTRUNK + Commands.Labor.SIX_HR
    private const val RPRTRUNK_7HR = Commands.Action.RPRTRUNK + Commands.Labor.SEVEN_HR
    private const val RPRTRUNK_8HR = Commands.Action.RPRTRUNK + Commands.Labor.EIGHT_HR
    private const val RPRTRUNK_9HR = Commands.Action.RPRTRUNK + Commands.Labor.NINE_HR
    private const val RPRTRUNK_10HR = Commands.Action.RPRTRUNK + Commands.Labor.TEN_HR
    private const val RPRTRUNK_HALFHR= Commands.Action.RPRTRUNK + Commands.Labor.HALF_HR
    private const val RPRTRUNK_1_5HR = Commands.Action.RPRTRUNK + Commands.Labor.ONE_HALF_HR
    private const val RPRTRUNK_2_5HR = Commands.Action.RPRTRUNK + Commands.Labor.TWO_HALF_HR
    private const val RPRTRUNK_3_5HR = Commands.Action.RPRTRUNK + Commands.Labor.THREE_HALF_HR
    private const val RPRTRUNK_4_5HR = Commands.Action.RPRTRUNK + Commands.Labor.FOUR_HALF_HR
    private const val RPRTRUNK_5_5HR = Commands.Action.RPRTRUNK + Commands.Labor.FIVE_HALF_HR
    private const val RPRTRUNK_6_5HR = Commands.Action.RPRTRUNK + Commands.Labor.SIX_HALF_HR
    private const val RPRTRUNK_7_5HR = Commands.Action.RPRTRUNK + Commands.Labor.SEVEN_HALF_HR
    private const val RPRTRUNK_8_5HR = Commands.Action.RPRTRUNK + Commands.Labor.EIGHT_HALF_HR
    private const val RPRTRUNK_9_5HR = Commands.Action.RPRTRUNK + Commands.Labor.NINE_HALF_HR

    /** Perform repair on LIFT GATE **/
    private const val RPRLIFTGATE_1HR = Commands.Action.RPRLIFTGATE + Commands.Labor.ONE_HR
    private const val RPRLIFTGATE_2HR = Commands.Action.RPRLIFTGATE + Commands.Labor.TWO_HR
    private const val RPRLIFTGATE_3HR = Commands.Action.RPRLIFTGATE + Commands.Labor.THREE_HR
    private const val RPRLIFTGATE_4HR = Commands.Action.RPRLIFTGATE + Commands.Labor.FOUR_HR
    private const val RPRLIFTGATE_5HR = Commands.Action.RPRLIFTGATE + Commands.Labor.FIVE_HR
    private const val RPRLIFTGATE_6HR = Commands.Action.RPRLIFTGATE + Commands.Labor.SIX_HR
    private const val RPRLIFTGATE_7HR = Commands.Action.RPRLIFTGATE + Commands.Labor.SEVEN_HR
    private const val RPRLIFTGATE_8HR = Commands.Action.RPRLIFTGATE + Commands.Labor.EIGHT_HR
    private const val RPRLIFTGATE_9HR = Commands.Action.RPRLIFTGATE + Commands.Labor.NINE_HR
    private const val RPRLIFTGATE_10HR = Commands.Action.RPRLIFTGATE + Commands.Labor.TEN_HR
    private const val RPRLIFTGATE_HALFHR= Commands.Action.RPRLIFTGATE + Commands.Labor.HALF_HR
    private const val RPRLIFTGATE_1_5HR = Commands.Action.RPRLIFTGATE + Commands.Labor.ONE_HALF_HR
    private const val RPRLIFTGATE_2_5HR = Commands.Action.RPRLIFTGATE + Commands.Labor.TWO_HALF_HR
    private const val RPRLIFTGATE_3_5HR = Commands.Action.RPRLIFTGATE + Commands.Labor.THREE_HALF_HR
    private const val RPRLIFTGATE_4_5HR = Commands.Action.RPRLIFTGATE + Commands.Labor.FOUR_HALF_HR
    private const val RPRLIFTGATE_5_5HR = Commands.Action.RPRLIFTGATE + Commands.Labor.FIVE_HALF_HR
    private const val RPRLIFTGATE_6_5HR = Commands.Action.RPRLIFTGATE + Commands.Labor.SIX_HALF_HR
    private const val RPRLIFTGATE_7_5HR = Commands.Action.RPRLIFTGATE + Commands.Labor.SEVEN_HALF_HR
    private const val RPRLIFTGATE_8_5HR = Commands.Action.RPRLIFTGATE + Commands.Labor.EIGHT_HALF_HR
    private const val RPRLIFTGATE_9_5HR = Commands.Action.RPRLIFTGATE + Commands.Labor.NINE_HALF_HR

    /** Perform repair on BACK DOOR **/
    private const val RPRBACKDOOR_1HR = Commands.Action.RPRBACKDOOR + Commands.Labor.ONE_HR
    private const val RPRBACKDOOR_2HR = Commands.Action.RPRBACKDOOR + Commands.Labor.TWO_HR
    private const val RPRBACKDOOR_3HR = Commands.Action.RPRBACKDOOR + Commands.Labor.THREE_HR
    private const val RPRBACKDOOR_4HR = Commands.Action.RPRBACKDOOR + Commands.Labor.FOUR_HR
    private const val RPRBACKDOOR_5HR = Commands.Action.RPRBACKDOOR + Commands.Labor.FIVE_HR
    private const val RPRBACKDOOR_6HR = Commands.Action.RPRBACKDOOR + Commands.Labor.SIX_HR
    private const val RPRBACKDOOR_7HR = Commands.Action.RPRBACKDOOR + Commands.Labor.SEVEN_HR
    private const val RPRBACKDOOR_8HR = Commands.Action.RPRBACKDOOR + Commands.Labor.EIGHT_HR
    private const val RPRBACKDOOR_9HR = Commands.Action.RPRBACKDOOR + Commands.Labor.NINE_HR
    private const val RPRBACKDOOR_10HR = Commands.Action.RPRBACKDOOR + Commands.Labor.TEN_HR
    private const val RPRBACKDOOR_HALFHR= Commands.Action.RPRBACKDOOR + Commands.Labor.HALF_HR
    private const val RPRBACKDOOR_1_5HR = Commands.Action.RPRBACKDOOR + Commands.Labor.ONE_HALF_HR
    private const val RPRBACKDOOR_2_5HR = Commands.Action.RPRBACKDOOR + Commands.Labor.TWO_HALF_HR
    private const val RPRBACKDOOR_3_5HR = Commands.Action.RPRBACKDOOR + Commands.Labor.THREE_HALF_HR
    private const val RPRBACKDOOR_4_5HR = Commands.Action.RPRBACKDOOR + Commands.Labor.FOUR_HALF_HR
    private const val RPRBACKDOOR_5_5HR = Commands.Action.RPRBACKDOOR + Commands.Labor.FIVE_HALF_HR
    private const val RPRBACKDOOR_6_5HR = Commands.Action.RPRBACKDOOR + Commands.Labor.SIX_HALF_HR
    private const val RPRBACKDOOR_7_5HR = Commands.Action.RPRBACKDOOR + Commands.Labor.SEVEN_HALF_HR
    private const val RPRBACKDOOR_8_5HR = Commands.Action.RPRBACKDOOR + Commands.Labor.EIGHT_HALF_HR
    private const val RPRBACKDOOR_9_5HR = Commands.Action.RPRBACKDOOR + Commands.Labor.NINE_HALF_HR

    /** Perform repair on rear bumper cover **/
    private const val RPRRBC_1HR = Commands.Action.RPRRBC + Commands.Labor.ONE_HR
    private const val RPRRBC_2HR = Commands.Action.RPRRBC + Commands.Labor.TWO_HR
    private const val RPRRBC_3HR = Commands.Action.RPRRBC + Commands.Labor.THREE_HR
    private const val RPRRBC_4HR = Commands.Action.RPRRBC + Commands.Labor.FOUR_HR
    private const val RPRRBC_5HR = Commands.Action.RPRRBC + Commands.Labor.FIVE_HR
    private const val RPRRBC_6HR = Commands.Action.RPRRBC + Commands.Labor.SIX_HR
    private const val RPRRBC_7HR = Commands.Action.RPRRBC + Commands.Labor.SEVEN_HR
    private const val RPRRBC_8HR = Commands.Action.RPRRBC + Commands.Labor.EIGHT_HR
    private const val RPRRBC_9HR = Commands.Action.RPRRBC + Commands.Labor.NINE_HR
    private const val RPRRBC_10HR = Commands.Action.RPRRBC + Commands.Labor.TEN_HR
    private const val RPRRBC_HALFHR = Action.RPRRBC + Labor.HALF_HR
    private const val RPRRBC_1_5HR = Commands.Action.RPRRBC + Commands.Labor.ONE_HALF_HR
    private const val RPRRBC_2_5HR = Commands.Action.RPRRBC + Commands.Labor.TWO_HALF_HR
    private const val RPRRBC_3_5HR = Commands.Action.RPRRBC + Commands.Labor.THREE_HALF_HR
    private const val RPRRBC_4_5HR = Commands.Action.RPRRBC + Commands.Labor.FOUR_HALF_HR
    private const val RPRRBC_5_5HR = Commands.Action.RPRRBC + Commands.Labor.FIVE_HALF_HR
    private const val RPRRBC_6_5HR = Commands.Action.RPRRBC + Commands.Labor.SIX_HALF_HR
    private const val RPRRBC_7_5HR = Commands.Action.RPRRBC + Commands.Labor.SEVEN_HALF_HR
    private const val RPRRBC_8_5HR = Commands.Action.RPRRBC + Commands.Labor.EIGHT_HALF_HR
    private const val RPRRBC_9_5HR = Commands.Action.RPRRBC + Commands.Labor.NINE_HALF_HR

    private const val RPRRB_1HR = Commands.Action.RPRRB + Commands.Labor.ONE_HR
    private const val RPRRB_2HR = Commands.Action.RPRRB + Commands.Labor.TWO_HR
    private const val RPRRB_3HR = Commands.Action.RPRRB + Commands.Labor.THREE_HR
    private const val RPRRB_4HR = Commands.Action.RPRRB + Commands.Labor.FOUR_HR
    private const val RPRRB_5HR = Commands.Action.RPRRB + Commands.Labor.FIVE_HR
    private const val RPRRB_6HR = Commands.Action.RPRRB + Commands.Labor.SIX_HR
    private const val RPRRB_7HR = Commands.Action.RPRRB + Commands.Labor.SEVEN_HR
    private const val RPRRB_8HR = Commands.Action.RPRRB + Commands.Labor.EIGHT_HR
    private const val RPRRB_9HR = Commands.Action.RPRRB + Commands.Labor.NINE_HR
    private const val RPRRB_10HR = Commands.Action.RPRRB + Commands.Labor.TEN_HR
    private const val RPRRB_HALFHR = Commands.Action.RPRRB + Commands.Labor.HALF_HR
    private const val RPRRB_1_5HR = Commands.Action.RPRRB + Commands.Labor.ONE_HALF_HR
    private const val RPRRB_2_5HR = Commands.Action.RPRRB + Commands.Labor.TWO_HALF_HR
    private const val RPRRB_3_5HR = Commands.Action.RPRRB + Commands.Labor.THREE_HALF_HR
    private const val RPRRB_4_5HR = Commands.Action.RPRRB + Commands.Labor.FOUR_HALF_HR
    private const val RPRRB_5_5HR = Commands.Action.RPRRB + Commands.Labor.FIVE_HALF_HR
    private const val RPRRB_6_5HR = Commands.Action.RPRRB + Commands.Labor.SIX_HALF_HR
    private const val RPRRB_7_5HR = Commands.Action.RPRRB + Commands.Labor.SEVEN_HALF_HR
    private const val RPRRB_8_5HR = Commands.Action.RPRRB + Commands.Labor.EIGHT_HALF_HR
    private const val RPRRB_9_5HR = Commands.Action.RPRRB + Commands.Labor.NINE_HALF_HR

    private const val RPRBB_1HR = Commands.Action.RPRBB + Commands.Labor.ONE_HR
    private const val RPRBB_2HR = Commands.Action.RPRBB + Commands.Labor.TWO_HR
    private const val RPRBB_3HR = Commands.Action.RPRBB + Commands.Labor.THREE_HR
    private const val RPRBB_4HR = Commands.Action.RPRBB + Commands.Labor.FOUR_HR
    private const val RPRBB_5HR = Commands.Action.RPRBB + Commands.Labor.FIVE_HR
    private const val RPRBB_6HR = Commands.Action.RPRBB + Commands.Labor.SIX_HR
    private const val RPRBB_7HR = Commands.Action.RPRBB + Commands.Labor.SEVEN_HR
    private const val RPRBB_8HR = Commands.Action.RPRBB + Commands.Labor.EIGHT_HR
    private const val RPRBB_9HR = Commands.Action.RPRBB + Commands.Labor.NINE_HR
    private const val RPRBB_10HR = Commands.Action.RPRBB + Commands.Labor.TEN_HR
    private const val RPRBB_HALFHR = Commands.Action.RPRBB + Commands.Labor.HALF_HR
    private const val RPRBB_1_5HR = Commands.Action.RPRBB + Commands.Labor.ONE_HALF_HR
    private const val RPRBB_2_5HR = Commands.Action.RPRBB + Commands.Labor.TWO_HALF_HR
    private const val RPRBB_3_5HR = Commands.Action.RPRBB + Commands.Labor.THREE_HALF_HR
    private const val RPRBB_4_5HR = Commands.Action.RPRBB + Commands.Labor.FOUR_HALF_HR
    private const val RPRBB_5_5HR = Commands.Action.RPRBB + Commands.Labor.FIVE_HALF_HR
    private const val RPRBB_6_5HR = Commands.Action.RPRBB + Commands.Labor.SIX_HALF_HR
    private const val RPRBB_7_5HR = Commands.Action.RPRBB + Commands.Labor.SEVEN_HALF_HR
    private const val RPRBB_8_5HR = Commands.Action.RPRBB + Commands.Labor.EIGHT_HALF_HR
    private const val RPRBB_9_5HR = Commands.Action.RPRBB + Commands.Labor.NINE_HALF_HR



    /** Perform r&i on a given part based by diagram number **/
    private const val RNI_NUMBER_1 = Action.RNI + Numbers.NUMBER_1
    private const val RNI_NUMBER_2 = Action.RNI + Numbers.NUMBER_2
    private const val RNI_NUMBER_3 = Action.RNI + Numbers.NUMBER_3
    private const val RNI_NUMBER_4 = Action.RNI + Numbers.NUMBER_4
    private const val RNI_NUMBER_5 = Action.RNI + Numbers.NUMBER_5
    private const val RNI_NUMBER_6 = Action.RNI + Numbers.NUMBER_6
    private const val RNI_NUMBER_7 = Action.RNI + Numbers.NUMBER_7
    private const val RNI_NUMBER_8 = Action.RNI + Numbers.NUMBER_8
    private const val RNI_NUMBER_9 = Action.RNI + Numbers.NUMBER_9
    private const val RNI_NUMBER_10 = Action.RNI + Numbers.NUMBER_10
    private const val RNI_NUMBER_11 = Action.RNI + Numbers.NUMBER_11
    private const val RNI_NUMBER_12 = Action.RNI + Numbers.NUMBER_12
    private const val RNI_NUMBER_13 = Action.RNI + Numbers.NUMBER_13
    private const val RNI_NUMBER_14 = Action.RNI + Numbers.NUMBER_14
    private const val RNI_NUMBER_15 = Action.RNI + Numbers.NUMBER_15
    private const val RNI_NUMBER_16 = Action.RNI + Numbers.NUMBER_16
    private const val RNI_NUMBER_17 = Action.RNI + Numbers.NUMBER_17
    private const val RNI_NUMBER_18 = Action.RNI + Numbers.NUMBER_18
    private const val RNI_NUMBER_19 = Action.RNI + Numbers.NUMBER_19
    private const val RNI_NUMBER_20 = Action.RNI + Numbers.NUMBER_20
    private const val RNI_NUMBER_21 = Action.RNI + Numbers.NUMBER_21
    private const val RNI_NUMBER_22 = Action.RNI + Numbers.NUMBER_22
    private const val RNI_NUMBER_23 = Action.RNI + Numbers.NUMBER_23
    private const val RNI_NUMBER_24 = Action.RNI + Numbers.NUMBER_24
    private const val RNI_NUMBER_25 = Action.RNI + Numbers.NUMBER_25
    private const val RNI_NUMBER_26 = Action.RNI + Numbers.NUMBER_26
    private const val RNI_NUMBER_27 = Action.RNI + Numbers.NUMBER_27
    private const val RNI_NUMBER_28 = Action.RNI + Numbers.NUMBER_28
    private const val RNI_NUMBER_29 = Action.RNI + Numbers.NUMBER_29
    private const val RNI_NUMBER_30 = Action.RNI + Numbers.NUMBER_30
    private const val RNI_NUMBER_31 = Action.RNI + Numbers.NUMBER_31
    private const val RNI_NUMBER_32 = Action.RNI + Numbers.NUMBER_32
    private const val RNI_NUMBER_33 = Action.RNI + Numbers.NUMBER_33
    private const val RNI_NUMBER_34 = Action.RNI + Numbers.NUMBER_34
    private const val RNI_NUMBER_35 = Action.RNI + Numbers.NUMBER_35
    private const val RNI_NUMBER_36 = Action.RNI + Numbers.NUMBER_36
    private const val RNI_NUMBER_37 = Action.RNI + Numbers.NUMBER_37

    /** r&i for left side parts **/
    private const val RNI_NUMBER_1_LEFT = Action.RNI + Numbers.NUMBER_1 + Position.LT
    private const val RNI_NUMBER_2_LEFT = Action.RNI + Numbers.NUMBER_2 + Position.LT
    private const val RNI_NUMBER_3_LEFT = Action.RNI + Numbers.NUMBER_3 + Position.LT
    private const val RNI_NUMBER_4_LEFT = Action.RNI + Numbers.NUMBER_4 + Position.LT
    private const val RNI_NUMBER_5_LEFT = Action.RNI + Numbers.NUMBER_5 + Position.LT
    private const val RNI_NUMBER_6_LEFT = Action.RNI + Numbers.NUMBER_6 + Position.LT
    private const val RNI_NUMBER_7_LEFT = Action.RNI + Numbers.NUMBER_7 + Position.LT
    private const val RNI_NUMBER_8_LEFT = Action.RNI + Numbers.NUMBER_8 + Position.LT
    private const val RNI_NUMBER_9_LEFT = Action.RNI + Numbers.NUMBER_9 + Position.LT
    private const val RNI_NUMBER_10_LEFT = Action.RNI + Numbers.NUMBER_10 + Position.LT
    private const val RNI_NUMBER_11_LEFT = Action.RNI + Numbers.NUMBER_11 + Position.LT
    private const val RNI_NUMBER_12_LEFT = Action.RNI + Numbers.NUMBER_12 + Position.LT
    private const val RNI_NUMBER_13_LEFT = Action.RNI + Numbers.NUMBER_13 + Position.LT
    private const val RNI_NUMBER_14_LEFT = Action.RNI + Numbers.NUMBER_14 + Position.LT
    private const val RNI_NUMBER_15_LEFT = Action.RNI + Numbers.NUMBER_15 + Position.LT
    private const val RNI_NUMBER_16_LEFT = Action.RNI + Numbers.NUMBER_16 + Position.LT
    private const val RNI_NUMBER_17_LEFT = Action.RNI + Numbers.NUMBER_17 + Position.LT
    private const val RNI_NUMBER_18_LEFT = Action.RNI + Numbers.NUMBER_18 + Position.LT
    private const val RNI_NUMBER_19_LEFT = Action.RNI + Numbers.NUMBER_19 + Position.LT
    private const val RNI_NUMBER_20_LEFT = Action.RNI + Numbers.NUMBER_20 + Position.LT
    private const val RNI_NUMBER_21_LEFT = Action.RNI + Numbers.NUMBER_21 + Position.LT
    private const val RNI_NUMBER_22_LEFT = Action.RNI + Numbers.NUMBER_22 + Position.LT
    private const val RNI_NUMBER_23_LEFT = Action.RNI + Numbers.NUMBER_23 + Position.LT
    private const val RNI_NUMBER_24_LEFT = Action.RNI + Numbers.NUMBER_24 + Position.LT
    private const val RNI_NUMBER_25_LEFT = Action.RNI + Numbers.NUMBER_25 + Position.LT
    private const val RNI_NUMBER_26_LEFT = Action.RNI + Numbers.NUMBER_26 + Position.LT
    private const val RNI_NUMBER_27_LEFT = Action.RNI + Numbers.NUMBER_27 + Position.LT
    private const val RNI_NUMBER_28_LEFT = Action.RNI + Numbers.NUMBER_28 + Position.LT
    private const val RNI_NUMBER_29_LEFT = Action.RNI + Numbers.NUMBER_29 + Position.LT
    private const val RNI_NUMBER_30_LEFT = Action.RNI + Numbers.NUMBER_30 + Position.LT
    private const val RNI_NUMBER_31_LEFT = Action.RNI + Numbers.NUMBER_31 + Position.LT
    private const val RNI_NUMBER_32_LEFT = Action.RNI + Numbers.NUMBER_32 + Position.LT
    private const val RNI_NUMBER_33_LEFT = Action.RNI + Numbers.NUMBER_33 + Position.LT
    private const val RNI_NUMBER_34_LEFT = Action.RNI + Numbers.NUMBER_34 + Position.LT
    private const val RNI_NUMBER_35_LEFT = Action.RNI + Numbers.NUMBER_35 + Position.LT
    private const val RNI_NUMBER_36_LEFT = Action.RNI + Numbers.NUMBER_36 + Position.LT
    private const val RNI_NUMBER_37_LEFT = Action.RNI + Numbers.NUMBER_37 + Position.LT

    /** r&i for right side parts **/
    private const val RNI_NUMBER_1_RIGHT = Action.RNI + Numbers.NUMBER_1 + Position.RT
    private const val RNI_NUMBER_2_RIGHT = Action.RNI + Numbers.NUMBER_2 + Position.RT
    private const val RNI_NUMBER_3_RIGHT = Action.RNI + Numbers.NUMBER_3 + Position.RT
    private const val RNI_NUMBER_4_RIGHT = Action.RNI + Numbers.NUMBER_4 + Position.RT
    private const val RNI_NUMBER_5_RIGHT = Action.RNI + Numbers.NUMBER_5 + Position.RT
    private const val RNI_NUMBER_6_RIGHT = Action.RNI + Numbers.NUMBER_6 + Position.RT
    private const val RNI_NUMBER_7_RIGHT = Action.RNI + Numbers.NUMBER_7 + Position.RT
    private const val RNI_NUMBER_8_RIGHT = Action.RNI + Numbers.NUMBER_8 + Position.RT
    private const val RNI_NUMBER_9_RIGHT = Action.RNI + Numbers.NUMBER_9 + Position.RT
    private const val RNI_NUMBER_10_RIGHT = Action.RNI + Numbers.NUMBER_10 + Position.RT
    private const val RNI_NUMBER_11_RIGHT = Action.RNI + Numbers.NUMBER_11 + Position.RT
    private const val RNI_NUMBER_12_RIGHT = Action.RNI + Numbers.NUMBER_12 + Position.RT
    private const val RNI_NUMBER_13_RIGHT = Action.RNI + Numbers.NUMBER_13 + Position.RT
    private const val RNI_NUMBER_14_RIGHT = Action.RNI + Numbers.NUMBER_14 + Position.RT
    private const val RNI_NUMBER_15_RIGHT = Action.RNI + Numbers.NUMBER_15 + Position.RT
    private const val RNI_NUMBER_16_RIGHT = Action.RNI + Numbers.NUMBER_16 + Position.RT
    private const val RNI_NUMBER_17_RIGHT = Action.RNI + Numbers.NUMBER_17 + Position.RT
    private const val RNI_NUMBER_18_RIGHT = Action.RNI + Numbers.NUMBER_18 + Position.RT
    private const val RNI_NUMBER_19_RIGHT = Action.RNI + Numbers.NUMBER_19 + Position.RT
    private const val RNI_NUMBER_20_RIGHT = Action.RNI + Numbers.NUMBER_20 + Position.RT
    private const val RNI_NUMBER_21_RIGHT = Action.RNI + Numbers.NUMBER_21 + Position.RT
    private const val RNI_NUMBER_22_RIGHT = Action.RNI + Numbers.NUMBER_22 + Position.RT
    private const val RNI_NUMBER_23_RIGHT = Action.RNI + Numbers.NUMBER_23 + Position.RT
    private const val RNI_NUMBER_24_RIGHT = Action.RNI + Numbers.NUMBER_24 + Position.RT
    private const val RNI_NUMBER_25_RIGHT = Action.RNI + Numbers.NUMBER_25 + Position.RT
    private const val RNI_NUMBER_26_RIGHT = Action.RNI + Numbers.NUMBER_26 + Position.RT
    private const val RNI_NUMBER_27_RIGHT = Action.RNI + Numbers.NUMBER_27 + Position.RT
    private const val RNI_NUMBER_28_RIGHT = Action.RNI + Numbers.NUMBER_28 + Position.RT
    private const val RNI_NUMBER_29_RIGHT = Action.RNI + Numbers.NUMBER_29 + Position.RT
    private const val RNI_NUMBER_30_RIGHT = Action.RNI + Numbers.NUMBER_30 + Position.RT
    private const val RNI_NUMBER_31_RIGHT = Action.RNI + Numbers.NUMBER_31 + Position.RT
    private const val RNI_NUMBER_32_RIGHT = Action.RNI + Numbers.NUMBER_32 + Position.RT
    private const val RNI_NUMBER_33_RIGHT = Action.RNI + Numbers.NUMBER_33 + Position.RT
    private const val RNI_NUMBER_34_RIGHT = Action.RNI + Numbers.NUMBER_34 + Position.RT
    private const val RNI_NUMBER_35_RIGHT = Action.RNI + Numbers.NUMBER_35 + Position.RT
    private const val RNI_NUMBER_36_RIGHT = Action.RNI + Numbers.NUMBER_36 + Position.RT
    private const val RNI_NUMBER_37_RIGHT = Action.RNI + Numbers.NUMBER_37 + Position.RT


    /** Perform BLD on a given part based by diagram number **/
    private const val BLD_NUMBER_1 = Action.BLD + Numbers.NUMBER_1
    private const val BLD_NUMBER_2 = Action.BLD + Numbers.NUMBER_2
    private const val BLD_NUMBER_3 = Action.BLD + Numbers.NUMBER_3
    private const val BLD_NUMBER_4 = Action.BLD + Numbers.NUMBER_4
    private const val BLD_NUMBER_5 = Action.BLD + Numbers.NUMBER_5
    private const val BLD_NUMBER_6 = Action.BLD + Numbers.NUMBER_6
    private const val BLD_NUMBER_7 = Action.BLD + Numbers.NUMBER_7
    private const val BLD_NUMBER_8 = Action.BLD + Numbers.NUMBER_8
    private const val BLD_NUMBER_9 = Action.BLD + Numbers.NUMBER_9
    private const val BLD_NUMBER_10 = Action.BLD + Numbers.NUMBER_10
    private const val BLD_NUMBER_11 = Action.BLD + Numbers.NUMBER_11
    private const val BLD_NUMBER_12 = Action.BLD + Numbers.NUMBER_12
    private const val BLD_NUMBER_13 = Action.BLD + Numbers.NUMBER_13
    private const val BLD_NUMBER_14 = Action.BLD + Numbers.NUMBER_14
    private const val BLD_NUMBER_15 = Action.BLD + Numbers.NUMBER_15
    private const val BLD_NUMBER_16 = Action.BLD + Numbers.NUMBER_16
    private const val BLD_NUMBER_17 = Action.BLD + Numbers.NUMBER_17
    private const val BLD_NUMBER_18 = Action.BLD + Numbers.NUMBER_18
    private const val BLD_NUMBER_19 = Action.BLD + Numbers.NUMBER_19
    private const val BLD_NUMBER_20 = Action.BLD + Numbers.NUMBER_20
    private const val BLD_NUMBER_21 = Action.BLD + Numbers.NUMBER_21
    private const val BLD_NUMBER_22 = Action.BLD + Numbers.NUMBER_22
    private const val BLD_NUMBER_23 = Action.BLD + Numbers.NUMBER_23
    private const val BLD_NUMBER_24 = Action.BLD + Numbers.NUMBER_24
    private const val BLD_NUMBER_25 = Action.BLD + Numbers.NUMBER_25
    private const val BLD_NUMBER_26 = Action.BLD + Numbers.NUMBER_26
    private const val BLD_NUMBER_27 = Action.BLD + Numbers.NUMBER_27
    private const val BLD_NUMBER_28 = Action.BLD + Numbers.NUMBER_28
    private const val BLD_NUMBER_29 = Action.BLD + Numbers.NUMBER_29
    private const val BLD_NUMBER_30 = Action.BLD + Numbers.NUMBER_30
    private const val BLD_NUMBER_31 = Action.BLD + Numbers.NUMBER_31
    private const val BLD_NUMBER_32 = Action.BLD + Numbers.NUMBER_32
    private const val BLD_NUMBER_33 = Action.BLD + Numbers.NUMBER_33
    private const val BLD_NUMBER_34 = Action.BLD + Numbers.NUMBER_34
    private const val BLD_NUMBER_35 = Action.BLD + Numbers.NUMBER_35
    private const val BLD_NUMBER_36 = Action.BLD + Numbers.NUMBER_36
    private const val BLD_NUMBER_37 = Action.BLD + Numbers.NUMBER_37

    /** Perform BLD LEFT on a given part based by diagram number **/
    private const val BLD_NUMBER_1_LEFT = Action.BLD + Numbers.NUMBER_1 + Position.LT
    private const val BLD_NUMBER_2_LEFT = Action.BLD + Numbers.NUMBER_2 + Position.LT
    private const val BLD_NUMBER_3_LEFT = Action.BLD + Numbers.NUMBER_3 + Position.LT
    private const val BLD_NUMBER_4_LEFT = Action.BLD + Numbers.NUMBER_4 + Position.LT
    private const val BLD_NUMBER_5_LEFT = Action.BLD + Numbers.NUMBER_5 + Position.LT
    private const val BLD_NUMBER_6_LEFT = Action.BLD + Numbers.NUMBER_6 + Position.LT
    private const val BLD_NUMBER_7_LEFT = Action.BLD + Numbers.NUMBER_7 + Position.LT
    private const val BLD_NUMBER_8_LEFT = Action.BLD + Numbers.NUMBER_8 + Position.LT
    private const val BLD_NUMBER_9_LEFT = Action.BLD + Numbers.NUMBER_9 + Position.LT
    private const val BLD_NUMBER_10_LEFT = Action.BLD + Numbers.NUMBER_10 + Position.LT
    private const val BLD_NUMBER_11_LEFT = Action.BLD + Numbers.NUMBER_11 + Position.LT
    private const val BLD_NUMBER_12_LEFT = Action.BLD + Numbers.NUMBER_12 + Position.LT
    private const val BLD_NUMBER_13_LEFT = Action.BLD + Numbers.NUMBER_13 + Position.LT
    private const val BLD_NUMBER_14_LEFT = Action.BLD + Numbers.NUMBER_14 + Position.LT
    private const val BLD_NUMBER_15_LEFT = Action.BLD + Numbers.NUMBER_15 + Position.LT
    private const val BLD_NUMBER_16_LEFT = Action.BLD + Numbers.NUMBER_16 + Position.LT
    private const val BLD_NUMBER_17_LEFT = Action.BLD + Numbers.NUMBER_17 + Position.LT
    private const val BLD_NUMBER_18_LEFT = Action.BLD + Numbers.NUMBER_18 + Position.LT
    private const val BLD_NUMBER_19_LEFT = Action.BLD + Numbers.NUMBER_19 + Position.LT
    private const val BLD_NUMBER_20_LEFT = Action.BLD + Numbers.NUMBER_20 + Position.LT
    private const val BLD_NUMBER_21_LEFT = Action.BLD + Numbers.NUMBER_21 + Position.LT
    private const val BLD_NUMBER_22_LEFT = Action.BLD + Numbers.NUMBER_22 + Position.LT
    private const val BLD_NUMBER_23_LEFT = Action.BLD + Numbers.NUMBER_23 + Position.LT
    private const val BLD_NUMBER_24_LEFT = Action.BLD + Numbers.NUMBER_24 + Position.LT
    private const val BLD_NUMBER_25_LEFT = Action.BLD + Numbers.NUMBER_25 + Position.LT
    private const val BLD_NUMBER_26_LEFT = Action.BLD + Numbers.NUMBER_26 + Position.LT
    private const val BLD_NUMBER_27_LEFT = Action.BLD + Numbers.NUMBER_27 + Position.LT
    private const val BLD_NUMBER_28_LEFT = Action.BLD + Numbers.NUMBER_28 + Position.LT
    private const val BLD_NUMBER_29_LEFT = Action.BLD + Numbers.NUMBER_29 + Position.LT
    private const val BLD_NUMBER_30_LEFT = Action.BLD + Numbers.NUMBER_30 + Position.LT
    private const val BLD_NUMBER_31_LEFT = Action.BLD + Numbers.NUMBER_31 + Position.LT
    private const val BLD_NUMBER_32_LEFT = Action.BLD + Numbers.NUMBER_32 + Position.LT
    private const val BLD_NUMBER_33_LEFT = Action.BLD + Numbers.NUMBER_33 + Position.LT
    private const val BLD_NUMBER_34_LEFT = Action.BLD + Numbers.NUMBER_34 + Position.LT
    private const val BLD_NUMBER_35_LEFT = Action.BLD + Numbers.NUMBER_35 + Position.LT
    private const val BLD_NUMBER_36_LEFT = Action.BLD + Numbers.NUMBER_36 + Position.LT
    private const val BLD_NUMBER_37_LEFT = Action.BLD + Numbers.NUMBER_37 + Position.LT

    /** Perform BLD RIGHT on a given part based by diagram number **/
    private const val BLD_NUMBER_1_RIGHT = Action.BLD + Numbers.NUMBER_1 + Position.RT
    private const val BLD_NUMBER_2_RIGHT = Action.BLD + Numbers.NUMBER_2 + Position.RT
    private const val BLD_NUMBER_3_RIGHT = Action.BLD + Numbers.NUMBER_3 + Position.RT
    private const val BLD_NUMBER_4_RIGHT = Action.BLD + Numbers.NUMBER_4 + Position.RT
    private const val BLD_NUMBER_5_RIGHT = Action.BLD + Numbers.NUMBER_5 + Position.RT
    private const val BLD_NUMBER_6_RIGHT = Action.BLD + Numbers.NUMBER_6 + Position.RT
    private const val BLD_NUMBER_7_RIGHT = Action.BLD + Numbers.NUMBER_7 + Position.RT
    private const val BLD_NUMBER_8_RIGHT = Action.BLD + Numbers.NUMBER_8 + Position.RT
    private const val BLD_NUMBER_9_RIGHT = Action.BLD + Numbers.NUMBER_9 + Position.RT
    private const val BLD_NUMBER_10_RIGHT = Action.BLD + Numbers.NUMBER_10 + Position.RT
    private const val BLD_NUMBER_11_RIGHT = Action.BLD + Numbers.NUMBER_11 + Position.RT
    private const val BLD_NUMBER_12_RIGHT = Action.BLD + Numbers.NUMBER_12 + Position.RT
    private const val BLD_NUMBER_13_RIGHT = Action.BLD + Numbers.NUMBER_13 + Position.RT
    private const val BLD_NUMBER_14_RIGHT = Action.BLD + Numbers.NUMBER_14 + Position.RT
    private const val BLD_NUMBER_15_RIGHT = Action.BLD + Numbers.NUMBER_15 + Position.RT
    private const val BLD_NUMBER_16_RIGHT = Action.BLD + Numbers.NUMBER_16 + Position.RT
    private const val BLD_NUMBER_17_RIGHT = Action.BLD + Numbers.NUMBER_17 + Position.RT
    private const val BLD_NUMBER_18_RIGHT = Action.BLD + Numbers.NUMBER_18 + Position.RT
    private const val BLD_NUMBER_19_RIGHT = Action.BLD + Numbers.NUMBER_19 + Position.RT
    private const val BLD_NUMBER_20_RIGHT = Action.BLD + Numbers.NUMBER_20 + Position.RT
    private const val BLD_NUMBER_21_RIGHT = Action.BLD + Numbers.NUMBER_21 + Position.RT
    private const val BLD_NUMBER_22_RIGHT = Action.BLD + Numbers.NUMBER_22 + Position.RT
    private const val BLD_NUMBER_23_RIGHT = Action.BLD + Numbers.NUMBER_23 + Position.RT
    private const val BLD_NUMBER_24_RIGHT = Action.BLD + Numbers.NUMBER_24 + Position.RT
    private const val BLD_NUMBER_25_RIGHT = Action.BLD + Numbers.NUMBER_25 + Position.RT
    private const val BLD_NUMBER_26_RIGHT = Action.BLD + Numbers.NUMBER_26 + Position.RT
    private const val BLD_NUMBER_27_RIGHT = Action.BLD + Numbers.NUMBER_27 + Position.RT
    private const val BLD_NUMBER_28_RIGHT = Action.BLD + Numbers.NUMBER_28 + Position.RT
    private const val BLD_NUMBER_29_RIGHT = Action.BLD + Numbers.NUMBER_29 + Position.RT
    private const val BLD_NUMBER_30_RIGHT = Action.BLD + Numbers.NUMBER_30 + Position.RT
    private const val BLD_NUMBER_31_RIGHT = Action.BLD + Numbers.NUMBER_31 + Position.RT
    private const val BLD_NUMBER_32_RIGHT = Action.BLD + Numbers.NUMBER_32 + Position.RT
    private const val BLD_NUMBER_33_RIGHT = Action.BLD + Numbers.NUMBER_33 + Position.RT
    private const val BLD_NUMBER_34_RIGHT = Action.BLD + Numbers.NUMBER_34 + Position.RT
    private const val BLD_NUMBER_35_RIGHT = Action.BLD + Numbers.NUMBER_35 + Position.RT
    private const val BLD_NUMBER_36_RIGHT = Action.BLD + Numbers.NUMBER_36 + Position.RT
    private const val BLD_NUMBER_37_RIGHT = Action.BLD + Numbers.NUMBER_37 + Position.RT

    /** Perform RFN on a given part based by diagram number **/
    private const val RFN_NUMBER_1 = Action.RFN + Numbers.NUMBER_1
    private const val RFN_NUMBER_2 = Action.RFN + Numbers.NUMBER_2
    private const val RFN_NUMBER_3 = Action.RFN + Numbers.NUMBER_3
    private const val RFN_NUMBER_4 = Action.RFN + Numbers.NUMBER_4
    private const val RFN_NUMBER_5 = Action.RFN + Numbers.NUMBER_5
    private const val RFN_NUMBER_6 = Action.RFN + Numbers.NUMBER_6
    private const val RFN_NUMBER_7 = Action.RFN + Numbers.NUMBER_7
    private const val RFN_NUMBER_8 = Action.RFN + Numbers.NUMBER_8
    private const val RFN_NUMBER_9 = Action.RFN + Numbers.NUMBER_9
    private const val RFN_NUMBER_10 = Action.RFN + Numbers.NUMBER_10
    private const val RFN_NUMBER_11 = Action.RFN + Numbers.NUMBER_11
    private const val RFN_NUMBER_12 = Action.RFN + Numbers.NUMBER_12
    private const val RFN_NUMBER_13 = Action.RFN + Numbers.NUMBER_13
    private const val RFN_NUMBER_14 = Action.RFN + Numbers.NUMBER_14
    private const val RFN_NUMBER_15 = Action.RFN + Numbers.NUMBER_15
    private const val RFN_NUMBER_16 = Action.RFN + Numbers.NUMBER_16
    private const val RFN_NUMBER_17 = Action.RFN + Numbers.NUMBER_17
    private const val RFN_NUMBER_18 = Action.RFN + Numbers.NUMBER_18
    private const val RFN_NUMBER_19 = Action.RFN + Numbers.NUMBER_19
    private const val RFN_NUMBER_20 = Action.RFN + Numbers.NUMBER_20
    private const val RFN_NUMBER_21 = Action.RFN + Numbers.NUMBER_21
    private const val RFN_NUMBER_22 = Action.RFN + Numbers.NUMBER_22
    private const val RFN_NUMBER_23 = Action.RFN + Numbers.NUMBER_23
    private const val RFN_NUMBER_24 = Action.RFN + Numbers.NUMBER_24
    private const val RFN_NUMBER_25 = Action.RFN + Numbers.NUMBER_25
    private const val RFN_NUMBER_26 = Action.RFN + Numbers.NUMBER_26
    private const val RFN_NUMBER_27 = Action.RFN + Numbers.NUMBER_27
    private const val RFN_NUMBER_28 = Action.RFN + Numbers.NUMBER_28
    private const val RFN_NUMBER_29 = Action.RFN + Numbers.NUMBER_29
    private const val RFN_NUMBER_30 = Action.RFN + Numbers.NUMBER_30
    private const val RFN_NUMBER_31 = Action.RFN + Numbers.NUMBER_31
    private const val RFN_NUMBER_32 = Action.RFN + Numbers.NUMBER_32
    private const val RFN_NUMBER_33 = Action.RFN + Numbers.NUMBER_33
    private const val RFN_NUMBER_34 = Action.RFN + Numbers.NUMBER_34
    private const val RFN_NUMBER_35 = Action.RFN + Numbers.NUMBER_35
    private const val RFN_NUMBER_36 = Action.RFN + Numbers.NUMBER_36
    private const val RFN_NUMBER_37 = Action.RFN + Numbers.NUMBER_37

    /** Perform RFN LEFT on a given part based by diagram number **/
    private const val RFN_NUMBER_1_LEFT = Action.RFN + Numbers.NUMBER_1 + Position.LT
    private const val RFN_NUMBER_2_LEFT = Action.RFN + Numbers.NUMBER_2 + Position.LT
    private const val RFN_NUMBER_3_LEFT = Action.RFN + Numbers.NUMBER_3 + Position.LT
    private const val RFN_NUMBER_4_LEFT = Action.RFN + Numbers.NUMBER_4 + Position.LT
    private const val RFN_NUMBER_5_LEFT = Action.RFN + Numbers.NUMBER_5 + Position.LT
    private const val RFN_NUMBER_6_LEFT = Action.RFN + Numbers.NUMBER_6 + Position.LT
    private const val RFN_NUMBER_7_LEFT = Action.RFN + Numbers.NUMBER_7 + Position.LT
    private const val RFN_NUMBER_8_LEFT = Action.RFN + Numbers.NUMBER_8 + Position.LT
    private const val RFN_NUMBER_9_LEFT = Action.RFN + Numbers.NUMBER_9 + Position.LT
    private const val RFN_NUMBER_10_LEFT = Action.RFN + Numbers.NUMBER_10 + Position.LT
    private const val RFN_NUMBER_11_LEFT = Action.RFN + Numbers.NUMBER_11 + Position.LT
    private const val RFN_NUMBER_12_LEFT = Action.RFN + Numbers.NUMBER_12 + Position.LT
    private const val RFN_NUMBER_13_LEFT = Action.RFN + Numbers.NUMBER_13 + Position.LT
    private const val RFN_NUMBER_14_LEFT = Action.RFN + Numbers.NUMBER_14 + Position.LT
    private const val RFN_NUMBER_15_LEFT = Action.RFN + Numbers.NUMBER_15 + Position.LT
    private const val RFN_NUMBER_16_LEFT = Action.RFN + Numbers.NUMBER_16 + Position.LT
    private const val RFN_NUMBER_17_LEFT = Action.RFN + Numbers.NUMBER_17 + Position.LT
    private const val RFN_NUMBER_18_LEFT = Action.RFN + Numbers.NUMBER_18 + Position.LT
    private const val RFN_NUMBER_19_LEFT = Action.RFN + Numbers.NUMBER_19 + Position.LT
    private const val RFN_NUMBER_20_LEFT = Action.RFN + Numbers.NUMBER_20 + Position.LT
    private const val RFN_NUMBER_21_LEFT = Action.RFN + Numbers.NUMBER_21 + Position.LT
    private const val RFN_NUMBER_22_LEFT = Action.RFN + Numbers.NUMBER_22 + Position.LT
    private const val RFN_NUMBER_23_LEFT = Action.RFN + Numbers.NUMBER_23 + Position.LT
    private const val RFN_NUMBER_24_LEFT = Action.RFN + Numbers.NUMBER_24 + Position.LT
    private const val RFN_NUMBER_25_LEFT = Action.RFN + Numbers.NUMBER_25 + Position.LT
    private const val RFN_NUMBER_26_LEFT = Action.RFN + Numbers.NUMBER_26 + Position.LT
    private const val RFN_NUMBER_27_LEFT = Action.RFN + Numbers.NUMBER_27 + Position.LT
    private const val RFN_NUMBER_28_LEFT = Action.RFN + Numbers.NUMBER_28 + Position.LT
    private const val RFN_NUMBER_29_LEFT = Action.RFN + Numbers.NUMBER_29 + Position.LT
    private const val RFN_NUMBER_30_LEFT = Action.RFN + Numbers.NUMBER_30 + Position.LT
    private const val RFN_NUMBER_31_LEFT = Action.RFN + Numbers.NUMBER_31 + Position.LT
    private const val RFN_NUMBER_32_LEFT = Action.RFN + Numbers.NUMBER_32 + Position.LT
    private const val RFN_NUMBER_33_LEFT = Action.RFN + Numbers.NUMBER_33 + Position.LT
    private const val RFN_NUMBER_34_LEFT = Action.RFN + Numbers.NUMBER_34 + Position.LT
    private const val RFN_NUMBER_35_LEFT = Action.RFN + Numbers.NUMBER_35 + Position.LT
    private const val RFN_NUMBER_36_LEFT = Action.RFN + Numbers.NUMBER_36 + Position.LT
    private const val RFN_NUMBER_37_LEFT = Action.RFN + Numbers.NUMBER_37 + Position.LT

    /** Perform RFN RIGHT on a given part based by diagram number **/
    private const val RFN_NUMBER_1_RIGHT = Action.RFN + Numbers.NUMBER_1 + Position.RT
    private const val RFN_NUMBER_2_RIGHT = Action.RFN + Numbers.NUMBER_2 + Position.RT
    private const val RFN_NUMBER_3_RIGHT = Action.RFN + Numbers.NUMBER_3 + Position.RT
    private const val RFN_NUMBER_4_RIGHT = Action.RFN + Numbers.NUMBER_4 + Position.RT
    private const val RFN_NUMBER_5_RIGHT = Action.RFN + Numbers.NUMBER_5 + Position.RT
    private const val RFN_NUMBER_6_RIGHT = Action.RFN + Numbers.NUMBER_6 + Position.RT
    private const val RFN_NUMBER_7_RIGHT = Action.RFN + Numbers.NUMBER_7 + Position.RT
    private const val RFN_NUMBER_8_RIGHT = Action.RFN + Numbers.NUMBER_8 + Position.RT
    private const val RFN_NUMBER_9_RIGHT = Action.RFN + Numbers.NUMBER_9 + Position.RT
    private const val RFN_NUMBER_10_RIGHT = Action.RFN + Numbers.NUMBER_10 + Position.RT
    private const val RFN_NUMBER_11_RIGHT = Action.RFN + Numbers.NUMBER_11 + Position.RT
    private const val RFN_NUMBER_12_RIGHT = Action.RFN + Numbers.NUMBER_12 + Position.RT
    private const val RFN_NUMBER_13_RIGHT = Action.RFN + Numbers.NUMBER_13 + Position.RT
    private const val RFN_NUMBER_14_RIGHT = Action.RFN + Numbers.NUMBER_14 + Position.RT
    private const val RFN_NUMBER_15_RIGHT = Action.RFN + Numbers.NUMBER_15 + Position.RT
    private const val RFN_NUMBER_16_RIGHT = Action.RFN + Numbers.NUMBER_16 + Position.RT
    private const val RFN_NUMBER_17_RIGHT = Action.RFN + Numbers.NUMBER_17 + Position.RT
    private const val RFN_NUMBER_18_RIGHT = Action.RFN + Numbers.NUMBER_18 + Position.RT
    private const val RFN_NUMBER_19_RIGHT = Action.RFN + Numbers.NUMBER_19 + Position.RT
    private const val RFN_NUMBER_20_RIGHT = Action.RFN + Numbers.NUMBER_20 + Position.RT
    private const val RFN_NUMBER_21_RIGHT = Action.RFN + Numbers.NUMBER_21 + Position.RT
    private const val RFN_NUMBER_22_RIGHT = Action.RFN + Numbers.NUMBER_22 + Position.RT
    private const val RFN_NUMBER_23_RIGHT = Action.RFN + Numbers.NUMBER_23 + Position.RT
    private const val RFN_NUMBER_24_RIGHT = Action.RFN + Numbers.NUMBER_24 + Position.RT
    private const val RFN_NUMBER_25_RIGHT = Action.RFN + Numbers.NUMBER_25 + Position.RT
    private const val RFN_NUMBER_26_RIGHT = Action.RFN + Numbers.NUMBER_26 + Position.RT
    private const val RFN_NUMBER_27_RIGHT = Action.RFN + Numbers.NUMBER_27 + Position.RT
    private const val RFN_NUMBER_28_RIGHT = Action.RFN + Numbers.NUMBER_28 + Position.RT
    private const val RFN_NUMBER_29_RIGHT = Action.RFN + Numbers.NUMBER_29 + Position.RT
    private const val RFN_NUMBER_30_RIGHT = Action.RFN + Numbers.NUMBER_30 + Position.RT
    private const val RFN_NUMBER_31_RIGHT = Action.RFN + Numbers.NUMBER_31 + Position.RT
    private const val RFN_NUMBER_32_RIGHT = Action.RFN + Numbers.NUMBER_32 + Position.RT
    private const val RFN_NUMBER_33_RIGHT = Action.RFN + Numbers.NUMBER_33 + Position.RT
    private const val RFN_NUMBER_34_RIGHT = Action.RFN + Numbers.NUMBER_34 + Position.RT
    private const val RFN_NUMBER_35_RIGHT = Action.RFN + Numbers.NUMBER_35 + Position.RT
    private const val RFN_NUMBER_36_RIGHT = Action.RFN + Numbers.NUMBER_36 + Position.RT
    private const val RFN_NUMBER_37_RIGHT = Action.RFN + Numbers.NUMBER_37 + Position.RT

    /** Perform google image search on a given part based by diagram number **/
    private const val GGL_NUMBER_1 = Action.GGL + Numbers.NUMBER_1
    private const val GGL_NUMBER_2 = Action.GGL + Numbers.NUMBER_2
    private const val GGL_NUMBER_3 = Action.GGL + Numbers.NUMBER_3
    private const val GGL_NUMBER_4 = Action.GGL + Numbers.NUMBER_4
    private const val GGL_NUMBER_5 = Action.GGL + Numbers.NUMBER_5
    private const val GGL_NUMBER_6 = Action.GGL + Numbers.NUMBER_6
    private const val GGL_NUMBER_7 = Action.GGL + Numbers.NUMBER_7
    private const val GGL_NUMBER_8 = Action.GGL + Numbers.NUMBER_8
    private const val GGL_NUMBER_9 = Action.GGL + Numbers.NUMBER_9
    private const val GGL_NUMBER_10 = Action.GGL + Numbers.NUMBER_10
    private const val GGL_NUMBER_11 = Action.GGL + Numbers.NUMBER_11
    private const val GGL_NUMBER_12 = Action.GGL + Numbers.NUMBER_12
    private const val GGL_NUMBER_13 = Action.GGL + Numbers.NUMBER_13
    private const val GGL_NUMBER_14 = Action.GGL + Numbers.NUMBER_14
    private const val GGL_NUMBER_15 = Action.GGL + Numbers.NUMBER_15
    private const val GGL_NUMBER_16 = Action.GGL + Numbers.NUMBER_16
    private const val GGL_NUMBER_17 = Action.GGL + Numbers.NUMBER_17
    private const val GGL_NUMBER_18 = Action.GGL + Numbers.NUMBER_18
    private const val GGL_NUMBER_19 = Action.GGL + Numbers.NUMBER_19
    private const val GGL_NUMBER_20 = Action.GGL + Numbers.NUMBER_20
    private const val GGL_NUMBER_21 = Action.GGL + Numbers.NUMBER_21
    private const val GGL_NUMBER_22 = Action.GGL + Numbers.NUMBER_22
    private const val GGL_NUMBER_23 = Action.GGL + Numbers.NUMBER_23
    private const val GGL_NUMBER_24 = Action.GGL + Numbers.NUMBER_24
    private const val GGL_NUMBER_25 = Action.GGL + Numbers.NUMBER_25
    private const val GGL_NUMBER_26 = Action.GGL + Numbers.NUMBER_26
    private const val GGL_NUMBER_27 = Action.GGL + Numbers.NUMBER_27
    private const val GGL_NUMBER_28 = Action.GGL + Numbers.NUMBER_28
    private const val GGL_NUMBER_29 = Action.GGL + Numbers.NUMBER_29
    private const val GGL_NUMBER_30 = Action.GGL + Numbers.NUMBER_30
    private const val GGL_NUMBER_31 = Action.GGL + Numbers.NUMBER_31
    private const val GGL_NUMBER_32 = Action.GGL + Numbers.NUMBER_32
    private const val GGL_NUMBER_33 = Action.GGL + Numbers.NUMBER_33
    private const val GGL_NUMBER_34 = Action.GGL + Numbers.NUMBER_34
    private const val GGL_NUMBER_35 = Action.GGL + Numbers.NUMBER_35
    private const val GGL_NUMBER_36 = Action.GGL + Numbers.NUMBER_36
    private const val GGL_NUMBER_37 = Action.GGL + Numbers.NUMBER_37

    /** Perform LEFT google image search on a given part based by diagram number **/
    private const val GGL_NUMBER_1_LEFT = Action.GGL + Numbers.NUMBER_1 + Position.LT
    private const val GGL_NUMBER_2_LEFT = Action.GGL + Numbers.NUMBER_2 + Position.LT
    private const val GGL_NUMBER_3_LEFT = Action.GGL + Numbers.NUMBER_3 + Position.LT
    private const val GGL_NUMBER_4_LEFT = Action.GGL + Numbers.NUMBER_4 + Position.LT
    private const val GGL_NUMBER_5_LEFT = Action.GGL + Numbers.NUMBER_5 + Position.LT
    private const val GGL_NUMBER_6_LEFT = Action.GGL + Numbers.NUMBER_6 + Position.LT
    private const val GGL_NUMBER_7_LEFT = Action.GGL + Numbers.NUMBER_7 + Position.LT
    private const val GGL_NUMBER_8_LEFT = Action.GGL + Numbers.NUMBER_8 + Position.LT
    private const val GGL_NUMBER_9_LEFT = Action.GGL + Numbers.NUMBER_9 + Position.LT
    private const val GGL_NUMBER_10_LEFT = Action.GGL + Numbers.NUMBER_10 + Position.LT
    private const val GGL_NUMBER_11_LEFT = Action.GGL + Numbers.NUMBER_11 + Position.LT
    private const val GGL_NUMBER_12_LEFT = Action.GGL + Numbers.NUMBER_12 + Position.LT
    private const val GGL_NUMBER_13_LEFT = Action.GGL + Numbers.NUMBER_13 + Position.LT
    private const val GGL_NUMBER_14_LEFT = Action.GGL + Numbers.NUMBER_14 + Position.LT
    private const val GGL_NUMBER_15_LEFT = Action.GGL + Numbers.NUMBER_15 + Position.LT
    private const val GGL_NUMBER_16_LEFT = Action.GGL + Numbers.NUMBER_16 + Position.LT
    private const val GGL_NUMBER_17_LEFT = Action.GGL + Numbers.NUMBER_17 + Position.LT
    private const val GGL_NUMBER_18_LEFT = Action.GGL + Numbers.NUMBER_18 + Position.LT
    private const val GGL_NUMBER_19_LEFT = Action.GGL + Numbers.NUMBER_19 + Position.LT
    private const val GGL_NUMBER_20_LEFT = Action.GGL + Numbers.NUMBER_20 + Position.LT
    private const val GGL_NUMBER_21_LEFT = Action.GGL + Numbers.NUMBER_21 + Position.LT
    private const val GGL_NUMBER_22_LEFT = Action.GGL + Numbers.NUMBER_22 + Position.LT
    private const val GGL_NUMBER_23_LEFT = Action.GGL + Numbers.NUMBER_23 + Position.LT
    private const val GGL_NUMBER_24_LEFT = Action.GGL + Numbers.NUMBER_24 + Position.LT
    private const val GGL_NUMBER_25_LEFT = Action.GGL + Numbers.NUMBER_25 + Position.LT
    private const val GGL_NUMBER_26_LEFT = Action.GGL + Numbers.NUMBER_26 + Position.LT
    private const val GGL_NUMBER_27_LEFT = Action.GGL + Numbers.NUMBER_27 + Position.LT
    private const val GGL_NUMBER_28_LEFT = Action.GGL + Numbers.NUMBER_28 + Position.LT
    private const val GGL_NUMBER_29_LEFT = Action.GGL + Numbers.NUMBER_29 + Position.LT
    private const val GGL_NUMBER_30_LEFT = Action.GGL + Numbers.NUMBER_30 + Position.LT
    private const val GGL_NUMBER_31_LEFT = Action.GGL + Numbers.NUMBER_31 + Position.LT
    private const val GGL_NUMBER_32_LEFT = Action.GGL + Numbers.NUMBER_32 + Position.LT
    private const val GGL_NUMBER_33_LEFT = Action.GGL + Numbers.NUMBER_33 + Position.LT
    private const val GGL_NUMBER_34_LEFT = Action.GGL + Numbers.NUMBER_34 + Position.LT
    private const val GGL_NUMBER_35_LEFT = Action.GGL + Numbers.NUMBER_35 + Position.LT
    private const val GGL_NUMBER_36_LEFT = Action.GGL + Numbers.NUMBER_36 + Position.LT
    private const val GGL_NUMBER_37_LEFT = Action.GGL + Numbers.NUMBER_37 + Position.LT

    /** Perform RIGHT google image search on a given part based by diagram number **/
    private const val GGL_NUMBER_1_RIGHT = Action.GGL + Numbers.NUMBER_1 + Position.RT
    private const val GGL_NUMBER_2_RIGHT = Action.GGL + Numbers.NUMBER_2 + Position.RT
    private const val GGL_NUMBER_3_RIGHT = Action.GGL + Numbers.NUMBER_3 + Position.RT
    private const val GGL_NUMBER_4_RIGHT = Action.GGL + Numbers.NUMBER_4 + Position.RT
    private const val GGL_NUMBER_5_RIGHT = Action.GGL + Numbers.NUMBER_5 + Position.RT
    private const val GGL_NUMBER_6_RIGHT = Action.GGL + Numbers.NUMBER_6 + Position.RT
    private const val GGL_NUMBER_7_RIGHT = Action.GGL + Numbers.NUMBER_7 + Position.RT
    private const val GGL_NUMBER_8_RIGHT = Action.GGL + Numbers.NUMBER_8 + Position.RT
    private const val GGL_NUMBER_9_RIGHT = Action.GGL + Numbers.NUMBER_9 + Position.RT
    private const val GGL_NUMBER_10_RIGHT = Action.GGL + Numbers.NUMBER_10 + Position.RT
    private const val GGL_NUMBER_11_RIGHT = Action.GGL + Numbers.NUMBER_11 + Position.RT
    private const val GGL_NUMBER_12_RIGHT = Action.GGL + Numbers.NUMBER_12 + Position.RT
    private const val GGL_NUMBER_13_RIGHT = Action.GGL + Numbers.NUMBER_13 + Position.RT
    private const val GGL_NUMBER_14_RIGHT = Action.GGL + Numbers.NUMBER_14 + Position.RT
    private const val GGL_NUMBER_15_RIGHT = Action.GGL + Numbers.NUMBER_15 + Position.RT
    private const val GGL_NUMBER_16_RIGHT = Action.GGL + Numbers.NUMBER_16 + Position.RT
    private const val GGL_NUMBER_17_RIGHT = Action.GGL + Numbers.NUMBER_17 + Position.RT
    private const val GGL_NUMBER_18_RIGHT = Action.GGL + Numbers.NUMBER_18 + Position.RT
    private const val GGL_NUMBER_19_RIGHT = Action.GGL + Numbers.NUMBER_19 + Position.RT
    private const val GGL_NUMBER_20_RIGHT = Action.GGL + Numbers.NUMBER_20 + Position.RT
    private const val GGL_NUMBER_21_RIGHT = Action.GGL + Numbers.NUMBER_21 + Position.RT
    private const val GGL_NUMBER_22_RIGHT = Action.GGL + Numbers.NUMBER_22 + Position.RT
    private const val GGL_NUMBER_23_RIGHT = Action.GGL + Numbers.NUMBER_23 + Position.RT
    private const val GGL_NUMBER_24_RIGHT = Action.GGL + Numbers.NUMBER_24 + Position.RT
    private const val GGL_NUMBER_25_RIGHT = Action.GGL + Numbers.NUMBER_25 + Position.RT
    private const val GGL_NUMBER_26_RIGHT = Action.GGL + Numbers.NUMBER_26 + Position.RT
    private const val GGL_NUMBER_27_RIGHT = Action.GGL + Numbers.NUMBER_27 + Position.RT
    private const val GGL_NUMBER_28_RIGHT = Action.GGL + Numbers.NUMBER_28 + Position.RT
    private const val GGL_NUMBER_29_RIGHT = Action.GGL + Numbers.NUMBER_29 + Position.RT
    private const val GGL_NUMBER_30_RIGHT = Action.GGL + Numbers.NUMBER_30 + Position.RT
    private const val GGL_NUMBER_31_RIGHT = Action.GGL + Numbers.NUMBER_31 + Position.RT
    private const val GGL_NUMBER_32_RIGHT = Action.GGL + Numbers.NUMBER_32 + Position.RT
    private const val GGL_NUMBER_33_RIGHT = Action.GGL + Numbers.NUMBER_33 + Position.RT
    private const val GGL_NUMBER_34_RIGHT = Action.GGL + Numbers.NUMBER_34 + Position.RT
    private const val GGL_NUMBER_35_RIGHT = Action.GGL + Numbers.NUMBER_35 + Position.RT
    private const val GGL_NUMBER_36_RIGHT = Action.GGL + Numbers.NUMBER_36 + Position.RT
    private const val GGL_NUMBER_37_RIGHT = Action.GGL + Numbers.NUMBER_37 + Position.RT

    /** Perform part replacement based by diagram number **/
    private const val RPL_NUMBER_1 = Action.RPL + Numbers.NUMBER_1
    private const val RPL_NUMBER_2 = Action.RPL + Numbers.NUMBER_2
    private const val RPL_NUMBER_3 = Action.RPL + Numbers.NUMBER_3
    private const val RPL_NUMBER_4 = Action.RPL + Numbers.NUMBER_4
    private const val RPL_NUMBER_5 = Action.RPL + Numbers.NUMBER_5
    private const val RPL_NUMBER_6 = Action.RPL + Numbers.NUMBER_6
    private const val RPL_NUMBER_7 = Action.RPL + Numbers.NUMBER_7
    private const val RPL_NUMBER_8 = Action.RPL + Numbers.NUMBER_8
    private const val RPL_NUMBER_9 = Action.RPL + Numbers.NUMBER_9
    private const val RPL_NUMBER_10 = Action.RPL + Numbers.NUMBER_10
    private const val RPL_NUMBER_11 = Action.RPL + Numbers.NUMBER_11
    private const val RPL_NUMBER_12 = Action.RPL + Numbers.NUMBER_12
    private const val RPL_NUMBER_13 = Action.RPL + Numbers.NUMBER_13
    private const val RPL_NUMBER_14 = Action.RPL + Numbers.NUMBER_14
    private const val RPL_NUMBER_15 = Action.RPL + Numbers.NUMBER_15
    private const val RPL_NUMBER_16 = Action.RPL + Numbers.NUMBER_16
    private const val RPL_NUMBER_17 = Action.RPL + Numbers.NUMBER_17
    private const val RPL_NUMBER_18 = Action.RPL + Numbers.NUMBER_18
    private const val RPL_NUMBER_19 = Action.RPL + Numbers.NUMBER_19
    private const val RPL_NUMBER_20 = Action.RPL + Numbers.NUMBER_20
    private const val RPL_NUMBER_21 = Action.RPL + Numbers.NUMBER_21
    private const val RPL_NUMBER_22 = Action.RPL + Numbers.NUMBER_22
    private const val RPL_NUMBER_23 = Action.RPL + Numbers.NUMBER_23
    private const val RPL_NUMBER_24 = Action.RPL + Numbers.NUMBER_24
    private const val RPL_NUMBER_25 = Action.RPL + Numbers.NUMBER_25
    private const val RPL_NUMBER_26 = Action.RPL + Numbers.NUMBER_26
    private const val RPL_NUMBER_27 = Action.RPL + Numbers.NUMBER_27
    private const val RPL_NUMBER_28 = Action.RPL + Numbers.NUMBER_28
    private const val RPL_NUMBER_29 = Action.RPL + Numbers.NUMBER_29
    private const val RPL_NUMBER_30 = Action.RPL + Numbers.NUMBER_30
    private const val RPL_NUMBER_31 = Action.RPL + Numbers.NUMBER_31
    private const val RPL_NUMBER_32 = Action.RPL + Numbers.NUMBER_32
    private const val RPL_NUMBER_33 = Action.RPL + Numbers.NUMBER_33
    private const val RPL_NUMBER_34 = Action.RPL + Numbers.NUMBER_34
    private const val RPL_NUMBER_35 = Action.RPL + Numbers.NUMBER_35
    private const val RPL_NUMBER_36 = Action.RPL + Numbers.NUMBER_36
    private const val RPL_NUMBER_37 = Action.RPL + Numbers.NUMBER_37

    /** Perform LEFT part replacement based by diagram number **/
    private const val RPL_NUMBER_1_LEFT = Action.RPL + Numbers.NUMBER_1 + Position.LT
    private const val RPL_NUMBER_2_LEFT = Action.RPL + Numbers.NUMBER_2 + Position.LT
    private const val RPL_NUMBER_3_LEFT = Action.RPL + Numbers.NUMBER_3 + Position.LT
    private const val RPL_NUMBER_4_LEFT = Action.RPL + Numbers.NUMBER_4 + Position.LT
    private const val RPL_NUMBER_5_LEFT = Action.RPL + Numbers.NUMBER_5 + Position.LT
    private const val RPL_NUMBER_6_LEFT = Action.RPL + Numbers.NUMBER_6 + Position.LT
    private const val RPL_NUMBER_7_LEFT = Action.RPL + Numbers.NUMBER_7 + Position.LT
    private const val RPL_NUMBER_8_LEFT = Action.RPL + Numbers.NUMBER_8 + Position.LT
    private const val RPL_NUMBER_9_LEFT = Action.RPL + Numbers.NUMBER_9 + Position.LT
    private const val RPL_NUMBER_10_LEFT = Action.RPL + Numbers.NUMBER_10 + Position.LT
    private const val RPL_NUMBER_11_LEFT = Action.RPL + Numbers.NUMBER_11 + Position.LT
    private const val RPL_NUMBER_12_LEFT = Action.RPL + Numbers.NUMBER_12 + Position.LT
    private const val RPL_NUMBER_13_LEFT = Action.RPL + Numbers.NUMBER_13 + Position.LT
    private const val RPL_NUMBER_14_LEFT = Action.RPL + Numbers.NUMBER_14 + Position.LT
    private const val RPL_NUMBER_15_LEFT = Action.RPL + Numbers.NUMBER_15 + Position.LT
    private const val RPL_NUMBER_16_LEFT = Action.RPL + Numbers.NUMBER_16 + Position.LT
    private const val RPL_NUMBER_17_LEFT = Action.RPL + Numbers.NUMBER_17 + Position.LT
    private const val RPL_NUMBER_18_LEFT = Action.RPL + Numbers.NUMBER_18 + Position.LT
    private const val RPL_NUMBER_19_LEFT = Action.RPL + Numbers.NUMBER_19 + Position.LT
    private const val RPL_NUMBER_20_LEFT = Action.RPL + Numbers.NUMBER_20 + Position.LT
    private const val RPL_NUMBER_21_LEFT = Action.RPL + Numbers.NUMBER_21 + Position.LT
    private const val RPL_NUMBER_22_LEFT = Action.RPL + Numbers.NUMBER_22 + Position.LT
    private const val RPL_NUMBER_23_LEFT = Action.RPL + Numbers.NUMBER_23 + Position.LT
    private const val RPL_NUMBER_24_LEFT = Action.RPL + Numbers.NUMBER_24 + Position.LT
    private const val RPL_NUMBER_25_LEFT = Action.RPL + Numbers.NUMBER_25 + Position.LT
    private const val RPL_NUMBER_26_LEFT = Action.RPL + Numbers.NUMBER_26 + Position.LT
    private const val RPL_NUMBER_27_LEFT = Action.RPL + Numbers.NUMBER_27 + Position.LT
    private const val RPL_NUMBER_28_LEFT = Action.RPL + Numbers.NUMBER_28 + Position.LT
    private const val RPL_NUMBER_29_LEFT = Action.RPL + Numbers.NUMBER_29 + Position.LT
    private const val RPL_NUMBER_30_LEFT = Action.RPL + Numbers.NUMBER_30 + Position.LT
    private const val RPL_NUMBER_31_LEFT = Action.RPL + Numbers.NUMBER_31 + Position.LT
    private const val RPL_NUMBER_32_LEFT = Action.RPL + Numbers.NUMBER_32 + Position.LT
    private const val RPL_NUMBER_33_LEFT = Action.RPL + Numbers.NUMBER_33 + Position.LT
    private const val RPL_NUMBER_34_LEFT = Action.RPL + Numbers.NUMBER_34 + Position.LT
    private const val RPL_NUMBER_35_LEFT = Action.RPL + Numbers.NUMBER_35 + Position.LT
    private const val RPL_NUMBER_36_LEFT = Action.RPL + Numbers.NUMBER_36 + Position.LT
    private const val RPL_NUMBER_37_LEFT = Action.RPL + Numbers.NUMBER_37 + Position.LT

    /** Perform RIGHT part replacement based by diagram number **/
    private const val RPL_NUMBER_1_RIGHT = Action.RPL + Numbers.NUMBER_1 + Position.RT
    private const val RPL_NUMBER_2_RIGHT = Action.RPL + Numbers.NUMBER_2 + Position.RT
    private const val RPL_NUMBER_3_RIGHT = Action.RPL + Numbers.NUMBER_3 + Position.RT
    private const val RPL_NUMBER_4_RIGHT = Action.RPL + Numbers.NUMBER_4 + Position.RT
    private const val RPL_NUMBER_5_RIGHT = Action.RPL + Numbers.NUMBER_5 + Position.RT
    private const val RPL_NUMBER_6_RIGHT = Action.RPL + Numbers.NUMBER_6 + Position.RT
    private const val RPL_NUMBER_7_RIGHT = Action.RPL + Numbers.NUMBER_7 + Position.RT
    private const val RPL_NUMBER_8_RIGHT = Action.RPL + Numbers.NUMBER_8 + Position.RT
    private const val RPL_NUMBER_9_RIGHT = Action.RPL + Numbers.NUMBER_9 + Position.RT
    private const val RPL_NUMBER_10_RIGHT = Action.RPL + Numbers.NUMBER_10 + Position.RT
    private const val RPL_NUMBER_11_RIGHT = Action.RPL + Numbers.NUMBER_11 + Position.RT
    private const val RPL_NUMBER_12_RIGHT = Action.RPL + Numbers.NUMBER_12 + Position.RT
    private const val RPL_NUMBER_13_RIGHT = Action.RPL + Numbers.NUMBER_13 + Position.RT
    private const val RPL_NUMBER_14_RIGHT = Action.RPL + Numbers.NUMBER_14 + Position.RT
    private const val RPL_NUMBER_15_RIGHT = Action.RPL + Numbers.NUMBER_15 + Position.RT
    private const val RPL_NUMBER_16_RIGHT = Action.RPL + Numbers.NUMBER_16 + Position.RT
    private const val RPL_NUMBER_17_RIGHT = Action.RPL + Numbers.NUMBER_17 + Position.RT
    private const val RPL_NUMBER_18_RIGHT = Action.RPL + Numbers.NUMBER_18 + Position.RT
    private const val RPL_NUMBER_19_RIGHT = Action.RPL + Numbers.NUMBER_19 + Position.RT
    private const val RPL_NUMBER_20_RIGHT = Action.RPL + Numbers.NUMBER_20 + Position.RT
    private const val RPL_NUMBER_21_RIGHT = Action.RPL + Numbers.NUMBER_21 + Position.RT
    private const val RPL_NUMBER_22_RIGHT = Action.RPL + Numbers.NUMBER_22 + Position.RT
    private const val RPL_NUMBER_23_RIGHT = Action.RPL + Numbers.NUMBER_23 + Position.RT
    private const val RPL_NUMBER_24_RIGHT = Action.RPL + Numbers.NUMBER_24 + Position.RT
    private const val RPL_NUMBER_25_RIGHT = Action.RPL + Numbers.NUMBER_25 + Position.RT
    private const val RPL_NUMBER_26_RIGHT = Action.RPL + Numbers.NUMBER_26 + Position.RT
    private const val RPL_NUMBER_27_RIGHT = Action.RPL + Numbers.NUMBER_27 + Position.RT
    private const val RPL_NUMBER_28_RIGHT = Action.RPL + Numbers.NUMBER_28 + Position.RT
    private const val RPL_NUMBER_29_RIGHT = Action.RPL + Numbers.NUMBER_29 + Position.RT
    private const val RPL_NUMBER_30_RIGHT = Action.RPL + Numbers.NUMBER_30 + Position.RT
    private const val RPL_NUMBER_31_RIGHT = Action.RPL + Numbers.NUMBER_31 + Position.RT
    private const val RPL_NUMBER_32_RIGHT = Action.RPL + Numbers.NUMBER_32 + Position.RT
    private const val RPL_NUMBER_33_RIGHT = Action.RPL + Numbers.NUMBER_33 + Position.RT
    private const val RPL_NUMBER_34_RIGHT = Action.RPL + Numbers.NUMBER_34 + Position.RT
    private const val RPL_NUMBER_35_RIGHT = Action.RPL + Numbers.NUMBER_35 + Position.RT
    private const val RPL_NUMBER_36_RIGHT = Action.RPL + Numbers.NUMBER_36 + Position.RT
    private const val RPL_NUMBER_37_RIGHT = Action.RPL + Numbers.NUMBER_37 + Position.RT

    //Going to line numbers in estimates
    private const val NL_NUMBER_1 = Commands.Action.NL + Commands.Numbers.NUMBER_1
    private const val NL_NUMBER_2 = Commands.Action.NL + Commands.Numbers.NUMBER_2
    private const val NL_NUMBER_3 = Commands.Action.NL + Commands.Numbers.NUMBER_3
    private const val NL_NUMBER_4 = Commands.Action.NL + Commands.Numbers.NUMBER_4
    private const val NL_NUMBER_5 = Commands.Action.NL + Commands.Numbers.NUMBER_5
    private const val NL_NUMBER_6 = Commands.Action.NL + Commands.Numbers.NUMBER_6
    private const val NL_NUMBER_7 = Commands.Action.NL + Commands.Numbers.NUMBER_7
    private const val NL_NUMBER_8 = Commands.Action.NL + Commands.Numbers.NUMBER_8
    private const val NL_NUMBER_9 = Commands.Action.NL + Commands.Numbers.NUMBER_9
    private const val NL_NUMBER_10 = Commands.Action.NL + Commands.Numbers.NUMBER_10
    private const val NL_NUMBER_11 = Commands.Action.NL + Commands.Numbers.NUMBER_11
    private const val NL_NUMBER_12 = Commands.Action.NL + Commands.Numbers.NUMBER_12
    private const val NL_NUMBER_13 = Commands.Action.NL + Commands.Numbers.NUMBER_13
    private const val NL_NUMBER_14 = Commands.Action.NL + Commands.Numbers.NUMBER_14
    private const val NL_NUMBER_15 = Commands.Action.NL + Commands.Numbers.NUMBER_15
    private const val NL_NUMBER_16 = Commands.Action.NL + Commands.Numbers.NUMBER_16
    private const val NL_NUMBER_17 = Commands.Action.NL + Commands.Numbers.NUMBER_17
    private const val NL_NUMBER_18 = Commands.Action.NL + Commands.Numbers.NUMBER_18
    private const val NL_NUMBER_19 = Commands.Action.NL + Commands.Numbers.NUMBER_19
    private const val NL_NUMBER_20 = Commands.Action.NL + Commands.Numbers.NUMBER_20
    private const val NL_NUMBER_21 = Commands.Action.NL + Commands.Numbers.NUMBER_21
    private const val NL_NUMBER_22 = Commands.Action.NL + Commands.Numbers.NUMBER_22
    private const val NL_NUMBER_23 = Commands.Action.NL + Commands.Numbers.NUMBER_23
    private const val NL_NUMBER_24 = Commands.Action.NL + Commands.Numbers.NUMBER_24
    private const val NL_NUMBER_25 = Commands.Action.NL + Commands.Numbers.NUMBER_25
    private const val NL_NUMBER_26 = Commands.Action.NL + Commands.Numbers.NUMBER_26
    private const val NL_NUMBER_27 = Commands.Action.NL + Commands.Numbers.NUMBER_27
    private const val NL_NUMBER_28 = Commands.Action.NL + Commands.Numbers.NUMBER_28
    private const val NL_NUMBER_29 = Commands.Action.NL + Commands.Numbers.NUMBER_29
    private const val NL_NUMBER_30 = Commands.Action.NL + Commands.Numbers.NUMBER_30
    private const val NL_NUMBER_31 = Commands.Action.NL + Commands.Numbers.NUMBER_31
    private const val NL_NUMBER_32 = Commands.Action.NL + Commands.Numbers.NUMBER_32
    private const val NL_NUMBER_33 = Commands.Action.NL + Commands.Numbers.NUMBER_33
    private const val NL_NUMBER_34 = Commands.Action.NL + Commands.Numbers.NUMBER_34
    private const val NL_NUMBER_35 = Commands.Action.NL + Commands.Numbers.NUMBER_35
    private const val NL_NUMBER_36 = Commands.Action.NL + Commands.Numbers.NUMBER_36
    private const val NL_NUMBER_37 = Commands.Action.NL + Commands.Numbers.NUMBER_37
    private const val NL_NUMBER_38 = Commands.Action.NL + Commands.Numbers.NUMBER_38
    private const val NL_NUMBER_39 = Commands.Action.NL + Commands.Numbers.NUMBER_39
    private const val NL_NUMBER_40 = Commands.Action.NL + Commands.Numbers.NUMBER_40
    private const val NL_NUMBER_41 = Commands.Action.NL + Commands.Numbers.NUMBER_41
    private const val NL_NUMBER_42 = Commands.Action.NL + Commands.Numbers.NUMBER_42
    private const val NL_NUMBER_43 = Commands.Action.NL + Commands.Numbers.NUMBER_43
    private const val NL_NUMBER_44 = Commands.Action.NL + Commands.Numbers.NUMBER_44
    private const val NL_NUMBER_45 = Commands.Action.NL + Commands.Numbers.NUMBER_45
    private const val NL_NUMBER_46 = Commands.Action.NL + Commands.Numbers.NUMBER_46
    private const val NL_NUMBER_47 = Commands.Action.NL + Commands.Numbers.NUMBER_47
    private const val NL_NUMBER_48 = Commands.Action.NL + Commands.Numbers.NUMBER_48
    private const val NL_NUMBER_49 = Commands.Action.NL + Commands.Numbers.NUMBER_49
    private const val NL_NUMBER_50 = Commands.Action.NL + Commands.Numbers.NUMBER_50
    private const val NL_NUMBER_51 = Commands.Action.NL + Commands.Numbers.NUMBER_51
    private const val NL_NUMBER_52 = Commands.Action.NL + Commands.Numbers.NUMBER_52
    private const val NL_NUMBER_53 = Commands.Action.NL + Commands.Numbers.NUMBER_53
    private const val NL_NUMBER_54 = Commands.Action.NL + Commands.Numbers.NUMBER_54
    private const val NL_NUMBER_55 = Commands.Action.NL + Commands.Numbers.NUMBER_55
    private const val NL_NUMBER_56 = Commands.Action.NL + Commands.Numbers.NUMBER_56
    private const val NL_NUMBER_57 = Commands.Action.NL + Commands.Numbers.NUMBER_57
    private const val NL_NUMBER_58 = Commands.Action.NL + Commands.Numbers.NUMBER_58
    private const val NL_NUMBER_59 = Commands.Action.NL + Commands.Numbers.NUMBER_59
    private const val NL_NUMBER_60 = Commands.Action.NL + Commands.Numbers.NUMBER_60
    private const val NL_NUMBER_61 = Commands.Action.NL + Commands.Numbers.NUMBER_61
    private const val NL_NUMBER_62 = Commands.Action.NL + Commands.Numbers.NUMBER_62
    private const val NL_NUMBER_63 = Commands.Action.NL + Commands.Numbers.NUMBER_63
    private const val NL_NUMBER_64 = Commands.Action.NL + Commands.Numbers.NUMBER_64
    private const val NL_NUMBER_65 = Commands.Action.NL + Commands.Numbers.NUMBER_65
    private const val NL_NUMBER_66 = Commands.Action.NL + Commands.Numbers.NUMBER_66
    private const val NL_NUMBER_67 = Commands.Action.NL + Commands.Numbers.NUMBER_67
    private const val NL_NUMBER_68 = Commands.Action.NL + Commands.Numbers.NUMBER_68
    private const val NL_NUMBER_69 = Commands.Action.NL + Commands.Numbers.NUMBER_69
    private const val NL_NUMBER_70 = Commands.Action.NL + Commands.Numbers.NUMBER_70
    private const val NL_NUMBER_71 = Commands.Action.NL + Commands.Numbers.NUMBER_71
    private const val NL_NUMBER_72 = Commands.Action.NL + Commands.Numbers.NUMBER_72
    private const val NL_NUMBER_73 = Commands.Action.NL + Commands.Numbers.NUMBER_73
    private const val NL_NUMBER_74 = Commands.Action.NL + Commands.Numbers.NUMBER_74
    private const val NL_NUMBER_75 = Commands.Action.NL + Commands.Numbers.NUMBER_75
    private const val NL_NUMBER_76 = Commands.Action.NL + Commands.Numbers.NUMBER_76
    private const val NL_NUMBER_77 = Commands.Action.NL + Commands.Numbers.NUMBER_77
    private const val NL_NUMBER_78 = Commands.Action.NL + Commands.Numbers.NUMBER_78
    private const val NL_NUMBER_79 = Commands.Action.NL + Commands.Numbers.NUMBER_79
    private const val NL_NUMBER_80 = Commands.Action.NL + Commands.Numbers.NUMBER_80
    private const val NL_NUMBER_81 = Commands.Action.NL + Commands.Numbers.NUMBER_81
    private const val NL_NUMBER_82 = Commands.Action.NL + Commands.Numbers.NUMBER_82
    private const val NL_NUMBER_83 = Commands.Action.NL + Commands.Numbers.NUMBER_83
    private const val NL_NUMBER_84 = Commands.Action.NL + Commands.Numbers.NUMBER_84
    private const val NL_NUMBER_85 = Commands.Action.NL + Commands.Numbers.NUMBER_85
    private const val NL_NUMBER_86 = Commands.Action.NL + Commands.Numbers.NUMBER_86
    private const val NL_NUMBER_87 = Commands.Action.NL + Commands.Numbers.NUMBER_87
    private const val NL_NUMBER_88 = Commands.Action.NL + Commands.Numbers.NUMBER_88
    private const val NL_NUMBER_89 = Commands.Action.NL + Commands.Numbers.NUMBER_89
    private const val NL_NUMBER_90 = Commands.Action.NL + Commands.Numbers.NUMBER_90
    private const val NL_NUMBER_91 = Commands.Action.NL + Commands.Numbers.NUMBER_91
    private const val NL_NUMBER_92 = Commands.Action.NL + Commands.Numbers.NUMBER_92
    private const val NL_NUMBER_93 = Commands.Action.NL + Commands.Numbers.NUMBER_93
    private const val NL_NUMBER_94 = Commands.Action.NL + Commands.Numbers.NUMBER_94
    private const val NL_NUMBER_95 = Commands.Action.NL + Commands.Numbers.NUMBER_95
    private const val NL_NUMBER_96 = Commands.Action.NL + Commands.Numbers.NUMBER_96
    private const val NL_NUMBER_97 = Commands.Action.NL + Commands.Numbers.NUMBER_97
    private const val NL_NUMBER_98 = Commands.Action.NL + Commands.Numbers.NUMBER_98
    private const val NL_NUMBER_99 = Commands.Action.NL + Commands.Numbers.NUMBER_99
    private const val NL_NUMBER_100 = Commands.Action.NL + Commands.Numbers.NUMBER_100

    //Insert line by numbers
    private const val INL_NUMBER_1 = Commands.Action.INL + Commands.Numbers.NUMBER_1
    private const val INL_NUMBER_2 = Commands.Action.INL + Commands.Numbers.NUMBER_2
    private const val INL_NUMBER_3 = Commands.Action.INL + Commands.Numbers.NUMBER_3
    private const val INL_NUMBER_4 = Commands.Action.INL + Commands.Numbers.NUMBER_4
    private const val INL_NUMBER_5 = Commands.Action.INL + Commands.Numbers.NUMBER_5
    private const val INL_NUMBER_6 = Commands.Action.INL + Commands.Numbers.NUMBER_6
    private const val INL_NUMBER_7 = Commands.Action.INL + Commands.Numbers.NUMBER_7
    private const val INL_NUMBER_8 = Commands.Action.INL + Commands.Numbers.NUMBER_8
    private const val INL_NUMBER_9 = Commands.Action.INL + Commands.Numbers.NUMBER_9
    private const val INL_NUMBER_10 = Commands.Action.INL + Commands.Numbers.NUMBER_10
    private const val INL_NUMBER_11 = Commands.Action.INL + Commands.Numbers.NUMBER_11
    private const val INL_NUMBER_12 = Commands.Action.INL + Commands.Numbers.NUMBER_12
    private const val INL_NUMBER_13 = Commands.Action.INL + Commands.Numbers.NUMBER_13
    private const val INL_NUMBER_14 = Commands.Action.INL + Commands.Numbers.NUMBER_14
    private const val INL_NUMBER_15 = Commands.Action.INL + Commands.Numbers.NUMBER_15
    private const val INL_NUMBER_16 = Commands.Action.INL + Commands.Numbers.NUMBER_16
    private const val INL_NUMBER_17 = Commands.Action.INL + Commands.Numbers.NUMBER_17
    private const val INL_NUMBER_18 = Commands.Action.INL + Commands.Numbers.NUMBER_18
    private const val INL_NUMBER_19 = Commands.Action.INL + Commands.Numbers.NUMBER_19
    private const val INL_NUMBER_20 = Commands.Action.INL + Commands.Numbers.NUMBER_20
    private const val INL_NUMBER_21 = Commands.Action.INL + Commands.Numbers.NUMBER_21
    private const val INL_NUMBER_22 = Commands.Action.INL + Commands.Numbers.NUMBER_22
    private const val INL_NUMBER_23 = Commands.Action.INL + Commands.Numbers.NUMBER_23
    private const val INL_NUMBER_24 = Commands.Action.INL + Commands.Numbers.NUMBER_24
    private const val INL_NUMBER_25 = Commands.Action.INL + Commands.Numbers.NUMBER_25
    private const val INL_NUMBER_26 = Commands.Action.INL + Commands.Numbers.NUMBER_26
    private const val INL_NUMBER_27 = Commands.Action.INL + Commands.Numbers.NUMBER_27
    private const val INL_NUMBER_28 = Commands.Action.INL + Commands.Numbers.NUMBER_28
    private const val INL_NUMBER_29 = Commands.Action.INL + Commands.Numbers.NUMBER_29
    private const val INL_NUMBER_30 = Commands.Action.INL + Commands.Numbers.NUMBER_30
    private const val INL_NUMBER_31 = Commands.Action.INL + Commands.Numbers.NUMBER_31
    private const val INL_NUMBER_32 = Commands.Action.INL + Commands.Numbers.NUMBER_32
    private const val INL_NUMBER_33 = Commands.Action.INL + Commands.Numbers.NUMBER_33
    private const val INL_NUMBER_34 = Commands.Action.INL + Commands.Numbers.NUMBER_34
    private const val INL_NUMBER_35 = Commands.Action.INL + Commands.Numbers.NUMBER_35
    private const val INL_NUMBER_36 = Commands.Action.INL + Commands.Numbers.NUMBER_36
    private const val INL_NUMBER_37 = Commands.Action.INL + Commands.Numbers.NUMBER_37
    private const val INL_NUMBER_38 = Commands.Action.INL + Commands.Numbers.NUMBER_38
    private const val INL_NUMBER_39 = Commands.Action.INL + Commands.Numbers.NUMBER_39
    private const val INL_NUMBER_40 = Commands.Action.INL + Commands.Numbers.NUMBER_40
    private const val INL_NUMBER_41 = Commands.Action.INL + Commands.Numbers.NUMBER_41
    private const val INL_NUMBER_42 = Commands.Action.INL + Commands.Numbers.NUMBER_42
    private const val INL_NUMBER_43 = Commands.Action.INL + Commands.Numbers.NUMBER_43
    private const val INL_NUMBER_44 = Commands.Action.INL + Commands.Numbers.NUMBER_44
    private const val INL_NUMBER_45 = Commands.Action.INL + Commands.Numbers.NUMBER_45
    private const val INL_NUMBER_46 = Commands.Action.INL + Commands.Numbers.NUMBER_46
    private const val INL_NUMBER_47 = Commands.Action.INL + Commands.Numbers.NUMBER_47
    private const val INL_NUMBER_48 = Commands.Action.INL + Commands.Numbers.NUMBER_48
    private const val INL_NUMBER_49 = Commands.Action.INL + Commands.Numbers.NUMBER_49
    private const val INL_NUMBER_50 = Commands.Action.INL + Commands.Numbers.NUMBER_50
    private const val INL_NUMBER_51 = Commands.Action.INL + Commands.Numbers.NUMBER_51
    private const val INL_NUMBER_52 = Commands.Action.INL + Commands.Numbers.NUMBER_52
    private const val INL_NUMBER_53 = Commands.Action.INL + Commands.Numbers.NUMBER_53
    private const val INL_NUMBER_54 = Commands.Action.INL + Commands.Numbers.NUMBER_54
    private const val INL_NUMBER_55 = Commands.Action.INL + Commands.Numbers.NUMBER_55
    private const val INL_NUMBER_56 = Commands.Action.INL + Commands.Numbers.NUMBER_56
    private const val INL_NUMBER_57 = Commands.Action.INL + Commands.Numbers.NUMBER_57
    private const val INL_NUMBER_58 = Commands.Action.INL + Commands.Numbers.NUMBER_58
    private const val INL_NUMBER_59 = Commands.Action.INL + Commands.Numbers.NUMBER_59
    private const val INL_NUMBER_60 = Commands.Action.INL + Commands.Numbers.NUMBER_60
    private const val INL_NUMBER_61 = Commands.Action.INL + Commands.Numbers.NUMBER_61
    private const val INL_NUMBER_62 = Commands.Action.INL + Commands.Numbers.NUMBER_62
    private const val INL_NUMBER_63 = Commands.Action.INL + Commands.Numbers.NUMBER_63
    private const val INL_NUMBER_64 = Commands.Action.INL + Commands.Numbers.NUMBER_64
    private const val INL_NUMBER_65 = Commands.Action.INL + Commands.Numbers.NUMBER_65
    private const val INL_NUMBER_66 = Commands.Action.INL + Commands.Numbers.NUMBER_66
    private const val INL_NUMBER_67 = Commands.Action.INL + Commands.Numbers.NUMBER_67
    private const val INL_NUMBER_68 = Commands.Action.INL + Commands.Numbers.NUMBER_68
    private const val INL_NUMBER_69 = Commands.Action.INL + Commands.Numbers.NUMBER_69
    private const val INL_NUMBER_70 = Commands.Action.INL + Commands.Numbers.NUMBER_70
    private const val INL_NUMBER_71 = Commands.Action.INL + Commands.Numbers.NUMBER_71
    private const val INL_NUMBER_72 = Commands.Action.INL + Commands.Numbers.NUMBER_72
    private const val INL_NUMBER_73 = Commands.Action.INL + Commands.Numbers.NUMBER_73
    private const val INL_NUMBER_74 = Commands.Action.INL + Commands.Numbers.NUMBER_74
    private const val INL_NUMBER_75 = Commands.Action.INL + Commands.Numbers.NUMBER_75
    private const val INL_NUMBER_76 = Commands.Action.INL + Commands.Numbers.NUMBER_76
    private const val INL_NUMBER_77 = Commands.Action.INL + Commands.Numbers.NUMBER_77
    private const val INL_NUMBER_78 = Commands.Action.INL + Commands.Numbers.NUMBER_78
    private const val INL_NUMBER_79 = Commands.Action.INL + Commands.Numbers.NUMBER_79
    private const val INL_NUMBER_80 = Commands.Action.INL + Commands.Numbers.NUMBER_80
    private const val INL_NUMBER_81 = Commands.Action.INL + Commands.Numbers.NUMBER_81
    private const val INL_NUMBER_82 = Commands.Action.INL + Commands.Numbers.NUMBER_82
    private const val INL_NUMBER_83 = Commands.Action.INL + Commands.Numbers.NUMBER_83
    private const val INL_NUMBER_84 = Commands.Action.INL + Commands.Numbers.NUMBER_84
    private const val INL_NUMBER_85 = Commands.Action.INL + Commands.Numbers.NUMBER_85
    private const val INL_NUMBER_86 = Commands.Action.INL + Commands.Numbers.NUMBER_86
    private const val INL_NUMBER_87 = Commands.Action.INL + Commands.Numbers.NUMBER_87
    private const val INL_NUMBER_88 = Commands.Action.INL + Commands.Numbers.NUMBER_88
    private const val INL_NUMBER_89 = Commands.Action.INL + Commands.Numbers.NUMBER_89
    private const val INL_NUMBER_90 = Commands.Action.INL + Commands.Numbers.NUMBER_90
    private const val INL_NUMBER_91 = Commands.Action.INL + Commands.Numbers.NUMBER_91
    private const val INL_NUMBER_92 = Commands.Action.INL + Commands.Numbers.NUMBER_92
    private const val INL_NUMBER_93 = Commands.Action.INL + Commands.Numbers.NUMBER_93
    private const val INL_NUMBER_94 = Commands.Action.INL + Commands.Numbers.NUMBER_94
    private const val INL_NUMBER_95 = Commands.Action.INL + Commands.Numbers.NUMBER_95
    private const val INL_NUMBER_96 = Commands.Action.INL + Commands.Numbers.NUMBER_96
    private const val INL_NUMBER_97 = Commands.Action.INL + Commands.Numbers.NUMBER_97
    private const val INL_NUMBER_98 = Commands.Action.INL + Commands.Numbers.NUMBER_98
    private const val INL_NUMBER_99 = Commands.Action.INL + Commands.Numbers.NUMBER_99
    private const val INL_NUMBER_100 = Commands.Action.INL + Commands.Numbers.NUMBER_100

    //Delete line by numbers
    private const val DEL_NUMBER_1 = Commands.Action.DEL + Commands.Numbers.NUMBER_1
    private const val DEL_NUMBER_2 = Commands.Action.DEL + Commands.Numbers.NUMBER_2
    private const val DEL_NUMBER_3 = Commands.Action.DEL + Commands.Numbers.NUMBER_3
    private const val DEL_NUMBER_4 = Commands.Action.DEL + Commands.Numbers.NUMBER_4
    private const val DEL_NUMBER_5 = Commands.Action.DEL + Commands.Numbers.NUMBER_5
    private const val DEL_NUMBER_6 = Commands.Action.DEL + Commands.Numbers.NUMBER_6
    private const val DEL_NUMBER_7 = Commands.Action.DEL + Commands.Numbers.NUMBER_7
    private const val DEL_NUMBER_8 = Commands.Action.DEL + Commands.Numbers.NUMBER_8
    private const val DEL_NUMBER_9 = Commands.Action.DEL + Commands.Numbers.NUMBER_9
    private const val DEL_NUMBER_10 = Commands.Action.DEL + Commands.Numbers.NUMBER_10
    private const val DEL_NUMBER_11 = Commands.Action.DEL + Commands.Numbers.NUMBER_11
    private const val DEL_NUMBER_12 = Commands.Action.DEL + Commands.Numbers.NUMBER_12
    private const val DEL_NUMBER_13 = Commands.Action.DEL + Commands.Numbers.NUMBER_13
    private const val DEL_NUMBER_14 = Commands.Action.DEL + Commands.Numbers.NUMBER_14
    private const val DEL_NUMBER_15 = Commands.Action.DEL + Commands.Numbers.NUMBER_15
    private const val DEL_NUMBER_16 = Commands.Action.DEL + Commands.Numbers.NUMBER_16
    private const val DEL_NUMBER_17 = Commands.Action.DEL + Commands.Numbers.NUMBER_17
    private const val DEL_NUMBER_18 = Commands.Action.DEL + Commands.Numbers.NUMBER_18
    private const val DEL_NUMBER_19 = Commands.Action.DEL + Commands.Numbers.NUMBER_19
    private const val DEL_NUMBER_20 = Commands.Action.DEL + Commands.Numbers.NUMBER_20
    private const val DEL_NUMBER_21 = Commands.Action.DEL + Commands.Numbers.NUMBER_21
    private const val DEL_NUMBER_22 = Commands.Action.DEL + Commands.Numbers.NUMBER_22
    private const val DEL_NUMBER_23 = Commands.Action.DEL + Commands.Numbers.NUMBER_23
    private const val DEL_NUMBER_24 = Commands.Action.DEL + Commands.Numbers.NUMBER_24
    private const val DEL_NUMBER_25 = Commands.Action.DEL + Commands.Numbers.NUMBER_25
    private const val DEL_NUMBER_26 = Commands.Action.DEL + Commands.Numbers.NUMBER_26
    private const val DEL_NUMBER_27 = Commands.Action.DEL + Commands.Numbers.NUMBER_27
    private const val DEL_NUMBER_28 = Commands.Action.DEL + Commands.Numbers.NUMBER_28
    private const val DEL_NUMBER_29 = Commands.Action.DEL + Commands.Numbers.NUMBER_29
    private const val DEL_NUMBER_30 = Commands.Action.DEL + Commands.Numbers.NUMBER_30
    private const val DEL_NUMBER_31 = Commands.Action.DEL + Commands.Numbers.NUMBER_31
    private const val DEL_NUMBER_32 = Commands.Action.DEL + Commands.Numbers.NUMBER_32
    private const val DEL_NUMBER_33 = Commands.Action.DEL + Commands.Numbers.NUMBER_33
    private const val DEL_NUMBER_34 = Commands.Action.DEL + Commands.Numbers.NUMBER_34
    private const val DEL_NUMBER_35 = Commands.Action.DEL + Commands.Numbers.NUMBER_35
    private const val DEL_NUMBER_36 = Commands.Action.DEL + Commands.Numbers.NUMBER_36
    private const val DEL_NUMBER_37 = Commands.Action.DEL + Commands.Numbers.NUMBER_37
    private const val DEL_NUMBER_38 = Commands.Action.DEL + Commands.Numbers.NUMBER_38
    private const val DEL_NUMBER_39 = Commands.Action.DEL + Commands.Numbers.NUMBER_39
    private const val DEL_NUMBER_40 = Commands.Action.DEL + Commands.Numbers.NUMBER_40
    private const val DEL_NUMBER_41 = Commands.Action.DEL + Commands.Numbers.NUMBER_41
    private const val DEL_NUMBER_42 = Commands.Action.DEL + Commands.Numbers.NUMBER_42
    private const val DEL_NUMBER_43 = Commands.Action.DEL + Commands.Numbers.NUMBER_43
    private const val DEL_NUMBER_44 = Commands.Action.DEL + Commands.Numbers.NUMBER_44
    private const val DEL_NUMBER_45 = Commands.Action.DEL + Commands.Numbers.NUMBER_45
    private const val DEL_NUMBER_46 = Commands.Action.DEL + Commands.Numbers.NUMBER_46
    private const val DEL_NUMBER_47 = Commands.Action.DEL + Commands.Numbers.NUMBER_47
    private const val DEL_NUMBER_48 = Commands.Action.DEL + Commands.Numbers.NUMBER_48
    private const val DEL_NUMBER_49 = Commands.Action.DEL + Commands.Numbers.NUMBER_49
    private const val DEL_NUMBER_50 = Commands.Action.DEL + Commands.Numbers.NUMBER_50
    private const val DEL_NUMBER_51 = Commands.Action.DEL + Commands.Numbers.NUMBER_51
    private const val DEL_NUMBER_52 = Commands.Action.DEL + Commands.Numbers.NUMBER_52
    private const val DEL_NUMBER_53 = Commands.Action.DEL + Commands.Numbers.NUMBER_53
    private const val DEL_NUMBER_54 = Commands.Action.DEL + Commands.Numbers.NUMBER_54
    private const val DEL_NUMBER_55 = Commands.Action.DEL + Commands.Numbers.NUMBER_55
    private const val DEL_NUMBER_56 = Commands.Action.DEL + Commands.Numbers.NUMBER_56
    private const val DEL_NUMBER_57 = Commands.Action.DEL + Commands.Numbers.NUMBER_57
    private const val DEL_NUMBER_58 = Commands.Action.DEL + Commands.Numbers.NUMBER_58
    private const val DEL_NUMBER_59 = Commands.Action.DEL + Commands.Numbers.NUMBER_59
    private const val DEL_NUMBER_60 = Commands.Action.DEL + Commands.Numbers.NUMBER_60
    private const val DEL_NUMBER_61 = Commands.Action.DEL + Commands.Numbers.NUMBER_61
    private const val DEL_NUMBER_62 = Commands.Action.DEL + Commands.Numbers.NUMBER_62
    private const val DEL_NUMBER_63 = Commands.Action.DEL + Commands.Numbers.NUMBER_63
    private const val DEL_NUMBER_64 = Commands.Action.DEL + Commands.Numbers.NUMBER_64
    private const val DEL_NUMBER_65 = Commands.Action.DEL + Commands.Numbers.NUMBER_65
    private const val DEL_NUMBER_66 = Commands.Action.DEL + Commands.Numbers.NUMBER_66
    private const val DEL_NUMBER_67 = Commands.Action.DEL + Commands.Numbers.NUMBER_67
    private const val DEL_NUMBER_68 = Commands.Action.DEL + Commands.Numbers.NUMBER_68
    private const val DEL_NUMBER_69 = Commands.Action.DEL + Commands.Numbers.NUMBER_69
    private const val DEL_NUMBER_70 = Commands.Action.DEL + Commands.Numbers.NUMBER_70
    private const val DEL_NUMBER_71 = Commands.Action.DEL + Commands.Numbers.NUMBER_71
    private const val DEL_NUMBER_72 = Commands.Action.DEL + Commands.Numbers.NUMBER_72
    private const val DEL_NUMBER_73 = Commands.Action.DEL + Commands.Numbers.NUMBER_73
    private const val DEL_NUMBER_74 = Commands.Action.DEL + Commands.Numbers.NUMBER_74
    private const val DEL_NUMBER_75 = Commands.Action.DEL + Commands.Numbers.NUMBER_75
    private const val DEL_NUMBER_76 = Commands.Action.DEL + Commands.Numbers.NUMBER_76
    private const val DEL_NUMBER_77 = Commands.Action.DEL + Commands.Numbers.NUMBER_77
    private const val DEL_NUMBER_78 = Commands.Action.DEL + Commands.Numbers.NUMBER_78
    private const val DEL_NUMBER_79 = Commands.Action.DEL + Commands.Numbers.NUMBER_79
    private const val DEL_NUMBER_80 = Commands.Action.DEL + Commands.Numbers.NUMBER_80
    private const val DEL_NUMBER_81 = Commands.Action.DEL + Commands.Numbers.NUMBER_81
    private const val DEL_NUMBER_82 = Commands.Action.DEL + Commands.Numbers.NUMBER_82
    private const val DEL_NUMBER_83 = Commands.Action.DEL + Commands.Numbers.NUMBER_83
    private const val DEL_NUMBER_84 = Commands.Action.DEL + Commands.Numbers.NUMBER_84
    private const val DEL_NUMBER_85 = Commands.Action.DEL + Commands.Numbers.NUMBER_85
    private const val DEL_NUMBER_86 = Commands.Action.DEL + Commands.Numbers.NUMBER_86
    private const val DEL_NUMBER_87 = Commands.Action.DEL + Commands.Numbers.NUMBER_87
    private const val DEL_NUMBER_88 = Commands.Action.DEL + Commands.Numbers.NUMBER_88
    private const val DEL_NUMBER_89 = Commands.Action.DEL + Commands.Numbers.NUMBER_89
    private const val DEL_NUMBER_90 = Commands.Action.DEL + Commands.Numbers.NUMBER_90
    private const val DEL_NUMBER_91 = Commands.Action.DEL + Commands.Numbers.NUMBER_91
    private const val DEL_NUMBER_92 = Commands.Action.DEL + Commands.Numbers.NUMBER_92
    private const val DEL_NUMBER_93 = Commands.Action.DEL + Commands.Numbers.NUMBER_93
    private const val DEL_NUMBER_94 = Commands.Action.DEL + Commands.Numbers.NUMBER_94
    private const val DEL_NUMBER_95 = Commands.Action.DEL + Commands.Numbers.NUMBER_95
    private const val DEL_NUMBER_96 = Commands.Action.DEL + Commands.Numbers.NUMBER_96
    private const val DEL_NUMBER_97 = Commands.Action.DEL + Commands.Numbers.NUMBER_97
    private const val DEL_NUMBER_98 = Commands.Action.DEL + Commands.Numbers.NUMBER_98
    private const val DEL_NUMBER_99 = Commands.Action.DEL + Commands.Numbers.NUMBER_99
    private const val DEL_NUMBER_100 = Commands.Action.DEL + Commands.Numbers.NUMBER_100

    //Update line by numbers
    private const val UPL_NUMBER_1 = Commands.Action.UPL + Commands.Numbers.NUMBER_1
    private const val UPL_NUMBER_2 = Commands.Action.UPL + Commands.Numbers.NUMBER_2
    private const val UPL_NUMBER_3 = Commands.Action.UPL + Commands.Numbers.NUMBER_3
    private const val UPL_NUMBER_4 = Commands.Action.UPL + Commands.Numbers.NUMBER_4
    private const val UPL_NUMBER_5 = Commands.Action.UPL + Commands.Numbers.NUMBER_5
    private const val UPL_NUMBER_6 = Commands.Action.UPL + Commands.Numbers.NUMBER_6
    private const val UPL_NUMBER_7 = Commands.Action.UPL + Commands.Numbers.NUMBER_7
    private const val UPL_NUMBER_8 = Commands.Action.UPL + Commands.Numbers.NUMBER_8
    private const val UPL_NUMBER_9 = Commands.Action.UPL + Commands.Numbers.NUMBER_9
    private const val UPL_NUMBER_10 = Commands.Action.UPL + Commands.Numbers.NUMBER_10
    private const val UPL_NUMBER_11 = Commands.Action.UPL + Commands.Numbers.NUMBER_11
    private const val UPL_NUMBER_12 = Commands.Action.UPL + Commands.Numbers.NUMBER_12
    private const val UPL_NUMBER_13 = Commands.Action.UPL + Commands.Numbers.NUMBER_13
    private const val UPL_NUMBER_14 = Commands.Action.UPL + Commands.Numbers.NUMBER_14
    private const val UPL_NUMBER_15 = Commands.Action.UPL + Commands.Numbers.NUMBER_15
    private const val UPL_NUMBER_16 = Commands.Action.UPL + Commands.Numbers.NUMBER_16
    private const val UPL_NUMBER_17 = Commands.Action.UPL + Commands.Numbers.NUMBER_17
    private const val UPL_NUMBER_18 = Commands.Action.UPL + Commands.Numbers.NUMBER_18
    private const val UPL_NUMBER_19 = Commands.Action.UPL + Commands.Numbers.NUMBER_19
    private const val UPL_NUMBER_20 = Commands.Action.UPL + Commands.Numbers.NUMBER_20
    private const val UPL_NUMBER_21 = Commands.Action.UPL + Commands.Numbers.NUMBER_21
    private const val UPL_NUMBER_22 = Commands.Action.UPL + Commands.Numbers.NUMBER_22
    private const val UPL_NUMBER_23 = Commands.Action.UPL + Commands.Numbers.NUMBER_23
    private const val UPL_NUMBER_24 = Commands.Action.UPL + Commands.Numbers.NUMBER_24
    private const val UPL_NUMBER_25 = Commands.Action.UPL + Commands.Numbers.NUMBER_25
    private const val UPL_NUMBER_26 = Commands.Action.UPL + Commands.Numbers.NUMBER_26
    private const val UPL_NUMBER_27 = Commands.Action.UPL + Commands.Numbers.NUMBER_27
    private const val UPL_NUMBER_28 = Commands.Action.UPL + Commands.Numbers.NUMBER_28
    private const val UPL_NUMBER_29 = Commands.Action.UPL + Commands.Numbers.NUMBER_29
    private const val UPL_NUMBER_30 = Commands.Action.UPL + Commands.Numbers.NUMBER_30
    private const val UPL_NUMBER_31 = Commands.Action.UPL + Commands.Numbers.NUMBER_31
    private const val UPL_NUMBER_32 = Commands.Action.UPL + Commands.Numbers.NUMBER_32
    private const val UPL_NUMBER_33 = Commands.Action.UPL + Commands.Numbers.NUMBER_33
    private const val UPL_NUMBER_34 = Commands.Action.UPL + Commands.Numbers.NUMBER_34
    private const val UPL_NUMBER_35 = Commands.Action.UPL + Commands.Numbers.NUMBER_35
    private const val UPL_NUMBER_36 = Commands.Action.UPL + Commands.Numbers.NUMBER_36
    private const val UPL_NUMBER_37 = Commands.Action.UPL + Commands.Numbers.NUMBER_37
    private const val UPL_NUMBER_38 = Commands.Action.UPL + Commands.Numbers.NUMBER_38
    private const val UPL_NUMBER_39 = Commands.Action.UPL + Commands.Numbers.NUMBER_39
    private const val UPL_NUMBER_40 = Commands.Action.UPL + Commands.Numbers.NUMBER_40
    private const val UPL_NUMBER_41 = Commands.Action.UPL + Commands.Numbers.NUMBER_41
    private const val UPL_NUMBER_42 = Commands.Action.UPL + Commands.Numbers.NUMBER_42
    private const val UPL_NUMBER_43 = Commands.Action.UPL + Commands.Numbers.NUMBER_43
    private const val UPL_NUMBER_44 = Commands.Action.UPL + Commands.Numbers.NUMBER_44
    private const val UPL_NUMBER_45 = Commands.Action.UPL + Commands.Numbers.NUMBER_45
    private const val UPL_NUMBER_46 = Commands.Action.UPL + Commands.Numbers.NUMBER_46
    private const val UPL_NUMBER_47 = Commands.Action.UPL + Commands.Numbers.NUMBER_47
    private const val UPL_NUMBER_48 = Commands.Action.UPL + Commands.Numbers.NUMBER_48
    private const val UPL_NUMBER_49 = Commands.Action.UPL + Commands.Numbers.NUMBER_49
    private const val UPL_NUMBER_50 = Commands.Action.UPL + Commands.Numbers.NUMBER_50
    private const val UPL_NUMBER_51 = Commands.Action.UPL + Commands.Numbers.NUMBER_51
    private const val UPL_NUMBER_52 = Commands.Action.UPL + Commands.Numbers.NUMBER_52
    private const val UPL_NUMBER_53 = Commands.Action.UPL + Commands.Numbers.NUMBER_53
    private const val UPL_NUMBER_54 = Commands.Action.UPL + Commands.Numbers.NUMBER_54
    private const val UPL_NUMBER_55 = Commands.Action.UPL + Commands.Numbers.NUMBER_55
    private const val UPL_NUMBER_56 = Commands.Action.UPL + Commands.Numbers.NUMBER_56
    private const val UPL_NUMBER_57 = Commands.Action.UPL + Commands.Numbers.NUMBER_57
    private const val UPL_NUMBER_58 = Commands.Action.UPL + Commands.Numbers.NUMBER_58
    private const val UPL_NUMBER_59 = Commands.Action.UPL + Commands.Numbers.NUMBER_59
    private const val UPL_NUMBER_60 = Commands.Action.UPL + Commands.Numbers.NUMBER_60
    private const val UPL_NUMBER_61 = Commands.Action.UPL + Commands.Numbers.NUMBER_61
    private const val UPL_NUMBER_62 = Commands.Action.UPL + Commands.Numbers.NUMBER_62
    private const val UPL_NUMBER_63 = Commands.Action.UPL + Commands.Numbers.NUMBER_63
    private const val UPL_NUMBER_64 = Commands.Action.UPL + Commands.Numbers.NUMBER_64
    private const val UPL_NUMBER_65 = Commands.Action.UPL + Commands.Numbers.NUMBER_65
    private const val UPL_NUMBER_66 = Commands.Action.UPL + Commands.Numbers.NUMBER_66
    private const val UPL_NUMBER_67 = Commands.Action.UPL + Commands.Numbers.NUMBER_67
    private const val UPL_NUMBER_68 = Commands.Action.UPL + Commands.Numbers.NUMBER_68
    private const val UPL_NUMBER_69 = Commands.Action.UPL + Commands.Numbers.NUMBER_69
    private const val UPL_NUMBER_70 = Commands.Action.UPL + Commands.Numbers.NUMBER_70
    private const val UPL_NUMBER_71 = Commands.Action.UPL + Commands.Numbers.NUMBER_71
    private const val UPL_NUMBER_72 = Commands.Action.UPL + Commands.Numbers.NUMBER_72
    private const val UPL_NUMBER_73 = Commands.Action.UPL + Commands.Numbers.NUMBER_73
    private const val UPL_NUMBER_74 = Commands.Action.UPL + Commands.Numbers.NUMBER_74
    private const val UPL_NUMBER_75 = Commands.Action.UPL + Commands.Numbers.NUMBER_75
    private const val UPL_NUMBER_76 = Commands.Action.UPL + Commands.Numbers.NUMBER_76
    private const val UPL_NUMBER_77 = Commands.Action.UPL + Commands.Numbers.NUMBER_77
    private const val UPL_NUMBER_78 = Commands.Action.UPL + Commands.Numbers.NUMBER_78
    private const val UPL_NUMBER_79 = Commands.Action.UPL + Commands.Numbers.NUMBER_79
    private const val UPL_NUMBER_80 = Commands.Action.UPL + Commands.Numbers.NUMBER_80
    private const val UPL_NUMBER_81 = Commands.Action.UPL + Commands.Numbers.NUMBER_81
    private const val UPL_NUMBER_82 = Commands.Action.UPL + Commands.Numbers.NUMBER_82
    private const val UPL_NUMBER_83 = Commands.Action.UPL + Commands.Numbers.NUMBER_83
    private const val UPL_NUMBER_84 = Commands.Action.UPL + Commands.Numbers.NUMBER_84
    private const val UPL_NUMBER_85 = Commands.Action.UPL + Commands.Numbers.NUMBER_85
    private const val UPL_NUMBER_86 = Commands.Action.UPL + Commands.Numbers.NUMBER_86
    private const val UPL_NUMBER_87 = Commands.Action.UPL + Commands.Numbers.NUMBER_87
    private const val UPL_NUMBER_88 = Commands.Action.UPL + Commands.Numbers.NUMBER_88
    private const val UPL_NUMBER_89 = Commands.Action.UPL + Commands.Numbers.NUMBER_89
    private const val UPL_NUMBER_90 = Commands.Action.UPL + Commands.Numbers.NUMBER_90
    private const val UPL_NUMBER_91 = Commands.Action.UPL + Commands.Numbers.NUMBER_91
    private const val UPL_NUMBER_92 = Commands.Action.UPL + Commands.Numbers.NUMBER_92
    private const val UPL_NUMBER_93 = Commands.Action.UPL + Commands.Numbers.NUMBER_93
    private const val UPL_NUMBER_94 = Commands.Action.UPL + Commands.Numbers.NUMBER_94
    private const val UPL_NUMBER_95 = Commands.Action.UPL + Commands.Numbers.NUMBER_95
    private const val UPL_NUMBER_96 = Commands.Action.UPL + Commands.Numbers.NUMBER_96
    private const val UPL_NUMBER_97 = Commands.Action.UPL + Commands.Numbers.NUMBER_97
    private const val UPL_NUMBER_98 = Commands.Action.UPL + Commands.Numbers.NUMBER_98
    private const val UPL_NUMBER_99 = Commands.Action.UPL + Commands.Numbers.NUMBER_99
    private const val UPL_NUMBER_100 = Commands.Action.UPL + Commands.Numbers.NUMBER_100

    /*
    /** Perform OEM part replacement based by diagram number **/
    private const val RPL_NUMBER_1_OEM = Action.RPL + Numbers.NUMBER_1 + PartType.OEM
    private const val RPL_NUMBER_2_OEM = Action.RPL + Numbers.NUMBER_2 + PartType.OEM
    private const val RPL_NUMBER_3_OEM = Action.RPL + Numbers.NUMBER_3 + PartType.OEM
    private const val RPL_NUMBER_4_OEM = Action.RPL + Numbers.NUMBER_4 + PartType.OEM
    private const val RPL_NUMBER_5_OEM = Action.RPL + Numbers.NUMBER_5 + PartType.OEM
    private const val RPL_NUMBER_6_OEM = Action.RPL + Numbers.NUMBER_6 + PartType.OEM
    private const val RPL_NUMBER_7_OEM = Action.RPL + Numbers.NUMBER_7 + PartType.OEM
    private const val RPL_NUMBER_8_OEM = Action.RPL + Numbers.NUMBER_8 + PartType.OEM
    private const val RPL_NUMBER_9_OEM = Action.RPL + Numbers.NUMBER_9 + PartType.OEM
    private const val RPL_NUMBER_10_OEM = Action.RPL + Numbers.NUMBER_10 + PartType.OEM
    private const val RPL_NUMBER_11_OEM = Action.RPL + Numbers.NUMBER_11 + PartType.OEM
    private const val RPL_NUMBER_12_OEM = Action.RPL + Numbers.NUMBER_12 + PartType.OEM
    private const val RPL_NUMBER_13_OEM = Action.RPL + Numbers.NUMBER_13 + PartType.OEM
    private const val RPL_NUMBER_14_OEM = Action.RPL + Numbers.NUMBER_14 + PartType.OEM
    private const val RPL_NUMBER_15_OEM = Action.RPL + Numbers.NUMBER_15 + PartType.OEM
    private const val RPL_NUMBER_16_OEM = Action.RPL + Numbers.NUMBER_16 + PartType.OEM
    private const val RPL_NUMBER_17_OEM = Action.RPL + Numbers.NUMBER_17 + PartType.OEM
    private const val RPL_NUMBER_18_OEM = Action.RPL + Numbers.NUMBER_18 + PartType.OEM
    private const val RPL_NUMBER_19_OEM = Action.RPL + Numbers.NUMBER_19 + PartType.OEM
    private const val RPL_NUMBER_20_OEM = Action.RPL + Numbers.NUMBER_20 + PartType.OEM
    private const val RPL_NUMBER_21_OEM = Action.RPL + Numbers.NUMBER_21 + PartType.OEM
    private const val RPL_NUMBER_22_OEM = Action.RPL + Numbers.NUMBER_22 + PartType.OEM
    private const val RPL_NUMBER_23_OEM = Action.RPL + Numbers.NUMBER_23 + PartType.OEM
    private const val RPL_NUMBER_24_OEM = Action.RPL + Numbers.NUMBER_24 + PartType.OEM
    private const val RPL_NUMBER_25_OEM = Action.RPL + Numbers.NUMBER_25 + PartType.OEM
    private const val RPL_NUMBER_26_OEM = Action.RPL + Numbers.NUMBER_26 + PartType.OEM
    private const val RPL_NUMBER_27_OEM = Action.RPL + Numbers.NUMBER_27 + PartType.OEM
    private const val RPL_NUMBER_28_OEM = Action.RPL + Numbers.NUMBER_28 + PartType.OEM
    private const val RPL_NUMBER_29_OEM = Action.RPL + Numbers.NUMBER_29 + PartType.OEM
    private const val RPL_NUMBER_30_OEM = Action.RPL + Numbers.NUMBER_30 + PartType.OEM
    private const val RPL_NUMBER_31_OEM = Action.RPL + Numbers.NUMBER_31 + PartType.OEM
    private const val RPL_NUMBER_32_OEM = Action.RPL + Numbers.NUMBER_32 + PartType.OEM
    private const val RPL_NUMBER_33_OEM = Action.RPL + Numbers.NUMBER_33 + PartType.OEM
    private const val RPL_NUMBER_34_OEM = Action.RPL + Numbers.NUMBER_34 + PartType.OEM
    private const val RPL_NUMBER_35_OEM = Action.RPL + Numbers.NUMBER_35 + PartType.OEM

    /** Perform cheapest part replacement based by diagram number **/
    private const val RPL_NUMBER_1_CHEAPEST = Action.RPL + Numbers.NUMBER_1 + PartType.CHEAPEST
    private const val RPL_NUMBER_2_CHEAPEST = Action.RPL + Numbers.NUMBER_2 + PartType.CHEAPEST
    private const val RPL_NUMBER_3_CHEAPEST = Action.RPL + Numbers.NUMBER_3 + PartType.CHEAPEST
    private const val RPL_NUMBER_4_CHEAPEST = Action.RPL + Numbers.NUMBER_4 + PartType.CHEAPEST
    private const val RPL_NUMBER_5_CHEAPEST = Action.RPL + Numbers.NUMBER_5 + PartType.CHEAPEST
    private const val RPL_NUMBER_6_CHEAPEST = Action.RPL + Numbers.NUMBER_6 + PartType.CHEAPEST
    private const val RPL_NUMBER_7_CHEAPEST = Action.RPL + Numbers.NUMBER_7 + PartType.CHEAPEST
    private const val RPL_NUMBER_8_CHEAPEST = Action.RPL + Numbers.NUMBER_8 + PartType.CHEAPEST
    private const val RPL_NUMBER_9_CHEAPEST = Action.RPL + Numbers.NUMBER_9 + PartType.CHEAPEST
    private const val RPL_NUMBER_10_CHEAPEST = Action.RPL + Numbers.NUMBER_10 + PartType.CHEAPEST
    private const val RPL_NUMBER_11_CHEAPEST = Action.RPL + Numbers.NUMBER_11 + PartType.CHEAPEST
    private const val RPL_NUMBER_12_CHEAPEST = Action.RPL + Numbers.NUMBER_12 + PartType.CHEAPEST
    private const val RPL_NUMBER_13_CHEAPEST = Action.RPL + Numbers.NUMBER_13 + PartType.CHEAPEST
    private const val RPL_NUMBER_14_CHEAPEST = Action.RPL + Numbers.NUMBER_14 + PartType.CHEAPEST
    private const val RPL_NUMBER_15_CHEAPEST = Action.RPL + Numbers.NUMBER_15 + PartType.CHEAPEST
    private const val RPL_NUMBER_16_CHEAPEST = Action.RPL + Numbers.NUMBER_16 + PartType.CHEAPEST
    private const val RPL_NUMBER_17_CHEAPEST = Action.RPL + Numbers.NUMBER_17 + PartType.CHEAPEST
    private const val RPL_NUMBER_18_CHEAPEST = Action.RPL + Numbers.NUMBER_18 + PartType.CHEAPEST
    private const val RPL_NUMBER_19_CHEAPEST = Action.RPL + Numbers.NUMBER_19 + PartType.CHEAPEST
    private const val RPL_NUMBER_20_CHEAPEST = Action.RPL + Numbers.NUMBER_20 + PartType.CHEAPEST
    private const val RPL_NUMBER_21_CHEAPEST = Action.RPL + Numbers.NUMBER_21 + PartType.CHEAPEST
    private const val RPL_NUMBER_22_CHEAPEST = Action.RPL + Numbers.NUMBER_22 + PartType.CHEAPEST
    private const val RPL_NUMBER_23_CHEAPEST = Action.RPL + Numbers.NUMBER_23 + PartType.CHEAPEST
    private const val RPL_NUMBER_24_CHEAPEST = Action.RPL + Numbers.NUMBER_24 + PartType.CHEAPEST
    private const val RPL_NUMBER_25_CHEAPEST = Action.RPL + Numbers.NUMBER_25 + PartType.CHEAPEST
    private const val RPL_NUMBER_26_CHEAPEST = Action.RPL + Numbers.NUMBER_26 + PartType.CHEAPEST
    private const val RPL_NUMBER_27_CHEAPEST = Action.RPL + Numbers.NUMBER_27 + PartType.CHEAPEST
    private const val RPL_NUMBER_28_CHEAPEST = Action.RPL + Numbers.NUMBER_28 + PartType.CHEAPEST
    private const val RPL_NUMBER_29_CHEAPEST = Action.RPL + Numbers.NUMBER_29 + PartType.CHEAPEST
    private const val RPL_NUMBER_30_CHEAPEST = Action.RPL + Numbers.NUMBER_30 + PartType.CHEAPEST
    private const val RPL_NUMBER_31_CHEAPEST = Action.RPL + Numbers.NUMBER_31 + PartType.CHEAPEST
    private const val RPL_NUMBER_32_CHEAPEST = Action.RPL + Numbers.NUMBER_32 + PartType.CHEAPEST
    private const val RPL_NUMBER_33_CHEAPEST = Action.RPL + Numbers.NUMBER_33 + PartType.CHEAPEST
    private const val RPL_NUMBER_34_CHEAPEST = Action.RPL + Numbers.NUMBER_34 + PartType.CHEAPEST
    private const val RPL_NUMBER_35_CHEAPEST = Action.RPL + Numbers.NUMBER_35 + PartType.CHEAPEST

    /** Perform LEFT OEM part replacement based by diagram number **/
    private const val RPL_NUMBER_1_LEFT_OEM = Action.RPL + Numbers.NUMBER_1 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_2_LEFT_OEM = Action.RPL + Numbers.NUMBER_2 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_3_LEFT_OEM = Action.RPL + Numbers.NUMBER_3 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_4_LEFT_OEM = Action.RPL + Numbers.NUMBER_4 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_5_LEFT_OEM = Action.RPL + Numbers.NUMBER_5 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_6_LEFT_OEM = Action.RPL + Numbers.NUMBER_6 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_7_LEFT_OEM = Action.RPL + Numbers.NUMBER_7 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_8_LEFT_OEM = Action.RPL + Numbers.NUMBER_8 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_9_LEFT_OEM = Action.RPL + Numbers.NUMBER_9 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_10_LEFT_OEM = Action.RPL + Numbers.NUMBER_10 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_11_LEFT_OEM = Action.RPL + Numbers.NUMBER_11 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_12_LEFT_OEM = Action.RPL + Numbers.NUMBER_12 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_13_LEFT_OEM = Action.RPL + Numbers.NUMBER_13 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_14_LEFT_OEM = Action.RPL + Numbers.NUMBER_14 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_15_LEFT_OEM = Action.RPL + Numbers.NUMBER_15 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_16_LEFT_OEM = Action.RPL + Numbers.NUMBER_16 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_17_LEFT_OEM = Action.RPL + Numbers.NUMBER_17 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_18_LEFT_OEM = Action.RPL + Numbers.NUMBER_18 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_19_LEFT_OEM = Action.RPL + Numbers.NUMBER_19 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_20_LEFT_OEM = Action.RPL + Numbers.NUMBER_20 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_21_LEFT_OEM = Action.RPL + Numbers.NUMBER_21 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_22_LEFT_OEM = Action.RPL + Numbers.NUMBER_22 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_23_LEFT_OEM = Action.RPL + Numbers.NUMBER_23 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_24_LEFT_OEM = Action.RPL + Numbers.NUMBER_24 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_25_LEFT_OEM = Action.RPL + Numbers.NUMBER_25 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_26_LEFT_OEM = Action.RPL + Numbers.NUMBER_26 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_27_LEFT_OEM = Action.RPL + Numbers.NUMBER_27 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_28_LEFT_OEM = Action.RPL + Numbers.NUMBER_28 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_29_LEFT_OEM = Action.RPL + Numbers.NUMBER_29 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_30_LEFT_OEM = Action.RPL + Numbers.NUMBER_30 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_31_LEFT_OEM = Action.RPL + Numbers.NUMBER_31 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_32_LEFT_OEM = Action.RPL + Numbers.NUMBER_32 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_33_LEFT_OEM = Action.RPL + Numbers.NUMBER_33 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_34_LEFT_OEM = Action.RPL + Numbers.NUMBER_34 + Position.LT + PartType.OEM
    private const val RPL_NUMBER_35_LEFT_OEM = Action.RPL + Numbers.NUMBER_35 + Position.LT + PartType.OEM

    /** Perform RIGHT OEM part replacement based by diagram number **/
    private const val RPL_NUMBER_1_RIGHT_OEM = Action.RPL + Numbers.NUMBER_1 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_2_RIGHT_OEM = Action.RPL + Numbers.NUMBER_2 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_3_RIGHT_OEM = Action.RPL + Numbers.NUMBER_3 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_4_RIGHT_OEM = Action.RPL + Numbers.NUMBER_4 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_5_RIGHT_OEM = Action.RPL + Numbers.NUMBER_5 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_6_RIGHT_OEM = Action.RPL + Numbers.NUMBER_6 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_7_RIGHT_OEM = Action.RPL + Numbers.NUMBER_7 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_8_RIGHT_OEM = Action.RPL + Numbers.NUMBER_8 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_9_RIGHT_OEM = Action.RPL + Numbers.NUMBER_9 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_10_RIGHT_OEM = Action.RPL + Numbers.NUMBER_10 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_11_RIGHT_OEM = Action.RPL + Numbers.NUMBER_11 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_12_RIGHT_OEM = Action.RPL + Numbers.NUMBER_12 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_13_RIGHT_OEM = Action.RPL + Numbers.NUMBER_13 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_14_RIGHT_OEM = Action.RPL + Numbers.NUMBER_14 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_15_RIGHT_OEM = Action.RPL + Numbers.NUMBER_15 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_16_RIGHT_OEM = Action.RPL + Numbers.NUMBER_16 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_17_RIGHT_OEM = Action.RPL + Numbers.NUMBER_17 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_18_RIGHT_OEM = Action.RPL + Numbers.NUMBER_18 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_19_RIGHT_OEM = Action.RPL + Numbers.NUMBER_19 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_20_RIGHT_OEM = Action.RPL + Numbers.NUMBER_20 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_21_RIGHT_OEM = Action.RPL + Numbers.NUMBER_21 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_22_RIGHT_OEM = Action.RPL + Numbers.NUMBER_22 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_23_RIGHT_OEM = Action.RPL + Numbers.NUMBER_23 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_24_RIGHT_OEM = Action.RPL + Numbers.NUMBER_24 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_25_RIGHT_OEM = Action.RPL + Numbers.NUMBER_25 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_26_RIGHT_OEM = Action.RPL + Numbers.NUMBER_26 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_27_RIGHT_OEM = Action.RPL + Numbers.NUMBER_27 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_28_RIGHT_OEM = Action.RPL + Numbers.NUMBER_28 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_29_RIGHT_OEM = Action.RPL + Numbers.NUMBER_29 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_30_RIGHT_OEM = Action.RPL + Numbers.NUMBER_30 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_31_RIGHT_OEM = Action.RPL + Numbers.NUMBER_31 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_32_RIGHT_OEM = Action.RPL + Numbers.NUMBER_32 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_33_RIGHT_OEM = Action.RPL + Numbers.NUMBER_33 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_34_RIGHT_OEM = Action.RPL + Numbers.NUMBER_34 + Position.RT + PartType.OEM
    private const val RPL_NUMBER_35_RIGHT_OEM = Action.RPL + Numbers.NUMBER_35 + Position.RT + PartType.OEM

    /** Perform LEFT CHEAPEST part replacement based by diagram number **/
    private const val RPL_NUMBER_1_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_1 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_2_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_2 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_3_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_3 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_4_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_4 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_5_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_5 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_6_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_6 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_7_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_7 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_8_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_8 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_9_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_9 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_10_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_10 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_11_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_11 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_12_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_12 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_13_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_13 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_14_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_14 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_15_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_15 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_16_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_16 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_17_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_17 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_18_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_18 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_19_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_19 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_20_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_20 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_21_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_21 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_22_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_22 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_23_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_23 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_24_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_24 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_25_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_25 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_26_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_26 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_27_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_27 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_28_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_28 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_29_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_29 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_30_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_30 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_31_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_31 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_32_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_32 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_33_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_33 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_34_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_34 + Position.LT + PartType.CHEAPEST
    private const val RPL_NUMBER_35_LEFT_CHEAPEST = Action.RPL + Numbers.NUMBER_35 + Position.LT + PartType.CHEAPEST

    /** Perform RIGHT CHEAPEST part replacement based by diagram number **/
    private const val RPL_NUMBER_1_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_1 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_2_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_2 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_3_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_3 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_4_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_4 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_5_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_5 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_6_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_6 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_7_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_7 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_8_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_8 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_9_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_9 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_10_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_10 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_11_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_11 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_12_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_12 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_13_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_13 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_14_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_14 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_15_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_15 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_16_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_16 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_17_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_17 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_18_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_18 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_19_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_19 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_20_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_20 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_21_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_21 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_22_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_22 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_23_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_23 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_24_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_24 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_25_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_25 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_26_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_26 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_27_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_27 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_28_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_28 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_29_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_29 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_30_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_30 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_31_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_31 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_32_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_32 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_33_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_33 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_34_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_34 + Position.RT + PartType.CHEAPEST
    private const val RPL_NUMBER_35_RIGHT_CHEAPEST = Action.RPL + Numbers.NUMBER_35 + Position.RT + PartType.CHEAPEST
*/

    val repairs: List<String> = listOf(
        Action.RESTARTSERVER,
        Action.INNL,
        Action.SE,
        Action.SP,
        Action.ADDPART,
        Action.CL,
        Action.LOG,
        Action.NW,
        Action.OK,
        Action.OPEN,
        Action.SA,
        Action.SAC,
        Action.YES,
        Action.NO,
        Action.PRINT,
        Action.PRINTPARTSLIST,

        /*
        Numbers.NUMBER_1,
        Numbers.NUMBER_2,
        Numbers.NUMBER_3,
        Numbers.NUMBER_4,
        Numbers.NUMBER_5,
        Numbers.NUMBER_6,
        Numbers.NUMBER_7,
        Numbers.NUMBER_8,
        Numbers.NUMBER_9,
        Numbers.NUMBER_10,
        Numbers.NUMBER_11,
        Numbers.NUMBER_12,
        Numbers.NUMBER_13,
        Numbers.NUMBER_14,
        Numbers.NUMBER_15,
        Numbers.NUMBER_16,
        Numbers.NUMBER_17,
        Numbers.NUMBER_18,
        Numbers.NUMBER_19,
        Numbers.NUMBER_20,
        Numbers.NUMBER_21,
        Numbers.NUMBER_22,
        Numbers.NUMBER_23,
        Numbers.NUMBER_24,
        Numbers.NUMBER_25,
        Numbers.NUMBER_26,
        Numbers.NUMBER_27,
        Numbers.NUMBER_28,
        Numbers.NUMBER_29,
        Numbers.NUMBER_30,
        Numbers.NUMBER_31,
        Numbers.NUMBER_32,
        Numbers.NUMBER_33,
        Numbers.NUMBER_34,
        Numbers.NUMBER_35,
        */

        GT_CONTACTS,
        GT_INSURANCE,
        GT_VEHICLE,
        GT_ESTIMATE,
        GT_ATTACHMENTS,
        GT_MOTOR,
        GT_PART_GROUPS,
        GT_PART_CODES,
        GT_WORKFILES,

        GT_AIR_CONDITIONER_AND_HEATER,
        GT_BACK_DOOR,
        GT_BACK_GLASS,
        GT_BODY_SHELL,
        GT_CAB,
        GT_CAB_CREW_CAB,
        GT_CONSOLE,
        GT_CONVERTIBLE,
        GT_CONVERTIBLESOFTTOP,
        GT_COOLING,
        GT_COWL,
        GT_DOOR,
        GT_ELECTRICAL,
        GT_EMISSION_SYSTEM,
        GT_ENGINE,
        GT_ENGINELID,
        GT_EXHAUST_SYSTEM,
        GT_FENDER,
        GT_FLUIDS,
        GT_FRAME,
        GT_FRONT_BUMPER,
        GT_FRONT_BUMPER_AND_GRILLE,
        GT_FRONT_DOOR,
        GT_FRONT_LAMPS,
        GT_FRONT_PANELS,
        GT_FRONT_SUSPENSION,
        GT_FUEL_SYSTEM,
        GT_GRILLE,
        GT_HOOD,
        GT_INFORMATION_LABELS,
        GT_INSTRUMENT_PANEL,
        GT_LIFT_GATE,
        GT_MISCELLANEOUS_OPERATIONS,
        GT_PAINT_IDENTIFICATION,
        GT_PICKUPBOX,
        GT_PILLARS_ROCKER_AND_FLOOR,
        GT_QUARTER_PANEL,
        GT_RADIATOR_SUPPORT,
        GT_REAR_BODY,
        GT_REAR_BODY_AND_FLOOR,
        GT_REAR_BUMPER,
        GT_REAR_DOOR,
        GT_REAR_LAMPS,
        GT_REAR_SUSPENSION,
        GT_RECYCLED_ASSEMBLIES,
        GT_REMOVABLETOP,
        GT_REMOVABLETOPHARDTOP,
        GT_RESTRAINT_SYSTEMS,
        GT_ROLLBARANDCOMPONENTS,
        GT_ROOF,
        GT_SEATS_AND_TRACKS,
        GT_SIDE_LOADING_DOOR,
        GT_SIDE_PANEL,
        GT_SPARE_TIRE_CARRIER,
        GT_STEERING_COLUMN,
        GT_STEERING_GEAR_AND_LINKAGE,
        GT_STEERING_WHEEL,
        GT_STRIPE_TAPE,
        GT_STRIPE_TAPE_AND_DECALS,
        GT_TAILGATE,
        GT_TRANSMISSION,
        GT_TRUNK_LID,
        GT_VEHICLE_DIAGNOSTICS,
        GT_WHEELS,
        GT_WINDSHIELD,

        RPR_NUMBER_1_1HR,
        RPR_NUMBER_1_2HR,
        RPR_NUMBER_1_3HR,
        RPR_NUMBER_1_4HR,
        RPR_NUMBER_1_5HR,
        RPR_NUMBER_1_6HR,
        RPR_NUMBER_1_7HR,
        RPR_NUMBER_1_8HR,
        RPR_NUMBER_1_9HR,
        RPR_NUMBER_1_10HR,
        RPR_NUMBER_2_1HR,
        RPR_NUMBER_2_2HR,
        RPR_NUMBER_2_3HR,
        RPR_NUMBER_2_4HR,
        RPR_NUMBER_2_5HR,
        RPR_NUMBER_2_6HR,
        RPR_NUMBER_2_7HR,
        RPR_NUMBER_2_8HR,
        RPR_NUMBER_2_9HR,
        RPR_NUMBER_2_10HR,
        RPR_NUMBER_3_1HR,
        RPR_NUMBER_3_2HR,
        RPR_NUMBER_3_3HR,
        RPR_NUMBER_3_4HR,
        RPR_NUMBER_3_5HR,
        RPR_NUMBER_3_6HR,
        RPR_NUMBER_3_7HR,
        RPR_NUMBER_3_8HR,
        RPR_NUMBER_3_9HR,
        RPR_NUMBER_3_10HR,
        RPR_NUMBER_4_1HR,
        RPR_NUMBER_4_2HR,
        RPR_NUMBER_4_3HR,
        RPR_NUMBER_4_4HR,
        RPR_NUMBER_4_5HR,
        RPR_NUMBER_4_6HR,
        RPR_NUMBER_4_7HR,
        RPR_NUMBER_4_8HR,
        RPR_NUMBER_4_9HR,
        RPR_NUMBER_4_10HR,
        RPR_NUMBER_5_1HR,
        RPR_NUMBER_5_2HR,
        RPR_NUMBER_5_3HR,
        RPR_NUMBER_5_4HR,
        RPR_NUMBER_5_5HR,
        RPR_NUMBER_5_6HR,
        RPR_NUMBER_5_7HR,
        RPR_NUMBER_5_8HR,
        RPR_NUMBER_5_9HR,
        RPR_NUMBER_5_10HR,
        RPR_NUMBER_6_1HR,
        RPR_NUMBER_6_2HR,
        RPR_NUMBER_6_3HR,
        RPR_NUMBER_6_4HR,
        RPR_NUMBER_6_5HR,
        RPR_NUMBER_6_6HR,
        RPR_NUMBER_6_7HR,
        RPR_NUMBER_6_8HR,
        RPR_NUMBER_6_9HR,
        RPR_NUMBER_6_10HR,
        RPR_NUMBER_7_1HR,
        RPR_NUMBER_7_2HR,
        RPR_NUMBER_7_3HR,
        RPR_NUMBER_7_4HR,
        RPR_NUMBER_7_5HR,
        RPR_NUMBER_7_6HR,
        RPR_NUMBER_7_7HR,
        RPR_NUMBER_7_8HR,
        RPR_NUMBER_7_9HR,
        RPR_NUMBER_7_10HR,
        RPR_NUMBER_8_1HR,
        RPR_NUMBER_8_2HR,
        RPR_NUMBER_8_3HR,
        RPR_NUMBER_8_4HR,
        RPR_NUMBER_8_5HR,
        RPR_NUMBER_8_6HR,
        RPR_NUMBER_8_7HR,
        RPR_NUMBER_8_8HR,
        RPR_NUMBER_8_9HR,
        RPR_NUMBER_8_10HR,
        RPR_NUMBER_9_1HR,
        RPR_NUMBER_9_2HR,
        RPR_NUMBER_9_3HR,
        RPR_NUMBER_9_4HR,
        RPR_NUMBER_9_5HR,
        RPR_NUMBER_9_6HR,
        RPR_NUMBER_9_7HR,
        RPR_NUMBER_9_8HR,
        RPR_NUMBER_9_9HR,
        RPR_NUMBER_9_10HR,
        RPR_NUMBER_10_1HR,
        RPR_NUMBER_10_2HR,
        RPR_NUMBER_10_3HR,
        RPR_NUMBER_10_4HR,
        RPR_NUMBER_10_5HR,
        RPR_NUMBER_10_6HR,
        RPR_NUMBER_10_7HR,
        RPR_NUMBER_10_8HR,
        RPR_NUMBER_10_9HR,
        RPR_NUMBER_10_10HR,
        RPR_NUMBER_11_1HR,
        RPR_NUMBER_11_2HR,
        RPR_NUMBER_11_3HR,
        RPR_NUMBER_11_4HR,
        RPR_NUMBER_11_5HR,
        RPR_NUMBER_11_6HR,
        RPR_NUMBER_11_7HR,
        RPR_NUMBER_11_8HR,
        RPR_NUMBER_11_9HR,
        RPR_NUMBER_11_10HR,
        RPR_NUMBER_12_1HR,
        RPR_NUMBER_12_2HR,
        RPR_NUMBER_12_3HR,
        RPR_NUMBER_12_4HR,
        RPR_NUMBER_12_5HR,
        RPR_NUMBER_12_6HR,
        RPR_NUMBER_12_7HR,
        RPR_NUMBER_12_8HR,
        RPR_NUMBER_12_9HR,
        RPR_NUMBER_12_10HR,
        RPR_NUMBER_13_1HR,
        RPR_NUMBER_13_2HR,
        RPR_NUMBER_13_3HR,
        RPR_NUMBER_13_4HR,
        RPR_NUMBER_13_5HR,
        RPR_NUMBER_13_6HR,
        RPR_NUMBER_13_7HR,
        RPR_NUMBER_13_8HR,
        RPR_NUMBER_13_9HR,
        RPR_NUMBER_13_10HR,
        RPR_NUMBER_14_1HR,
        RPR_NUMBER_14_2HR,
        RPR_NUMBER_14_3HR,
        RPR_NUMBER_14_4HR,
        RPR_NUMBER_14_5HR,
        RPR_NUMBER_14_6HR,
        RPR_NUMBER_14_7HR,
        RPR_NUMBER_14_8HR,
        RPR_NUMBER_14_9HR,
        RPR_NUMBER_14_10HR,
        RPR_NUMBER_15_1HR,
        RPR_NUMBER_15_2HR,
        RPR_NUMBER_15_3HR,
        RPR_NUMBER_15_4HR,
        RPR_NUMBER_15_5HR,
        RPR_NUMBER_15_6HR,
        RPR_NUMBER_15_7HR,
        RPR_NUMBER_15_8HR,
        RPR_NUMBER_15_9HR,
        RPR_NUMBER_15_10HR,
        RPR_NUMBER_16_1HR,
        RPR_NUMBER_16_2HR,
        RPR_NUMBER_16_3HR,
        RPR_NUMBER_16_4HR,
        RPR_NUMBER_16_5HR,
        RPR_NUMBER_16_6HR,
        RPR_NUMBER_16_7HR,
        RPR_NUMBER_16_8HR,
        RPR_NUMBER_16_9HR,
        RPR_NUMBER_16_10HR,
        RPR_NUMBER_17_1HR,
        RPR_NUMBER_17_2HR,
        RPR_NUMBER_17_3HR,
        RPR_NUMBER_17_4HR,
        RPR_NUMBER_17_5HR,
        RPR_NUMBER_17_6HR,
        RPR_NUMBER_17_7HR,
        RPR_NUMBER_17_8HR,
        RPR_NUMBER_17_9HR,
        RPR_NUMBER_17_10HR,
        RPR_NUMBER_18_1HR,
        RPR_NUMBER_18_2HR,
        RPR_NUMBER_18_3HR,
        RPR_NUMBER_18_4HR,
        RPR_NUMBER_18_5HR,
        RPR_NUMBER_18_6HR,
        RPR_NUMBER_18_7HR,
        RPR_NUMBER_18_8HR,
        RPR_NUMBER_18_9HR,
        RPR_NUMBER_18_10HR,
        RPR_NUMBER_19_1HR,
        RPR_NUMBER_19_2HR,
        RPR_NUMBER_19_3HR,
        RPR_NUMBER_19_4HR,
        RPR_NUMBER_19_5HR,
        RPR_NUMBER_19_6HR,
        RPR_NUMBER_19_7HR,
        RPR_NUMBER_19_8HR,
        RPR_NUMBER_19_9HR,
        RPR_NUMBER_19_10HR,
        RPR_NUMBER_20_1HR,
        RPR_NUMBER_20_2HR,
        RPR_NUMBER_20_3HR,
        RPR_NUMBER_20_4HR,
        RPR_NUMBER_20_5HR,
        RPR_NUMBER_20_6HR,
        RPR_NUMBER_20_7HR,
        RPR_NUMBER_20_8HR,
        RPR_NUMBER_20_9HR,
        RPR_NUMBER_20_10HR,
        RPR_NUMBER_21_1HR,
        RPR_NUMBER_21_2HR,
        RPR_NUMBER_21_3HR,
        RPR_NUMBER_21_4HR,
        RPR_NUMBER_21_5HR,
        RPR_NUMBER_21_6HR,
        RPR_NUMBER_21_7HR,
        RPR_NUMBER_21_8HR,
        RPR_NUMBER_21_9HR,
        RPR_NUMBER_21_10HR,
        RPR_NUMBER_22_1HR,
        RPR_NUMBER_22_2HR,
        RPR_NUMBER_22_3HR,
        RPR_NUMBER_22_4HR,
        RPR_NUMBER_22_5HR,
        RPR_NUMBER_22_6HR,
        RPR_NUMBER_22_7HR,
        RPR_NUMBER_22_8HR,
        RPR_NUMBER_22_9HR,
        RPR_NUMBER_22_10HR,
        RPR_NUMBER_23_1HR,
        RPR_NUMBER_23_2HR,
        RPR_NUMBER_23_3HR,
        RPR_NUMBER_23_4HR,
        RPR_NUMBER_23_5HR,
        RPR_NUMBER_23_6HR,
        RPR_NUMBER_23_7HR,
        RPR_NUMBER_23_8HR,
        RPR_NUMBER_23_9HR,
        RPR_NUMBER_23_10HR,
        RPR_NUMBER_24_1HR,
        RPR_NUMBER_24_2HR,
        RPR_NUMBER_24_3HR,
        RPR_NUMBER_24_4HR,
        RPR_NUMBER_24_5HR,
        RPR_NUMBER_24_6HR,
        RPR_NUMBER_24_7HR,
        RPR_NUMBER_24_8HR,
        RPR_NUMBER_24_9HR,
        RPR_NUMBER_24_10HR,
        RPR_NUMBER_25_1HR,
        RPR_NUMBER_25_2HR,
        RPR_NUMBER_25_3HR,
        RPR_NUMBER_25_4HR,
        RPR_NUMBER_25_5HR,
        RPR_NUMBER_25_6HR,
        RPR_NUMBER_25_7HR,
        RPR_NUMBER_25_8HR,
        RPR_NUMBER_25_9HR,
        RPR_NUMBER_25_10HR,
        RPR_NUMBER_26_1HR,
        RPR_NUMBER_26_2HR,
        RPR_NUMBER_26_3HR,
        RPR_NUMBER_26_4HR,
        RPR_NUMBER_26_5HR,
        RPR_NUMBER_26_6HR,
        RPR_NUMBER_26_7HR,
        RPR_NUMBER_26_8HR,
        RPR_NUMBER_26_9HR,
        RPR_NUMBER_26_10HR,
        RPR_NUMBER_27_1HR,
        RPR_NUMBER_27_2HR,
        RPR_NUMBER_27_3HR,
        RPR_NUMBER_27_4HR,
        RPR_NUMBER_27_5HR,
        RPR_NUMBER_27_6HR,
        RPR_NUMBER_27_7HR,
        RPR_NUMBER_27_8HR,
        RPR_NUMBER_27_9HR,
        RPR_NUMBER_27_10HR,
        RPR_NUMBER_28_1HR,
        RPR_NUMBER_28_2HR,
        RPR_NUMBER_28_3HR,
        RPR_NUMBER_28_4HR,
        RPR_NUMBER_28_5HR,
        RPR_NUMBER_28_6HR,
        RPR_NUMBER_28_7HR,
        RPR_NUMBER_28_8HR,
        RPR_NUMBER_28_9HR,
        RPR_NUMBER_28_10HR,
        RPR_NUMBER_29_1HR,
        RPR_NUMBER_29_2HR,
        RPR_NUMBER_29_3HR,
        RPR_NUMBER_29_4HR,
        RPR_NUMBER_29_5HR,
        RPR_NUMBER_29_6HR,
        RPR_NUMBER_29_7HR,
        RPR_NUMBER_29_8HR,
        RPR_NUMBER_29_9HR,
        RPR_NUMBER_29_10HR,
        RPR_NUMBER_30_1HR,
        RPR_NUMBER_30_2HR,
        RPR_NUMBER_30_3HR,
        RPR_NUMBER_30_4HR,
        RPR_NUMBER_30_5HR,
        RPR_NUMBER_30_6HR,
        RPR_NUMBER_30_7HR,
        RPR_NUMBER_30_8HR,
        RPR_NUMBER_30_9HR,
        RPR_NUMBER_30_10HR,
        RPR_NUMBER_31_1HR,
        RPR_NUMBER_31_2HR,
        RPR_NUMBER_31_3HR,
        RPR_NUMBER_31_4HR,
        RPR_NUMBER_31_5HR,
        RPR_NUMBER_31_6HR,
        RPR_NUMBER_31_7HR,
        RPR_NUMBER_31_8HR,
        RPR_NUMBER_31_9HR,
        RPR_NUMBER_31_10HR,
        RPR_NUMBER_32_1HR,
        RPR_NUMBER_32_2HR,
        RPR_NUMBER_32_3HR,
        RPR_NUMBER_32_4HR,
        RPR_NUMBER_32_5HR,
        RPR_NUMBER_32_6HR,
        RPR_NUMBER_32_7HR,
        RPR_NUMBER_32_8HR,
        RPR_NUMBER_32_9HR,
        RPR_NUMBER_32_10HR,
        RPR_NUMBER_33_1HR,
        RPR_NUMBER_33_2HR,
        RPR_NUMBER_33_3HR,
        RPR_NUMBER_33_4HR,
        RPR_NUMBER_33_5HR,
        RPR_NUMBER_33_6HR,
        RPR_NUMBER_33_7HR,
        RPR_NUMBER_33_8HR,
        RPR_NUMBER_33_9HR,
        RPR_NUMBER_33_10HR,
        RPR_NUMBER_34_1HR,
        RPR_NUMBER_34_2HR,
        RPR_NUMBER_34_3HR,
        RPR_NUMBER_34_4HR,
        RPR_NUMBER_34_5HR,
        RPR_NUMBER_34_6HR,
        RPR_NUMBER_34_7HR,
        RPR_NUMBER_34_8HR,
        RPR_NUMBER_34_9HR,
        RPR_NUMBER_34_10HR,
        RPR_NUMBER_35_1HR,
        RPR_NUMBER_35_2HR,
        RPR_NUMBER_35_3HR,
        RPR_NUMBER_35_4HR,
        RPR_NUMBER_35_5HR,
        RPR_NUMBER_35_6HR,
        RPR_NUMBER_35_7HR,
        RPR_NUMBER_35_8HR,
        RPR_NUMBER_35_9HR,
        RPR_NUMBER_35_10HR,
        RPR_NUMBER_36_1HR,
        RPR_NUMBER_36_2HR,
        RPR_NUMBER_36_3HR,
        RPR_NUMBER_36_4HR,
        RPR_NUMBER_36_5HR,
        RPR_NUMBER_36_6HR,
        RPR_NUMBER_36_7HR,
        RPR_NUMBER_36_8HR,
        RPR_NUMBER_36_9HR,
        RPR_NUMBER_36_10HR,
        RPR_NUMBER_37_1HR,
        RPR_NUMBER_37_2HR,
        RPR_NUMBER_37_3HR,
        RPR_NUMBER_37_4HR,
        RPR_NUMBER_37_5HR,
        RPR_NUMBER_37_6HR,
        RPR_NUMBER_37_7HR,
        RPR_NUMBER_37_8HR,
        RPR_NUMBER_37_9HR,
        RPR_NUMBER_37_10HR,

        RPR_NUMBER_1_HALFHR,
        RPR_NUMBER_2_HALFHR,
        RPR_NUMBER_3_HALFHR,
        RPR_NUMBER_4_HALFHR,
        RPR_NUMBER_5_HALFHR,
        RPR_NUMBER_6_HALFHR,
        RPR_NUMBER_7_HALFHR,
        RPR_NUMBER_8_HALFHR,
        RPR_NUMBER_9_HALFHR,
        RPR_NUMBER_10_HALFHR,
        RPR_NUMBER_11_HALFHR,
        RPR_NUMBER_12_HALFHR,
        RPR_NUMBER_13_HALFHR,
        RPR_NUMBER_14_HALFHR,
        RPR_NUMBER_15_HALFHR,
        RPR_NUMBER_16_HALFHR,
        RPR_NUMBER_17_HALFHR,
        RPR_NUMBER_18_HALFHR,
        RPR_NUMBER_19_HALFHR,
        RPR_NUMBER_20_HALFHR,
        RPR_NUMBER_21_HALFHR,
        RPR_NUMBER_22_HALFHR,
        RPR_NUMBER_23_HALFHR,
        RPR_NUMBER_24_HALFHR,
        RPR_NUMBER_25_HALFHR,
        RPR_NUMBER_26_HALFHR,
        RPR_NUMBER_27_HALFHR,
        RPR_NUMBER_28_HALFHR,
        RPR_NUMBER_29_HALFHR,
        RPR_NUMBER_30_HALFHR,
        RPR_NUMBER_31_HALFHR,
        RPR_NUMBER_32_HALFHR,
        RPR_NUMBER_33_HALFHR,
        RPR_NUMBER_34_HALFHR,
        RPR_NUMBER_35_HALFHR,
        RPR_NUMBER_36_HALFHR,
        RPR_NUMBER_37_HALFHR,

        RPR_NUMBER_1_1_5HR,
        RPR_NUMBER_1_2_5HR,
        RPR_NUMBER_1_3_5HR,
        RPR_NUMBER_1_4_5HR,
        RPR_NUMBER_1_5_5HR,
        RPR_NUMBER_1_6_5HR,
        RPR_NUMBER_1_7_5HR,
        RPR_NUMBER_1_8_5HR,
        RPR_NUMBER_1_9_5HR,
        RPR_NUMBER_2_1_5HR,
        RPR_NUMBER_2_2_5HR,
        RPR_NUMBER_2_3_5HR,
        RPR_NUMBER_2_4_5HR,
        RPR_NUMBER_2_5_5HR,
        RPR_NUMBER_2_6_5HR,
        RPR_NUMBER_2_7_5HR,
        RPR_NUMBER_2_8_5HR,
        RPR_NUMBER_2_9_5HR,
        RPR_NUMBER_3_1_5HR,
        RPR_NUMBER_3_2_5HR,
        RPR_NUMBER_3_3_5HR,
        RPR_NUMBER_3_4_5HR,
        RPR_NUMBER_3_5_5HR,
        RPR_NUMBER_3_6_5HR,
        RPR_NUMBER_3_7_5HR,
        RPR_NUMBER_3_8_5HR,
        RPR_NUMBER_3_9_5HR,
        RPR_NUMBER_4_1_5HR,
        RPR_NUMBER_4_2_5HR,
        RPR_NUMBER_4_3_5HR,
        RPR_NUMBER_4_4_5HR,
        RPR_NUMBER_4_5_5HR,
        RPR_NUMBER_4_6_5HR,
        RPR_NUMBER_4_7_5HR,
        RPR_NUMBER_4_8_5HR,
        RPR_NUMBER_4_9_5HR,
        RPR_NUMBER_5_1_5HR,
        RPR_NUMBER_5_2_5HR,
        RPR_NUMBER_5_3_5HR,
        RPR_NUMBER_5_4_5HR,
        RPR_NUMBER_5_5_5HR,
        RPR_NUMBER_5_6_5HR,
        RPR_NUMBER_5_7_5HR,
        RPR_NUMBER_5_8_5HR,
        RPR_NUMBER_5_9_5HR,
        RPR_NUMBER_6_1_5HR,
        RPR_NUMBER_6_2_5HR,
        RPR_NUMBER_6_3_5HR,
        RPR_NUMBER_6_4_5HR,
        RPR_NUMBER_6_5_5HR,
        RPR_NUMBER_6_6_5HR,
        RPR_NUMBER_6_7_5HR,
        RPR_NUMBER_6_8_5HR,
        RPR_NUMBER_6_9_5HR,
        RPR_NUMBER_7_1_5HR,
        RPR_NUMBER_7_2_5HR,
        RPR_NUMBER_7_3_5HR,
        RPR_NUMBER_7_4_5HR,
        RPR_NUMBER_7_5_5HR,
        RPR_NUMBER_7_6_5HR,
        RPR_NUMBER_7_7_5HR,
        RPR_NUMBER_7_8_5HR,
        RPR_NUMBER_7_9_5HR,
        RPR_NUMBER_8_1_5HR,
        RPR_NUMBER_8_2_5HR,
        RPR_NUMBER_8_3_5HR,
        RPR_NUMBER_8_4_5HR,
        RPR_NUMBER_8_5_5HR,
        RPR_NUMBER_8_6_5HR,
        RPR_NUMBER_8_7_5HR,
        RPR_NUMBER_8_8_5HR,
        RPR_NUMBER_8_9_5HR,
        RPR_NUMBER_9_1_5HR,
        RPR_NUMBER_9_2_5HR,
        RPR_NUMBER_9_3_5HR,
        RPR_NUMBER_9_4_5HR,
        RPR_NUMBER_9_5_5HR,
        RPR_NUMBER_9_6_5HR,
        RPR_NUMBER_9_7_5HR,
        RPR_NUMBER_9_8_5HR,
        RPR_NUMBER_9_9_5HR,
        RPR_NUMBER_10_1_5HR,
        RPR_NUMBER_10_2_5HR,
        RPR_NUMBER_10_3_5HR,
        RPR_NUMBER_10_4_5HR,
        RPR_NUMBER_10_5_5HR,
        RPR_NUMBER_10_6_5HR,
        RPR_NUMBER_10_7_5HR,
        RPR_NUMBER_10_8_5HR,
        RPR_NUMBER_10_9_5HR,
        RPR_NUMBER_11_1_5HR,
        RPR_NUMBER_11_2_5HR,
        RPR_NUMBER_11_3_5HR,
        RPR_NUMBER_11_4_5HR,
        RPR_NUMBER_11_5_5HR,
        RPR_NUMBER_11_6_5HR,
        RPR_NUMBER_11_7_5HR,
        RPR_NUMBER_11_8_5HR,
        RPR_NUMBER_11_9_5HR,
        RPR_NUMBER_12_1_5HR,
        RPR_NUMBER_12_2_5HR,
        RPR_NUMBER_12_3_5HR,
        RPR_NUMBER_12_4_5HR,
        RPR_NUMBER_12_5_5HR,
        RPR_NUMBER_12_6_5HR,
        RPR_NUMBER_12_7_5HR,
        RPR_NUMBER_12_8_5HR,
        RPR_NUMBER_12_9_5HR,
        RPR_NUMBER_13_1_5HR,
        RPR_NUMBER_13_2_5HR,
        RPR_NUMBER_13_3_5HR,
        RPR_NUMBER_13_4_5HR,
        RPR_NUMBER_13_5_5HR,
        RPR_NUMBER_13_6_5HR,
        RPR_NUMBER_13_7_5HR,
        RPR_NUMBER_13_8_5HR,
        RPR_NUMBER_13_9_5HR,
        RPR_NUMBER_14_1_5HR,
        RPR_NUMBER_14_2_5HR,
        RPR_NUMBER_14_3_5HR,
        RPR_NUMBER_14_4_5HR,
        RPR_NUMBER_14_5_5HR,
        RPR_NUMBER_14_6_5HR,
        RPR_NUMBER_14_7_5HR,
        RPR_NUMBER_14_8_5HR,
        RPR_NUMBER_14_9_5HR,
        RPR_NUMBER_15_1_5HR,
        RPR_NUMBER_15_2_5HR,
        RPR_NUMBER_15_3_5HR,
        RPR_NUMBER_15_4_5HR,
        RPR_NUMBER_15_5_5HR,
        RPR_NUMBER_15_6_5HR,
        RPR_NUMBER_15_7_5HR,
        RPR_NUMBER_15_8_5HR,
        RPR_NUMBER_15_9_5HR,
        RPR_NUMBER_16_1_5HR,
        RPR_NUMBER_16_2_5HR,
        RPR_NUMBER_16_3_5HR,
        RPR_NUMBER_16_4_5HR,
        RPR_NUMBER_16_5_5HR,
        RPR_NUMBER_16_6_5HR,
        RPR_NUMBER_16_7_5HR,
        RPR_NUMBER_16_8_5HR,
        RPR_NUMBER_16_9_5HR,
        RPR_NUMBER_17_1_5HR,
        RPR_NUMBER_17_2_5HR,
        RPR_NUMBER_17_3_5HR,
        RPR_NUMBER_17_4_5HR,
        RPR_NUMBER_17_5_5HR,
        RPR_NUMBER_17_6_5HR,
        RPR_NUMBER_17_7_5HR,
        RPR_NUMBER_17_8_5HR,
        RPR_NUMBER_17_9_5HR,
        RPR_NUMBER_18_1_5HR,
        RPR_NUMBER_18_2_5HR,
        RPR_NUMBER_18_3_5HR,
        RPR_NUMBER_18_4_5HR,
        RPR_NUMBER_18_5_5HR,
        RPR_NUMBER_18_6_5HR,
        RPR_NUMBER_18_7_5HR,
        RPR_NUMBER_18_8_5HR,
        RPR_NUMBER_18_9_5HR,
        RPR_NUMBER_19_1_5HR,
        RPR_NUMBER_19_2_5HR,
        RPR_NUMBER_19_3_5HR,
        RPR_NUMBER_19_4_5HR,
        RPR_NUMBER_19_5_5HR,
        RPR_NUMBER_19_6_5HR,
        RPR_NUMBER_19_7_5HR,
        RPR_NUMBER_19_8_5HR,
        RPR_NUMBER_19_9_5HR,
        RPR_NUMBER_20_1_5HR,
        RPR_NUMBER_20_2_5HR,
        RPR_NUMBER_20_3_5HR,
        RPR_NUMBER_20_4_5HR,
        RPR_NUMBER_20_5_5HR,
        RPR_NUMBER_20_6_5HR,
        RPR_NUMBER_20_7_5HR,
        RPR_NUMBER_20_8_5HR,
        RPR_NUMBER_20_9_5HR,
        RPR_NUMBER_21_1_5HR,
        RPR_NUMBER_21_2_5HR,
        RPR_NUMBER_21_3_5HR,
        RPR_NUMBER_21_4_5HR,
        RPR_NUMBER_21_5_5HR,
        RPR_NUMBER_21_6_5HR,
        RPR_NUMBER_21_7_5HR,
        RPR_NUMBER_21_8_5HR,
        RPR_NUMBER_21_9_5HR,
        RPR_NUMBER_22_1_5HR,
        RPR_NUMBER_22_2_5HR,
        RPR_NUMBER_22_3_5HR,
        RPR_NUMBER_22_4_5HR,
        RPR_NUMBER_22_5_5HR,
        RPR_NUMBER_22_6_5HR,
        RPR_NUMBER_22_7_5HR,
        RPR_NUMBER_22_8_5HR,
        RPR_NUMBER_22_9_5HR,
        RPR_NUMBER_23_1_5HR,
        RPR_NUMBER_23_2_5HR,
        RPR_NUMBER_23_3_5HR,
        RPR_NUMBER_23_4_5HR,
        RPR_NUMBER_23_5_5HR,
        RPR_NUMBER_23_6_5HR,
        RPR_NUMBER_23_7_5HR,
        RPR_NUMBER_23_8_5HR,
        RPR_NUMBER_23_9_5HR,
        RPR_NUMBER_24_1_5HR,
        RPR_NUMBER_24_2_5HR,
        RPR_NUMBER_24_3_5HR,
        RPR_NUMBER_24_4_5HR,
        RPR_NUMBER_24_5_5HR,
        RPR_NUMBER_24_6_5HR,
        RPR_NUMBER_24_7_5HR,
        RPR_NUMBER_24_8_5HR,
        RPR_NUMBER_24_9_5HR,
        RPR_NUMBER_25_1_5HR,
        RPR_NUMBER_25_2_5HR,
        RPR_NUMBER_25_3_5HR,
        RPR_NUMBER_25_4_5HR,
        RPR_NUMBER_25_5_5HR,
        RPR_NUMBER_25_6_5HR,
        RPR_NUMBER_25_7_5HR,
        RPR_NUMBER_25_8_5HR,
        RPR_NUMBER_25_9_5HR,
        RPR_NUMBER_26_1_5HR,
        RPR_NUMBER_26_2_5HR,
        RPR_NUMBER_26_3_5HR,
        RPR_NUMBER_26_4_5HR,
        RPR_NUMBER_26_5_5HR,
        RPR_NUMBER_26_6_5HR,
        RPR_NUMBER_26_7_5HR,
        RPR_NUMBER_26_8_5HR,
        RPR_NUMBER_26_9_5HR,
        RPR_NUMBER_27_1_5HR,
        RPR_NUMBER_27_2_5HR,
        RPR_NUMBER_27_3_5HR,
        RPR_NUMBER_27_4_5HR,
        RPR_NUMBER_27_5_5HR,
        RPR_NUMBER_27_6_5HR,
        RPR_NUMBER_27_7_5HR,
        RPR_NUMBER_27_8_5HR,
        RPR_NUMBER_27_9_5HR,
        RPR_NUMBER_28_1_5HR,
        RPR_NUMBER_28_2_5HR,
        RPR_NUMBER_28_3_5HR,
        RPR_NUMBER_28_4_5HR,
        RPR_NUMBER_28_5_5HR,
        RPR_NUMBER_28_6_5HR,
        RPR_NUMBER_28_7_5HR,
        RPR_NUMBER_28_8_5HR,
        RPR_NUMBER_28_9_5HR,
        RPR_NUMBER_29_1_5HR,
        RPR_NUMBER_29_2_5HR,
        RPR_NUMBER_29_3_5HR,
        RPR_NUMBER_29_4_5HR,
        RPR_NUMBER_29_5_5HR,
        RPR_NUMBER_29_6_5HR,
        RPR_NUMBER_29_7_5HR,
        RPR_NUMBER_29_8_5HR,
        RPR_NUMBER_29_9_5HR,
        RPR_NUMBER_30_1_5HR,
        RPR_NUMBER_30_2_5HR,
        RPR_NUMBER_30_3_5HR,
        RPR_NUMBER_30_4_5HR,
        RPR_NUMBER_30_5_5HR,
        RPR_NUMBER_30_6_5HR,
        RPR_NUMBER_30_7_5HR,
        RPR_NUMBER_30_8_5HR,
        RPR_NUMBER_30_9_5HR,
        RPR_NUMBER_31_1_5HR,
        RPR_NUMBER_31_2_5HR,
        RPR_NUMBER_31_3_5HR,
        RPR_NUMBER_31_4_5HR,
        RPR_NUMBER_31_5_5HR,
        RPR_NUMBER_31_6_5HR,
        RPR_NUMBER_31_7_5HR,
        RPR_NUMBER_31_8_5HR,
        RPR_NUMBER_31_9_5HR,
        RPR_NUMBER_32_1_5HR,
        RPR_NUMBER_32_2_5HR,
        RPR_NUMBER_32_3_5HR,
        RPR_NUMBER_32_4_5HR,
        RPR_NUMBER_32_5_5HR,
        RPR_NUMBER_32_6_5HR,
        RPR_NUMBER_32_7_5HR,
        RPR_NUMBER_32_8_5HR,
        RPR_NUMBER_32_9_5HR,
        RPR_NUMBER_33_1_5HR,
        RPR_NUMBER_33_2_5HR,
        RPR_NUMBER_33_3_5HR,
        RPR_NUMBER_33_4_5HR,
        RPR_NUMBER_33_5_5HR,
        RPR_NUMBER_33_6_5HR,
        RPR_NUMBER_33_7_5HR,
        RPR_NUMBER_33_8_5HR,
        RPR_NUMBER_33_9_5HR,
        RPR_NUMBER_34_1_5HR,
        RPR_NUMBER_34_2_5HR,
        RPR_NUMBER_34_3_5HR,
        RPR_NUMBER_34_4_5HR,
        RPR_NUMBER_34_5_5HR,
        RPR_NUMBER_34_6_5HR,
        RPR_NUMBER_34_7_5HR,
        RPR_NUMBER_34_8_5HR,
        RPR_NUMBER_34_9_5HR,
        RPR_NUMBER_35_1_5HR,
        RPR_NUMBER_35_2_5HR,
        RPR_NUMBER_35_3_5HR,
        RPR_NUMBER_35_4_5HR,
        RPR_NUMBER_35_5_5HR,
        RPR_NUMBER_35_6_5HR,
        RPR_NUMBER_35_7_5HR,
        RPR_NUMBER_35_8_5HR,
        RPR_NUMBER_35_9_5HR,
        RPR_NUMBER_36_1_5HR,
        RPR_NUMBER_36_2_5HR,
        RPR_NUMBER_36_3_5HR,
        RPR_NUMBER_36_4_5HR,
        RPR_NUMBER_36_5_5HR,
        RPR_NUMBER_36_6_5HR,
        RPR_NUMBER_36_7_5HR,
        RPR_NUMBER_36_8_5HR,
        RPR_NUMBER_36_9_5HR,
        RPR_NUMBER_37_1_5HR,
        RPR_NUMBER_37_2_5HR,
        RPR_NUMBER_37_3_5HR,
        RPR_NUMBER_37_4_5HR,
        RPR_NUMBER_37_5_5HR,
        RPR_NUMBER_37_6_5HR,
        RPR_NUMBER_37_7_5HR,
        RPR_NUMBER_37_8_5HR,
        RPR_NUMBER_37_9_5HR,

        RPR_NUMBER_1_LEFT_1HR,
        RPR_NUMBER_1_LEFT_2HR,
        RPR_NUMBER_1_LEFT_3HR,
        RPR_NUMBER_1_LEFT_4HR,
        RPR_NUMBER_1_LEFT_5HR,
        RPR_NUMBER_1_LEFT_6HR,
        RPR_NUMBER_1_LEFT_7HR,
        RPR_NUMBER_1_LEFT_8HR,
        RPR_NUMBER_1_LEFT_9HR,
        RPR_NUMBER_1_LEFT_10HR,
        RPR_NUMBER_2_LEFT_1HR,
        RPR_NUMBER_2_LEFT_2HR,
        RPR_NUMBER_2_LEFT_3HR,
        RPR_NUMBER_2_LEFT_4HR,
        RPR_NUMBER_2_LEFT_5HR,
        RPR_NUMBER_2_LEFT_6HR,
        RPR_NUMBER_2_LEFT_7HR,
        RPR_NUMBER_2_LEFT_8HR,
        RPR_NUMBER_2_LEFT_9HR,
        RPR_NUMBER_2_LEFT_10HR,
        RPR_NUMBER_3_LEFT_1HR,
        RPR_NUMBER_3_LEFT_2HR,
        RPR_NUMBER_3_LEFT_3HR,
        RPR_NUMBER_3_LEFT_4HR,
        RPR_NUMBER_3_LEFT_5HR,
        RPR_NUMBER_3_LEFT_6HR,
        RPR_NUMBER_3_LEFT_7HR,
        RPR_NUMBER_3_LEFT_8HR,
        RPR_NUMBER_3_LEFT_9HR,
        RPR_NUMBER_3_LEFT_10HR,
        RPR_NUMBER_4_LEFT_1HR,
        RPR_NUMBER_4_LEFT_2HR,
        RPR_NUMBER_4_LEFT_3HR,
        RPR_NUMBER_4_LEFT_4HR,
        RPR_NUMBER_4_LEFT_5HR,
        RPR_NUMBER_4_LEFT_6HR,
        RPR_NUMBER_4_LEFT_7HR,
        RPR_NUMBER_4_LEFT_8HR,
        RPR_NUMBER_4_LEFT_9HR,
        RPR_NUMBER_4_LEFT_10HR,
        RPR_NUMBER_5_LEFT_1HR,
        RPR_NUMBER_5_LEFT_2HR,
        RPR_NUMBER_5_LEFT_3HR,
        RPR_NUMBER_5_LEFT_4HR,
        RPR_NUMBER_5_LEFT_5HR,
        RPR_NUMBER_5_LEFT_6HR,
        RPR_NUMBER_5_LEFT_7HR,
        RPR_NUMBER_5_LEFT_8HR,
        RPR_NUMBER_5_LEFT_9HR,
        RPR_NUMBER_5_LEFT_10HR,
        RPR_NUMBER_6_LEFT_1HR,
        RPR_NUMBER_6_LEFT_2HR,
        RPR_NUMBER_6_LEFT_3HR,
        RPR_NUMBER_6_LEFT_4HR,
        RPR_NUMBER_6_LEFT_5HR,
        RPR_NUMBER_6_LEFT_6HR,
        RPR_NUMBER_6_LEFT_7HR,
        RPR_NUMBER_6_LEFT_8HR,
        RPR_NUMBER_6_LEFT_9HR,
        RPR_NUMBER_6_LEFT_10HR,
        RPR_NUMBER_7_LEFT_1HR,
        RPR_NUMBER_7_LEFT_2HR,
        RPR_NUMBER_7_LEFT_3HR,
        RPR_NUMBER_7_LEFT_4HR,
        RPR_NUMBER_7_LEFT_5HR,
        RPR_NUMBER_7_LEFT_6HR,
        RPR_NUMBER_7_LEFT_7HR,
        RPR_NUMBER_7_LEFT_8HR,
        RPR_NUMBER_7_LEFT_9HR,
        RPR_NUMBER_7_LEFT_10HR,
        RPR_NUMBER_8_LEFT_1HR,
        RPR_NUMBER_8_LEFT_2HR,
        RPR_NUMBER_8_LEFT_3HR,
        RPR_NUMBER_8_LEFT_4HR,
        RPR_NUMBER_8_LEFT_5HR,
        RPR_NUMBER_8_LEFT_6HR,
        RPR_NUMBER_8_LEFT_7HR,
        RPR_NUMBER_8_LEFT_8HR,
        RPR_NUMBER_8_LEFT_9HR,
        RPR_NUMBER_8_LEFT_10HR,
        RPR_NUMBER_9_LEFT_1HR,
        RPR_NUMBER_9_LEFT_2HR,
        RPR_NUMBER_9_LEFT_3HR,
        RPR_NUMBER_9_LEFT_4HR,
        RPR_NUMBER_9_LEFT_5HR,
        RPR_NUMBER_9_LEFT_6HR,
        RPR_NUMBER_9_LEFT_7HR,
        RPR_NUMBER_9_LEFT_8HR,
        RPR_NUMBER_9_LEFT_9HR,
        RPR_NUMBER_9_LEFT_10HR,
        RPR_NUMBER_10_LEFT_1HR,
        RPR_NUMBER_10_LEFT_2HR,
        RPR_NUMBER_10_LEFT_3HR,
        RPR_NUMBER_10_LEFT_4HR,
        RPR_NUMBER_10_LEFT_5HR,
        RPR_NUMBER_10_LEFT_6HR,
        RPR_NUMBER_10_LEFT_7HR,
        RPR_NUMBER_10_LEFT_8HR,
        RPR_NUMBER_10_LEFT_9HR,
        RPR_NUMBER_10_LEFT_10HR,
        RPR_NUMBER_11_LEFT_1HR,
        RPR_NUMBER_11_LEFT_2HR,
        RPR_NUMBER_11_LEFT_3HR,
        RPR_NUMBER_11_LEFT_4HR,
        RPR_NUMBER_11_LEFT_5HR,
        RPR_NUMBER_11_LEFT_6HR,
        RPR_NUMBER_11_LEFT_7HR,
        RPR_NUMBER_11_LEFT_8HR,
        RPR_NUMBER_11_LEFT_9HR,
        RPR_NUMBER_11_LEFT_10HR,
        RPR_NUMBER_12_LEFT_1HR,
        RPR_NUMBER_12_LEFT_2HR,
        RPR_NUMBER_12_LEFT_3HR,
        RPR_NUMBER_12_LEFT_4HR,
        RPR_NUMBER_12_LEFT_5HR,
        RPR_NUMBER_12_LEFT_6HR,
        RPR_NUMBER_12_LEFT_7HR,
        RPR_NUMBER_12_LEFT_8HR,
        RPR_NUMBER_12_LEFT_9HR,
        RPR_NUMBER_12_LEFT_10HR,
        RPR_NUMBER_13_LEFT_1HR,
        RPR_NUMBER_13_LEFT_2HR,
        RPR_NUMBER_13_LEFT_3HR,
        RPR_NUMBER_13_LEFT_4HR,
        RPR_NUMBER_13_LEFT_5HR,
        RPR_NUMBER_13_LEFT_6HR,
        RPR_NUMBER_13_LEFT_7HR,
        RPR_NUMBER_13_LEFT_8HR,
        RPR_NUMBER_13_LEFT_9HR,
        RPR_NUMBER_13_LEFT_10HR,
        RPR_NUMBER_14_LEFT_1HR,
        RPR_NUMBER_14_LEFT_2HR,
        RPR_NUMBER_14_LEFT_3HR,
        RPR_NUMBER_14_LEFT_4HR,
        RPR_NUMBER_14_LEFT_5HR,
        RPR_NUMBER_14_LEFT_6HR,
        RPR_NUMBER_14_LEFT_7HR,
        RPR_NUMBER_14_LEFT_8HR,
        RPR_NUMBER_14_LEFT_9HR,
        RPR_NUMBER_14_LEFT_10HR,
        RPR_NUMBER_15_LEFT_1HR,
        RPR_NUMBER_15_LEFT_2HR,
        RPR_NUMBER_15_LEFT_3HR,
        RPR_NUMBER_15_LEFT_4HR,
        RPR_NUMBER_15_LEFT_5HR,
        RPR_NUMBER_15_LEFT_6HR,
        RPR_NUMBER_15_LEFT_7HR,
        RPR_NUMBER_15_LEFT_8HR,
        RPR_NUMBER_15_LEFT_9HR,
        RPR_NUMBER_15_LEFT_10HR,
        RPR_NUMBER_16_LEFT_1HR,
        RPR_NUMBER_16_LEFT_2HR,
        RPR_NUMBER_16_LEFT_3HR,
        RPR_NUMBER_16_LEFT_4HR,
        RPR_NUMBER_16_LEFT_5HR,
        RPR_NUMBER_16_LEFT_6HR,
        RPR_NUMBER_16_LEFT_7HR,
        RPR_NUMBER_16_LEFT_8HR,
        RPR_NUMBER_16_LEFT_9HR,
        RPR_NUMBER_16_LEFT_10HR,
        RPR_NUMBER_17_LEFT_1HR,
        RPR_NUMBER_17_LEFT_2HR,
        RPR_NUMBER_17_LEFT_3HR,
        RPR_NUMBER_17_LEFT_4HR,
        RPR_NUMBER_17_LEFT_5HR,
        RPR_NUMBER_17_LEFT_6HR,
        RPR_NUMBER_17_LEFT_7HR,
        RPR_NUMBER_17_LEFT_8HR,
        RPR_NUMBER_17_LEFT_9HR,
        RPR_NUMBER_17_LEFT_10HR,
        RPR_NUMBER_18_LEFT_1HR,
        RPR_NUMBER_18_LEFT_2HR,
        RPR_NUMBER_18_LEFT_3HR,
        RPR_NUMBER_18_LEFT_4HR,
        RPR_NUMBER_18_LEFT_5HR,
        RPR_NUMBER_18_LEFT_6HR,
        RPR_NUMBER_18_LEFT_7HR,
        RPR_NUMBER_18_LEFT_8HR,
        RPR_NUMBER_18_LEFT_9HR,
        RPR_NUMBER_18_LEFT_10HR,
        RPR_NUMBER_19_LEFT_1HR,
        RPR_NUMBER_19_LEFT_2HR,
        RPR_NUMBER_19_LEFT_3HR,
        RPR_NUMBER_19_LEFT_4HR,
        RPR_NUMBER_19_LEFT_5HR,
        RPR_NUMBER_19_LEFT_6HR,
        RPR_NUMBER_19_LEFT_7HR,
        RPR_NUMBER_19_LEFT_8HR,
        RPR_NUMBER_19_LEFT_9HR,
        RPR_NUMBER_19_LEFT_10HR,
        RPR_NUMBER_20_LEFT_1HR,
        RPR_NUMBER_20_LEFT_2HR,
        RPR_NUMBER_20_LEFT_3HR,
        RPR_NUMBER_20_LEFT_4HR,
        RPR_NUMBER_20_LEFT_5HR,
        RPR_NUMBER_20_LEFT_6HR,
        RPR_NUMBER_20_LEFT_7HR,
        RPR_NUMBER_20_LEFT_8HR,
        RPR_NUMBER_20_LEFT_9HR,
        RPR_NUMBER_20_LEFT_10HR,
        RPR_NUMBER_21_LEFT_1HR,
        RPR_NUMBER_21_LEFT_2HR,
        RPR_NUMBER_21_LEFT_3HR,
        RPR_NUMBER_21_LEFT_4HR,
        RPR_NUMBER_21_LEFT_5HR,
        RPR_NUMBER_21_LEFT_6HR,
        RPR_NUMBER_21_LEFT_7HR,
        RPR_NUMBER_21_LEFT_8HR,
        RPR_NUMBER_21_LEFT_9HR,
        RPR_NUMBER_21_LEFT_10HR,
        RPR_NUMBER_22_LEFT_1HR,
        RPR_NUMBER_22_LEFT_2HR,
        RPR_NUMBER_22_LEFT_3HR,
        RPR_NUMBER_22_LEFT_4HR,
        RPR_NUMBER_22_LEFT_5HR,
        RPR_NUMBER_22_LEFT_6HR,
        RPR_NUMBER_22_LEFT_7HR,
        RPR_NUMBER_22_LEFT_8HR,
        RPR_NUMBER_22_LEFT_9HR,
        RPR_NUMBER_22_LEFT_10HR,
        RPR_NUMBER_23_LEFT_1HR,
        RPR_NUMBER_23_LEFT_2HR,
        RPR_NUMBER_23_LEFT_3HR,
        RPR_NUMBER_23_LEFT_4HR,
        RPR_NUMBER_23_LEFT_5HR,
        RPR_NUMBER_23_LEFT_6HR,
        RPR_NUMBER_23_LEFT_7HR,
        RPR_NUMBER_23_LEFT_8HR,
        RPR_NUMBER_23_LEFT_9HR,
        RPR_NUMBER_23_LEFT_10HR,
        RPR_NUMBER_24_LEFT_1HR,
        RPR_NUMBER_24_LEFT_2HR,
        RPR_NUMBER_24_LEFT_3HR,
        RPR_NUMBER_24_LEFT_4HR,
        RPR_NUMBER_24_LEFT_5HR,
        RPR_NUMBER_24_LEFT_6HR,
        RPR_NUMBER_24_LEFT_7HR,
        RPR_NUMBER_24_LEFT_8HR,
        RPR_NUMBER_24_LEFT_9HR,
        RPR_NUMBER_24_LEFT_10HR,
        RPR_NUMBER_25_LEFT_1HR,
        RPR_NUMBER_25_LEFT_2HR,
        RPR_NUMBER_25_LEFT_3HR,
        RPR_NUMBER_25_LEFT_4HR,
        RPR_NUMBER_25_LEFT_5HR,
        RPR_NUMBER_25_LEFT_6HR,
        RPR_NUMBER_25_LEFT_7HR,
        RPR_NUMBER_25_LEFT_8HR,
        RPR_NUMBER_25_LEFT_9HR,
        RPR_NUMBER_25_LEFT_10HR,
        RPR_NUMBER_26_LEFT_1HR,
        RPR_NUMBER_26_LEFT_2HR,
        RPR_NUMBER_26_LEFT_3HR,
        RPR_NUMBER_26_LEFT_4HR,
        RPR_NUMBER_26_LEFT_5HR,
        RPR_NUMBER_26_LEFT_6HR,
        RPR_NUMBER_26_LEFT_7HR,
        RPR_NUMBER_26_LEFT_8HR,
        RPR_NUMBER_26_LEFT_9HR,
        RPR_NUMBER_26_LEFT_10HR,
        RPR_NUMBER_27_LEFT_1HR,
        RPR_NUMBER_27_LEFT_2HR,
        RPR_NUMBER_27_LEFT_3HR,
        RPR_NUMBER_27_LEFT_4HR,
        RPR_NUMBER_27_LEFT_5HR,
        RPR_NUMBER_27_LEFT_6HR,
        RPR_NUMBER_27_LEFT_7HR,
        RPR_NUMBER_27_LEFT_8HR,
        RPR_NUMBER_27_LEFT_9HR,
        RPR_NUMBER_27_LEFT_10HR,
        RPR_NUMBER_28_LEFT_1HR,
        RPR_NUMBER_28_LEFT_2HR,
        RPR_NUMBER_28_LEFT_3HR,
        RPR_NUMBER_28_LEFT_4HR,
        RPR_NUMBER_28_LEFT_5HR,
        RPR_NUMBER_28_LEFT_6HR,
        RPR_NUMBER_28_LEFT_7HR,
        RPR_NUMBER_28_LEFT_8HR,
        RPR_NUMBER_28_LEFT_9HR,
        RPR_NUMBER_28_LEFT_10HR,
        RPR_NUMBER_29_LEFT_1HR,
        RPR_NUMBER_29_LEFT_2HR,
        RPR_NUMBER_29_LEFT_3HR,
        RPR_NUMBER_29_LEFT_4HR,
        RPR_NUMBER_29_LEFT_5HR,
        RPR_NUMBER_29_LEFT_6HR,
        RPR_NUMBER_29_LEFT_7HR,
        RPR_NUMBER_29_LEFT_8HR,
        RPR_NUMBER_29_LEFT_9HR,
        RPR_NUMBER_29_LEFT_10HR,
        RPR_NUMBER_30_LEFT_1HR,
        RPR_NUMBER_30_LEFT_2HR,
        RPR_NUMBER_30_LEFT_3HR,
        RPR_NUMBER_30_LEFT_4HR,
        RPR_NUMBER_30_LEFT_5HR,
        RPR_NUMBER_30_LEFT_6HR,
        RPR_NUMBER_30_LEFT_7HR,
        RPR_NUMBER_30_LEFT_8HR,
        RPR_NUMBER_30_LEFT_9HR,
        RPR_NUMBER_30_LEFT_10HR,
        RPR_NUMBER_31_LEFT_1HR,
        RPR_NUMBER_31_LEFT_2HR,
        RPR_NUMBER_31_LEFT_3HR,
        RPR_NUMBER_31_LEFT_4HR,
        RPR_NUMBER_31_LEFT_5HR,
        RPR_NUMBER_31_LEFT_6HR,
        RPR_NUMBER_31_LEFT_7HR,
        RPR_NUMBER_31_LEFT_8HR,
        RPR_NUMBER_31_LEFT_9HR,
        RPR_NUMBER_31_LEFT_10HR,
        RPR_NUMBER_32_LEFT_1HR,
        RPR_NUMBER_32_LEFT_2HR,
        RPR_NUMBER_32_LEFT_3HR,
        RPR_NUMBER_32_LEFT_4HR,
        RPR_NUMBER_32_LEFT_5HR,
        RPR_NUMBER_32_LEFT_6HR,
        RPR_NUMBER_32_LEFT_7HR,
        RPR_NUMBER_32_LEFT_8HR,
        RPR_NUMBER_32_LEFT_9HR,
        RPR_NUMBER_32_LEFT_10HR,
        RPR_NUMBER_33_LEFT_1HR,
        RPR_NUMBER_33_LEFT_2HR,
        RPR_NUMBER_33_LEFT_3HR,
        RPR_NUMBER_33_LEFT_4HR,
        RPR_NUMBER_33_LEFT_5HR,
        RPR_NUMBER_33_LEFT_6HR,
        RPR_NUMBER_33_LEFT_7HR,
        RPR_NUMBER_33_LEFT_8HR,
        RPR_NUMBER_33_LEFT_9HR,
        RPR_NUMBER_33_LEFT_10HR,
        RPR_NUMBER_34_LEFT_1HR,
        RPR_NUMBER_34_LEFT_2HR,
        RPR_NUMBER_34_LEFT_3HR,
        RPR_NUMBER_34_LEFT_4HR,
        RPR_NUMBER_34_LEFT_5HR,
        RPR_NUMBER_34_LEFT_6HR,
        RPR_NUMBER_34_LEFT_7HR,
        RPR_NUMBER_34_LEFT_8HR,
        RPR_NUMBER_34_LEFT_9HR,
        RPR_NUMBER_34_LEFT_10HR,
        RPR_NUMBER_35_LEFT_1HR,
        RPR_NUMBER_35_LEFT_2HR,
        RPR_NUMBER_35_LEFT_3HR,
        RPR_NUMBER_35_LEFT_4HR,
        RPR_NUMBER_35_LEFT_5HR,
        RPR_NUMBER_35_LEFT_6HR,
        RPR_NUMBER_35_LEFT_7HR,
        RPR_NUMBER_35_LEFT_8HR,
        RPR_NUMBER_35_LEFT_9HR,
        RPR_NUMBER_35_LEFT_10HR,
        RPR_NUMBER_36_LEFT_1HR,
        RPR_NUMBER_36_LEFT_2HR,
        RPR_NUMBER_36_LEFT_3HR,
        RPR_NUMBER_36_LEFT_4HR,
        RPR_NUMBER_36_LEFT_5HR,
        RPR_NUMBER_36_LEFT_6HR,
        RPR_NUMBER_36_LEFT_7HR,
        RPR_NUMBER_36_LEFT_8HR,
        RPR_NUMBER_36_LEFT_9HR,
        RPR_NUMBER_36_LEFT_10HR,
        RPR_NUMBER_37_LEFT_1HR,
        RPR_NUMBER_37_LEFT_2HR,
        RPR_NUMBER_37_LEFT_3HR,
        RPR_NUMBER_37_LEFT_4HR,
        RPR_NUMBER_37_LEFT_5HR,
        RPR_NUMBER_37_LEFT_6HR,
        RPR_NUMBER_37_LEFT_7HR,
        RPR_NUMBER_37_LEFT_8HR,
        RPR_NUMBER_37_LEFT_9HR,
        RPR_NUMBER_37_LEFT_10HR,

        RPR_NUMBER_1_LEFT_HALFHR,
        RPR_NUMBER_2_LEFT_HALFHR,
        RPR_NUMBER_3_LEFT_HALFHR,
        RPR_NUMBER_4_LEFT_HALFHR,
        RPR_NUMBER_5_LEFT_HALFHR,
        RPR_NUMBER_6_LEFT_HALFHR,
        RPR_NUMBER_7_LEFT_HALFHR,
        RPR_NUMBER_8_LEFT_HALFHR,
        RPR_NUMBER_9_LEFT_HALFHR,
        RPR_NUMBER_10_LEFT_HALFHR,
        RPR_NUMBER_11_LEFT_HALFHR,
        RPR_NUMBER_12_LEFT_HALFHR,
        RPR_NUMBER_13_LEFT_HALFHR,
        RPR_NUMBER_14_LEFT_HALFHR,
        RPR_NUMBER_15_LEFT_HALFHR,
        RPR_NUMBER_16_LEFT_HALFHR,
        RPR_NUMBER_17_LEFT_HALFHR,
        RPR_NUMBER_18_LEFT_HALFHR,
        RPR_NUMBER_19_LEFT_HALFHR,
        RPR_NUMBER_20_LEFT_HALFHR,
        RPR_NUMBER_21_LEFT_HALFHR,
        RPR_NUMBER_22_LEFT_HALFHR,
        RPR_NUMBER_23_LEFT_HALFHR,
        RPR_NUMBER_24_LEFT_HALFHR,
        RPR_NUMBER_25_LEFT_HALFHR,
        RPR_NUMBER_26_LEFT_HALFHR,
        RPR_NUMBER_27_LEFT_HALFHR,
        RPR_NUMBER_28_LEFT_HALFHR,
        RPR_NUMBER_29_LEFT_HALFHR,
        RPR_NUMBER_30_LEFT_HALFHR,
        RPR_NUMBER_31_LEFT_HALFHR,
        RPR_NUMBER_32_LEFT_HALFHR,
        RPR_NUMBER_33_LEFT_HALFHR,
        RPR_NUMBER_34_LEFT_HALFHR,
        RPR_NUMBER_35_LEFT_HALFHR,
        RPR_NUMBER_36_LEFT_HALFHR,
        RPR_NUMBER_37_LEFT_HALFHR,

        RPR_NUMBER_1_LEFT_1_5HR,
        RPR_NUMBER_1_LEFT_2_5HR,
        RPR_NUMBER_1_LEFT_3_5HR,
        RPR_NUMBER_1_LEFT_4_5HR,
        RPR_NUMBER_1_LEFT_5_5HR,
        RPR_NUMBER_1_LEFT_6_5HR,
        RPR_NUMBER_1_LEFT_7_5HR,
        RPR_NUMBER_1_LEFT_8_5HR,
        RPR_NUMBER_1_LEFT_9_5HR,
        RPR_NUMBER_2_LEFT_1_5HR,
        RPR_NUMBER_2_LEFT_2_5HR,
        RPR_NUMBER_2_LEFT_3_5HR,
        RPR_NUMBER_2_LEFT_4_5HR,
        RPR_NUMBER_2_LEFT_5_5HR,
        RPR_NUMBER_2_LEFT_6_5HR,
        RPR_NUMBER_2_LEFT_7_5HR,
        RPR_NUMBER_2_LEFT_8_5HR,
        RPR_NUMBER_2_LEFT_9_5HR,
        RPR_NUMBER_3_LEFT_1_5HR,
        RPR_NUMBER_3_LEFT_2_5HR,
        RPR_NUMBER_3_LEFT_3_5HR,
        RPR_NUMBER_3_LEFT_4_5HR,
        RPR_NUMBER_3_LEFT_5_5HR,
        RPR_NUMBER_3_LEFT_6_5HR,
        RPR_NUMBER_3_LEFT_7_5HR,
        RPR_NUMBER_3_LEFT_8_5HR,
        RPR_NUMBER_3_LEFT_9_5HR,
        RPR_NUMBER_4_LEFT_1_5HR,
        RPR_NUMBER_4_LEFT_2_5HR,
        RPR_NUMBER_4_LEFT_3_5HR,
        RPR_NUMBER_4_LEFT_4_5HR,
        RPR_NUMBER_4_LEFT_5_5HR,
        RPR_NUMBER_4_LEFT_6_5HR,
        RPR_NUMBER_4_LEFT_7_5HR,
        RPR_NUMBER_4_LEFT_8_5HR,
        RPR_NUMBER_4_LEFT_9_5HR,
        RPR_NUMBER_5_LEFT_1_5HR,
        RPR_NUMBER_5_LEFT_2_5HR,
        RPR_NUMBER_5_LEFT_3_5HR,
        RPR_NUMBER_5_LEFT_4_5HR,
        RPR_NUMBER_5_LEFT_5_5HR,
        RPR_NUMBER_5_LEFT_6_5HR,
        RPR_NUMBER_5_LEFT_7_5HR,
        RPR_NUMBER_5_LEFT_8_5HR,
        RPR_NUMBER_5_LEFT_9_5HR,
        RPR_NUMBER_6_LEFT_1_5HR,
        RPR_NUMBER_6_LEFT_2_5HR,
        RPR_NUMBER_6_LEFT_3_5HR,
        RPR_NUMBER_6_LEFT_4_5HR,
        RPR_NUMBER_6_LEFT_5_5HR,
        RPR_NUMBER_6_LEFT_6_5HR,
        RPR_NUMBER_6_LEFT_7_5HR,
        RPR_NUMBER_6_LEFT_8_5HR,
        RPR_NUMBER_6_LEFT_9_5HR,
        RPR_NUMBER_7_LEFT_1_5HR,
        RPR_NUMBER_7_LEFT_2_5HR,
        RPR_NUMBER_7_LEFT_3_5HR,
        RPR_NUMBER_7_LEFT_4_5HR,
        RPR_NUMBER_7_LEFT_5_5HR,
        RPR_NUMBER_7_LEFT_6_5HR,
        RPR_NUMBER_7_LEFT_7_5HR,
        RPR_NUMBER_7_LEFT_8_5HR,
        RPR_NUMBER_7_LEFT_9_5HR,
        RPR_NUMBER_8_LEFT_1_5HR,
        RPR_NUMBER_8_LEFT_2_5HR,
        RPR_NUMBER_8_LEFT_3_5HR,
        RPR_NUMBER_8_LEFT_4_5HR,
        RPR_NUMBER_8_LEFT_5_5HR,
        RPR_NUMBER_8_LEFT_6_5HR,
        RPR_NUMBER_8_LEFT_7_5HR,
        RPR_NUMBER_8_LEFT_8_5HR,
        RPR_NUMBER_8_LEFT_9_5HR,
        RPR_NUMBER_9_LEFT_1_5HR,
        RPR_NUMBER_9_LEFT_2_5HR,
        RPR_NUMBER_9_LEFT_3_5HR,
        RPR_NUMBER_9_LEFT_4_5HR,
        RPR_NUMBER_9_LEFT_5_5HR,
        RPR_NUMBER_9_LEFT_6_5HR,
        RPR_NUMBER_9_LEFT_7_5HR,
        RPR_NUMBER_9_LEFT_8_5HR,
        RPR_NUMBER_9_LEFT_9_5HR,
        RPR_NUMBER_10_LEFT_1_5HR,
        RPR_NUMBER_10_LEFT_2_5HR,
        RPR_NUMBER_10_LEFT_3_5HR,
        RPR_NUMBER_10_LEFT_4_5HR,
        RPR_NUMBER_10_LEFT_5_5HR,
        RPR_NUMBER_10_LEFT_6_5HR,
        RPR_NUMBER_10_LEFT_7_5HR,
        RPR_NUMBER_10_LEFT_8_5HR,
        RPR_NUMBER_10_LEFT_9_5HR,
        RPR_NUMBER_11_LEFT_1_5HR,
        RPR_NUMBER_11_LEFT_2_5HR,
        RPR_NUMBER_11_LEFT_3_5HR,
        RPR_NUMBER_11_LEFT_4_5HR,
        RPR_NUMBER_11_LEFT_5_5HR,
        RPR_NUMBER_11_LEFT_6_5HR,
        RPR_NUMBER_11_LEFT_7_5HR,
        RPR_NUMBER_11_LEFT_8_5HR,
        RPR_NUMBER_11_LEFT_9_5HR,
        RPR_NUMBER_12_LEFT_1_5HR,
        RPR_NUMBER_12_LEFT_2_5HR,
        RPR_NUMBER_12_LEFT_3_5HR,
        RPR_NUMBER_12_LEFT_4_5HR,
        RPR_NUMBER_12_LEFT_5_5HR,
        RPR_NUMBER_12_LEFT_6_5HR,
        RPR_NUMBER_12_LEFT_7_5HR,
        RPR_NUMBER_12_LEFT_8_5HR,
        RPR_NUMBER_12_LEFT_9_5HR,
        RPR_NUMBER_13_LEFT_1_5HR,
        RPR_NUMBER_13_LEFT_2_5HR,
        RPR_NUMBER_13_LEFT_3_5HR,
        RPR_NUMBER_13_LEFT_4_5HR,
        RPR_NUMBER_13_LEFT_5_5HR,
        RPR_NUMBER_13_LEFT_6_5HR,
        RPR_NUMBER_13_LEFT_7_5HR,
        RPR_NUMBER_13_LEFT_8_5HR,
        RPR_NUMBER_13_LEFT_9_5HR,
        RPR_NUMBER_14_LEFT_1_5HR,
        RPR_NUMBER_14_LEFT_2_5HR,
        RPR_NUMBER_14_LEFT_3_5HR,
        RPR_NUMBER_14_LEFT_4_5HR,
        RPR_NUMBER_14_LEFT_5_5HR,
        RPR_NUMBER_14_LEFT_6_5HR,
        RPR_NUMBER_14_LEFT_7_5HR,
        RPR_NUMBER_14_LEFT_8_5HR,
        RPR_NUMBER_14_LEFT_9_5HR,
        RPR_NUMBER_15_LEFT_1_5HR,
        RPR_NUMBER_15_LEFT_2_5HR,
        RPR_NUMBER_15_LEFT_3_5HR,
        RPR_NUMBER_15_LEFT_4_5HR,
        RPR_NUMBER_15_LEFT_5_5HR,
        RPR_NUMBER_15_LEFT_6_5HR,
        RPR_NUMBER_15_LEFT_7_5HR,
        RPR_NUMBER_15_LEFT_8_5HR,
        RPR_NUMBER_15_LEFT_9_5HR,
        RPR_NUMBER_16_LEFT_1_5HR,
        RPR_NUMBER_16_LEFT_2_5HR,
        RPR_NUMBER_16_LEFT_3_5HR,
        RPR_NUMBER_16_LEFT_4_5HR,
        RPR_NUMBER_16_LEFT_5_5HR,
        RPR_NUMBER_16_LEFT_6_5HR,
        RPR_NUMBER_16_LEFT_7_5HR,
        RPR_NUMBER_16_LEFT_8_5HR,
        RPR_NUMBER_16_LEFT_9_5HR,
        RPR_NUMBER_17_LEFT_1_5HR,
        RPR_NUMBER_17_LEFT_2_5HR,
        RPR_NUMBER_17_LEFT_3_5HR,
        RPR_NUMBER_17_LEFT_4_5HR,
        RPR_NUMBER_17_LEFT_5_5HR,
        RPR_NUMBER_17_LEFT_6_5HR,
        RPR_NUMBER_17_LEFT_7_5HR,
        RPR_NUMBER_17_LEFT_8_5HR,
        RPR_NUMBER_17_LEFT_9_5HR,
        RPR_NUMBER_18_LEFT_1_5HR,
        RPR_NUMBER_18_LEFT_2_5HR,
        RPR_NUMBER_18_LEFT_3_5HR,
        RPR_NUMBER_18_LEFT_4_5HR,
        RPR_NUMBER_18_LEFT_5_5HR,
        RPR_NUMBER_18_LEFT_6_5HR,
        RPR_NUMBER_18_LEFT_7_5HR,
        RPR_NUMBER_18_LEFT_8_5HR,
        RPR_NUMBER_18_LEFT_9_5HR,
        RPR_NUMBER_19_LEFT_1_5HR,
        RPR_NUMBER_19_LEFT_2_5HR,
        RPR_NUMBER_19_LEFT_3_5HR,
        RPR_NUMBER_19_LEFT_4_5HR,
        RPR_NUMBER_19_LEFT_5_5HR,
        RPR_NUMBER_19_LEFT_6_5HR,
        RPR_NUMBER_19_LEFT_7_5HR,
        RPR_NUMBER_19_LEFT_8_5HR,
        RPR_NUMBER_19_LEFT_9_5HR,
        RPR_NUMBER_20_LEFT_1_5HR,
        RPR_NUMBER_20_LEFT_2_5HR,
        RPR_NUMBER_20_LEFT_3_5HR,
        RPR_NUMBER_20_LEFT_4_5HR,
        RPR_NUMBER_20_LEFT_5_5HR,
        RPR_NUMBER_20_LEFT_6_5HR,
        RPR_NUMBER_20_LEFT_7_5HR,
        RPR_NUMBER_20_LEFT_8_5HR,
        RPR_NUMBER_20_LEFT_9_5HR,
        RPR_NUMBER_21_LEFT_1_5HR,
        RPR_NUMBER_21_LEFT_2_5HR,
        RPR_NUMBER_21_LEFT_3_5HR,
        RPR_NUMBER_21_LEFT_4_5HR,
        RPR_NUMBER_21_LEFT_5_5HR,
        RPR_NUMBER_21_LEFT_6_5HR,
        RPR_NUMBER_21_LEFT_7_5HR,
        RPR_NUMBER_21_LEFT_8_5HR,
        RPR_NUMBER_21_LEFT_9_5HR,
        RPR_NUMBER_22_LEFT_1_5HR,
        RPR_NUMBER_22_LEFT_2_5HR,
        RPR_NUMBER_22_LEFT_3_5HR,
        RPR_NUMBER_22_LEFT_4_5HR,
        RPR_NUMBER_22_LEFT_5_5HR,
        RPR_NUMBER_22_LEFT_6_5HR,
        RPR_NUMBER_22_LEFT_7_5HR,
        RPR_NUMBER_22_LEFT_8_5HR,
        RPR_NUMBER_22_LEFT_9_5HR,
        RPR_NUMBER_23_LEFT_1_5HR,
        RPR_NUMBER_23_LEFT_2_5HR,
        RPR_NUMBER_23_LEFT_3_5HR,
        RPR_NUMBER_23_LEFT_4_5HR,
        RPR_NUMBER_23_LEFT_5_5HR,
        RPR_NUMBER_23_LEFT_6_5HR,
        RPR_NUMBER_23_LEFT_7_5HR,
        RPR_NUMBER_23_LEFT_8_5HR,
        RPR_NUMBER_23_LEFT_9_5HR,
        RPR_NUMBER_24_LEFT_1_5HR,
        RPR_NUMBER_24_LEFT_2_5HR,
        RPR_NUMBER_24_LEFT_3_5HR,
        RPR_NUMBER_24_LEFT_4_5HR,
        RPR_NUMBER_24_LEFT_5_5HR,
        RPR_NUMBER_24_LEFT_6_5HR,
        RPR_NUMBER_24_LEFT_7_5HR,
        RPR_NUMBER_24_LEFT_8_5HR,
        RPR_NUMBER_24_LEFT_9_5HR,
        RPR_NUMBER_25_LEFT_1_5HR,
        RPR_NUMBER_25_LEFT_2_5HR,
        RPR_NUMBER_25_LEFT_3_5HR,
        RPR_NUMBER_25_LEFT_4_5HR,
        RPR_NUMBER_25_LEFT_5_5HR,
        RPR_NUMBER_25_LEFT_6_5HR,
        RPR_NUMBER_25_LEFT_7_5HR,
        RPR_NUMBER_25_LEFT_8_5HR,
        RPR_NUMBER_25_LEFT_9_5HR,
        RPR_NUMBER_26_LEFT_1_5HR,
        RPR_NUMBER_26_LEFT_2_5HR,
        RPR_NUMBER_26_LEFT_3_5HR,
        RPR_NUMBER_26_LEFT_4_5HR,
        RPR_NUMBER_26_LEFT_5_5HR,
        RPR_NUMBER_26_LEFT_6_5HR,
        RPR_NUMBER_26_LEFT_7_5HR,
        RPR_NUMBER_26_LEFT_8_5HR,
        RPR_NUMBER_26_LEFT_9_5HR,
        RPR_NUMBER_27_LEFT_1_5HR,
        RPR_NUMBER_27_LEFT_2_5HR,
        RPR_NUMBER_27_LEFT_3_5HR,
        RPR_NUMBER_27_LEFT_4_5HR,
        RPR_NUMBER_27_LEFT_5_5HR,
        RPR_NUMBER_27_LEFT_6_5HR,
        RPR_NUMBER_27_LEFT_7_5HR,
        RPR_NUMBER_27_LEFT_8_5HR,
        RPR_NUMBER_27_LEFT_9_5HR,
        RPR_NUMBER_28_LEFT_1_5HR,
        RPR_NUMBER_28_LEFT_2_5HR,
        RPR_NUMBER_28_LEFT_3_5HR,
        RPR_NUMBER_28_LEFT_4_5HR,
        RPR_NUMBER_28_LEFT_5_5HR,
        RPR_NUMBER_28_LEFT_6_5HR,
        RPR_NUMBER_28_LEFT_7_5HR,
        RPR_NUMBER_28_LEFT_8_5HR,
        RPR_NUMBER_28_LEFT_9_5HR,
        RPR_NUMBER_29_LEFT_1_5HR,
        RPR_NUMBER_29_LEFT_2_5HR,
        RPR_NUMBER_29_LEFT_3_5HR,
        RPR_NUMBER_29_LEFT_4_5HR,
        RPR_NUMBER_29_LEFT_5_5HR,
        RPR_NUMBER_29_LEFT_6_5HR,
        RPR_NUMBER_29_LEFT_7_5HR,
        RPR_NUMBER_29_LEFT_8_5HR,
        RPR_NUMBER_29_LEFT_9_5HR,
        RPR_NUMBER_30_LEFT_1_5HR,
        RPR_NUMBER_30_LEFT_2_5HR,
        RPR_NUMBER_30_LEFT_3_5HR,
        RPR_NUMBER_30_LEFT_4_5HR,
        RPR_NUMBER_30_LEFT_5_5HR,
        RPR_NUMBER_30_LEFT_6_5HR,
        RPR_NUMBER_30_LEFT_7_5HR,
        RPR_NUMBER_30_LEFT_8_5HR,
        RPR_NUMBER_30_LEFT_9_5HR,
        RPR_NUMBER_31_LEFT_1_5HR,
        RPR_NUMBER_31_LEFT_2_5HR,
        RPR_NUMBER_31_LEFT_3_5HR,
        RPR_NUMBER_31_LEFT_4_5HR,
        RPR_NUMBER_31_LEFT_5_5HR,
        RPR_NUMBER_31_LEFT_6_5HR,
        RPR_NUMBER_31_LEFT_7_5HR,
        RPR_NUMBER_31_LEFT_8_5HR,
        RPR_NUMBER_31_LEFT_9_5HR,
        RPR_NUMBER_32_LEFT_1_5HR,
        RPR_NUMBER_32_LEFT_2_5HR,
        RPR_NUMBER_32_LEFT_3_5HR,
        RPR_NUMBER_32_LEFT_4_5HR,
        RPR_NUMBER_32_LEFT_5_5HR,
        RPR_NUMBER_32_LEFT_6_5HR,
        RPR_NUMBER_32_LEFT_7_5HR,
        RPR_NUMBER_32_LEFT_8_5HR,
        RPR_NUMBER_32_LEFT_9_5HR,
        RPR_NUMBER_33_LEFT_1_5HR,
        RPR_NUMBER_33_LEFT_2_5HR,
        RPR_NUMBER_33_LEFT_3_5HR,
        RPR_NUMBER_33_LEFT_4_5HR,
        RPR_NUMBER_33_LEFT_5_5HR,
        RPR_NUMBER_33_LEFT_6_5HR,
        RPR_NUMBER_33_LEFT_7_5HR,
        RPR_NUMBER_33_LEFT_8_5HR,
        RPR_NUMBER_33_LEFT_9_5HR,
        RPR_NUMBER_34_LEFT_1_5HR,
        RPR_NUMBER_34_LEFT_2_5HR,
        RPR_NUMBER_34_LEFT_3_5HR,
        RPR_NUMBER_34_LEFT_4_5HR,
        RPR_NUMBER_34_LEFT_5_5HR,
        RPR_NUMBER_34_LEFT_6_5HR,
        RPR_NUMBER_34_LEFT_7_5HR,
        RPR_NUMBER_34_LEFT_8_5HR,
        RPR_NUMBER_34_LEFT_9_5HR,
        RPR_NUMBER_35_LEFT_1_5HR,
        RPR_NUMBER_35_LEFT_2_5HR,
        RPR_NUMBER_35_LEFT_3_5HR,
        RPR_NUMBER_35_LEFT_4_5HR,
        RPR_NUMBER_35_LEFT_5_5HR,
        RPR_NUMBER_35_LEFT_6_5HR,
        RPR_NUMBER_35_LEFT_7_5HR,
        RPR_NUMBER_35_LEFT_8_5HR,
        RPR_NUMBER_35_LEFT_9_5HR,
        RPR_NUMBER_36_LEFT_1_5HR,
        RPR_NUMBER_36_LEFT_2_5HR,
        RPR_NUMBER_36_LEFT_3_5HR,
        RPR_NUMBER_36_LEFT_4_5HR,
        RPR_NUMBER_36_LEFT_5_5HR,
        RPR_NUMBER_36_LEFT_6_5HR,
        RPR_NUMBER_36_LEFT_7_5HR,
        RPR_NUMBER_36_LEFT_8_5HR,
        RPR_NUMBER_36_LEFT_9_5HR,
        RPR_NUMBER_37_LEFT_1_5HR,
        RPR_NUMBER_37_LEFT_2_5HR,
        RPR_NUMBER_37_LEFT_3_5HR,
        RPR_NUMBER_37_LEFT_4_5HR,
        RPR_NUMBER_37_LEFT_5_5HR,
        RPR_NUMBER_37_LEFT_6_5HR,
        RPR_NUMBER_37_LEFT_7_5HR,
        RPR_NUMBER_37_LEFT_8_5HR,
        RPR_NUMBER_37_LEFT_9_5HR,

        RPR_NUMBER_1_RIGHT_1HR,
        RPR_NUMBER_1_RIGHT_2HR,
        RPR_NUMBER_1_RIGHT_3HR,
        RPR_NUMBER_1_RIGHT_4HR,
        RPR_NUMBER_1_RIGHT_5HR,
        RPR_NUMBER_1_RIGHT_6HR,
        RPR_NUMBER_1_RIGHT_7HR,
        RPR_NUMBER_1_RIGHT_8HR,
        RPR_NUMBER_1_RIGHT_9HR,
        RPR_NUMBER_1_RIGHT_10HR,
        RPR_NUMBER_2_RIGHT_1HR,
        RPR_NUMBER_2_RIGHT_2HR,
        RPR_NUMBER_2_RIGHT_3HR,
        RPR_NUMBER_2_RIGHT_4HR,
        RPR_NUMBER_2_RIGHT_5HR,
        RPR_NUMBER_2_RIGHT_6HR,
        RPR_NUMBER_2_RIGHT_7HR,
        RPR_NUMBER_2_RIGHT_8HR,
        RPR_NUMBER_2_RIGHT_9HR,
        RPR_NUMBER_2_RIGHT_10HR,
        RPR_NUMBER_3_RIGHT_1HR,
        RPR_NUMBER_3_RIGHT_2HR,
        RPR_NUMBER_3_RIGHT_3HR,
        RPR_NUMBER_3_RIGHT_4HR,
        RPR_NUMBER_3_RIGHT_5HR,
        RPR_NUMBER_3_RIGHT_6HR,
        RPR_NUMBER_3_RIGHT_7HR,
        RPR_NUMBER_3_RIGHT_8HR,
        RPR_NUMBER_3_RIGHT_9HR,
        RPR_NUMBER_3_RIGHT_10HR,
        RPR_NUMBER_4_RIGHT_1HR,
        RPR_NUMBER_4_RIGHT_2HR,
        RPR_NUMBER_4_RIGHT_3HR,
        RPR_NUMBER_4_RIGHT_4HR,
        RPR_NUMBER_4_RIGHT_5HR,
        RPR_NUMBER_4_RIGHT_6HR,
        RPR_NUMBER_4_RIGHT_7HR,
        RPR_NUMBER_4_RIGHT_8HR,
        RPR_NUMBER_4_RIGHT_9HR,
        RPR_NUMBER_4_RIGHT_10HR,
        RPR_NUMBER_5_RIGHT_1HR,
        RPR_NUMBER_5_RIGHT_2HR,
        RPR_NUMBER_5_RIGHT_3HR,
        RPR_NUMBER_5_RIGHT_4HR,
        RPR_NUMBER_5_RIGHT_5HR,
        RPR_NUMBER_5_RIGHT_6HR,
        RPR_NUMBER_5_RIGHT_7HR,
        RPR_NUMBER_5_RIGHT_8HR,
        RPR_NUMBER_5_RIGHT_9HR,
        RPR_NUMBER_5_RIGHT_10HR,
        RPR_NUMBER_6_RIGHT_1HR,
        RPR_NUMBER_6_RIGHT_2HR,
        RPR_NUMBER_6_RIGHT_3HR,
        RPR_NUMBER_6_RIGHT_4HR,
        RPR_NUMBER_6_RIGHT_5HR,
        RPR_NUMBER_6_RIGHT_6HR,
        RPR_NUMBER_6_RIGHT_7HR,
        RPR_NUMBER_6_RIGHT_8HR,
        RPR_NUMBER_6_RIGHT_9HR,
        RPR_NUMBER_6_RIGHT_10HR,
        RPR_NUMBER_7_RIGHT_1HR,
        RPR_NUMBER_7_RIGHT_2HR,
        RPR_NUMBER_7_RIGHT_3HR,
        RPR_NUMBER_7_RIGHT_4HR,
        RPR_NUMBER_7_RIGHT_5HR,
        RPR_NUMBER_7_RIGHT_6HR,
        RPR_NUMBER_7_RIGHT_7HR,
        RPR_NUMBER_7_RIGHT_8HR,
        RPR_NUMBER_7_RIGHT_9HR,
        RPR_NUMBER_7_RIGHT_10HR,
        RPR_NUMBER_8_RIGHT_1HR,
        RPR_NUMBER_8_RIGHT_2HR,
        RPR_NUMBER_8_RIGHT_3HR,
        RPR_NUMBER_8_RIGHT_4HR,
        RPR_NUMBER_8_RIGHT_5HR,
        RPR_NUMBER_8_RIGHT_6HR,
        RPR_NUMBER_8_RIGHT_7HR,
        RPR_NUMBER_8_RIGHT_8HR,
        RPR_NUMBER_8_RIGHT_9HR,
        RPR_NUMBER_8_RIGHT_10HR,
        RPR_NUMBER_9_RIGHT_1HR,
        RPR_NUMBER_9_RIGHT_2HR,
        RPR_NUMBER_9_RIGHT_3HR,
        RPR_NUMBER_9_RIGHT_4HR,
        RPR_NUMBER_9_RIGHT_5HR,
        RPR_NUMBER_9_RIGHT_6HR,
        RPR_NUMBER_9_RIGHT_7HR,
        RPR_NUMBER_9_RIGHT_8HR,
        RPR_NUMBER_9_RIGHT_9HR,
        RPR_NUMBER_9_RIGHT_10HR,
        RPR_NUMBER_10_RIGHT_1HR,
        RPR_NUMBER_10_RIGHT_2HR,
        RPR_NUMBER_10_RIGHT_3HR,
        RPR_NUMBER_10_RIGHT_4HR,
        RPR_NUMBER_10_RIGHT_5HR,
        RPR_NUMBER_10_RIGHT_6HR,
        RPR_NUMBER_10_RIGHT_7HR,
        RPR_NUMBER_10_RIGHT_8HR,
        RPR_NUMBER_10_RIGHT_9HR,
        RPR_NUMBER_10_RIGHT_10HR,
        RPR_NUMBER_11_RIGHT_1HR,
        RPR_NUMBER_11_RIGHT_2HR,
        RPR_NUMBER_11_RIGHT_3HR,
        RPR_NUMBER_11_RIGHT_4HR,
        RPR_NUMBER_11_RIGHT_5HR,
        RPR_NUMBER_11_RIGHT_6HR,
        RPR_NUMBER_11_RIGHT_7HR,
        RPR_NUMBER_11_RIGHT_8HR,
        RPR_NUMBER_11_RIGHT_9HR,
        RPR_NUMBER_11_RIGHT_10HR,
        RPR_NUMBER_12_RIGHT_1HR,
        RPR_NUMBER_12_RIGHT_2HR,
        RPR_NUMBER_12_RIGHT_3HR,
        RPR_NUMBER_12_RIGHT_4HR,
        RPR_NUMBER_12_RIGHT_5HR,
        RPR_NUMBER_12_RIGHT_6HR,
        RPR_NUMBER_12_RIGHT_7HR,
        RPR_NUMBER_12_RIGHT_8HR,
        RPR_NUMBER_12_RIGHT_9HR,
        RPR_NUMBER_12_RIGHT_10HR,
        RPR_NUMBER_13_RIGHT_1HR,
        RPR_NUMBER_13_RIGHT_2HR,
        RPR_NUMBER_13_RIGHT_3HR,
        RPR_NUMBER_13_RIGHT_4HR,
        RPR_NUMBER_13_RIGHT_5HR,
        RPR_NUMBER_13_RIGHT_6HR,
        RPR_NUMBER_13_RIGHT_7HR,
        RPR_NUMBER_13_RIGHT_8HR,
        RPR_NUMBER_13_RIGHT_9HR,
        RPR_NUMBER_13_RIGHT_10HR,
        RPR_NUMBER_14_RIGHT_1HR,
        RPR_NUMBER_14_RIGHT_2HR,
        RPR_NUMBER_14_RIGHT_3HR,
        RPR_NUMBER_14_RIGHT_4HR,
        RPR_NUMBER_14_RIGHT_5HR,
        RPR_NUMBER_14_RIGHT_6HR,
        RPR_NUMBER_14_RIGHT_7HR,
        RPR_NUMBER_14_RIGHT_8HR,
        RPR_NUMBER_14_RIGHT_9HR,
        RPR_NUMBER_14_RIGHT_10HR,
        RPR_NUMBER_15_RIGHT_1HR,
        RPR_NUMBER_15_RIGHT_2HR,
        RPR_NUMBER_15_RIGHT_3HR,
        RPR_NUMBER_15_RIGHT_4HR,
        RPR_NUMBER_15_RIGHT_5HR,
        RPR_NUMBER_15_RIGHT_6HR,
        RPR_NUMBER_15_RIGHT_7HR,
        RPR_NUMBER_15_RIGHT_8HR,
        RPR_NUMBER_15_RIGHT_9HR,
        RPR_NUMBER_15_RIGHT_10HR,
        RPR_NUMBER_16_RIGHT_1HR,
        RPR_NUMBER_16_RIGHT_2HR,
        RPR_NUMBER_16_RIGHT_3HR,
        RPR_NUMBER_16_RIGHT_4HR,
        RPR_NUMBER_16_RIGHT_5HR,
        RPR_NUMBER_16_RIGHT_6HR,
        RPR_NUMBER_16_RIGHT_7HR,
        RPR_NUMBER_16_RIGHT_8HR,
        RPR_NUMBER_16_RIGHT_9HR,
        RPR_NUMBER_16_RIGHT_10HR,
        RPR_NUMBER_17_RIGHT_1HR,
        RPR_NUMBER_17_RIGHT_2HR,
        RPR_NUMBER_17_RIGHT_3HR,
        RPR_NUMBER_17_RIGHT_4HR,
        RPR_NUMBER_17_RIGHT_5HR,
        RPR_NUMBER_17_RIGHT_6HR,
        RPR_NUMBER_17_RIGHT_7HR,
        RPR_NUMBER_17_RIGHT_8HR,
        RPR_NUMBER_17_RIGHT_9HR,
        RPR_NUMBER_17_RIGHT_10HR,
        RPR_NUMBER_18_RIGHT_1HR,
        RPR_NUMBER_18_RIGHT_2HR,
        RPR_NUMBER_18_RIGHT_3HR,
        RPR_NUMBER_18_RIGHT_4HR,
        RPR_NUMBER_18_RIGHT_5HR,
        RPR_NUMBER_18_RIGHT_6HR,
        RPR_NUMBER_18_RIGHT_7HR,
        RPR_NUMBER_18_RIGHT_8HR,
        RPR_NUMBER_18_RIGHT_9HR,
        RPR_NUMBER_18_RIGHT_10HR,
        RPR_NUMBER_19_RIGHT_1HR,
        RPR_NUMBER_19_RIGHT_2HR,
        RPR_NUMBER_19_RIGHT_3HR,
        RPR_NUMBER_19_RIGHT_4HR,
        RPR_NUMBER_19_RIGHT_5HR,
        RPR_NUMBER_19_RIGHT_6HR,
        RPR_NUMBER_19_RIGHT_7HR,
        RPR_NUMBER_19_RIGHT_8HR,
        RPR_NUMBER_19_RIGHT_9HR,
        RPR_NUMBER_19_RIGHT_10HR,
        RPR_NUMBER_20_RIGHT_1HR,
        RPR_NUMBER_20_RIGHT_2HR,
        RPR_NUMBER_20_RIGHT_3HR,
        RPR_NUMBER_20_RIGHT_4HR,
        RPR_NUMBER_20_RIGHT_5HR,
        RPR_NUMBER_20_RIGHT_6HR,
        RPR_NUMBER_20_RIGHT_7HR,
        RPR_NUMBER_20_RIGHT_8HR,
        RPR_NUMBER_20_RIGHT_9HR,
        RPR_NUMBER_20_RIGHT_10HR,
        RPR_NUMBER_21_RIGHT_1HR,
        RPR_NUMBER_21_RIGHT_2HR,
        RPR_NUMBER_21_RIGHT_3HR,
        RPR_NUMBER_21_RIGHT_4HR,
        RPR_NUMBER_21_RIGHT_5HR,
        RPR_NUMBER_21_RIGHT_6HR,
        RPR_NUMBER_21_RIGHT_7HR,
        RPR_NUMBER_21_RIGHT_8HR,
        RPR_NUMBER_21_RIGHT_9HR,
        RPR_NUMBER_21_RIGHT_10HR,
        RPR_NUMBER_22_RIGHT_1HR,
        RPR_NUMBER_22_RIGHT_2HR,
        RPR_NUMBER_22_RIGHT_3HR,
        RPR_NUMBER_22_RIGHT_4HR,
        RPR_NUMBER_22_RIGHT_5HR,
        RPR_NUMBER_22_RIGHT_6HR,
        RPR_NUMBER_22_RIGHT_7HR,
        RPR_NUMBER_22_RIGHT_8HR,
        RPR_NUMBER_22_RIGHT_9HR,
        RPR_NUMBER_22_RIGHT_10HR,
        RPR_NUMBER_23_RIGHT_1HR,
        RPR_NUMBER_23_RIGHT_2HR,
        RPR_NUMBER_23_RIGHT_3HR,
        RPR_NUMBER_23_RIGHT_4HR,
        RPR_NUMBER_23_RIGHT_5HR,
        RPR_NUMBER_23_RIGHT_6HR,
        RPR_NUMBER_23_RIGHT_7HR,
        RPR_NUMBER_23_RIGHT_8HR,
        RPR_NUMBER_23_RIGHT_9HR,
        RPR_NUMBER_23_RIGHT_10HR,
        RPR_NUMBER_24_RIGHT_1HR,
        RPR_NUMBER_24_RIGHT_2HR,
        RPR_NUMBER_24_RIGHT_3HR,
        RPR_NUMBER_24_RIGHT_4HR,
        RPR_NUMBER_24_RIGHT_5HR,
        RPR_NUMBER_24_RIGHT_6HR,
        RPR_NUMBER_24_RIGHT_7HR,
        RPR_NUMBER_24_RIGHT_8HR,
        RPR_NUMBER_24_RIGHT_9HR,
        RPR_NUMBER_24_RIGHT_10HR,
        RPR_NUMBER_25_RIGHT_1HR,
        RPR_NUMBER_25_RIGHT_2HR,
        RPR_NUMBER_25_RIGHT_3HR,
        RPR_NUMBER_25_RIGHT_4HR,
        RPR_NUMBER_25_RIGHT_5HR,
        RPR_NUMBER_25_RIGHT_6HR,
        RPR_NUMBER_25_RIGHT_7HR,
        RPR_NUMBER_25_RIGHT_8HR,
        RPR_NUMBER_25_RIGHT_9HR,
        RPR_NUMBER_25_RIGHT_10HR,
        RPR_NUMBER_26_RIGHT_1HR,
        RPR_NUMBER_26_RIGHT_2HR,
        RPR_NUMBER_26_RIGHT_3HR,
        RPR_NUMBER_26_RIGHT_4HR,
        RPR_NUMBER_26_RIGHT_5HR,
        RPR_NUMBER_26_RIGHT_6HR,
        RPR_NUMBER_26_RIGHT_7HR,
        RPR_NUMBER_26_RIGHT_8HR,
        RPR_NUMBER_26_RIGHT_9HR,
        RPR_NUMBER_26_RIGHT_10HR,
        RPR_NUMBER_27_RIGHT_1HR,
        RPR_NUMBER_27_RIGHT_2HR,
        RPR_NUMBER_27_RIGHT_3HR,
        RPR_NUMBER_27_RIGHT_4HR,
        RPR_NUMBER_27_RIGHT_5HR,
        RPR_NUMBER_27_RIGHT_6HR,
        RPR_NUMBER_27_RIGHT_7HR,
        RPR_NUMBER_27_RIGHT_8HR,
        RPR_NUMBER_27_RIGHT_9HR,
        RPR_NUMBER_27_RIGHT_10HR,
        RPR_NUMBER_28_RIGHT_1HR,
        RPR_NUMBER_28_RIGHT_2HR,
        RPR_NUMBER_28_RIGHT_3HR,
        RPR_NUMBER_28_RIGHT_4HR,
        RPR_NUMBER_28_RIGHT_5HR,
        RPR_NUMBER_28_RIGHT_6HR,
        RPR_NUMBER_28_RIGHT_7HR,
        RPR_NUMBER_28_RIGHT_8HR,
        RPR_NUMBER_28_RIGHT_9HR,
        RPR_NUMBER_28_RIGHT_10HR,
        RPR_NUMBER_29_RIGHT_1HR,
        RPR_NUMBER_29_RIGHT_2HR,
        RPR_NUMBER_29_RIGHT_3HR,
        RPR_NUMBER_29_RIGHT_4HR,
        RPR_NUMBER_29_RIGHT_5HR,
        RPR_NUMBER_29_RIGHT_6HR,
        RPR_NUMBER_29_RIGHT_7HR,
        RPR_NUMBER_29_RIGHT_8HR,
        RPR_NUMBER_29_RIGHT_9HR,
        RPR_NUMBER_29_RIGHT_10HR,
        RPR_NUMBER_30_RIGHT_1HR,
        RPR_NUMBER_30_RIGHT_2HR,
        RPR_NUMBER_30_RIGHT_3HR,
        RPR_NUMBER_30_RIGHT_4HR,
        RPR_NUMBER_30_RIGHT_5HR,
        RPR_NUMBER_30_RIGHT_6HR,
        RPR_NUMBER_30_RIGHT_7HR,
        RPR_NUMBER_30_RIGHT_8HR,
        RPR_NUMBER_30_RIGHT_9HR,
        RPR_NUMBER_30_RIGHT_10HR,
        RPR_NUMBER_31_RIGHT_1HR,
        RPR_NUMBER_31_RIGHT_2HR,
        RPR_NUMBER_31_RIGHT_3HR,
        RPR_NUMBER_31_RIGHT_4HR,
        RPR_NUMBER_31_RIGHT_5HR,
        RPR_NUMBER_31_RIGHT_6HR,
        RPR_NUMBER_31_RIGHT_7HR,
        RPR_NUMBER_31_RIGHT_8HR,
        RPR_NUMBER_31_RIGHT_9HR,
        RPR_NUMBER_31_RIGHT_10HR,
        RPR_NUMBER_32_RIGHT_1HR,
        RPR_NUMBER_32_RIGHT_2HR,
        RPR_NUMBER_32_RIGHT_3HR,
        RPR_NUMBER_32_RIGHT_4HR,
        RPR_NUMBER_32_RIGHT_5HR,
        RPR_NUMBER_32_RIGHT_6HR,
        RPR_NUMBER_32_RIGHT_7HR,
        RPR_NUMBER_32_RIGHT_8HR,
        RPR_NUMBER_32_RIGHT_9HR,
        RPR_NUMBER_32_RIGHT_10HR,
        RPR_NUMBER_33_RIGHT_1HR,
        RPR_NUMBER_33_RIGHT_2HR,
        RPR_NUMBER_33_RIGHT_3HR,
        RPR_NUMBER_33_RIGHT_4HR,
        RPR_NUMBER_33_RIGHT_5HR,
        RPR_NUMBER_33_RIGHT_6HR,
        RPR_NUMBER_33_RIGHT_7HR,
        RPR_NUMBER_33_RIGHT_8HR,
        RPR_NUMBER_33_RIGHT_9HR,
        RPR_NUMBER_33_RIGHT_10HR,
        RPR_NUMBER_34_RIGHT_1HR,
        RPR_NUMBER_34_RIGHT_2HR,
        RPR_NUMBER_34_RIGHT_3HR,
        RPR_NUMBER_34_RIGHT_4HR,
        RPR_NUMBER_34_RIGHT_5HR,
        RPR_NUMBER_34_RIGHT_6HR,
        RPR_NUMBER_34_RIGHT_7HR,
        RPR_NUMBER_34_RIGHT_8HR,
        RPR_NUMBER_34_RIGHT_9HR,
        RPR_NUMBER_34_RIGHT_10HR,
        RPR_NUMBER_35_RIGHT_1HR,
        RPR_NUMBER_35_RIGHT_2HR,
        RPR_NUMBER_35_RIGHT_3HR,
        RPR_NUMBER_35_RIGHT_4HR,
        RPR_NUMBER_35_RIGHT_5HR,
        RPR_NUMBER_35_RIGHT_6HR,
        RPR_NUMBER_35_RIGHT_7HR,
        RPR_NUMBER_35_RIGHT_8HR,
        RPR_NUMBER_35_RIGHT_9HR,
        RPR_NUMBER_35_RIGHT_10HR,
        RPR_NUMBER_36_RIGHT_1HR,
        RPR_NUMBER_36_RIGHT_2HR,
        RPR_NUMBER_36_RIGHT_3HR,
        RPR_NUMBER_36_RIGHT_4HR,
        RPR_NUMBER_36_RIGHT_5HR,
        RPR_NUMBER_36_RIGHT_6HR,
        RPR_NUMBER_36_RIGHT_7HR,
        RPR_NUMBER_36_RIGHT_8HR,
        RPR_NUMBER_36_RIGHT_9HR,
        RPR_NUMBER_36_RIGHT_10HR,
        RPR_NUMBER_37_RIGHT_1HR,
        RPR_NUMBER_37_RIGHT_2HR,
        RPR_NUMBER_37_RIGHT_3HR,
        RPR_NUMBER_37_RIGHT_4HR,
        RPR_NUMBER_37_RIGHT_5HR,
        RPR_NUMBER_37_RIGHT_6HR,
        RPR_NUMBER_37_RIGHT_7HR,
        RPR_NUMBER_37_RIGHT_8HR,
        RPR_NUMBER_37_RIGHT_9HR,
        RPR_NUMBER_37_RIGHT_10HR,

        RPR_NUMBER_1_RIGHT_HALFHR,
        RPR_NUMBER_2_RIGHT_HALFHR,
        RPR_NUMBER_3_RIGHT_HALFHR,
        RPR_NUMBER_4_RIGHT_HALFHR,
        RPR_NUMBER_5_RIGHT_HALFHR,
        RPR_NUMBER_6_RIGHT_HALFHR,
        RPR_NUMBER_7_RIGHT_HALFHR,
        RPR_NUMBER_8_RIGHT_HALFHR,
        RPR_NUMBER_9_RIGHT_HALFHR,
        RPR_NUMBER_10_RIGHT_HALFHR,
        RPR_NUMBER_11_RIGHT_HALFHR,
        RPR_NUMBER_12_RIGHT_HALFHR,
        RPR_NUMBER_13_RIGHT_HALFHR,
        RPR_NUMBER_14_RIGHT_HALFHR,
        RPR_NUMBER_15_RIGHT_HALFHR,
        RPR_NUMBER_16_RIGHT_HALFHR,
        RPR_NUMBER_17_RIGHT_HALFHR,
        RPR_NUMBER_18_RIGHT_HALFHR,
        RPR_NUMBER_19_RIGHT_HALFHR,
        RPR_NUMBER_20_RIGHT_HALFHR,
        RPR_NUMBER_21_RIGHT_HALFHR,
        RPR_NUMBER_22_RIGHT_HALFHR,
        RPR_NUMBER_23_RIGHT_HALFHR,
        RPR_NUMBER_24_RIGHT_HALFHR,
        RPR_NUMBER_25_RIGHT_HALFHR,
        RPR_NUMBER_26_RIGHT_HALFHR,
        RPR_NUMBER_27_RIGHT_HALFHR,
        RPR_NUMBER_28_RIGHT_HALFHR,
        RPR_NUMBER_29_RIGHT_HALFHR,
        RPR_NUMBER_30_RIGHT_HALFHR,
        RPR_NUMBER_31_RIGHT_HALFHR,
        RPR_NUMBER_32_RIGHT_HALFHR,
        RPR_NUMBER_33_RIGHT_HALFHR,
        RPR_NUMBER_34_RIGHT_HALFHR,
        RPR_NUMBER_35_RIGHT_HALFHR,
        RPR_NUMBER_36_RIGHT_HALFHR,
        RPR_NUMBER_37_RIGHT_HALFHR,

        RPR_NUMBER_1_RIGHT_1_5HR,
        RPR_NUMBER_1_RIGHT_2_5HR,
        RPR_NUMBER_1_RIGHT_3_5HR,
        RPR_NUMBER_1_RIGHT_4_5HR,
        RPR_NUMBER_1_RIGHT_5_5HR,
        RPR_NUMBER_1_RIGHT_6_5HR,
        RPR_NUMBER_1_RIGHT_7_5HR,
        RPR_NUMBER_1_RIGHT_8_5HR,
        RPR_NUMBER_1_RIGHT_9_5HR,
        RPR_NUMBER_2_RIGHT_1_5HR,
        RPR_NUMBER_2_RIGHT_2_5HR,
        RPR_NUMBER_2_RIGHT_3_5HR,
        RPR_NUMBER_2_RIGHT_4_5HR,
        RPR_NUMBER_2_RIGHT_5_5HR,
        RPR_NUMBER_2_RIGHT_6_5HR,
        RPR_NUMBER_2_RIGHT_7_5HR,
        RPR_NUMBER_2_RIGHT_8_5HR,
        RPR_NUMBER_2_RIGHT_9_5HR,
        RPR_NUMBER_3_RIGHT_1_5HR,
        RPR_NUMBER_3_RIGHT_2_5HR,
        RPR_NUMBER_3_RIGHT_3_5HR,
        RPR_NUMBER_3_RIGHT_4_5HR,
        RPR_NUMBER_3_RIGHT_5_5HR,
        RPR_NUMBER_3_RIGHT_6_5HR,
        RPR_NUMBER_3_RIGHT_7_5HR,
        RPR_NUMBER_3_RIGHT_8_5HR,
        RPR_NUMBER_3_RIGHT_9_5HR,
        RPR_NUMBER_4_RIGHT_1_5HR,
        RPR_NUMBER_4_RIGHT_2_5HR,
        RPR_NUMBER_4_RIGHT_3_5HR,
        RPR_NUMBER_4_RIGHT_4_5HR,
        RPR_NUMBER_4_RIGHT_5_5HR,
        RPR_NUMBER_4_RIGHT_6_5HR,
        RPR_NUMBER_4_RIGHT_7_5HR,
        RPR_NUMBER_4_RIGHT_8_5HR,
        RPR_NUMBER_4_RIGHT_9_5HR,
        RPR_NUMBER_5_RIGHT_1_5HR,
        RPR_NUMBER_5_RIGHT_2_5HR,
        RPR_NUMBER_5_RIGHT_3_5HR,
        RPR_NUMBER_5_RIGHT_4_5HR,
        RPR_NUMBER_5_RIGHT_5_5HR,
        RPR_NUMBER_5_RIGHT_6_5HR,
        RPR_NUMBER_5_RIGHT_7_5HR,
        RPR_NUMBER_5_RIGHT_8_5HR,
        RPR_NUMBER_5_RIGHT_9_5HR,
        RPR_NUMBER_6_RIGHT_1_5HR,
        RPR_NUMBER_6_RIGHT_2_5HR,
        RPR_NUMBER_6_RIGHT_3_5HR,
        RPR_NUMBER_6_RIGHT_4_5HR,
        RPR_NUMBER_6_RIGHT_5_5HR,
        RPR_NUMBER_6_RIGHT_6_5HR,
        RPR_NUMBER_6_RIGHT_7_5HR,
        RPR_NUMBER_6_RIGHT_8_5HR,
        RPR_NUMBER_6_RIGHT_9_5HR,
        RPR_NUMBER_7_RIGHT_1_5HR,
        RPR_NUMBER_7_RIGHT_2_5HR,
        RPR_NUMBER_7_RIGHT_3_5HR,
        RPR_NUMBER_7_RIGHT_4_5HR,
        RPR_NUMBER_7_RIGHT_5_5HR,
        RPR_NUMBER_7_RIGHT_6_5HR,
        RPR_NUMBER_7_RIGHT_7_5HR,
        RPR_NUMBER_7_RIGHT_8_5HR,
        RPR_NUMBER_7_RIGHT_9_5HR,
        RPR_NUMBER_8_RIGHT_1_5HR,
        RPR_NUMBER_8_RIGHT_2_5HR,
        RPR_NUMBER_8_RIGHT_3_5HR,
        RPR_NUMBER_8_RIGHT_4_5HR,
        RPR_NUMBER_8_RIGHT_5_5HR,
        RPR_NUMBER_8_RIGHT_6_5HR,
        RPR_NUMBER_8_RIGHT_7_5HR,
        RPR_NUMBER_8_RIGHT_8_5HR,
        RPR_NUMBER_8_RIGHT_9_5HR,
        RPR_NUMBER_9_RIGHT_1_5HR,
        RPR_NUMBER_9_RIGHT_2_5HR,
        RPR_NUMBER_9_RIGHT_3_5HR,
        RPR_NUMBER_9_RIGHT_4_5HR,
        RPR_NUMBER_9_RIGHT_5_5HR,
        RPR_NUMBER_9_RIGHT_6_5HR,
        RPR_NUMBER_9_RIGHT_7_5HR,
        RPR_NUMBER_9_RIGHT_8_5HR,
        RPR_NUMBER_9_RIGHT_9_5HR,
        RPR_NUMBER_10_RIGHT_1_5HR,
        RPR_NUMBER_10_RIGHT_2_5HR,
        RPR_NUMBER_10_RIGHT_3_5HR,
        RPR_NUMBER_10_RIGHT_4_5HR,
        RPR_NUMBER_10_RIGHT_5_5HR,
        RPR_NUMBER_10_RIGHT_6_5HR,
        RPR_NUMBER_10_RIGHT_7_5HR,
        RPR_NUMBER_10_RIGHT_8_5HR,
        RPR_NUMBER_10_RIGHT_9_5HR,
        RPR_NUMBER_11_RIGHT_1_5HR,
        RPR_NUMBER_11_RIGHT_2_5HR,
        RPR_NUMBER_11_RIGHT_3_5HR,
        RPR_NUMBER_11_RIGHT_4_5HR,
        RPR_NUMBER_11_RIGHT_5_5HR,
        RPR_NUMBER_11_RIGHT_6_5HR,
        RPR_NUMBER_11_RIGHT_7_5HR,
        RPR_NUMBER_11_RIGHT_8_5HR,
        RPR_NUMBER_11_RIGHT_9_5HR,
        RPR_NUMBER_12_RIGHT_1_5HR,
        RPR_NUMBER_12_RIGHT_2_5HR,
        RPR_NUMBER_12_RIGHT_3_5HR,
        RPR_NUMBER_12_RIGHT_4_5HR,
        RPR_NUMBER_12_RIGHT_5_5HR,
        RPR_NUMBER_12_RIGHT_6_5HR,
        RPR_NUMBER_12_RIGHT_7_5HR,
        RPR_NUMBER_12_RIGHT_8_5HR,
        RPR_NUMBER_12_RIGHT_9_5HR,
        RPR_NUMBER_13_RIGHT_1_5HR,
        RPR_NUMBER_13_RIGHT_2_5HR,
        RPR_NUMBER_13_RIGHT_3_5HR,
        RPR_NUMBER_13_RIGHT_4_5HR,
        RPR_NUMBER_13_RIGHT_5_5HR,
        RPR_NUMBER_13_RIGHT_6_5HR,
        RPR_NUMBER_13_RIGHT_7_5HR,
        RPR_NUMBER_13_RIGHT_8_5HR,
        RPR_NUMBER_13_RIGHT_9_5HR,
        RPR_NUMBER_14_RIGHT_1_5HR,
        RPR_NUMBER_14_RIGHT_2_5HR,
        RPR_NUMBER_14_RIGHT_3_5HR,
        RPR_NUMBER_14_RIGHT_4_5HR,
        RPR_NUMBER_14_RIGHT_5_5HR,
        RPR_NUMBER_14_RIGHT_6_5HR,
        RPR_NUMBER_14_RIGHT_7_5HR,
        RPR_NUMBER_14_RIGHT_8_5HR,
        RPR_NUMBER_14_RIGHT_9_5HR,
        RPR_NUMBER_15_RIGHT_1_5HR,
        RPR_NUMBER_15_RIGHT_2_5HR,
        RPR_NUMBER_15_RIGHT_3_5HR,
        RPR_NUMBER_15_RIGHT_4_5HR,
        RPR_NUMBER_15_RIGHT_5_5HR,
        RPR_NUMBER_15_RIGHT_6_5HR,
        RPR_NUMBER_15_RIGHT_7_5HR,
        RPR_NUMBER_15_RIGHT_8_5HR,
        RPR_NUMBER_15_RIGHT_9_5HR,
        RPR_NUMBER_16_RIGHT_1_5HR,
        RPR_NUMBER_16_RIGHT_2_5HR,
        RPR_NUMBER_16_RIGHT_3_5HR,
        RPR_NUMBER_16_RIGHT_4_5HR,
        RPR_NUMBER_16_RIGHT_5_5HR,
        RPR_NUMBER_16_RIGHT_6_5HR,
        RPR_NUMBER_16_RIGHT_7_5HR,
        RPR_NUMBER_16_RIGHT_8_5HR,
        RPR_NUMBER_16_RIGHT_9_5HR,
        RPR_NUMBER_17_RIGHT_1_5HR,
        RPR_NUMBER_17_RIGHT_2_5HR,
        RPR_NUMBER_17_RIGHT_3_5HR,
        RPR_NUMBER_17_RIGHT_4_5HR,
        RPR_NUMBER_17_RIGHT_5_5HR,
        RPR_NUMBER_17_RIGHT_6_5HR,
        RPR_NUMBER_17_RIGHT_7_5HR,
        RPR_NUMBER_17_RIGHT_8_5HR,
        RPR_NUMBER_17_RIGHT_9_5HR,
        RPR_NUMBER_18_RIGHT_1_5HR,
        RPR_NUMBER_18_RIGHT_2_5HR,
        RPR_NUMBER_18_RIGHT_3_5HR,
        RPR_NUMBER_18_RIGHT_4_5HR,
        RPR_NUMBER_18_RIGHT_5_5HR,
        RPR_NUMBER_18_RIGHT_6_5HR,
        RPR_NUMBER_18_RIGHT_7_5HR,
        RPR_NUMBER_18_RIGHT_8_5HR,
        RPR_NUMBER_18_RIGHT_9_5HR,
        RPR_NUMBER_19_RIGHT_1_5HR,
        RPR_NUMBER_19_RIGHT_2_5HR,
        RPR_NUMBER_19_RIGHT_3_5HR,
        RPR_NUMBER_19_RIGHT_4_5HR,
        RPR_NUMBER_19_RIGHT_5_5HR,
        RPR_NUMBER_19_RIGHT_6_5HR,
        RPR_NUMBER_19_RIGHT_7_5HR,
        RPR_NUMBER_19_RIGHT_8_5HR,
        RPR_NUMBER_19_RIGHT_9_5HR,
        RPR_NUMBER_20_RIGHT_1_5HR,
        RPR_NUMBER_20_RIGHT_2_5HR,
        RPR_NUMBER_20_RIGHT_3_5HR,
        RPR_NUMBER_20_RIGHT_4_5HR,
        RPR_NUMBER_20_RIGHT_5_5HR,
        RPR_NUMBER_20_RIGHT_6_5HR,
        RPR_NUMBER_20_RIGHT_7_5HR,
        RPR_NUMBER_20_RIGHT_8_5HR,
        RPR_NUMBER_20_RIGHT_9_5HR,
        RPR_NUMBER_21_RIGHT_1_5HR,
        RPR_NUMBER_21_RIGHT_2_5HR,
        RPR_NUMBER_21_RIGHT_3_5HR,
        RPR_NUMBER_21_RIGHT_4_5HR,
        RPR_NUMBER_21_RIGHT_5_5HR,
        RPR_NUMBER_21_RIGHT_6_5HR,
        RPR_NUMBER_21_RIGHT_7_5HR,
        RPR_NUMBER_21_RIGHT_8_5HR,
        RPR_NUMBER_21_RIGHT_9_5HR,
        RPR_NUMBER_22_RIGHT_1_5HR,
        RPR_NUMBER_22_RIGHT_2_5HR,
        RPR_NUMBER_22_RIGHT_3_5HR,
        RPR_NUMBER_22_RIGHT_4_5HR,
        RPR_NUMBER_22_RIGHT_5_5HR,
        RPR_NUMBER_22_RIGHT_6_5HR,
        RPR_NUMBER_22_RIGHT_7_5HR,
        RPR_NUMBER_22_RIGHT_8_5HR,
        RPR_NUMBER_22_RIGHT_9_5HR,
        RPR_NUMBER_23_RIGHT_1_5HR,
        RPR_NUMBER_23_RIGHT_2_5HR,
        RPR_NUMBER_23_RIGHT_3_5HR,
        RPR_NUMBER_23_RIGHT_4_5HR,
        RPR_NUMBER_23_RIGHT_5_5HR,
        RPR_NUMBER_23_RIGHT_6_5HR,
        RPR_NUMBER_23_RIGHT_7_5HR,
        RPR_NUMBER_23_RIGHT_8_5HR,
        RPR_NUMBER_23_RIGHT_9_5HR,
        RPR_NUMBER_24_RIGHT_1_5HR,
        RPR_NUMBER_24_RIGHT_2_5HR,
        RPR_NUMBER_24_RIGHT_3_5HR,
        RPR_NUMBER_24_RIGHT_4_5HR,
        RPR_NUMBER_24_RIGHT_5_5HR,
        RPR_NUMBER_24_RIGHT_6_5HR,
        RPR_NUMBER_24_RIGHT_7_5HR,
        RPR_NUMBER_24_RIGHT_8_5HR,
        RPR_NUMBER_24_RIGHT_9_5HR,
        RPR_NUMBER_25_RIGHT_1_5HR,
        RPR_NUMBER_25_RIGHT_2_5HR,
        RPR_NUMBER_25_RIGHT_3_5HR,
        RPR_NUMBER_25_RIGHT_4_5HR,
        RPR_NUMBER_25_RIGHT_5_5HR,
        RPR_NUMBER_25_RIGHT_6_5HR,
        RPR_NUMBER_25_RIGHT_7_5HR,
        RPR_NUMBER_25_RIGHT_8_5HR,
        RPR_NUMBER_25_RIGHT_9_5HR,
        RPR_NUMBER_26_RIGHT_1_5HR,
        RPR_NUMBER_26_RIGHT_2_5HR,
        RPR_NUMBER_26_RIGHT_3_5HR,
        RPR_NUMBER_26_RIGHT_4_5HR,
        RPR_NUMBER_26_RIGHT_5_5HR,
        RPR_NUMBER_26_RIGHT_6_5HR,
        RPR_NUMBER_26_RIGHT_7_5HR,
        RPR_NUMBER_26_RIGHT_8_5HR,
        RPR_NUMBER_26_RIGHT_9_5HR,
        RPR_NUMBER_27_RIGHT_1_5HR,
        RPR_NUMBER_27_RIGHT_2_5HR,
        RPR_NUMBER_27_RIGHT_3_5HR,
        RPR_NUMBER_27_RIGHT_4_5HR,
        RPR_NUMBER_27_RIGHT_5_5HR,
        RPR_NUMBER_27_RIGHT_6_5HR,
        RPR_NUMBER_27_RIGHT_7_5HR,
        RPR_NUMBER_27_RIGHT_8_5HR,
        RPR_NUMBER_27_RIGHT_9_5HR,
        RPR_NUMBER_28_RIGHT_1_5HR,
        RPR_NUMBER_28_RIGHT_2_5HR,
        RPR_NUMBER_28_RIGHT_3_5HR,
        RPR_NUMBER_28_RIGHT_4_5HR,
        RPR_NUMBER_28_RIGHT_5_5HR,
        RPR_NUMBER_28_RIGHT_6_5HR,
        RPR_NUMBER_28_RIGHT_7_5HR,
        RPR_NUMBER_28_RIGHT_8_5HR,
        RPR_NUMBER_28_RIGHT_9_5HR,
        RPR_NUMBER_29_RIGHT_1_5HR,
        RPR_NUMBER_29_RIGHT_2_5HR,
        RPR_NUMBER_29_RIGHT_3_5HR,
        RPR_NUMBER_29_RIGHT_4_5HR,
        RPR_NUMBER_29_RIGHT_5_5HR,
        RPR_NUMBER_29_RIGHT_6_5HR,
        RPR_NUMBER_29_RIGHT_7_5HR,
        RPR_NUMBER_29_RIGHT_8_5HR,
        RPR_NUMBER_29_RIGHT_9_5HR,
        RPR_NUMBER_30_RIGHT_1_5HR,
        RPR_NUMBER_30_RIGHT_2_5HR,
        RPR_NUMBER_30_RIGHT_3_5HR,
        RPR_NUMBER_30_RIGHT_4_5HR,
        RPR_NUMBER_30_RIGHT_5_5HR,
        RPR_NUMBER_30_RIGHT_6_5HR,
        RPR_NUMBER_30_RIGHT_7_5HR,
        RPR_NUMBER_30_RIGHT_8_5HR,
        RPR_NUMBER_30_RIGHT_9_5HR,
        RPR_NUMBER_31_RIGHT_1_5HR,
        RPR_NUMBER_31_RIGHT_2_5HR,
        RPR_NUMBER_31_RIGHT_3_5HR,
        RPR_NUMBER_31_RIGHT_4_5HR,
        RPR_NUMBER_31_RIGHT_5_5HR,
        RPR_NUMBER_31_RIGHT_6_5HR,
        RPR_NUMBER_31_RIGHT_7_5HR,
        RPR_NUMBER_31_RIGHT_8_5HR,
        RPR_NUMBER_31_RIGHT_9_5HR,
        RPR_NUMBER_32_RIGHT_1_5HR,
        RPR_NUMBER_32_RIGHT_2_5HR,
        RPR_NUMBER_32_RIGHT_3_5HR,
        RPR_NUMBER_32_RIGHT_4_5HR,
        RPR_NUMBER_32_RIGHT_5_5HR,
        RPR_NUMBER_32_RIGHT_6_5HR,
        RPR_NUMBER_32_RIGHT_7_5HR,
        RPR_NUMBER_32_RIGHT_8_5HR,
        RPR_NUMBER_32_RIGHT_9_5HR,
        RPR_NUMBER_33_RIGHT_1_5HR,
        RPR_NUMBER_33_RIGHT_2_5HR,
        RPR_NUMBER_33_RIGHT_3_5HR,
        RPR_NUMBER_33_RIGHT_4_5HR,
        RPR_NUMBER_33_RIGHT_5_5HR,
        RPR_NUMBER_33_RIGHT_6_5HR,
        RPR_NUMBER_33_RIGHT_7_5HR,
        RPR_NUMBER_33_RIGHT_8_5HR,
        RPR_NUMBER_33_RIGHT_9_5HR,
        RPR_NUMBER_34_RIGHT_1_5HR,
        RPR_NUMBER_34_RIGHT_2_5HR,
        RPR_NUMBER_34_RIGHT_3_5HR,
        RPR_NUMBER_34_RIGHT_4_5HR,
        RPR_NUMBER_34_RIGHT_5_5HR,
        RPR_NUMBER_34_RIGHT_6_5HR,
        RPR_NUMBER_34_RIGHT_7_5HR,
        RPR_NUMBER_34_RIGHT_8_5HR,
        RPR_NUMBER_34_RIGHT_9_5HR,
        RPR_NUMBER_35_RIGHT_1_5HR,
        RPR_NUMBER_35_RIGHT_2_5HR,
        RPR_NUMBER_35_RIGHT_3_5HR,
        RPR_NUMBER_35_RIGHT_4_5HR,
        RPR_NUMBER_35_RIGHT_5_5HR,
        RPR_NUMBER_35_RIGHT_6_5HR,
        RPR_NUMBER_35_RIGHT_7_5HR,
        RPR_NUMBER_35_RIGHT_8_5HR,
        RPR_NUMBER_35_RIGHT_9_5HR,
        RPR_NUMBER_36_RIGHT_1_5HR,
        RPR_NUMBER_36_RIGHT_2_5HR,
        RPR_NUMBER_36_RIGHT_3_5HR,
        RPR_NUMBER_36_RIGHT_4_5HR,
        RPR_NUMBER_36_RIGHT_5_5HR,
        RPR_NUMBER_36_RIGHT_6_5HR,
        RPR_NUMBER_36_RIGHT_7_5HR,
        RPR_NUMBER_36_RIGHT_8_5HR,
        RPR_NUMBER_36_RIGHT_9_5HR,
        RPR_NUMBER_37_RIGHT_1_5HR,
        RPR_NUMBER_37_RIGHT_2_5HR,
        RPR_NUMBER_37_RIGHT_3_5HR,
        RPR_NUMBER_37_RIGHT_4_5HR,
        RPR_NUMBER_37_RIGHT_5_5HR,
        RPR_NUMBER_37_RIGHT_6_5HR,
        RPR_NUMBER_37_RIGHT_7_5HR,
        RPR_NUMBER_37_RIGHT_8_5HR,
        RPR_NUMBER_37_RIGHT_9_5HR,

        RPRFBC_1HR,
        RPRFBC_2HR,
        RPRFBC_3HR,
        RPRFBC_4HR,
        RPRFBC_5HR,
        RPRFBC_6HR,
        RPRFBC_7HR,
        RPRFBC_8HR,
        RPRFBC_9HR,
        RPRFBC_10HR,
        RPRFBC_HALFHR,
        RPRFBC_1_5HR,
        RPRFBC_2_5HR,
        RPRFBC_3_5HR,
        RPRFBC_4_5HR,
        RPRFBC_5_5HR,
        RPRFBC_6_5HR,
        RPRFBC_7_5HR,
        RPRFBC_8_5HR,
        RPRFBC_9_5HR,
        RPRFB_1HR,
        RPRFB_2HR,
        RPRFB_3HR,
        RPRFB_4HR,
        RPRFB_5HR,
        RPRFB_6HR,
        RPRFB_7HR,
        RPRFB_8HR,
        RPRFB_9HR,
        RPRFB_10HR,
        RPRFB_HALFHR,
        RPRFB_1_5HR,
        RPRFB_2_5HR,
        RPRFB_3_5HR,
        RPRFB_4_5HR,
        RPRFB_5_5HR,
        RPRFB_6_5HR,
        RPRFB_7_5HR,
        RPRFB_8_5HR,
        RPRFB_9_5HR,

        RPRRBC_1HR,
        RPRRBC_2HR,
        RPRRBC_3HR,
        RPRRBC_4HR,
        RPRRBC_5HR,
        RPRRBC_6HR,
        RPRRBC_7HR,
        RPRRBC_8HR,
        RPRRBC_9HR,
        RPRRBC_10HR,
        RPRRBC_HALFHR,
        RPRRBC_1_5HR,
        RPRRBC_2_5HR,
        RPRRBC_3_5HR,
        RPRRBC_4_5HR,
        RPRRBC_5_5HR,
        RPRRBC_6_5HR,
        RPRRBC_7_5HR,
        RPRRBC_8_5HR,
        RPRRBC_9_5HR,
        RPRRB_1HR,
        RPRRB_2HR,
        RPRRB_3HR,
        RPRRB_4HR,
        RPRRB_5HR,
        RPRRB_6HR,
        RPRRB_7HR,
        RPRRB_8HR,
        RPRRB_9HR,
        RPRRB_10HR,
        RPRRB_HALFHR,
        RPRRB_1_5HR,
        RPRRB_2_5HR,
        RPRRB_3_5HR,
        RPRRB_4_5HR,
        RPRRB_5_5HR,
        RPRRB_6_5HR,
        RPRRB_7_5HR,
        RPRRB_8_5HR,
        RPRRB_9_5HR,
        RPRBB_1HR,
        RPRBB_2HR,
        RPRBB_3HR,
        RPRBB_4HR,
        RPRBB_5HR,
        RPRBB_6HR,
        RPRBB_7HR,
        RPRBB_8HR,
        RPRBB_9HR,
        RPRBB_10HR,
        RPRBB_HALFHR,
        RPRBB_1_5HR,
        RPRBB_2_5HR,
        RPRBB_3_5HR,
        RPRBB_4_5HR,
        RPRBB_5_5HR,
        RPRBB_6_5HR,
        RPRBB_7_5HR,
        RPRBB_8_5HR,
        RPRBB_9_5HR,

        RPRLF_1HR,
        RPRLF_2HR,
        RPRLF_3HR,
        RPRLF_4HR,
        RPRLF_5HR,
        RPRLF_6HR,
        RPRLF_7HR,
        RPRLF_8HR,
        RPRLF_9HR,
        RPRLF_10HR,
        RPRLF_HALFHR,
        RPRLF_1_5HR,
        RPRLF_2_5HR,
        RPRLF_3_5HR,
        RPRLF_4_5HR,
        RPRLF_5_5HR,
        RPRLF_6_5HR,
        RPRLF_7_5HR,
        RPRLF_8_5HR,
        RPRLF_9_5HR,
        RPRRF_1HR,
        RPRRF_2HR,
        RPRRF_3HR,
        RPRRF_4HR,
        RPRRF_5HR,
        RPRRF_6HR,
        RPRRF_7HR,
        RPRRF_8HR,
        RPRRF_9HR,
        RPRRF_10HR,
        RPRRF_HALFHR,
        RPRRF_1_5HR,
        RPRRF_2_5HR,
        RPRRF_3_5HR,
        RPRRF_4_5HR,
        RPRRF_5_5HR,
        RPRRF_6_5HR,
        RPRRF_7_5HR,
        RPRRF_8_5HR,
        RPRRF_9_5HR,

        RPRLFD_1HR,
        RPRLFD_2HR,
        RPRLFD_3HR,
        RPRLFD_4HR,
        RPRLFD_5HR,
        RPRLFD_6HR,
        RPRLFD_7HR,
        RPRLFD_8HR,
        RPRLFD_9HR,
        RPRLFD_10HR,
        RPRLFD_HALFHR,
        RPRLFD_1_5HR,
        RPRLFD_2_5HR,
        RPRLFD_3_5HR,
        RPRLFD_4_5HR,
        RPRLFD_5_5HR,
        RPRLFD_6_5HR,
        RPRLFD_7_5HR,
        RPRLFD_8_5HR,
        RPRLFD_9_5HR,
        RPRRFD_1HR,
        RPRRFD_2HR,
        RPRRFD_3HR,
        RPRRFD_4HR,
        RPRRFD_5HR,
        RPRRFD_6HR,
        RPRRFD_7HR,
        RPRRFD_8HR,
        RPRRFD_9HR,
        RPRRFD_10HR,
        RPRRFD_HALFHR,
        RPRRFD_1_5HR,
        RPRRFD_2_5HR,
        RPRRFD_3_5HR,
        RPRRFD_4_5HR,
        RPRRFD_5_5HR,
        RPRRFD_6_5HR,
        RPRRFD_7_5HR,
        RPRRFD_8_5HR,
        RPRRFD_9_5HR,

        RPRLRD_1HR,
        RPRLRD_2HR,
        RPRLRD_3HR,
        RPRLRD_4HR,
        RPRLRD_5HR,
        RPRLRD_6HR,
        RPRLRD_7HR,
        RPRLRD_8HR,
        RPRLRD_9HR,
        RPRLRD_10HR,
        RPRLRD_HALFHR,
        RPRLRD_1_5HR,
        RPRLRD_2_5HR,
        RPRLRD_3_5HR,
        RPRLRD_4_5HR,
        RPRLRD_5_5HR,
        RPRLRD_6_5HR,
        RPRLRD_7_5HR,
        RPRLRD_8_5HR,
        RPRLRD_9_5HR,
        RPRRRD_1HR,
        RPRRRD_2HR,
        RPRRRD_3HR,
        RPRRRD_4HR,
        RPRRRD_5HR,
        RPRRRD_6HR,
        RPRRRD_7HR,
        RPRRRD_8HR,
        RPRRRD_9HR,
        RPRRRD_10HR,
        RPRRRD_HALFHR,
        RPRRRD_1_5HR,
        RPRRRD_2_5HR,
        RPRRRD_3_5HR,
        RPRRRD_4_5HR,
        RPRRRD_5_5HR,
        RPRRRD_6_5HR,
        RPRRRD_7_5HR,
        RPRRRD_8_5HR,
        RPRRRD_9_5HR,

        RPRLSLD_1HR,
        RPRLSLD_2HR,
        RPRLSLD_3HR,
        RPRLSLD_4HR,
        RPRLSLD_5HR,
        RPRLSLD_6HR,
        RPRLSLD_7HR,
        RPRLSLD_8HR,
        RPRLSLD_9HR,
        RPRLSLD_10HR,
        RPRLSLD_HALFHR,
        RPRLSLD_1_5HR,
        RPRLSLD_2_5HR,
        RPRLSLD_3_5HR,
        RPRLSLD_4_5HR,
        RPRLSLD_5_5HR,
        RPRLSLD_6_5HR,
        RPRLSLD_7_5HR,
        RPRLSLD_8_5HR,
        RPRLSLD_9_5HR,
        RPRRSLD_1HR,
        RPRRSLD_2HR,
        RPRRSLD_3HR,
        RPRRSLD_4HR,
        RPRRSLD_5HR,
        RPRRSLD_6HR,
        RPRRSLD_7HR,
        RPRRSLD_8HR,
        RPRRSLD_9HR,
        RPRRSLD_10HR,
        RPRRSLD_HALFHR,
        RPRRSLD_1_5HR,
        RPRRSLD_2_5HR,
        RPRRSLD_3_5HR,
        RPRRSLD_4_5HR,
        RPRRSLD_5_5HR,
        RPRRSLD_6_5HR,
        RPRRSLD_7_5HR,
        RPRRSLD_8_5HR,
        RPRRSLD_9_5HR,

        RPRLRM_1HR,
        RPRLRM_2HR,
        RPRLRM_3HR,
        RPRLRM_4HR,
        RPRLRM_5HR,
        RPRLRM_6HR,
        RPRLRM_7HR,
        RPRLRM_8HR,
        RPRLRM_9HR,
        RPRLRM_10HR,
        RPRLRM_HALFHR,
        RPRLRM_1_5HR,
        RPRLRM_2_5HR,
        RPRLRM_3_5HR,
        RPRLRM_4_5HR,
        RPRLRM_5_5HR,
        RPRLRM_6_5HR,
        RPRLRM_7_5HR,
        RPRLRM_8_5HR,
        RPRLRM_9_5HR,
        RPRLR_1HR,
        RPRLR_2HR,
        RPRLR_3HR,
        RPRLR_4HR,
        RPRLR_5HR,
        RPRLR_6HR,
        RPRLR_7HR,
        RPRLR_8HR,
        RPRLR_9HR,
        RPRLR_10HR,
        RPRLR_HALFHR,
        RPRLR_1_5HR,
        RPRLR_2_5HR,
        RPRLR_3_5HR,
        RPRLR_4_5HR,
        RPRLR_5_5HR,
        RPRLR_6_5HR,
        RPRLR_7_5HR,
        RPRLR_8_5HR,
        RPRLR_9_5HR,

        RPRRRM_1HR,
        RPRRRM_2HR,
        RPRRRM_3HR,
        RPRRRM_4HR,
        RPRRRM_5HR,
        RPRRRM_6HR,
        RPRRRM_7HR,
        RPRRRM_8HR,
        RPRRRM_9HR,
        RPRRRM_10HR,
        RPRRRM_HALFHR,
        RPRRRM_1_5HR,
        RPRRRM_2_5HR,
        RPRRRM_3_5HR,
        RPRRRM_4_5HR,
        RPRRRM_5_5HR,
        RPRRRM_6_5HR,
        RPRRRM_7_5HR,
        RPRRRM_8_5HR,
        RPRRRM_9_5HR,
        RPRRR_1HR,
        RPRRR_2HR,
        RPRRR_3HR,
        RPRRR_4HR,
        RPRRR_5HR,
        RPRRR_6HR,
        RPRRR_7HR,
        RPRRR_8HR,
        RPRRR_9HR,
        RPRRR_10HR,
        RPRRR_HALFHR,
        RPRRR_1_5HR,
        RPRRR_2_5HR,
        RPRRR_3_5HR,
        RPRRR_4_5HR,
        RPRRR_5_5HR,
        RPRRR_6_5HR,
        RPRRR_7_5HR,
        RPRRR_8_5HR,
        RPRRR_9_5HR,

        RPRLQP_1HR,
        RPRLQP_2HR,
        RPRLQP_3HR,
        RPRLQP_4HR,
        RPRLQP_5HR,
        RPRLQP_6HR,
        RPRLQP_7HR,
        RPRLQP_8HR,
        RPRLQP_9HR,
        RPRLQP_10HR,
        RPRLQP_HALFHR,
        RPRLQP_1_5HR,
        RPRLQP_2_5HR,
        RPRLQP_3_5HR,
        RPRLQP_4_5HR,
        RPRLQP_5_5HR,
        RPRLQP_6_5HR,
        RPRLQP_7_5HR,
        RPRLQP_8_5HR,
        RPRLQP_9_5HR,
        RPRRQP_1HR,
        RPRRQP_2HR,
        RPRRQP_3HR,
        RPRRQP_4HR,
        RPRRQP_5HR,
        RPRRQP_6HR,
        RPRRQP_7HR,
        RPRRQP_8HR,
        RPRRQP_9HR,
        RPRRQP_10HR,
        RPRRQP_HALFHR,
        RPRRQP_1_5HR,
        RPRRQP_2_5HR,
        RPRRQP_3_5HR,
        RPRRQP_4_5HR,
        RPRRQP_5_5HR,
        RPRRQP_6_5HR,
        RPRRQP_7_5HR,
        RPRRQP_8_5HR,
        RPRRQP_9_5HR,
        RPRLQ_1HR,
        RPRLQ_2HR,
        RPRLQ_3HR,
        RPRLQ_4HR,
        RPRLQ_5HR,
        RPRLQ_6HR,
        RPRLQ_7HR,
        RPRLQ_8HR,
        RPRLQ_9HR,
        RPRLQ_10HR,
        RPRLQ_HALFHR,
        RPRLQ_1_5HR,
        RPRLQ_2_5HR,
        RPRLQ_3_5HR,
        RPRLQ_4_5HR,
        RPRLQ_5_5HR,
        RPRLQ_6_5HR,
        RPRLQ_7_5HR,
        RPRLQ_8_5HR,
        RPRLQ_9_5HR,
        RPRRQ_1HR,
        RPRRQ_2HR,
        RPRRQ_3HR,
        RPRRQ_4HR,
        RPRRQ_5HR,
        RPRRQ_6HR,
        RPRRQ_7HR,
        RPRRQ_8HR,
        RPRRQ_9HR,
        RPRRQ_10HR,
        RPRRQ_HALFHR,
        RPRRQ_1_5HR,
        RPRRQ_2_5HR,
        RPRRQ_3_5HR,
        RPRRQ_4_5HR,
        RPRRQ_5_5HR,
        RPRRQ_6_5HR,
        RPRRQ_7_5HR,
        RPRRQ_8_5HR,
        RPRRQ_9_5HR,

        RPRLSP_1HR,
        RPRLSP_2HR,
        RPRLSP_3HR,
        RPRLSP_4HR,
        RPRLSP_5HR,
        RPRLSP_6HR,
        RPRLSP_7HR,
        RPRLSP_8HR,
        RPRLSP_9HR,
        RPRLSP_10HR,
        RPRLSP_HALFHR,
        RPRLSP_1_5HR,
        RPRLSP_2_5HR,
        RPRLSP_3_5HR,
        RPRLSP_4_5HR,
        RPRLSP_5_5HR,
        RPRLSP_6_5HR,
        RPRLSP_7_5HR,
        RPRLSP_8_5HR,
        RPRLSP_9_5HR,
        RPRRSP_1HR,
        RPRRSP_2HR,
        RPRRSP_3HR,
        RPRRSP_4HR,
        RPRRSP_5HR,
        RPRRSP_6HR,
        RPRRSP_7HR,
        RPRRSP_8HR,
        RPRRSP_9HR,
        RPRRSP_10HR,
        RPRRSP_HALFHR,
        RPRRSP_1_5HR,
        RPRRSP_2_5HR,
        RPRRSP_3_5HR,
        RPRRSP_4_5HR,
        RPRRSP_5_5HR,
        RPRRSP_6_5HR,
        RPRRSP_7_5HR,
        RPRRSP_8_5HR,
        RPRRSP_9_5HR,

        RPRLPP_1HR,
        RPRLPP_2HR,
        RPRLPP_3HR,
        RPRLPP_4HR,
        RPRLPP_5HR,
        RPRLPP_6HR,
        RPRLPP_7HR,
        RPRLPP_8HR,
        RPRLPP_9HR,
        RPRLPP_10HR,
        RPRLPP_HALFHR,
        RPRLPP_1_5HR,
        RPRLPP_2_5HR,
        RPRLPP_3_5HR,
        RPRLPP_4_5HR,
        RPRLPP_5_5HR,
        RPRLPP_6_5HR,
        RPRLPP_7_5HR,
        RPRLPP_8_5HR,
        RPRLPP_9_5HR,
        RPRRPP_1HR,
        RPRRPP_2HR,
        RPRRPP_3HR,
        RPRRPP_4HR,
        RPRRPP_5HR,
        RPRRPP_6HR,
        RPRRPP_7HR,
        RPRRPP_8HR,
        RPRRPP_9HR,
        RPRRPP_10HR,
        RPRRPP_HALFHR,
        RPRRPP_1_5HR,
        RPRRPP_2_5HR,
        RPRRPP_3_5HR,
        RPRRPP_4_5HR,
        RPRRPP_5_5HR,
        RPRRPP_6_5HR,
        RPRRPP_7_5HR,
        RPRRPP_8_5HR,
        RPRRPP_9_5HR,

        RPRHOOD_1HR,
        RPRHOOD_2HR,
        RPRHOOD_3HR,
        RPRHOOD_4HR,
        RPRHOOD_5HR,
        RPRHOOD_6HR,
        RPRHOOD_7HR,
        RPRHOOD_8HR,
        RPRHOOD_9HR,
        RPRHOOD_10HR,
        RPRHOOD_HALFHR,
        RPRHOOD_1_5HR,
        RPRHOOD_2_5HR,
        RPRHOOD_3_5HR,
        RPRHOOD_4_5HR,
        RPRHOOD_5_5HR,
        RPRHOOD_6_5HR,
        RPRHOOD_7_5HR,
        RPRHOOD_8_5HR,
        RPRHOOD_9_5HR,

        RPRROOF_1HR,
        RPRROOF_2HR,
        RPRROOF_3HR,
        RPRROOF_4HR,
        RPRROOF_5HR,
        RPRROOF_6HR,
        RPRROOF_7HR,
        RPRROOF_8HR,
        RPRROOF_9HR,
        RPRROOF_10HR,
        RPRROOF_HALFHR,
        RPRROOF_1_5HR,
        RPRROOF_2_5HR,
        RPRROOF_3_5HR,
        RPRROOF_4_5HR,
        RPRROOF_5_5HR,
        RPRROOF_6_5HR,
        RPRROOF_7_5HR,
        RPRROOF_8_5HR,
        RPRROOF_9_5HR,

        RPRTRUNKLID_1HR,
        RPRTRUNKLID_2HR,
        RPRTRUNKLID_3HR,
        RPRTRUNKLID_4HR,
        RPRTRUNKLID_5HR,
        RPRTRUNKLID_6HR,
        RPRTRUNKLID_7HR,
        RPRTRUNKLID_8HR,
        RPRTRUNKLID_9HR,
        RPRTRUNKLID_10HR,
        RPRTRUNKLID_HALFHR,
        RPRTRUNKLID_1_5HR,
        RPRTRUNKLID_2_5HR,
        RPRTRUNKLID_3_5HR,
        RPRTRUNKLID_4_5HR,
        RPRTRUNKLID_5_5HR,
        RPRTRUNKLID_6_5HR,
        RPRTRUNKLID_7_5HR,
        RPRTRUNKLID_8_5HR,
        RPRTRUNKLID_9_5HR,
        RPRTRUNK_1HR,
        RPRTRUNK_2HR,
        RPRTRUNK_3HR,
        RPRTRUNK_4HR,
        RPRTRUNK_5HR,
        RPRTRUNK_6HR,
        RPRTRUNK_7HR,
        RPRTRUNK_8HR,
        RPRTRUNK_9HR,
        RPRTRUNK_10HR,
        RPRTRUNK_HALFHR,
        RPRTRUNK_1_5HR,
        RPRTRUNK_2_5HR,
        RPRTRUNK_3_5HR,
        RPRTRUNK_4_5HR,
        RPRTRUNK_5_5HR,
        RPRTRUNK_6_5HR,
        RPRTRUNK_7_5HR,
        RPRTRUNK_8_5HR,
        RPRTRUNK_9_5HR,

        RPRLIFTGATE_1HR,
        RPRLIFTGATE_2HR,
        RPRLIFTGATE_3HR,
        RPRLIFTGATE_4HR,
        RPRLIFTGATE_5HR,
        RPRLIFTGATE_6HR,
        RPRLIFTGATE_7HR,
        RPRLIFTGATE_8HR,
        RPRLIFTGATE_9HR,
        RPRLIFTGATE_10HR,
        RPRLIFTGATE_HALFHR,
        RPRLIFTGATE_1_5HR,
        RPRLIFTGATE_2_5HR,
        RPRLIFTGATE_3_5HR,
        RPRLIFTGATE_4_5HR,
        RPRLIFTGATE_5_5HR,
        RPRLIFTGATE_6_5HR,
        RPRLIFTGATE_7_5HR,
        RPRLIFTGATE_8_5HR,
        RPRLIFTGATE_9_5HR,

        RPRBACKDOOR_1HR,
        RPRBACKDOOR_2HR,
        RPRBACKDOOR_3HR,
        RPRBACKDOOR_4HR,
        RPRBACKDOOR_5HR,
        RPRBACKDOOR_6HR,
        RPRBACKDOOR_7HR,
        RPRBACKDOOR_8HR,
        RPRBACKDOOR_9HR,
        RPRBACKDOOR_10HR,
        RPRBACKDOOR_HALFHR,
        RPRBACKDOOR_1_5HR,
        RPRBACKDOOR_2_5HR,
        RPRBACKDOOR_3_5HR,
        RPRBACKDOOR_4_5HR,
        RPRBACKDOOR_5_5HR,
        RPRBACKDOOR_6_5HR,
        RPRBACKDOOR_7_5HR,
        RPRBACKDOOR_8_5HR,
        RPRBACKDOOR_9_5HR,

        RNI_NUMBER_1,
        RNI_NUMBER_2,
        RNI_NUMBER_3,
        RNI_NUMBER_4,
        RNI_NUMBER_5,
        RNI_NUMBER_6,
        RNI_NUMBER_7,
        RNI_NUMBER_8,
        RNI_NUMBER_9,
        RNI_NUMBER_10,
        RNI_NUMBER_11,
        RNI_NUMBER_12,
        RNI_NUMBER_13,
        RNI_NUMBER_14,
        RNI_NUMBER_15,
        RNI_NUMBER_16,
        RNI_NUMBER_17,
        RNI_NUMBER_18,
        RNI_NUMBER_19,
        RNI_NUMBER_20,
        RNI_NUMBER_21,
        RNI_NUMBER_22,
        RNI_NUMBER_23,
        RNI_NUMBER_24,
        RNI_NUMBER_25,
        RNI_NUMBER_26,
        RNI_NUMBER_27,
        RNI_NUMBER_28,
        RNI_NUMBER_29,
        RNI_NUMBER_30,
        RNI_NUMBER_31,
        RNI_NUMBER_32,
        RNI_NUMBER_33,
        RNI_NUMBER_34,
        RNI_NUMBER_35,
        RNI_NUMBER_36,
        RNI_NUMBER_37,

        RNI_NUMBER_1_LEFT,
        RNI_NUMBER_2_LEFT,
        RNI_NUMBER_3_LEFT,
        RNI_NUMBER_4_LEFT,
        RNI_NUMBER_5_LEFT,
        RNI_NUMBER_6_LEFT,
        RNI_NUMBER_7_LEFT,
        RNI_NUMBER_8_LEFT,
        RNI_NUMBER_9_LEFT,
        RNI_NUMBER_10_LEFT,
        RNI_NUMBER_11_LEFT,
        RNI_NUMBER_12_LEFT,
        RNI_NUMBER_13_LEFT,
        RNI_NUMBER_14_LEFT,
        RNI_NUMBER_15_LEFT,
        RNI_NUMBER_16_LEFT,
        RNI_NUMBER_17_LEFT,
        RNI_NUMBER_18_LEFT,
        RNI_NUMBER_19_LEFT,
        RNI_NUMBER_20_LEFT,
        RNI_NUMBER_21_LEFT,
        RNI_NUMBER_22_LEFT,
        RNI_NUMBER_23_LEFT,
        RNI_NUMBER_24_LEFT,
        RNI_NUMBER_25_LEFT,
        RNI_NUMBER_26_LEFT,
        RNI_NUMBER_27_LEFT,
        RNI_NUMBER_28_LEFT,
        RNI_NUMBER_29_LEFT,
        RNI_NUMBER_30_LEFT,
        RNI_NUMBER_31_LEFT,
        RNI_NUMBER_32_LEFT,
        RNI_NUMBER_33_LEFT,
        RNI_NUMBER_34_LEFT,
        RNI_NUMBER_35_LEFT,
        RNI_NUMBER_36_LEFT,
        RNI_NUMBER_37_LEFT,

        RNI_NUMBER_1_RIGHT,
        RNI_NUMBER_2_RIGHT,
        RNI_NUMBER_3_RIGHT,
        RNI_NUMBER_4_RIGHT,
        RNI_NUMBER_5_RIGHT,
        RNI_NUMBER_6_RIGHT,
        RNI_NUMBER_7_RIGHT,
        RNI_NUMBER_8_RIGHT,
        RNI_NUMBER_9_RIGHT,
        RNI_NUMBER_10_RIGHT,
        RNI_NUMBER_11_RIGHT,
        RNI_NUMBER_12_RIGHT,
        RNI_NUMBER_13_RIGHT,
        RNI_NUMBER_14_RIGHT,
        RNI_NUMBER_15_RIGHT,
        RNI_NUMBER_16_RIGHT,
        RNI_NUMBER_17_RIGHT,
        RNI_NUMBER_18_RIGHT,
        RNI_NUMBER_19_RIGHT,
        RNI_NUMBER_20_RIGHT,
        RNI_NUMBER_21_RIGHT,
        RNI_NUMBER_22_RIGHT,
        RNI_NUMBER_23_RIGHT,
        RNI_NUMBER_24_RIGHT,
        RNI_NUMBER_25_RIGHT,
        RNI_NUMBER_26_RIGHT,
        RNI_NUMBER_27_RIGHT,
        RNI_NUMBER_28_RIGHT,
        RNI_NUMBER_29_RIGHT,
        RNI_NUMBER_30_RIGHT,
        RNI_NUMBER_31_RIGHT,
        RNI_NUMBER_32_RIGHT,
        RNI_NUMBER_33_RIGHT,
        RNI_NUMBER_34_RIGHT,
        RNI_NUMBER_35_RIGHT,
        RNI_NUMBER_36_RIGHT,
        RNI_NUMBER_37_RIGHT,

        BLD_NUMBER_1,
        BLD_NUMBER_2,
        BLD_NUMBER_3,
        BLD_NUMBER_4,
        BLD_NUMBER_5,
        BLD_NUMBER_6,
        BLD_NUMBER_7,
        BLD_NUMBER_8,
        BLD_NUMBER_9,
        BLD_NUMBER_10,
        BLD_NUMBER_11,
        BLD_NUMBER_12,
        BLD_NUMBER_13,
        BLD_NUMBER_14,
        BLD_NUMBER_15,
        BLD_NUMBER_16,
        BLD_NUMBER_17,
        BLD_NUMBER_18,
        BLD_NUMBER_19,
        BLD_NUMBER_20,
        BLD_NUMBER_21,
        BLD_NUMBER_22,
        BLD_NUMBER_23,
        BLD_NUMBER_24,
        BLD_NUMBER_25,
        BLD_NUMBER_26,
        BLD_NUMBER_27,
        BLD_NUMBER_28,
        BLD_NUMBER_29,
        BLD_NUMBER_30,
        BLD_NUMBER_31,
        BLD_NUMBER_32,
        BLD_NUMBER_33,
        BLD_NUMBER_34,
        BLD_NUMBER_35,
        BLD_NUMBER_36,
        BLD_NUMBER_37,

        BLD_NUMBER_1_LEFT,
        BLD_NUMBER_2_LEFT,
        BLD_NUMBER_3_LEFT,
        BLD_NUMBER_4_LEFT,
        BLD_NUMBER_5_LEFT,
        BLD_NUMBER_6_LEFT,
        BLD_NUMBER_7_LEFT,
        BLD_NUMBER_8_LEFT,
        BLD_NUMBER_9_LEFT,
        BLD_NUMBER_10_LEFT,
        BLD_NUMBER_11_LEFT,
        BLD_NUMBER_12_LEFT,
        BLD_NUMBER_13_LEFT,
        BLD_NUMBER_14_LEFT,
        BLD_NUMBER_15_LEFT,
        BLD_NUMBER_16_LEFT,
        BLD_NUMBER_17_LEFT,
        BLD_NUMBER_18_LEFT,
        BLD_NUMBER_19_LEFT,
        BLD_NUMBER_20_LEFT,
        BLD_NUMBER_21_LEFT,
        BLD_NUMBER_22_LEFT,
        BLD_NUMBER_23_LEFT,
        BLD_NUMBER_24_LEFT,
        BLD_NUMBER_25_LEFT,
        BLD_NUMBER_26_LEFT,
        BLD_NUMBER_27_LEFT,
        BLD_NUMBER_28_LEFT,
        BLD_NUMBER_29_LEFT,
        BLD_NUMBER_30_LEFT,
        BLD_NUMBER_31_LEFT,
        BLD_NUMBER_32_LEFT,
        BLD_NUMBER_33_LEFT,
        BLD_NUMBER_34_LEFT,
        BLD_NUMBER_35_LEFT,
        BLD_NUMBER_36_LEFT,
        BLD_NUMBER_37_LEFT,

        BLD_NUMBER_1_RIGHT,
        BLD_NUMBER_2_RIGHT,
        BLD_NUMBER_3_RIGHT,
        BLD_NUMBER_4_RIGHT,
        BLD_NUMBER_5_RIGHT,
        BLD_NUMBER_6_RIGHT,
        BLD_NUMBER_7_RIGHT,
        BLD_NUMBER_8_RIGHT,
        BLD_NUMBER_9_RIGHT,
        BLD_NUMBER_10_RIGHT,
        BLD_NUMBER_11_RIGHT,
        BLD_NUMBER_12_RIGHT,
        BLD_NUMBER_13_RIGHT,
        BLD_NUMBER_14_RIGHT,
        BLD_NUMBER_15_RIGHT,
        BLD_NUMBER_16_RIGHT,
        BLD_NUMBER_17_RIGHT,
        BLD_NUMBER_18_RIGHT,
        BLD_NUMBER_19_RIGHT,
        BLD_NUMBER_20_RIGHT,
        BLD_NUMBER_21_RIGHT,
        BLD_NUMBER_22_RIGHT,
        BLD_NUMBER_23_RIGHT,
        BLD_NUMBER_24_RIGHT,
        BLD_NUMBER_25_RIGHT,
        BLD_NUMBER_26_RIGHT,
        BLD_NUMBER_27_RIGHT,
        BLD_NUMBER_28_RIGHT,
        BLD_NUMBER_29_RIGHT,
        BLD_NUMBER_30_RIGHT,
        BLD_NUMBER_31_RIGHT,
        BLD_NUMBER_32_RIGHT,
        BLD_NUMBER_33_RIGHT,
        BLD_NUMBER_34_RIGHT,
        BLD_NUMBER_35_RIGHT,
        BLD_NUMBER_36_RIGHT,
        BLD_NUMBER_37_RIGHT,

        RFN_NUMBER_1,
        RFN_NUMBER_2,
        RFN_NUMBER_3,
        RFN_NUMBER_4,
        RFN_NUMBER_5,
        RFN_NUMBER_6,
        RFN_NUMBER_7,
        RFN_NUMBER_8,
        RFN_NUMBER_9,
        RFN_NUMBER_10,
        RFN_NUMBER_11,
        RFN_NUMBER_12,
        RFN_NUMBER_13,
        RFN_NUMBER_14,
        RFN_NUMBER_15,
        RFN_NUMBER_16,
        RFN_NUMBER_17,
        RFN_NUMBER_18,
        RFN_NUMBER_19,
        RFN_NUMBER_20,
        RFN_NUMBER_21,
        RFN_NUMBER_22,
        RFN_NUMBER_23,
        RFN_NUMBER_24,
        RFN_NUMBER_25,
        RFN_NUMBER_26,
        RFN_NUMBER_27,
        RFN_NUMBER_28,
        RFN_NUMBER_29,
        RFN_NUMBER_30,
        RFN_NUMBER_31,
        RFN_NUMBER_32,
        RFN_NUMBER_33,
        RFN_NUMBER_34,
        RFN_NUMBER_35,
        RFN_NUMBER_36,
        RFN_NUMBER_37,

        RFN_NUMBER_1_LEFT,
        RFN_NUMBER_2_LEFT,
        RFN_NUMBER_3_LEFT,
        RFN_NUMBER_4_LEFT,
        RFN_NUMBER_5_LEFT,
        RFN_NUMBER_6_LEFT,
        RFN_NUMBER_7_LEFT,
        RFN_NUMBER_8_LEFT,
        RFN_NUMBER_9_LEFT,
        RFN_NUMBER_10_LEFT,
        RFN_NUMBER_11_LEFT,
        RFN_NUMBER_12_LEFT,
        RFN_NUMBER_13_LEFT,
        RFN_NUMBER_14_LEFT,
        RFN_NUMBER_15_LEFT,
        RFN_NUMBER_16_LEFT,
        RFN_NUMBER_17_LEFT,
        RFN_NUMBER_18_LEFT,
        RFN_NUMBER_19_LEFT,
        RFN_NUMBER_20_LEFT,
        RFN_NUMBER_21_LEFT,
        RFN_NUMBER_22_LEFT,
        RFN_NUMBER_23_LEFT,
        RFN_NUMBER_24_LEFT,
        RFN_NUMBER_25_LEFT,
        RFN_NUMBER_26_LEFT,
        RFN_NUMBER_27_LEFT,
        RFN_NUMBER_28_LEFT,
        RFN_NUMBER_29_LEFT,
        RFN_NUMBER_30_LEFT,
        RFN_NUMBER_31_LEFT,
        RFN_NUMBER_32_LEFT,
        RFN_NUMBER_33_LEFT,
        RFN_NUMBER_34_LEFT,
        RFN_NUMBER_35_LEFT,
        RFN_NUMBER_36_LEFT,
        RFN_NUMBER_37_LEFT,

        RFN_NUMBER_1_RIGHT,
        RFN_NUMBER_2_RIGHT,
        RFN_NUMBER_3_RIGHT,
        RFN_NUMBER_4_RIGHT,
        RFN_NUMBER_5_RIGHT,
        RFN_NUMBER_6_RIGHT,
        RFN_NUMBER_7_RIGHT,
        RFN_NUMBER_8_RIGHT,
        RFN_NUMBER_9_RIGHT,
        RFN_NUMBER_10_RIGHT,
        RFN_NUMBER_11_RIGHT,
        RFN_NUMBER_12_RIGHT,
        RFN_NUMBER_13_RIGHT,
        RFN_NUMBER_14_RIGHT,
        RFN_NUMBER_15_RIGHT,
        RFN_NUMBER_16_RIGHT,
        RFN_NUMBER_17_RIGHT,
        RFN_NUMBER_18_RIGHT,
        RFN_NUMBER_19_RIGHT,
        RFN_NUMBER_20_RIGHT,
        RFN_NUMBER_21_RIGHT,
        RFN_NUMBER_22_RIGHT,
        RFN_NUMBER_23_RIGHT,
        RFN_NUMBER_24_RIGHT,
        RFN_NUMBER_25_RIGHT,
        RFN_NUMBER_26_RIGHT,
        RFN_NUMBER_27_RIGHT,
        RFN_NUMBER_28_RIGHT,
        RFN_NUMBER_29_RIGHT,
        RFN_NUMBER_30_RIGHT,
        RFN_NUMBER_31_RIGHT,
        RFN_NUMBER_32_RIGHT,
        RFN_NUMBER_33_RIGHT,
        RFN_NUMBER_34_RIGHT,
        RFN_NUMBER_35_RIGHT,
        RFN_NUMBER_36_RIGHT,
        RFN_NUMBER_37_RIGHT,

        GGL_NUMBER_1,
        GGL_NUMBER_2,
        GGL_NUMBER_3,
        GGL_NUMBER_4,
        GGL_NUMBER_5,
        GGL_NUMBER_6,
        GGL_NUMBER_7,
        GGL_NUMBER_8,
        GGL_NUMBER_9,
        GGL_NUMBER_10,
        GGL_NUMBER_11,
        GGL_NUMBER_12,
        GGL_NUMBER_13,
        GGL_NUMBER_14,
        GGL_NUMBER_15,
        GGL_NUMBER_16,
        GGL_NUMBER_17,
        GGL_NUMBER_18,
        GGL_NUMBER_19,
        GGL_NUMBER_20,
        GGL_NUMBER_21,
        GGL_NUMBER_22,
        GGL_NUMBER_23,
        GGL_NUMBER_24,
        GGL_NUMBER_25,
        GGL_NUMBER_26,
        GGL_NUMBER_27,
        GGL_NUMBER_28,
        GGL_NUMBER_29,
        GGL_NUMBER_30,
        GGL_NUMBER_31,
        GGL_NUMBER_32,
        GGL_NUMBER_33,
        GGL_NUMBER_34,
        GGL_NUMBER_35,
        GGL_NUMBER_36,
        GGL_NUMBER_37,

        GGL_NUMBER_1_LEFT,
        GGL_NUMBER_2_LEFT,
        GGL_NUMBER_3_LEFT,
        GGL_NUMBER_4_LEFT,
        GGL_NUMBER_5_LEFT,
        GGL_NUMBER_6_LEFT,
        GGL_NUMBER_7_LEFT,
        GGL_NUMBER_8_LEFT,
        GGL_NUMBER_9_LEFT,
        GGL_NUMBER_10_LEFT,
        GGL_NUMBER_11_LEFT,
        GGL_NUMBER_12_LEFT,
        GGL_NUMBER_13_LEFT,
        GGL_NUMBER_14_LEFT,
        GGL_NUMBER_15_LEFT,
        GGL_NUMBER_16_LEFT,
        GGL_NUMBER_17_LEFT,
        GGL_NUMBER_18_LEFT,
        GGL_NUMBER_19_LEFT,
        GGL_NUMBER_20_LEFT,
        GGL_NUMBER_21_LEFT,
        GGL_NUMBER_22_LEFT,
        GGL_NUMBER_23_LEFT,
        GGL_NUMBER_24_LEFT,
        GGL_NUMBER_25_LEFT,
        GGL_NUMBER_26_LEFT,
        GGL_NUMBER_27_LEFT,
        GGL_NUMBER_28_LEFT,
        GGL_NUMBER_29_LEFT,
        GGL_NUMBER_30_LEFT,
        GGL_NUMBER_31_LEFT,
        GGL_NUMBER_32_LEFT,
        GGL_NUMBER_33_LEFT,
        GGL_NUMBER_34_LEFT,
        GGL_NUMBER_35_LEFT,
        GGL_NUMBER_36_LEFT,
        GGL_NUMBER_37_LEFT,

        GGL_NUMBER_1_RIGHT,
        GGL_NUMBER_2_RIGHT,
        GGL_NUMBER_3_RIGHT,
        GGL_NUMBER_4_RIGHT,
        GGL_NUMBER_5_RIGHT,
        GGL_NUMBER_6_RIGHT,
        GGL_NUMBER_7_RIGHT,
        GGL_NUMBER_8_RIGHT,
        GGL_NUMBER_9_RIGHT,
        GGL_NUMBER_10_RIGHT,
        GGL_NUMBER_11_RIGHT,
        GGL_NUMBER_12_RIGHT,
        GGL_NUMBER_13_RIGHT,
        GGL_NUMBER_14_RIGHT,
        GGL_NUMBER_15_RIGHT,
        GGL_NUMBER_16_RIGHT,
        GGL_NUMBER_17_RIGHT,
        GGL_NUMBER_18_RIGHT,
        GGL_NUMBER_19_RIGHT,
        GGL_NUMBER_20_RIGHT,
        GGL_NUMBER_21_RIGHT,
        GGL_NUMBER_22_RIGHT,
        GGL_NUMBER_23_RIGHT,
        GGL_NUMBER_24_RIGHT,
        GGL_NUMBER_25_RIGHT,
        GGL_NUMBER_26_RIGHT,
        GGL_NUMBER_27_RIGHT,
        GGL_NUMBER_28_RIGHT,
        GGL_NUMBER_29_RIGHT,
        GGL_NUMBER_30_RIGHT,
        GGL_NUMBER_31_RIGHT,
        GGL_NUMBER_32_RIGHT,
        GGL_NUMBER_33_RIGHT,
        GGL_NUMBER_34_RIGHT,
        GGL_NUMBER_35_RIGHT,
        GGL_NUMBER_36_RIGHT,
        GGL_NUMBER_37_RIGHT,

        RPL_NUMBER_1,
        RPL_NUMBER_2,
        RPL_NUMBER_3,
        RPL_NUMBER_4,
        RPL_NUMBER_5,
        RPL_NUMBER_6,
        RPL_NUMBER_7,
        RPL_NUMBER_8,
        RPL_NUMBER_9,
        RPL_NUMBER_10,
        RPL_NUMBER_11,
        RPL_NUMBER_12,
        RPL_NUMBER_13,
        RPL_NUMBER_14,
        RPL_NUMBER_15,
        RPL_NUMBER_16,
        RPL_NUMBER_17,
        RPL_NUMBER_18,
        RPL_NUMBER_19,
        RPL_NUMBER_20,
        RPL_NUMBER_21,
        RPL_NUMBER_22,
        RPL_NUMBER_23,
        RPL_NUMBER_24,
        RPL_NUMBER_25,
        RPL_NUMBER_26,
        RPL_NUMBER_27,
        RPL_NUMBER_28,
        RPL_NUMBER_29,
        RPL_NUMBER_30,
        RPL_NUMBER_31,
        RPL_NUMBER_32,
        RPL_NUMBER_33,
        RPL_NUMBER_34,
        RPL_NUMBER_35,
        RPL_NUMBER_36,
        RPL_NUMBER_37,

        RPL_NUMBER_1_LEFT,
        RPL_NUMBER_2_LEFT,
        RPL_NUMBER_3_LEFT,
        RPL_NUMBER_4_LEFT,
        RPL_NUMBER_5_LEFT,
        RPL_NUMBER_6_LEFT,
        RPL_NUMBER_7_LEFT,
        RPL_NUMBER_8_LEFT,
        RPL_NUMBER_9_LEFT,
        RPL_NUMBER_10_LEFT,
        RPL_NUMBER_11_LEFT,
        RPL_NUMBER_12_LEFT,
        RPL_NUMBER_13_LEFT,
        RPL_NUMBER_14_LEFT,
        RPL_NUMBER_15_LEFT,
        RPL_NUMBER_16_LEFT,
        RPL_NUMBER_17_LEFT,
        RPL_NUMBER_18_LEFT,
        RPL_NUMBER_19_LEFT,
        RPL_NUMBER_20_LEFT,
        RPL_NUMBER_21_LEFT,
        RPL_NUMBER_22_LEFT,
        RPL_NUMBER_23_LEFT,
        RPL_NUMBER_24_LEFT,
        RPL_NUMBER_25_LEFT,
        RPL_NUMBER_26_LEFT,
        RPL_NUMBER_27_LEFT,
        RPL_NUMBER_28_LEFT,
        RPL_NUMBER_29_LEFT,
        RPL_NUMBER_30_LEFT,
        RPL_NUMBER_31_LEFT,
        RPL_NUMBER_32_LEFT,
        RPL_NUMBER_33_LEFT,
        RPL_NUMBER_34_LEFT,
        RPL_NUMBER_35_LEFT,
        RPL_NUMBER_36_LEFT,
        RPL_NUMBER_37_LEFT,

        RPL_NUMBER_1_RIGHT,
        RPL_NUMBER_2_RIGHT,
        RPL_NUMBER_3_RIGHT,
        RPL_NUMBER_4_RIGHT,
        RPL_NUMBER_5_RIGHT,
        RPL_NUMBER_6_RIGHT,
        RPL_NUMBER_7_RIGHT,
        RPL_NUMBER_8_RIGHT,
        RPL_NUMBER_9_RIGHT,
        RPL_NUMBER_10_RIGHT,
        RPL_NUMBER_11_RIGHT,
        RPL_NUMBER_12_RIGHT,
        RPL_NUMBER_13_RIGHT,
        RPL_NUMBER_14_RIGHT,
        RPL_NUMBER_15_RIGHT,
        RPL_NUMBER_16_RIGHT,
        RPL_NUMBER_17_RIGHT,
        RPL_NUMBER_18_RIGHT,
        RPL_NUMBER_19_RIGHT,
        RPL_NUMBER_20_RIGHT,
        RPL_NUMBER_21_RIGHT,
        RPL_NUMBER_22_RIGHT,
        RPL_NUMBER_23_RIGHT,
        RPL_NUMBER_24_RIGHT,
        RPL_NUMBER_25_RIGHT,
        RPL_NUMBER_26_RIGHT,
        RPL_NUMBER_27_RIGHT,
        RPL_NUMBER_28_RIGHT,
        RPL_NUMBER_29_RIGHT,
        RPL_NUMBER_30_RIGHT,
        RPL_NUMBER_31_RIGHT,
        RPL_NUMBER_32_RIGHT,
        RPL_NUMBER_33_RIGHT,
        RPL_NUMBER_34_RIGHT,
        RPL_NUMBER_35_RIGHT,
        RPL_NUMBER_36_RIGHT,
        RPL_NUMBER_37_RIGHT,

        RPLFBC,
        Action.RPLRBC,
        Action.RPLLF,
        Action.RPLRF,
        Action.RPLLFW,
        Action.RPLRFW,
        Action.RPLLFD,
        Action.RPLRFD,
        Action.RPLLRD,
        Action.RPLRRD,
        Action.RPLLSLD,
        Action.RPLRSLD,
        Action.RPLLRM,
        Action.RPLRRM,
        Action.RPLLQP,
        Action.RPLRQP,
        Action.RPLLSP,
        Action.RPLRSP,
        Action.RPLLPP,
        Action.RPLRPP,
        Action.RPLLRW,
        Action.RPLRRW,
        Action.RPLHOOD,
        Action.RPLROOF,
        Action.RPLTRUNKLID,
        Action.RPLLIFTGATE,
        Action.RPLBACKDOOR,
        Action.RPLLHL,
        Action.RPLRHL,
        Action.RPLLTL,
        Action.RPLRTL,

        /** CONVERSION REPLACEMENTS **/
        Action.RPLFB,
        Action.RPLBB,
        Action.RPLLR,
        Action.RPLRR,
        Action.RPLLQ,
        Action.RPLRQ,
        Action.RPLTRUNK,

        NL_NUMBER_1,
        NL_NUMBER_2,
        NL_NUMBER_3,
        NL_NUMBER_4,
        NL_NUMBER_5,
        NL_NUMBER_6,
        NL_NUMBER_7,
        NL_NUMBER_8,
        NL_NUMBER_9,
        NL_NUMBER_10,
        NL_NUMBER_11,
        NL_NUMBER_12,
        NL_NUMBER_13,
        NL_NUMBER_14,
        NL_NUMBER_15,
        NL_NUMBER_16,
        NL_NUMBER_17,
        NL_NUMBER_18,
        NL_NUMBER_19,
        NL_NUMBER_20,
        NL_NUMBER_21,
        NL_NUMBER_22,
        NL_NUMBER_23,
        NL_NUMBER_24,
        NL_NUMBER_25,
        NL_NUMBER_26,
        NL_NUMBER_27,
        NL_NUMBER_28,
        NL_NUMBER_29,
        NL_NUMBER_30,
        NL_NUMBER_31,
        NL_NUMBER_32,
        NL_NUMBER_33,
        NL_NUMBER_34,
        NL_NUMBER_35,
        NL_NUMBER_36,
        NL_NUMBER_37,
        NL_NUMBER_38,
        NL_NUMBER_39,
        NL_NUMBER_40,
        NL_NUMBER_41,
        NL_NUMBER_42,
        NL_NUMBER_43,
        NL_NUMBER_44,
        NL_NUMBER_45,
        NL_NUMBER_46,
        NL_NUMBER_47,
        NL_NUMBER_48,
        NL_NUMBER_49,
        NL_NUMBER_50,
        NL_NUMBER_51,
        NL_NUMBER_52,
        NL_NUMBER_53,
        NL_NUMBER_54,
        NL_NUMBER_55,
        NL_NUMBER_56,
        NL_NUMBER_57,
        NL_NUMBER_58,
        NL_NUMBER_59,
        NL_NUMBER_60,
        NL_NUMBER_61,
        NL_NUMBER_62,
        NL_NUMBER_63,
        NL_NUMBER_64,
        NL_NUMBER_65,
        NL_NUMBER_66,
        NL_NUMBER_67,
        NL_NUMBER_68,
        NL_NUMBER_69,
        NL_NUMBER_70,
        NL_NUMBER_71,
        NL_NUMBER_72,
        NL_NUMBER_73,
        NL_NUMBER_74,
        NL_NUMBER_75,
        NL_NUMBER_76,
        NL_NUMBER_77,
        NL_NUMBER_78,
        NL_NUMBER_79,
        NL_NUMBER_80,
        NL_NUMBER_81,
        NL_NUMBER_82,
        NL_NUMBER_83,
        NL_NUMBER_84,
        NL_NUMBER_85,
        NL_NUMBER_86,
        NL_NUMBER_87,
        NL_NUMBER_88,
        NL_NUMBER_89,
        NL_NUMBER_90,
        NL_NUMBER_91,
        NL_NUMBER_92,
        NL_NUMBER_93,
        NL_NUMBER_94,
        NL_NUMBER_95,
        NL_NUMBER_96,
        NL_NUMBER_97,
        NL_NUMBER_98,
        NL_NUMBER_99,
        NL_NUMBER_100,

        INL_NUMBER_1,
        INL_NUMBER_2,
        INL_NUMBER_3,
        INL_NUMBER_4,
        INL_NUMBER_5,
        INL_NUMBER_6,
        INL_NUMBER_7,
        INL_NUMBER_8,
        INL_NUMBER_9,
        INL_NUMBER_10,
        INL_NUMBER_11,
        INL_NUMBER_12,
        INL_NUMBER_13,
        INL_NUMBER_14,
        INL_NUMBER_15,
        INL_NUMBER_16,
        INL_NUMBER_17,
        INL_NUMBER_18,
        INL_NUMBER_19,
        INL_NUMBER_20,
        INL_NUMBER_21,
        INL_NUMBER_22,
        INL_NUMBER_23,
        INL_NUMBER_24,
        INL_NUMBER_25,
        INL_NUMBER_26,
        INL_NUMBER_27,
        INL_NUMBER_28,
        INL_NUMBER_29,
        INL_NUMBER_30,
        INL_NUMBER_31,
        INL_NUMBER_32,
        INL_NUMBER_33,
        INL_NUMBER_34,
        INL_NUMBER_35,
        INL_NUMBER_36,
        INL_NUMBER_37,
        INL_NUMBER_38,
        INL_NUMBER_39,
        INL_NUMBER_40,
        INL_NUMBER_41,
        INL_NUMBER_42,
        INL_NUMBER_43,
        INL_NUMBER_44,
        INL_NUMBER_45,
        INL_NUMBER_46,
        INL_NUMBER_47,
        INL_NUMBER_48,
        INL_NUMBER_49,
        INL_NUMBER_50,
        INL_NUMBER_51,
        INL_NUMBER_52,
        INL_NUMBER_53,
        INL_NUMBER_54,
        INL_NUMBER_55,
        INL_NUMBER_56,
        INL_NUMBER_57,
        INL_NUMBER_58,
        INL_NUMBER_59,
        INL_NUMBER_60,
        INL_NUMBER_61,
        INL_NUMBER_62,
        INL_NUMBER_63,
        INL_NUMBER_64,
        INL_NUMBER_65,
        INL_NUMBER_66,
        INL_NUMBER_67,
        INL_NUMBER_68,
        INL_NUMBER_69,
        INL_NUMBER_70,
        INL_NUMBER_71,
        INL_NUMBER_72,
        INL_NUMBER_73,
        INL_NUMBER_74,
        INL_NUMBER_75,
        INL_NUMBER_76,
        INL_NUMBER_77,
        INL_NUMBER_78,
        INL_NUMBER_79,
        INL_NUMBER_80,
        INL_NUMBER_81,
        INL_NUMBER_82,
        INL_NUMBER_83,
        INL_NUMBER_84,
        INL_NUMBER_85,
        INL_NUMBER_86,
        INL_NUMBER_87,
        INL_NUMBER_88,
        INL_NUMBER_89,
        INL_NUMBER_90,
        INL_NUMBER_91,
        INL_NUMBER_92,
        INL_NUMBER_93,
        INL_NUMBER_94,
        INL_NUMBER_95,
        INL_NUMBER_96,
        INL_NUMBER_97,
        INL_NUMBER_98,
        INL_NUMBER_99,
        INL_NUMBER_100,

        DEL_NUMBER_1,
        DEL_NUMBER_2,
        DEL_NUMBER_3,
        DEL_NUMBER_4,
        DEL_NUMBER_5,
        DEL_NUMBER_6,
        DEL_NUMBER_7,
        DEL_NUMBER_8,
        DEL_NUMBER_9,
        DEL_NUMBER_10,
        DEL_NUMBER_11,
        DEL_NUMBER_12,
        DEL_NUMBER_13,
        DEL_NUMBER_14,
        DEL_NUMBER_15,
        DEL_NUMBER_16,
        DEL_NUMBER_17,
        DEL_NUMBER_18,
        DEL_NUMBER_19,
        DEL_NUMBER_20,
        DEL_NUMBER_21,
        DEL_NUMBER_22,
        DEL_NUMBER_23,
        DEL_NUMBER_24,
        DEL_NUMBER_25,
        DEL_NUMBER_26,
        DEL_NUMBER_27,
        DEL_NUMBER_28,
        DEL_NUMBER_29,
        DEL_NUMBER_30,
        DEL_NUMBER_31,
        DEL_NUMBER_32,
        DEL_NUMBER_33,
        DEL_NUMBER_34,
        DEL_NUMBER_35,
        DEL_NUMBER_36,
        DEL_NUMBER_37,
        DEL_NUMBER_38,
        DEL_NUMBER_39,
        DEL_NUMBER_40,
        DEL_NUMBER_41,
        DEL_NUMBER_42,
        DEL_NUMBER_43,
        DEL_NUMBER_44,
        DEL_NUMBER_45,
        DEL_NUMBER_46,
        DEL_NUMBER_47,
        DEL_NUMBER_48,
        DEL_NUMBER_49,
        DEL_NUMBER_50,
        DEL_NUMBER_51,
        DEL_NUMBER_52,
        DEL_NUMBER_53,
        DEL_NUMBER_54,
        DEL_NUMBER_55,
        DEL_NUMBER_56,
        DEL_NUMBER_57,
        DEL_NUMBER_58,
        DEL_NUMBER_59,
        DEL_NUMBER_60,
        DEL_NUMBER_61,
        DEL_NUMBER_62,
        DEL_NUMBER_63,
        DEL_NUMBER_64,
        DEL_NUMBER_65,
        DEL_NUMBER_66,
        DEL_NUMBER_67,
        DEL_NUMBER_68,
        DEL_NUMBER_69,
        DEL_NUMBER_70,
        DEL_NUMBER_71,
        DEL_NUMBER_72,
        DEL_NUMBER_73,
        DEL_NUMBER_74,
        DEL_NUMBER_75,
        DEL_NUMBER_76,
        DEL_NUMBER_77,
        DEL_NUMBER_78,
        DEL_NUMBER_79,
        DEL_NUMBER_80,
        DEL_NUMBER_81,
        DEL_NUMBER_82,
        DEL_NUMBER_83,
        DEL_NUMBER_84,
        DEL_NUMBER_85,
        DEL_NUMBER_86,
        DEL_NUMBER_87,
        DEL_NUMBER_88,
        DEL_NUMBER_89,
        DEL_NUMBER_90,
        DEL_NUMBER_91,
        DEL_NUMBER_92,
        DEL_NUMBER_93,
        DEL_NUMBER_94,
        DEL_NUMBER_95,
        DEL_NUMBER_96,
        DEL_NUMBER_97,
        DEL_NUMBER_98,
        DEL_NUMBER_99,
        DEL_NUMBER_100,

        UPL_NUMBER_1,
        UPL_NUMBER_2,
        UPL_NUMBER_3,
        UPL_NUMBER_4,
        UPL_NUMBER_5,
        UPL_NUMBER_6,
        UPL_NUMBER_7,
        UPL_NUMBER_8,
        UPL_NUMBER_9,
        UPL_NUMBER_10,
        UPL_NUMBER_11,
        UPL_NUMBER_12,
        UPL_NUMBER_13,
        UPL_NUMBER_14,
        UPL_NUMBER_15,
        UPL_NUMBER_16,
        UPL_NUMBER_17,
        UPL_NUMBER_18,
        UPL_NUMBER_19,
        UPL_NUMBER_20,
        UPL_NUMBER_21,
        UPL_NUMBER_22,
        UPL_NUMBER_23,
        UPL_NUMBER_24,
        UPL_NUMBER_25,
        UPL_NUMBER_26,
        UPL_NUMBER_27,
        UPL_NUMBER_28,
        UPL_NUMBER_29,
        UPL_NUMBER_30,
        UPL_NUMBER_31,
        UPL_NUMBER_32,
        UPL_NUMBER_33,
        UPL_NUMBER_34,
        UPL_NUMBER_35,
        UPL_NUMBER_36,
        UPL_NUMBER_37,
        UPL_NUMBER_38,
        UPL_NUMBER_39,
        UPL_NUMBER_40,
        UPL_NUMBER_41,
        UPL_NUMBER_42,
        UPL_NUMBER_43,
        UPL_NUMBER_44,
        UPL_NUMBER_45,
        UPL_NUMBER_46,
        UPL_NUMBER_47,
        UPL_NUMBER_48,
        UPL_NUMBER_49,
        UPL_NUMBER_50,
        UPL_NUMBER_51,
        UPL_NUMBER_52,
        UPL_NUMBER_53,
        UPL_NUMBER_54,
        UPL_NUMBER_55,
        UPL_NUMBER_56,
        UPL_NUMBER_57,
        UPL_NUMBER_58,
        UPL_NUMBER_59,
        UPL_NUMBER_60,
        UPL_NUMBER_61,
        UPL_NUMBER_62,
        UPL_NUMBER_63,
        UPL_NUMBER_64,
        UPL_NUMBER_65,
        UPL_NUMBER_66,
        UPL_NUMBER_67,
        UPL_NUMBER_68,
        UPL_NUMBER_69,
        UPL_NUMBER_70,
        UPL_NUMBER_71,
        UPL_NUMBER_72,
        UPL_NUMBER_73,
        UPL_NUMBER_74,
        UPL_NUMBER_75,
        UPL_NUMBER_76,
        UPL_NUMBER_77,
        UPL_NUMBER_78,
        UPL_NUMBER_79,
        UPL_NUMBER_80,
        UPL_NUMBER_81,
        UPL_NUMBER_82,
        UPL_NUMBER_83,
        UPL_NUMBER_84,
        UPL_NUMBER_85,
        UPL_NUMBER_86,
        UPL_NUMBER_87,
        UPL_NUMBER_88,
        UPL_NUMBER_89,
        UPL_NUMBER_90,
        UPL_NUMBER_91,
        UPL_NUMBER_92,
        UPL_NUMBER_93,
        UPL_NUMBER_94,
        UPL_NUMBER_95,
        UPL_NUMBER_96,
        UPL_NUMBER_97,
        UPL_NUMBER_98,
        UPL_NUMBER_99,
        UPL_NUMBER_100

        /*
        RPL_NUMBER_1_OEM,
        RPL_NUMBER_2_OEM,
        RPL_NUMBER_3_OEM,
        RPL_NUMBER_4_OEM,
        RPL_NUMBER_5_OEM,
        RPL_NUMBER_6_OEM,
        RPL_NUMBER_7_OEM,
        RPL_NUMBER_8_OEM,
        RPL_NUMBER_9_OEM,
        RPL_NUMBER_10_OEM,
        RPL_NUMBER_11_OEM,
        RPL_NUMBER_12_OEM,
        RPL_NUMBER_13_OEM,
        RPL_NUMBER_14_OEM,
        RPL_NUMBER_15_OEM,
        RPL_NUMBER_16_OEM,
        RPL_NUMBER_17_OEM,
        RPL_NUMBER_18_OEM,
        RPL_NUMBER_19_OEM,
        RPL_NUMBER_20_OEM,
        RPL_NUMBER_21_OEM,
        RPL_NUMBER_22_OEM,
        RPL_NUMBER_23_OEM,
        RPL_NUMBER_24_OEM,
        RPL_NUMBER_25_OEM,
        RPL_NUMBER_26_OEM,
        RPL_NUMBER_27_OEM,
        RPL_NUMBER_28_OEM,
        RPL_NUMBER_29_OEM,
        RPL_NUMBER_30_OEM,
        RPL_NUMBER_31_OEM,
        RPL_NUMBER_32_OEM,
        RPL_NUMBER_33_OEM,
        RPL_NUMBER_34_OEM,
        RPL_NUMBER_35_OEM,

        RPL_NUMBER_1_CHEAPEST,
        RPL_NUMBER_2_CHEAPEST,
        RPL_NUMBER_3_CHEAPEST,
        RPL_NUMBER_4_CHEAPEST,
        RPL_NUMBER_5_CHEAPEST,
        RPL_NUMBER_6_CHEAPEST,
        RPL_NUMBER_7_CHEAPEST,
        RPL_NUMBER_8_CHEAPEST,
        RPL_NUMBER_9_CHEAPEST,
        RPL_NUMBER_10_CHEAPEST,
        RPL_NUMBER_11_CHEAPEST,
        RPL_NUMBER_12_CHEAPEST,
        RPL_NUMBER_13_CHEAPEST,
        RPL_NUMBER_14_CHEAPEST,
        RPL_NUMBER_15_CHEAPEST,
        RPL_NUMBER_16_CHEAPEST,
        RPL_NUMBER_17_CHEAPEST,
        RPL_NUMBER_18_CHEAPEST,
        RPL_NUMBER_19_CHEAPEST,
        RPL_NUMBER_20_CHEAPEST,
        RPL_NUMBER_21_CHEAPEST,
        RPL_NUMBER_22_CHEAPEST,
        RPL_NUMBER_23_CHEAPEST,
        RPL_NUMBER_24_CHEAPEST,
        RPL_NUMBER_25_CHEAPEST,
        RPL_NUMBER_26_CHEAPEST,
        RPL_NUMBER_27_CHEAPEST,
        RPL_NUMBER_28_CHEAPEST,
        RPL_NUMBER_29_CHEAPEST,
        RPL_NUMBER_30_CHEAPEST,
        RPL_NUMBER_31_CHEAPEST,
        RPL_NUMBER_32_CHEAPEST,
        RPL_NUMBER_33_CHEAPEST,
        RPL_NUMBER_34_CHEAPEST,
        RPL_NUMBER_35_CHEAPEST,

        RPL_NUMBER_1_LEFT_OEM,
        RPL_NUMBER_2_LEFT_OEM,
        RPL_NUMBER_3_LEFT_OEM,
        RPL_NUMBER_4_LEFT_OEM,
        RPL_NUMBER_5_LEFT_OEM,
        RPL_NUMBER_6_LEFT_OEM,
        RPL_NUMBER_7_LEFT_OEM,
        RPL_NUMBER_8_LEFT_OEM,
        RPL_NUMBER_9_LEFT_OEM,
        RPL_NUMBER_10_LEFT_OEM,
        RPL_NUMBER_11_LEFT_OEM,
        RPL_NUMBER_12_LEFT_OEM,
        RPL_NUMBER_13_LEFT_OEM,
        RPL_NUMBER_14_LEFT_OEM,
        RPL_NUMBER_15_LEFT_OEM,
        RPL_NUMBER_16_LEFT_OEM,
        RPL_NUMBER_17_LEFT_OEM,
        RPL_NUMBER_18_LEFT_OEM,
        RPL_NUMBER_19_LEFT_OEM,
        RPL_NUMBER_20_LEFT_OEM,
        RPL_NUMBER_21_LEFT_OEM,
        RPL_NUMBER_22_LEFT_OEM,
        RPL_NUMBER_23_LEFT_OEM,
        RPL_NUMBER_24_LEFT_OEM,
        RPL_NUMBER_25_LEFT_OEM,
        RPL_NUMBER_26_LEFT_OEM,
        RPL_NUMBER_27_LEFT_OEM,
        RPL_NUMBER_28_LEFT_OEM,
        RPL_NUMBER_29_LEFT_OEM,
        RPL_NUMBER_30_LEFT_OEM,
        RPL_NUMBER_31_LEFT_OEM,
        RPL_NUMBER_32_LEFT_OEM,
        RPL_NUMBER_33_LEFT_OEM,
        RPL_NUMBER_34_LEFT_OEM,
        RPL_NUMBER_35_LEFT_OEM,

        RPL_NUMBER_1_RIGHT_OEM,
        RPL_NUMBER_2_RIGHT_OEM,
        RPL_NUMBER_3_RIGHT_OEM,
        RPL_NUMBER_4_RIGHT_OEM,
        RPL_NUMBER_5_RIGHT_OEM,
        RPL_NUMBER_6_RIGHT_OEM,
        RPL_NUMBER_7_RIGHT_OEM,
        RPL_NUMBER_8_RIGHT_OEM,
        RPL_NUMBER_9_RIGHT_OEM,
        RPL_NUMBER_10_RIGHT_OEM,
        RPL_NUMBER_11_RIGHT_OEM,
        RPL_NUMBER_12_RIGHT_OEM,
        RPL_NUMBER_13_RIGHT_OEM,
        RPL_NUMBER_14_RIGHT_OEM,
        RPL_NUMBER_15_RIGHT_OEM,
        RPL_NUMBER_16_RIGHT_OEM,
        RPL_NUMBER_17_RIGHT_OEM,
        RPL_NUMBER_18_RIGHT_OEM,
        RPL_NUMBER_19_RIGHT_OEM,
        RPL_NUMBER_20_RIGHT_OEM,
        RPL_NUMBER_21_RIGHT_OEM,
        RPL_NUMBER_22_RIGHT_OEM,
        RPL_NUMBER_23_RIGHT_OEM,
        RPL_NUMBER_24_RIGHT_OEM,
        RPL_NUMBER_25_RIGHT_OEM,
        RPL_NUMBER_26_RIGHT_OEM,
        RPL_NUMBER_27_RIGHT_OEM,
        RPL_NUMBER_28_RIGHT_OEM,
        RPL_NUMBER_29_RIGHT_OEM,
        RPL_NUMBER_30_RIGHT_OEM,
        RPL_NUMBER_31_RIGHT_OEM,
        RPL_NUMBER_32_RIGHT_OEM,
        RPL_NUMBER_33_RIGHT_OEM,
        RPL_NUMBER_34_RIGHT_OEM,
        RPL_NUMBER_35_RIGHT_OEM,

        RPL_NUMBER_1_LEFT_CHEAPEST,
        RPL_NUMBER_2_LEFT_CHEAPEST,
        RPL_NUMBER_3_LEFT_CHEAPEST,
        RPL_NUMBER_4_LEFT_CHEAPEST,
        RPL_NUMBER_5_LEFT_CHEAPEST,
        RPL_NUMBER_6_LEFT_CHEAPEST,
        RPL_NUMBER_7_LEFT_CHEAPEST,
        RPL_NUMBER_8_LEFT_CHEAPEST,
        RPL_NUMBER_9_LEFT_CHEAPEST,
        RPL_NUMBER_10_LEFT_CHEAPEST,
        RPL_NUMBER_11_LEFT_CHEAPEST,
        RPL_NUMBER_12_LEFT_CHEAPEST,
        RPL_NUMBER_13_LEFT_CHEAPEST,
        RPL_NUMBER_14_LEFT_CHEAPEST,
        RPL_NUMBER_15_LEFT_CHEAPEST,
        RPL_NUMBER_16_LEFT_CHEAPEST,
        RPL_NUMBER_17_LEFT_CHEAPEST,
        RPL_NUMBER_18_LEFT_CHEAPEST,
        RPL_NUMBER_19_LEFT_CHEAPEST,
        RPL_NUMBER_20_LEFT_CHEAPEST,
        RPL_NUMBER_21_LEFT_CHEAPEST,
        RPL_NUMBER_22_LEFT_CHEAPEST,
        RPL_NUMBER_23_LEFT_CHEAPEST,
        RPL_NUMBER_24_LEFT_CHEAPEST,
        RPL_NUMBER_25_LEFT_CHEAPEST,
        RPL_NUMBER_26_LEFT_CHEAPEST,
        RPL_NUMBER_27_LEFT_CHEAPEST,
        RPL_NUMBER_28_LEFT_CHEAPEST,
        RPL_NUMBER_29_LEFT_CHEAPEST,
        RPL_NUMBER_30_LEFT_CHEAPEST,
        RPL_NUMBER_31_LEFT_CHEAPEST,
        RPL_NUMBER_32_LEFT_CHEAPEST,
        RPL_NUMBER_33_LEFT_CHEAPEST,
        RPL_NUMBER_34_LEFT_CHEAPEST,
        RPL_NUMBER_35_LEFT_CHEAPEST,

        RPL_NUMBER_1_RIGHT_CHEAPEST,
        RPL_NUMBER_2_RIGHT_CHEAPEST,
        RPL_NUMBER_3_RIGHT_CHEAPEST,
        RPL_NUMBER_4_RIGHT_CHEAPEST,
        RPL_NUMBER_5_RIGHT_CHEAPEST,
        RPL_NUMBER_6_RIGHT_CHEAPEST,
        RPL_NUMBER_7_RIGHT_CHEAPEST,
        RPL_NUMBER_8_RIGHT_CHEAPEST,
        RPL_NUMBER_9_RIGHT_CHEAPEST,
        RPL_NUMBER_10_RIGHT_CHEAPEST,
        RPL_NUMBER_11_RIGHT_CHEAPEST,
        RPL_NUMBER_12_RIGHT_CHEAPEST,
        RPL_NUMBER_13_RIGHT_CHEAPEST,
        RPL_NUMBER_14_RIGHT_CHEAPEST,
        RPL_NUMBER_15_RIGHT_CHEAPEST,
        RPL_NUMBER_16_RIGHT_CHEAPEST,
        RPL_NUMBER_17_RIGHT_CHEAPEST,
        RPL_NUMBER_18_RIGHT_CHEAPEST,
        RPL_NUMBER_19_RIGHT_CHEAPEST,
        RPL_NUMBER_20_RIGHT_CHEAPEST,
        RPL_NUMBER_21_RIGHT_CHEAPEST,
        RPL_NUMBER_22_RIGHT_CHEAPEST,
        RPL_NUMBER_23_RIGHT_CHEAPEST,
        RPL_NUMBER_24_RIGHT_CHEAPEST,
        RPL_NUMBER_25_RIGHT_CHEAPEST,
        RPL_NUMBER_26_RIGHT_CHEAPEST,
        RPL_NUMBER_27_RIGHT_CHEAPEST,
        RPL_NUMBER_28_RIGHT_CHEAPEST,
        RPL_NUMBER_29_RIGHT_CHEAPEST,
        RPL_NUMBER_30_RIGHT_CHEAPEST,
        RPL_NUMBER_31_RIGHT_CHEAPEST,
        RPL_NUMBER_32_RIGHT_CHEAPEST,
        RPL_NUMBER_33_RIGHT_CHEAPEST,
        RPL_NUMBER_34_RIGHT_CHEAPEST,
        RPL_NUMBER_35_RIGHT_CHEAPEST,
         */
    )

    val help: List<String> = listOf(
        "===== Main Menu Commands =====",
        "New Workfile" + "  [Called from the main screen]",
        "Open Workfile" + "  [Called from the main screen. Opens a workfile if one is highlighted]",

        "",
        "",
        "===== Part Group Commands =====",
        "[All part group commands can be called from anywhere within the Estimate tab]",
        "Go to Part Groups" + " [Takes you to the part groups screen]",
        "Go to (Group Name)" + " [Takes you to the specified part group]",

        "",
        "",
        "===== Workfile Commands =====",
        "Go to Contacts/Insurance/Vehicle/Estimate/Attachments",
        "Go to Motor/Part Codes",
        "Show Parts/Estimate",
        "Print/Print Parts List",
        "Save/Save and Close",

        "",
        "",
        "===== Repair Commands By Number =====",
        "(Used while in a part group)",
        "(Repair command format: repair number position(optional) hours",
        "(Numbers range from 1-37)",
        "(Positions are left and right or driver and passenger)",
        "(Hours range from .5 to 10)",
        "Usage examples:",
        "Repair number 1 driver side half hour",
        "Repair 4 passenger side half an hour",
        "Repair 6 left 10 hours",
        "Repair number 21 right 7 point 5 hours",
        "Repair 10 7 and a half hours",

        "",
        "",
        "===== Replace/Blend/Refinish/R&I/Google =====",
        "(Numbers range from 1-37)",
        "(Positions are left and right)",
        "Usage examples:",
        "Replace number 1",
        "Blend 2 left",
        "Refinish number 7 right",
        "R&I 10 driver side",
        "Google 11" + "  [Will perform a google image search on the part number]",

        "",
        "",
        "===== Repair/Replace Commands By Name =====",
        "[Current list of repair/replace parts:]",
        "Front/Rear Bumper Cover",
        "Hood",
        "Roof",
        "Left/Right Headlamp  (Replace only)",
        "Left/Right Fender",
        "Left Front/Left Rear/Right Front/Right Rear Wheel",
        "Left/Right Rocker Molding",
        "Left/Right Front/Rear/Side Loading Door",
        "Left/Right Quarter/Side Panel",
        "Left/Right Pickup Panel",
        "Trunk Lid/Lift Gate",
        "Left/Right Tail Lamp  (Replace only)",

        "",
        "",
        "===== Estimate Commands =====",
        "(Numbers range from 1-100)",
        "Insert new line" + " [Insert new line at the end of the estimate]",
        "Insert 10/Insert line 10" + "  [Insert new line at a specific line number]",
        "Delete 10/Delete line 10" + "  [Delete line at a specific line number]",
        "Update 10/Update line 10" + " [Update line at a specific line number]",
        "Note 10/Note line 10" + "  [Insert a note at a specific line number]",

        "===== Action Buttons =====",
        "Up/Down Arrow:",
        "-Switches been subgroup menus inside of a part group",
        "-Navigates up/down lists one by one",
        "-Scrolls up/down lists when the up/donw button is held",

        "Mouse:",
        "-When enabled, can be used to interact with the screen",

        "Keyboard",
        "-Can be opened up to begin typing in any field that is focused",

        "===== Touch Gestures =====",
        "-Pinch/Zoom/Pan to get a better view of the screen",
        "-Double tap to reset the screen"

    )

    /** Options for each part **/
    val extraRepairHours: List<String> = listOf(
        ".5 hr",
        "1 hr",
        "1.5 hrs",
        "2 hrs",
        "2.5 hrs",
        "3 hrs",
        "3.5 hrs",
        "4 hrs",
        "4.5 hrs",
        "5 hrs",
        "5.5 hrs",
        "6 hrs",
        "6.5 hrs",
        "7 hrs",
        "7.5 hrs",
        "8 hrs",
        "8.5 hrs",
        "9 hrs",
        "9.5 hrs",
        "10 hrs"
    )

    /** Options for each part: These are the ENDINGS of each possible extra repair **/
    val extraRepairOptionsMap: Map<String, List<String>> = mapOf(
        "bumper cover" to listOf("Replace", "Repair", "R&I"),
        "lamp" to listOf("Replace", "R&I"),
        "emblem" to listOf("Replace", "R&I"),
        "hood" to listOf("Replace", "Repair", "Blend"),
        "fender" to listOf("Replace", "Repair", "Blend"),
        "wheel" to listOf("Replace", "Repair"),
        "TPMS sensor" to listOf("Replace", "R&I"),
        "liner" to listOf("Replace", "R&I"),
        "liner (if applicable)" to listOf("Replace", "R&I"),
        "bracket (if applicable)" to listOf("Replace", "R&I"),
        "nameplate" to listOf("Replace", "R&I"),
        "nameplate(s)" to listOf("Replace", "R&I"),
        "nameplate (if applicable)" to listOf("Replace", "R&I"),
        "molding" to listOf("Replace", "R&I"),
        "molding (if applicable)" to listOf("Replace", "R&I"),
        "rack (if applicable)" to listOf("Replace", "R&I"),
        "spoiler (if applicable)" to listOf("Replace", "Repair", "R&I"),
        "door" to listOf("Replace", "Repair", "Blend"),
        "door (if applicable)" to listOf("Replace", "Repair", "R&I"),
        "door handle" to listOf("Replace", "Repair", "R&I"),
        "panel" to listOf("Replace", "Repair", "Blend"),
        "lid" to listOf("Replace", "Repair", "Blend"),
        "gate" to listOf("Replace", "Repair", "Blend"),
    )

    /** Categories and repairs list **/
    val extraRepairCategoriesMap: Map<String, String> = mapOf(
        "Repair front bumper cover" to "Front Bumper",
        "Replace front bumper cover" to "Front Bumper",
        "Blend front bumper cover" to "Front Bumper",
        "R&I front bumper cover" to "Front Bumper",
        "Overhaul front bumper" to "Front Bumper",
        "Clean and inspect front bumper cover (recycled)" to "Front Bumper",

        "Repair hood" to "Hood",
        "Replace hood" to "Hood",
        "Blend hood" to "Hood",
        "Clean and inspect hood (recycled)" to "Hood",

        "Replace left headlamp" to "Front Lamps",
        "R&I left headlamp" to "Front Lamps",
        "Clean and inspect left headlamp (recycled)" to "Front Lamps",
        "Replace right headlamp" to "Front Lamps",
        "R&I right headlamp" to "Front Lamps",
        "Clean and inspect right headlamp (recycled)" to "Front Lamps",

        "Replace left fender" to "Fender",
        "Repair left fender" to "Fender",
        "Blend left fender" to "Fender",
        "Clean and inspect left fender (recycled)" to "Fender",
        "Replace right fender" to "Fender",
        "Repair right fender" to "Fender",
        "Blend right fender" to "Fender",
        "Clean and inspect right fender (recycled)" to "Fender",

        "Replace left fender liner" to "Fender",
        "R&I left fender liner" to "Fender",
        "Replace right fender liner" to "Fender",
        "R&I right fender liner" to "Fender",

        "Replace left fender nameplate (if applicable)" to "Fender",
        "R&I left fender nameplate (if applicable)" to "Fender",
        "Replace right fender nameplate (if applicable)" to "Fender",
        "R&I right fender nameplate (if applicable)" to "Fender",

        "Replace left fender emblem (if applicable)" to "Fender",
        "R&I left fender emblem (if applicable)" to "Fender",
        "Replace right fender emblem (if applicable)" to "Fender",
        "R&I right fender emblem (if applicable)" to "Fender",

        "Replace left front wheel opening molding (if applicable)" to "Fender",
        "R&I left front wheel opening molding (if applicable)" to "Fender",
        "Replace right front wheel opening molding (if applicable)" to "Fender",
        "R&I right front wheel opening molding (if applicable)" to "Fender",

        "Replace left fender lower molding (if applicable)" to "Fender",
        "R&I left fender lower molding (if applicable)" to "Fender",
        "Replace right fender lower molding (if applicable)" to "Fender",
        "R&I right fender lower molding (if applicable)" to "Fender",

        "Repair left front wheel" to "Wheels",
        "Replace left front wheel" to "Wheels",
        "Clean and inspect left front wheel (recycled)" to "Wheels",
        "Repair right front wheel" to "Wheels",
        "Replace right front wheel" to "Wheels",
        "Clean and inspect right front wheel (recycled)" to "Wheels",
        "Repair left rear wheel" to "Wheels",
        "Replace left rear wheel" to "Wheels",
        "Clean and inspect rear front wheel (recycled)" to "Wheels",
        "Repair right rear wheel" to "Wheels",
        "Replace right rear wheel" to "Wheels",
        "Clean and inspect right rear wheel (recycled)" to "Wheels",

        "Replace left front TPMS sensor" to "Wheels",
        "Replace right front TPMS sensor" to "Wheels",
        "Replace left rear TPMS sensor" to "Wheels",
        "Replace right rear TPMS sensor" to "Wheels",
        "R&I left front TPMS sensor" to "Wheels",
        "R&I right front TPMS sensor" to "Wheels",
        "R&I left rear TPMS sensor" to "Wheels",
        "R&I right rear TPMS sensor" to "Wheels",

        "Replace left aperture panel" to "Aperture",
        "Repair left aperture panel" to "Aperture",
        "Blend left aperture panel" to "Aperture",
        "Replace right aperture panel" to "Aperture",
        "Repair right aperture panel" to "Aperture",
        "Blend right aperture panel" to "Aperture",

        "Replace left roof molding (if applicable)" to "Roof",
        "R&I left roof molding (if applicable)" to "Roof",
        "Replace right roof molding (if applicable)" to "Roof",
        "R&I right roof molding (if applicable)" to "Roof",

        "Replace left roof rack (if applicable)" to "Roof",
        "R&I left roof rack (if applicable)" to "Roof",
        "Replace right roof rack (if applicable)" to "Roof",
        "R&I right roof rack (if applicable)" to "Roof",

        "Replace left front door" to "Front Door",
        "Repair left front door" to "Front Door",
        "Blend left front door" to "Front Door",
        "Clean and inspect left front door (recycled)" to "Front Door",
        "Replace right front door" to "Front Door",
        "Repair right front door" to "Front Door",
        "Blend right front door" to "Front Door",
        "Clean and inspect right front door (recycled)" to "Front Door",

        "Replace left front door handle" to "Front Door",
        "Repair left front door handle" to "Front Door",
        "R&I left front door handle" to "Front Door",
        "Replace right front door handle" to "Front Door",
        "Repair right front door handle" to "Front Door",
        "R&I right front door handle" to "Front Door",

        "Replace left front door nameplate (if applicable)" to "Front Door",
        "R&I left front door nameplate (if applicable)" to "Front Door",
        "Replace right front door nameplate (if applicable)" to "Front Door",
        "R&I right front door nameplate (if applicable)" to "Front Door",

        "Replace left front door belt molding" to "Front Door",
        "R&I left front door belt molding" to "Front Door",
        "Replace right front door belt molding" to "Front Door",
        "R&I right front door belt molding" to "Front Door",

        "Replace left front door side molding (if applicable)" to "Front Door",
        "R&I left front door side molding (if applicable)" to "Front Door",
        "Replace right front door side molding (if applicable)" to "Front Door",
        "R&I right front door side molding (if applicable)" to "Front Door",

        "Replace left front door lower molding (if applicable)" to "Front Door",
        "R&I left front door lower molding (if applicable)" to "Front Door",
        "Replace right front door lower molding (if applicable)" to "Front Door",
        "R&I right front door lower molding (if applicable)" to "Front Door",

        "Replace left rear door" to "Rear Door",
        "Repair left rear door" to "Rear Door",
        "Blend left rear door" to "Rear Door",
        "Clean and inspect left rear door (recycled)" to "Rear Door",
        "Replace right rear door" to "Rear Door",
        "Repair right rear door" to "Rear Door",
        "Blend right rear door" to "Rear Door",
        "Clean and inspect right rear door (recycled)" to "Rear Door",

        "Replace left rear door handle" to "Rear Door",
        "Repair left rear door handle" to "Rear Door",
        "R&I left rear door handle" to "Rear Door",
        "Replace right rear door handle" to "Rear Door",
        "Repair right rear door handle" to "Rear Door",
        "R&I right rear door handle" to "Rear Door",

        "Replace left rear door belt molding" to "Rear Door",
        "R&I left rear door belt molding" to "Rear Door",
        "Replace right rear door belt molding" to "Rear Door",
        "R&I right rear door belt molding" to "Rear Door",

        "Replace left rear door side molding (if applicable)" to "Rear Door",
        "R&I left rear door side molding (if applicable)" to "Rear Door",
        "Replace right rear door side molding (if applicable)" to "Rear Door",
        "R&I right rear door side molding (if applicable)" to "Rear Door",

        "Replace left rear door lower molding (if applicable)" to "Rear Door",
        "R&I left rear door lower molding (if applicable)" to "Rear Door",
        "Replace right rear door lower molding (if applicable)" to "Rear Door",
        "R&I right rear door lower molding (if applicable)" to "Rear Door",

        "Replace left rear door wheel opening molding (if applicable)" to "Rear Door",
        "R&I left rear door wheel opening molding (if applicable)" to "Rear Door",
        "Replace right rear door wheel opening molding (if applicable)" to "Rear Door",
        "R&I right rear door wheel opening molding (if applicable)" to "Rear Door",

        "Replace left side loading door" to "Side Loading Door",
        "Repair left side loading door" to "Side Loading Door",
        "Blend left side loading door" to "Side Loading Door",
        "Clean and inspect left side loading door (recycled)" to "Side Loading Door",
        "Replace right side loading door" to "Side Loading Door",
        "Repair right side loading door" to "Side Loading Door",
        "Blend right side loading door" to "Side Loading Door",
        "Clean and inspect right side loading door (recycled)" to "Side Loading Door",

        "Replace left side loading door handle" to "Side Loading Door",
        "Repair left side loading door handle" to "Side Loading Door",
        "R&I left side loading door handle" to "Side Loading Door",
        "Replace right side loading door handle" to "Side Loading Door",
        "Repair right side loading door handle" to "Side Loading Door",
        "R&I right side loading door handle" to "Side Loading Door",

        "Replace left side loading door belt molding" to "Side Loading Door",
        "R&I left side loading door belt molding" to "Side Loading Door",
        "Replace right side loading door belt molding" to "Side Loading Door",
        "R&I right side loading door belt molding" to "Side Loading Door",

        "Replace left side loading door side molding (if applicable)" to "Side Loading Door",
        "R&I left side loading door side molding (if applicable)" to "Side Loading Door",
        "Replace right side loading door side molding (if applicable)" to "Side Loading Door",
        "R&I right side loading door side molding (if applicable)" to "Side Loading Door",

        "Replace left side loading door lower molding (if applicable)" to "Side Loading Door",
        "R&I left side loading door lower molding (if applicable)" to "Side Loading Door",
        "Replace right side loading door lower molding (if applicable)" to "Side Loading Door",
        "R&I right side loading door lower molding (if applicable)" to "Side Loading Door",

        "Replace left quarter panel" to "Quarter Panel",
        "Repair left quarter panel" to "Quarter Panel",
        "Blend left quarter panel" to "Quarter Panel",
        "Clean and inspect left quarter panel (recycled)" to "Quarter Panel",
        "Replace right quarter panel" to "Quarter Panel",
        "Repair right quarter panel" to "Quarter Panel",
        "Blend right quarter panel" to "Quarter Panel",
        "Clean and inspect right quarter panel (recycled)" to "Quarter Panel",

        "Replace left quarter panel belt molding (if applicable)" to "Quarter Panel",
        "R&I left quarter panel belt molding (if applicable)" to "Quarter Panel",
        "Replace right quarter panel belt molding (if applicable)" to "Quarter Panel",
        "R&I right quarter panel belt molding (if applicable)" to "Quarter Panel",

        "Replace quarter panel fuel door (if applicable)" to "Quarter Panel",
        "Repair quarter panel fuel door (if applicable)" to "Quarter Panel",
        "R&I quarter panel fuel door (if applicable)" to "Quarter Panel",

        "Replace left quarter panel wheelhouse liner (if applicable)" to "Quarter Panel",
        "R&I left quarter panel wheelhouse liner (if applicable)" to "Quarter Panel",
        "Replace right quarter panel wheelhouse liner (if applicable)" to "Quarter Panel",
        "R&I right quarter panel wheelhouse liner (if applicable)" to "Quarter Panel",

        "Replace left quarter panel wheel opening molding (if applicable)" to "Quarter Panel",
        "R&I left quarter panel wheel opening molding (if applicable)" to "Quarter Panel",
        "Replace right quarter panel wheel opening molding (if applicable)" to "Quarter Panel",
        "R&I right quarter panel wheel opening molding (if applicable)" to "Quarter Panel",

        "Mask left quarter panel glass (if applicable)" to "Quarter Panel",
        "Mask right quarter panel glass (if applicable)" to "Quarter Panel",

        "Replace left side panel" to "Side Panel",
        "Repair left side panel" to "Side Panel",
        "Blend left side panel" to "Side Panel",
        "Clean and inspect left side panel (recycled)" to "Side Panel",
        "Replace right side panel" to "Side Panel",
        "Repair right side panel" to "Side Panel",
        "Blend right side panel" to "Side Panel",
        "Clean and inspect right side panel (recycled)" to "Side Panel",

        "Replace side panel fuel door (if applicable)" to "Side Panel",
        "Repair side panel fuel door (if applicable)" to "Side Panel",
        "R&I side panel fuel door (if applicable)" to "Side Panel",

        "Replace left side panel wheelhouse liner (if applicable)" to "Side Panel",
        "R&I left side panel wheelhouse liner (if applicable)" to "Side Panel",
        "Replace right side panel wheelhouse liner (if applicable)" to "Side Panel",
        "R&I right side panel wheelhouse liner (if applicable)" to "Side Panel",

        "Replace left side panel side molding (if applicable)" to "Side Panel",
        "R&I left side panel side molding (if applicable)" to "Side Panel",
        "Replace right side panel side molding (if applicable)" to "Side Panel",
        "R&I right side panel side molding (if applicable)" to "Side Panel",

        "Replace left side panel wheel opening molding (if applicable)" to "Side Panel",
        "R&I left side panel wheel opening molding (if applicable)" to "Side Panel",
        "Replace right side panel wheel opening molding (if applicable)" to "Side Panel",
        "R&I right side panel wheel opening molding (if applicable)" to "Side Panel",

        "Mask left side panel glass (if applicable)" to "Side Panel",
        "Mask right side panel glass (if applicable)" to "Side Panel",

        "Replace left pickup panel" to "Pickup Panel",
        "Repair left pickup panel" to "Pickup Panel",
        "Blend left pickup panel" to "Pickup Panel",
        "Clean and inspect left pickup panel (recycled)" to "Pickup Panel",
        "Replace right pickup panel" to "Pickup Panel",
        "Repair right pickup panel" to "Pickup Panel",
        "Blend right pickup panel" to "Pickup Panel",
        "Clean and inspect right pickup panel (recycled)" to "Pickup Panel",

        "Replace pickup panel fuel door (if applicable)" to "Pickup Panel",
        "Repair pickup panel fuel door (if applicable)" to "Pickup Panel",
        "R&I pickup panel fuel door (if applicable)" to "Pickup Panel",

        "Replace left pickup panel wheelhouse liner (if applicable)" to "Pickup Panel",
        "R&I left pickup panel wheelhouse liner (if applicable)" to "Pickup Panel",
        "Replace right pickup panel wheelhouse liner (if applicable)" to "Pickup Panel",
        "R&I right pickup panel wheelhouse liner (if applicable)" to "Pickup Panel",

        "Replace left pickup panel wheel opening molding (if applicable)" to "Pickup Panel",
        "R&I left pickup panel wheel opening molding (if applicable)" to "Pickup Panel",
        "Replace right pickup panel wheel opening molding (if applicable)" to "Pickup Panel",
        "R&I right pickup panel wheel opening molding (if applicable)" to "Pickup Panel",

        "Repair trunk lid" to "Trunk Lid",
        "Replace trunk lid" to "Trunk Lid",
        "Blend trunk lid" to "Trunk Lid",
        "Clean and inspect trunk lid (recycled)" to "Trunk Lid",

        "Replace trunk lid emblem" to "Trunk Lid",
        "R&I trunk lid emblem" to "Trunk Lid",

        "Replace trunk lid spoiler (if applicable)" to "Trunk Lid",
        "Repair trunk lid spoiler (if applicable)" to "Trunk Lid",
        "R&I trunk lid spoiler (if applicable)" to "Trunk Lid",

        "Replace trunk lid nameplate(s)" to "Trunk Lid",
        "R&I trunk lid nameplate(s)" to "Trunk Lid",

        "Replace trunk lid license bracket (if applicable)" to "Trunk Lid",
        "R&I trunk lid license bracket (if applicable)" to "Trunk Lid",

        "Mask back glass" to "Trunk Lid",

        "Repair lift gate" to "Lift Gate",
        "Replace lift gate" to "Lift Gate",
        "Blend lift gate" to "Lift Gate",
        "Clean and inspect lift gate (recycled)" to "Lift Gate",

        "Replace lift gate emblem" to "Lift Gate",
        "R&I lift gate emblem" to "Lift Gate",

        "Replace lift gate nameplate(s)" to "Lift Gate",
        "R&I lift gate nameplate(s)" to "Lift Gate",

        "Replace lift gate license bracket (if applicable)" to "Lift Gate",
        "R&I lift gate license bracket (if applicable)" to "Lift Gate",

        "Mask lift gate glass" to "Lift Gate",

        "Repair back door" to "Back Door",
        "Replace back door" to "Back Door",
        "Blend back door" to "Back Door",
        "Clean and inspect back door (recycled)" to "Back Door",

        "Replace back door emblem" to "Back Door",
        "R&I back door emblem" to "Back Door",

        "Replace back door nameplate(s)" to "Back Door",
        "R&I back door nameplate(s)" to "Back Door",

        "Replace back door license bracket (if applicable)" to "Back Door",
        "R&I back door license bracket (if applicable)" to "Back Door",

        "Mask back door glass" to "Back Door",

        "Replace left tail lamp" to "Rear Lamps",
        "R&I left tail lamp" to "Rear Lamps",
        "Clean and inspect left tail lamp (recycled)" to "Rear Lamps",
        "Replace right tail lamp" to "Rear Lamps",
        "R&I right tail lamp" to "Rear Lamps",
        "Clean and inspect right tail lamp (recycled)" to "Rear Lamps",

        "Replace left backup lamp (if applicable)" to "Rear Lamps",
        "R&I left backup lamp (if applicable)" to "Rear Lamps",
        "Replace right backup lamp (if applicable)" to "Rear Lamps",
        "R&I right backup lamp (if applicable)" to "Rear Lamps",

        "Replace rear bumper cover" to "Rear Bumper",
        "Repair rear bumper cover" to "Rear Bumper",
        "Blend rear bumper cover" to "Rear Bumper",
        "Clean and inspect rear bumper cover (recycled)" to "Rear Bumper",
        "R&I rear bumper cover" to "Rear Bumper",
        "Overhaul rear bumper" to "Rear Bumper",

        "Cover car" to "Miscellaneous",
        "Flex additive" to "Miscellaneous",
        "Hazardous waste removal" to "Miscellaneous",
        "Chip guard" to "Miscellaneous",
        "Wheel alignment" to "Miscellaneous",
    )

    /** New repairs to include/exclude when repair type is changed from R&I to repair/replace **/
    val extraRepairAdditionalRepairs: Map<String, List<String>> = mapOf(
        "Repair front bumper cover" to listOf(
            "Overhaul front bumper---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Flex additive---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
        ),
        "Replace front bumper cover" to listOf(
            "Overhaul front bumper---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Flex additive---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
        ),
        "Replace left headlamp" to listOf(
            "Clean and inspect recycled left headlamp---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
        ),
        "Replace right headlamp" to listOf(
            "Clean and inspect recycled right headlamp---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
        ),
        "Replace hood" to listOf(
            "Clean and inspect recycled hood---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
        ),
        "Repair left fender" to listOf(
            "Blend left aperture---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend hood---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend left front door---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left front door handle---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left front door belt molding---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left front door nameplate (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left front door side molding (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left front door lower molding (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
        ),
        "Replace left fender" to listOf(
            "Clean and inspect recycled left fender---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend left aperture---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend hood---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend left front door---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left front door handle---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left front door belt molding---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left front door nameplate (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left front door side molding (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left front door lower molding (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
        ),
        "Repair right fender" to listOf(
            "Blend right aperture---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend hood---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend right front door---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door handle---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door belt molding---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door nameplate (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door side molding (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door lower molding (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
        ),
        "Replace right fender" to listOf(
            "Clean and inspect recycled right fender---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend right aperture---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend hood---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend right front door---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door handle---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door belt molding---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door nameplate (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door side molding (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door lower molding (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
        ),
        "Blend right fender" to listOf(
            "Blend right front door---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door handle---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door belt molding---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door nameplate (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door side molding (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door lower molding (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
        ),
        "Repair left front door" to listOf(
            "R&I front bumper cover---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left headlamp---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend left fender---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left fender liner---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left fender nameplate (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left front wheel opening molding (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend left rear door---4dquartertrunk,4dquarterliftgate,4dpickup",
            "R&I left rear door handle---4dquartertrunk,4dquarterliftgate,4dpickup",
            "R&I left rear door belt molding---4dquartertrunk,4dquarterliftgate,4dpickup",
            "R&I left rear door side molding (if applicable)---4dquartertrunk,4dquarterliftgate,4dpickup",
            "R&I left rear door lower molding (if applicable)---4dquartertrunk,4dquarterliftgate,4dpickup",
            "Blend left side loading door---4dslidingliftgate",
            "R&I left side loading door handle---4dslidingliftgate",
            "R&I left side loading door belt molding---4dslidingliftgate",
            "R&I left side loading door side molding (if applicable)---4dslidingliftgate",
            "R&I left side loading door lower molding (if applicable)---4dslidingliftgate",
            "Blend left quarter panel---2dquartertrunk,2dquarterliftgate",
            "R&I quarter panel fuel door (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I left quarter panel wheelhouse liner (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I left quarter panel wheel opening molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "Mask left quarter panel glass---2dquartertrunk,2dquarterliftgate",
            "R&I left roof molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I left roof rack (if applicable)---2dquartertrunk,2dquarterliftgate",
            "Blend left pickup panel---2dpickup",
            "R&I pickup panel fuel door (if applicable)---2dpickup",
            "R&I left pickup panel wheelhouse liner (if applicable)---2dpickup",
            "R&I left pickup panel wheel opening molding (if applicable)---2dpickup",
            "R&I left tail lamp---2dquartertrunk,2dquarterliftgate,2dpickup",
            "R&I rear bumper cover---2dquartertrunk,2dquarterliftgate,2dpickup",
        ),
        "Replace left front door" to listOf(
            "Clean and inspect recycled left front door---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left headlamp---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend left fender---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left fender liner---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left fender nameplate (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left front wheel opening molding (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend left rear door---4dquartertrunk,4dquarterliftgate,4dpickup",
            "R&I left rear door handle---4dquartertrunk,4dquarterliftgate,4dpickup",
            "R&I left rear door belt molding---4dquartertrunk,4dquarterliftgate,4dpickup",
            "R&I left rear door side molding (if applicable)---4dquartertrunk,4dquarterliftgate,4dpickup",
            "R&I left rear door lower molding (if applicable)---4dquartertrunk,4dquarterliftgate,4dpickup",
            "Blend left side loading door---4dslidingliftgate",
            "R&I left side loading door handle---4dslidingliftgate",
            "R&I left side loading door belt molding---4dslidingliftgate",
            "R&I left side loading door side molding (if applicable)---4dslidingliftgate",
            "R&I left side loading door lower molding (if applicable)---4dslidingliftgate",
            "Blend left quarter panel---2dquartertrunk,2dquarterliftgate",
            "R&I quarter panel fuel door (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I left quarter panel wheelhouse liner (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I left quarter panel wheel opening molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "Mask left quarter panel glass---2dquartertrunk,2dquarterliftgate",
            "R&I left roof molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I left roof rack (if applicable)---2dquartertrunk,2dquarterliftgate",
            "Blend left pickup panel---2dpickup",
            "R&I pickup panel fuel door (if applicable)---2dpickup",
            "R&I left pickup panel wheelhouse liner (if applicable)---2dpickup",
            "R&I left pickup panel wheel opening molding (if applicable)---2dpickup",
            "R&I left tail lamp---2dquartertrunk,2dquarterliftgate,2dpickup",
            "R&I rear bumper cover---2dquartertrunk,2dquarterliftgate,2dpickup",
        ),
        "Blend left front door" to listOf(
            "R&I front bumper cover---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left headlamp---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend left fender---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left fender liner---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left fender nameplate (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left front wheel opening molding (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend left rear door---4dquartertrunk,4dquarterliftgate,4dpickup",
            "R&I left rear door handle---4dquartertrunk,4dquarterliftgate,4dpickup",
            "R&I left rear door belt molding---4dquartertrunk,4dquarterliftgate,4dpickup",
            "R&I left rear door side molding (if applicable)---4dquartertrunk,4dquarterliftgate,4dpickup",
            "R&I left rear door lower molding (if applicable)---4dquartertrunk,4dquarterliftgate,4dpickup",
            "Blend left side loading door---4dslidingliftgate",
            "R&I left side loading door handle---4dslidingliftgate",
            "R&I left side loading door belt molding---4dslidingliftgate",
            "R&I left side loading door side molding (if applicable)---4dslidingliftgate",
            "R&I left side loading door lower molding (if applicable)---4dslidingliftgate",
            "Blend left quarter panel---2dquartertrunk,2dquarterliftgate",
            "R&I quarter panel fuel door (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I left quarter panel wheelhouse liner (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I left quarter panel wheel opening molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "Mask left quarter panel glass---2dquartertrunk,2dquarterliftgate",
            "R&I left roof molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I left roof rack (if applicable)---2dquartertrunk,2dquarterliftgate",
            "Blend left pickup panel---2dpickup",
            "R&I pickup panel fuel door (if applicable)---2dpickup",
            "R&I left pickup panel wheelhouse liner (if applicable)---2dpickup",
            "R&I left pickup panel wheel opening molding (if applicable)---2dpickup",
            "R&I left tail lamp---2dquartertrunk,2dquarterliftgate,2dpickup",
            "R&I rear bumper cover---2dquartertrunk,2dquarterliftgate,2dpickup",
        ),
        "Repair right front door" to listOf(
            "R&I front bumper cover---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right headlamp---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend right fender---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right fender liner---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right fender nameplate (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front wheel opening molding (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend right rear door---4dquartertrunk,4dquarterliftgate,4dpickup",
            "R&I right rear door handle---4dquartertrunk,4dquarterliftgate,4dpickup",
            "R&I right rear door belt molding---4dquartertrunk,4dquarterliftgate,4dpickup",
            "R&I right rear door side molding (if applicable)---4dquartertrunk,4dquarterliftgate,4dpickup",
            "R&I right rear door lower molding (if applicable)---4dquartertrunk,4dquarterliftgate,4dpickup",
            "Blend right side loading door---4dslidingliftgate",
            "R&I right side loading door handle---4dslidingliftgate",
            "R&I right side loading door belt molding---4dslidingliftgate",
            "R&I right side loading door side molding (if applicable)---4dslidingliftgate",
            "R&I right side loading door lower molding (if applicable)---4dslidingliftgate",
            "Blend right quarter panel---2dquartertrunk,2dquarterliftgate",
            "R&I quarter panel fuel door (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I right quarter panel wheelhouse liner (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I right quarter panel wheel opening molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "Mask right quarter panel glass---2dquartertrunk,2dquarterliftgate",
            "R&I right roof molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I right roof rack (if applicable)---2dquartertrunk,2dquarterliftgate",
            "Blend right pickup panel---2dpickup",
            "R&I pickup panel fuel door (if applicable)---2dpickup",
            "R&I right pickup panel wheelhouse liner (if applicable)---2dpickup",
            "R&I right pickup panel wheel opening molding (if applicable)---2dpickup",
            "R&I right tail lamp---2dquartertrunk,2dquarterliftgate,2dpickup",
            "R&I rear bumper cover---2dquartertrunk,2dquarterliftgate,2dpickup",
        ),
        "Replace right front door" to listOf(
            "Clean and inspect recycled right front door---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right headlamp---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend right fender---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right fender liner---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right fender nameplate (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front wheel opening molding (if applicable)---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend right rear door---4dquartertrunk,4dquarterliftgate,4dpickup",
            "R&I right rear door handle---4dquartertrunk,4dquarterliftgate,4dpickup",
            "R&I right rear door belt molding---4dquartertrunk,4dquarterliftgate,4dpickup",
            "R&I right rear door side molding (if applicable)---4dquartertrunk,4dquarterliftgate,4dpickup",
            "R&I right rear door lower molding (if applicable)---4dquartertrunk,4dquarterliftgate,4dpickup",
            "Blend right side loading door---4dslidingliftgate",
            "R&I right side loading door handle---4dslidingliftgate",
            "R&I right side loading door belt molding---4dslidingliftgate",
            "R&I right side loading door side molding (if applicable)---4dslidingliftgate",
            "R&I right side loading door lower molding (if applicable)---4dslidingliftgate",
            "Blend right quarter panel---2dquartertrunk,2dquarterliftgate",
            "R&I quarter panel fuel door (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I right quarter panel wheelhouse liner (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I right quarter panel wheel opening molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "Mask right quarter panel glass---2dquartertrunk,2dquarterliftgate",
            "R&I right roof molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I right roof rack (if applicable)---2dquartertrunk,2dquarterliftgate",
            "Blend right pickup panel---2dpickup",
            "R&I pickup panel fuel door (if applicable)---2dpickup",
            "R&I right pickup panel wheelhouse liner (if applicable)---2dpickup",
            "R&I right pickup panel wheel opening molding (if applicable)---2dpickup",
            "R&I right tail lamp---2dquartertrunk,2dquarterliftgate,2dpickup",
            "R&I rear bumper cover---2dquartertrunk,2dquarterliftgate,2dpickup",
        ),
        "Repair left rear door" to listOf(
            "Blend left front door---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left front door handle---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left front door belt molding---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left front door nameplate (if applicable)---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left front door side molding (if applicable)---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left front door lower molding (if applicable)---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend left quarter panel---4dquartertrunk,4dquarterliftgate",
            "R&I quarter panel fuel door (if applicable)---4dquartertrunk,4dquarterliftgate",
            "R&I left quarter panel wheelhouse liner (if applicable)---4dquartertrunk,4dquarterliftgate",
            "R&I left quarter panel wheel opening molding (if applicable)---4dquartertrunk,4dquarterliftgate",
            "Mask left quarter panel glass---4dquartertrunk,4dquarterliftgate",
            "R&I left roof molding (if applicable)---4dquartertrunk,4dquarterliftgate",
            "R&I left roof rack (if applicable)---4d,quarter,trunk,lift",
            "Blend left pickup panel---4dpickup",
            "R&I pickup panel fuel door (if applicable)---4dpickup",
            "R&I left pickup panel wheelhouse liner (if applicable)---4dpickup",
            "R&I left pickup panel wheel opening molding (if applicable)---4dpickup",
            "R&I left tail lamp---4dquartertrunk,4dquarterliftgate,4dpickup",
            "R&I rear bumper cover---4dquartertrunk,4dquarterliftgate,4dpickup",
        ),
        "Replace left rear door" to listOf(
            "Clean and inspect recycled left rear door---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend left front door---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left front door handle---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left front door belt molding---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left front door nameplate (if applicable)---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left front door side molding (if applicable)---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I left front door lower molding (if applicable)---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend left quarter panel---4dquartertrunk,4dquarterliftgate",
            "R&I quarter panel fuel door (if applicable)---4dquartertrunk,4dquarterliftgate",
            "R&I left quarter panel wheelhouse liner (if applicable)---4dquartertrunk,4dquarterliftgate",
            "R&I left quarter panel wheel opening molding (if applicable)---4dquartertrunk,4dquarterliftgate",
            "Mask left quarter panel glass---4dquartertrunk,4dquarterliftgate",
            "R&I left roof molding (if applicable)---4dquartertrunk,4dquarterliftgate",
            "R&I left roof rack (if applicable)---4d,quarter,trunk,lift",
            "Blend left pickup panel---4dpickup",
            "R&I pickup panel fuel door (if applicable)---4dpickup",
            "R&I left pickup panel wheelhouse liner (if applicable)---4dpickup",
            "R&I left pickup panel wheel opening molding (if applicable)---4dpickup",
            "R&I left tail lamp---4dquartertrunk,4dquarterliftgate,4dpickup",
            "R&I rear bumper cover---4dquartertrunk,4dquarterliftgate,4dpickup",
        ),
        "Repair right rear door" to listOf(
            "Blend right front door---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door handle---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door belt molding---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door nameplate (if applicable)---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door side molding (if applicable)---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door lower molding (if applicable)---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend right quarter panel---4dquartertrunk,4dquarterliftgate",
            "R&I quarter panel fuel door (if applicable)---4dquartertrunk,4dquarterliftgate",
            "R&I right quarter panel wheelhouse liner (if applicable)---4dquartertrunk,4dquarterliftgate",
            "R&I right quarter panel wheel opening molding (if applicable)---4dquartertrunk,4dquarterliftgate",
            "Mask right quarter panel glass---4dquartertrunk,4dquarterliftgate",
            "R&I right roof molding (if applicable)---4dquartertrunk,4dquarterliftgate",
            "R&I right roof rack (if applicable)---4d,quarter,trunk,lift",
            "Blend right pickup panel---4dpickup",
            "R&I pickup panel fuel door (if applicable)---4dpickup",
            "R&I right pickup panel wheelhouse liner (if applicable)---4dpickup",
            "R&I right pickup panel wheel opening molding (if applicable)---4dpickup",
            "R&I right tail lamp---4dquartertrunk,4dquarterliftgate,4dpickup",
            "R&I rear bumper cover---4dquartertrunk,4dquarterliftgate,4dpickup",
        ),
        "Replace right rear door" to listOf(
            "Clean and inspect recycled right rear door---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend right front door---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door handle---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door belt molding---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door nameplate (if applicable)---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door side molding (if applicable)---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "R&I right front door lower molding (if applicable)---4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Blend right quarter panel---4dquartertrunk,4dquarterliftgate",
            "R&I quarter panel fuel door (if applicable)---4dquartertrunk,4dquarterliftgate",
            "R&I right quarter panel wheelhouse liner (if applicable)---4dquartertrunk,4dquarterliftgate",
            "R&I right quarter panel wheel opening molding (if applicable)---4dquartertrunk,4dquarterliftgate",
            "Mask right quarter panel glass---4dquartertrunk,4dquarterliftgate",
            "R&I right roof molding (if applicable)---4dquartertrunk,4dquarterliftgate",
            "R&I right roof rack (if applicable)---4d,quarter,trunk,lift",
            "Blend right pickup panel---4dpickup",
            "R&I pickup panel fuel door (if applicable)---4dpickup",
            "R&I right pickup panel wheelhouse liner (if applicable)---4dpickup",
            "R&I right pickup panel wheel opening molding (if applicable)---4dpickup",
            "R&I right tail lamp---4dquartertrunk,4dquarterliftgate,4dpickup",
            "R&I rear bumper cover---4dquartertrunk,4dquarterliftgate,4dpickup",
        ),
        "Repair left side loading door" to listOf(
            "Blend left front door---4dslidingliftgate",
            "R&I left front door handle---4dslidingliftgate",
            "R&I left front door belt molding---4dslidingliftgate",
            "R&I left front door nameplate (if applicable)---4dslidingliftgate",
            "R&I left front door side molding (if applicable)---4dslidingliftgate",
            "R&I left front door lower molding (if applicable)---4dslidingliftgate",
            "Blend left side panel---4dslidingliftgate",
            "R&I side panel fuel door (if applicable)---4dslidingliftgate",
            "R&I left side panel wheelhouse liner (if applicable)---4dslidingliftgate",
            "R&I left side panel side molding (if applicable)---4dslidingliftgate",
            "R&I left side panel wheel opening molding (if applicable)---4dslidingliftgate",
            "Mask left side panel glass---4dslidingliftgate",
            "R&I left roof molding (if applicable)---4dslidingliftgate",
            "R&I left roof rack (if applicable)---4dslidingliftgate",
            "R&I left tail lamp---4dslidingliftgate",
            "R&I rear bumper cover---4dslidingliftgate",
        ),
        "Replace left side loading door" to listOf(
            "Clean and inspect recycled left side loading door---4dslidingliftgate",
            "Blend left front door---4dslidingliftgate",
            "R&I left front door handle---4dslidingliftgate",
            "R&I left front door belt molding---4dslidingliftgate",
            "R&I left front door nameplate (if applicable)---4dslidingliftgate",
            "R&I left front door side molding (if applicable)---4dslidingliftgate",
            "R&I left front door lower molding (if applicable)---4dslidingliftgate",
            "Blend left side panel---4dslidingliftgate",
            "R&I side panel fuel door (if applicable)---4dslidingliftgate",
            "R&I left side panel wheelhouse liner (if applicable)---4dslidingliftgate",
            "R&I left side panel side molding (if applicable)---4dslidingliftgate",
            "R&I left side panel wheel opening molding (if applicable)---4dslidingliftgate",
            "Mask left side panel glass---4dslidingliftgate",
            "R&I left roof molding (if applicable)---4dslidingliftgate",
            "R&I left roof rack (if applicable)---4dslidingliftgate",
            "R&I left tail lamp---4dslidingliftgate",
            "R&I rear bumper cover---4dslidingliftgate",
        ),
        "Repair right side loading door" to listOf(
            "Blend right front door---4dslidingliftgate",
            "R&I right front door handle---4dslidingliftgate",
            "R&I right front door belt molding---4dslidingliftgate",
            "R&I right front door nameplate (if applicable)---4dslidingliftgate",
            "R&I right front door side molding (if applicable)---4dslidingliftgate",
            "R&I right front door lower molding (if applicable)---4dslidingliftgate",
            "Blend right side panel---4dslidingliftgate",
            "R&I side panel fuel door (if applicable)---4dslidingliftgate",
            "R&I right side panel wheelhouse liner (if applicable)---4dslidingliftgate",
            "R&I right side panel side molding (if applicable)---4dslidingliftgate",
            "R&I right side panel wheel opening molding (if applicable)---4dslidingliftgate",
            "Mask right side panel glass---4dslidingliftgate",
            "R&I right roof molding (if applicable)---4dslidingliftgate",
            "R&I right roof rack (if applicable)---4dslidingliftgate",
            "R&I right tail lamp---4dslidingliftgate",
            "R&I rear bumper cover---4dslidingliftgate",
        ),
        "Replace right side loading door" to listOf(
            "Clean and inspect recycled right side loading door---4dslidingliftgate",
            "Blend right front door---4dslidingliftgate",
            "R&I right front door handle---4dslidingliftgate",
            "R&I right front door belt molding---4dslidingliftgate",
            "R&I right front door nameplate (if applicable)---4dslidingliftgate",
            "R&I right front door side molding (if applicable)---4dslidingliftgate",
            "R&I right front door lower molding (if applicable)---4dslidingliftgate",
            "Blend right side panel---4dslidingliftgate",
            "R&I side panel fuel door (if applicable)---4dslidingliftgate",
            "R&I right side panel wheelhouse liner (if applicable)---4dslidingliftgate",
            "R&I right side panel side molding (if applicable)---4dslidingliftgate",
            "R&I right side panel wheel opening molding (if applicable)---4dslidingliftgate",
            "Mask right side panel glass---4dslidingliftgate",
            "R&I right roof molding (if applicable)---4dslidingliftgate",
            "R&I right roof rack (if applicable)---4dslidingliftgate",
            "R&I right tail lamp---4dslidingliftgate",
            "R&I rear bumper cover---4dslidingliftgate",
        ),
        "Repair left quarter panel" to listOf(
            "Blend left front door---2dquartertrunk,2dquarterliftgate",
            "R&I left front door handle---2dquartertrunk,2dquarterliftgate",
            "R&I left front door belt molding---2dquartertrunk,2dquarterliftgate",
            "R&I left front door nameplate (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I left front door side molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I left front door lower molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "Blend left rear door---4dquartertrunk,4dquarterliftgate",
            "R&I left rear door handle---4dquartertrunk,4dquarterliftgate",
            "R&I left rear door belt molding---4dquartertrunk,4dquarterliftgate",
            "R&I left rear door side molding (if applicable)---4dquartertrunk,4dquarterliftgate",
            "R&I left rear door lower molding (if applicable)---4dquartertrunk,4dquarterliftgate",
            "Blend trunk---2dquartertrunk,4dquartertrunk",
            "R&I trunk lid emblem---2dquartertrunk,4dquartertrunk",
            "R&I trunk lid spoiler (if applicable)---2dquartertrunk,4dquartertrunk",
            "R&I trunk lid nameplate---2dquartertrunk,4dquartertrunk",
            "R&I trunk lid license bracket (if applicable)---2dquartertrunk,4dquartertrunk",
            "Mask back glass---2dquartertrunk,4dquartertrunk",
            "Blend lift gate---2dquarterliftgate,4dquarterliftgate",
            "R&I lift gate emblem---2dquarterliftgate,4dquarterliftgate",
            "R&I lift gate spoiler (if applicable)---2dquarterliftgate,4dquarterliftgate",
            "R&I lift gate license bracket (if applicable)---2dquarterliftgate,4dquarterliftgate",
            "Mask lift gate glass---2dquarterliftgate,4dquarterliftgate",
        ),
        "Replace left quarter panel" to listOf(
            "Blend left front door---2dquartertrunk,2dquarterliftgate",
            "R&I left front door handle---2dquartertrunk,2dquarterliftgate",
            "R&I left front door belt molding---2dquartertrunk,2dquarterliftgate",
            "R&I left front door nameplate (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I left front door side molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I left front door lower molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "Blend left rear door---4dquartertrunk,4dquarterliftgate",
            "R&I left rear door handle---4dquartertrunk,4dquarterliftgate",
            "R&I left rear door belt molding---4dquartertrunk,4dquarterliftgate",
            "R&I left rear door side molding (if applicable)---4dquartertrunk,4dquarterliftgate",
            "R&I left rear door lower molding (if applicable)---4dquartertrunk,4dquarterliftgate",
            "Blend trunk---2dquartertrunk,4dquartertrunk",
            "R&I trunk lid emblem---2dquartertrunk,4dquartertrunk",
            "R&I trunk lid spoiler (if applicable)---2dquartertrunk,4dquartertrunk",
            "R&I trunk lid nameplate---2dquartertrunk,4dquartertrunk",
            "R&I trunk lid license bracket (if applicable)---2dquartertrunk,4dquartertrunk",
            "Mask back glass---2dquartertrunk,4dquartertrunk",
            "Blend lift gate---2dquarterliftgate,4dquarterliftgate",
            "R&I lift gate emblem---2dquarterliftgate,4dquarterliftgate",
            "R&I lift gate spoiler (if applicable)---2dquarterliftgate,4dquarterliftgate",
            "R&I lift gate license bracket (if applicable)---2dquarterliftgate,4dquarterliftgate",
            "Mask lift gate glass---2dquarterliftgate,4dquarterliftgate",
        ),
        "Repair right quarter panel" to listOf(
            "Blend right front door---2dquartertrunk,2dquarterliftgate",
            "R&I right front door handle---2dquartertrunk,2dquarterliftgate",
            "R&I right front door belt molding---2dquartertrunk,2dquarterliftgate",
            "R&I right front door nameplate (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I right front door side molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I right front door lower molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "Blend right rear door---4dquartertrunk,4dquarterliftgate",
            "R&I right rear door handle---4dquartertrunk,4dquarterliftgate",
            "R&I right rear door belt molding---4dquartertrunk,4dquarterliftgate",
            "R&I right rear door side molding (if applicable)---4dquartertrunk,4dquarterliftgate",
            "R&I right rear door lower molding (if applicable)---4dquartertrunk,4dquarterliftgate",
            "Blend trunk---2dquartertrunk,4dquartertrunk",
            "R&I trunk lid emblem---2dquartertrunk,4dquartertrunk",
            "R&I trunk lid spoiler (if applicable)---2dquartertrunk,4dquartertrunk",
            "R&I trunk lid nameplate---2dquartertrunk,4dquartertrunk",
            "R&I trunk lid license bracket (if applicable)---2dquartertrunk,4dquartertrunk",
            "Mask back glass---2dquartertrunk,4dquartertrunk",
            "Blend lift gate---2dquarterliftgate,4dquarterliftgate",
            "R&I lift gate emblem---2dquarterliftgate,4dquarterliftgate",
            "R&I lift gate spoiler (if applicable)---2dquarterliftgate,4dquarterliftgate",
            "R&I lift gate license bracket (if applicable)---2dquarterliftgate,4dquarterliftgate",
            "Mask lift gate glass---2dquarterliftgate,4dquarterliftgate",
        ),
        "Replace right quarter panel" to listOf(
            "Blend right front door---2dquartertrunk,2dquarterliftgate",
            "R&I right front door handle---2dquartertrunk,2dquarterliftgate",
            "R&I right front door belt molding---2dquartertrunk,2dquarterliftgate",
            "R&I right front door nameplate (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I right front door side molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I right front door lower molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "Blend right rear door---4dquartertrunk,4dquarterliftgate",
            "R&I right rear door handle---4dquartertrunk,4dquarterliftgate",
            "R&I right rear door belt molding---4dquartertrunk,4dquarterliftgate",
            "R&I right rear door side molding (if applicable)---4dquartertrunk,4dquarterliftgate",
            "R&I right rear door lower molding (if applicable)---4dquartertrunk,4dquarterliftgate",
            "Blend trunk---2dquartertrunk,4dquartertrunk",
            "R&I trunk lid emblem---2dquartertrunk,4dquartertrunk",
            "R&I trunk lid spoiler (if applicable)---2dquartertrunk,4dquartertrunk",
            "R&I trunk lid nameplate---2dquartertrunk,4dquartertrunk",
            "R&I trunk lid license bracket (if applicable)---2dquartertrunk,4dquartertrunk",
            "Mask back glass---2dquartertrunk,4dquartertrunk",
            "Blend lift gate---2dquarterliftgate,4dquarterliftgate",
            "R&I lift gate emblem---2dquarterliftgate,4dquarterliftgate",
            "R&I lift gate spoiler (if applicable)---2dquarterliftgate,4dquarterliftgate",
            "R&I lift gate license bracket (if applicable)---2dquarterliftgate,4dquarterliftgate",
            "Mask lift gate glass---2dquarterliftgate,4dquarterliftgate",
        ),
        "Repair left side panel" to listOf(
            "Blend left front door---2dquartertrunk,2dquarterliftgate",
            "R&I left front door handle---2dquartertrunk,2dquarterliftgate",
            "R&I left front door belt molding---2dquartertrunk,2dquarterliftgate",
            "R&I left front door nameplate (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I left front door side molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I left front door lower molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "Blend left side loading door---4dslidingliftgate",
            "R&I left side loading door handle---4dslidingliftgate",
            "R&I left side loading door belt molding---4dslidingliftgate",
            "R&I left side loading door side molding (if applicable)---4dslidingliftgate",
            "R&I left side loading door lower molding (if applicable)---4dslidingliftgate",
            "Mask back glass---2dquartertrunk,4dquartertrunk",
            "Blend lift gate---2dquarterliftgate,4dquarterliftgate",
            "R&I lift gate emblem---2dquarterliftgate,4dquarterliftgate",
            "R&I lift gate spoiler (if applicable)---2dquarterliftgate,4dquarterliftgate",
            "R&I lift gate license bracket (if applicable)---2dquarterliftgate,4dquarterliftgate",
            "Mask lift gate glass---2dquarterliftgate,4dquarterliftgate",
        ),
        "Replace left side panel" to listOf(
            "Blend left front door---2dquartertrunk,2dquarterliftgate",
            "R&I left front door handle---2dquartertrunk,2dquarterliftgate",
            "R&I left front door belt molding---2dquartertrunk,2dquarterliftgate",
            "R&I left front door nameplate (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I left front door side molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I left front door lower molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "Blend left side loading door---4dslidingliftgate",
            "R&I left side loading door handle---4dslidingliftgate",
            "R&I left side loading door belt molding---4dslidingliftgate",
            "R&I left side loading door side molding (if applicable)---4dslidingliftgate",
            "R&I left side loading door lower molding (if applicable)---4dslidingliftgate",
            "Mask back glass---2dquartertrunk,4dquartertrunk",
            "Blend lift gate---2dquarterliftgate,4dquarterliftgate",
            "R&I lift gate emblem---2dquarterliftgate,4dquarterliftgate",
            "R&I lift gate spoiler (if applicable)---2dquarterliftgate,4dquarterliftgate",
            "R&I lift gate license bracket (if applicable)---2dquarterliftgate,4dquarterliftgate",
            "Mask lift gate glass---2dquarterliftgate,4dquarterliftgate",
        ),
        "Repair right side panel" to listOf(
            "Blend right front door---2dquartertrunk,2dquarterliftgate",
            "R&I right front door handle---2dquartertrunk,2dquarterliftgate",
            "R&I right front door belt molding---2dquartertrunk,2dquarterliftgate",
            "R&I right front door nameplate (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I right front door side molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I right front door lower molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "Blend right side loading door---4dslidingliftgate",
            "R&I right side loading door handle---4dslidingliftgate",
            "R&I right side loading door belt molding---4dslidingliftgate",
            "R&I right side loading door side molding (if applicable)---4dslidingliftgate",
            "R&I right side loading door lower molding (if applicable)---4dslidingliftgate",
            "Mask back glass---2dquartertrunk,4dquartertrunk",
            "Blend lift gate---2dquarterliftgate,4dquarterliftgate",
            "R&I lift gate emblem---2dquarterliftgate,4dquarterliftgate",
            "R&I lift gate spoiler (if applicable)---2dquarterliftgate,4dquarterliftgate",
            "R&I lift gate license bracket (if applicable)---2dquarterliftgate,4dquarterliftgate",
            "Mask lift gate glass---2dquarterliftgate,4dquarterliftgate",
        ),
        "Replace right side panel" to listOf(
            "Blend right front door---2dquartertrunk,2dquarterliftgate",
            "R&I right front door handle---2dquartertrunk,2dquarterliftgate",
            "R&I right front door belt molding---2dquartertrunk,2dquarterliftgate",
            "R&I right front door nameplate (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I right front door side molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "R&I right front door lower molding (if applicable)---2dquartertrunk,2dquarterliftgate",
            "Blend right side loading door---4dslidingliftgate",
            "R&I right side loading door handle---4dslidingliftgate",
            "R&I right side loading door belt molding---4dslidingliftgate",
            "R&I right side loading door side molding (if applicable)---4dslidingliftgate",
            "R&I right side loading door lower molding (if applicable)---4dslidingliftgate",
            "Mask back glass---2dquartertrunk,4dquartertrunk",
            "Blend lift gate---2dquarterliftgate,4dquarterliftgate",
            "R&I lift gate emblem---2dquarterliftgate,4dquarterliftgate",
            "R&I lift gate spoiler (if applicable)---2dquarterliftgate,4dquarterliftgate",
            "R&I lift gate license bracket (if applicable)---2dquarterliftgate,4dquarterliftgate",
            "Mask lift gate glass---2dquarterliftgate,4dquarterliftgate",
        ),
        "Repair left pickup panel" to listOf(
            "Blend left front door---2dpickup",
            "R&I left front door handle---2dpickup",
            "R&I left front door belt molding---2dpickup",
            "R&I left front door nameplate (if applicable)---2dpickup",
            "R&I left front door side molding (if applicable)---2dpickup",
            "R&I left front door lower molding (if applicable)---2dpickup",
            "Blend left rear door---4dpickup",
            "R&I left rear door handle---4dpickup",
            "R&I left rear door belt molding---4dpickup",
            "R&I left rear door side molding (if applicable)---4dpickup",
            "R&I left rear door lower molding (if applicable)---4dpickup",
        ),
        "Replace left pickup panel" to listOf(
            "Blend left front door---2dpickup",
            "R&I left front door handle---2dpickup",
            "R&I left front door belt molding---2dpickup",
            "R&I left front door nameplate (if applicable)---2dpickup",
            "R&I left front door side molding (if applicable)---2dpickup",
            "R&I left front door lower molding (if applicable)---2dpickup",
            "Blend left rear door---4dpickup",
            "R&I left rear door handle---4dpickup",
            "R&I left rear door belt molding---4dpickup",
            "R&I left rear door side molding (if applicable)---4dpickup",
            "R&I left rear door lower molding (if applicable)---4dpickup",
        ),
        "Repair right pickup panel" to listOf(
            "Blend right front door---2dpickup",
            "R&I right front door handle---2dpickup",
            "R&I right front door belt molding---2dpickup",
            "R&I right front door nameplate (if applicable)---2dpickup",
            "R&I right front door side molding (if applicable)---2dpickup",
            "R&I right front door lower molding (if applicable)---2dpickup",
            "Blend right rear door---4dpickup",
            "R&I right rear door handle---4dpickup",
            "R&I right rear door belt molding---4dpickup",
            "R&I right rear door side molding (if applicable)---4dpickup",
            "R&I right rear door lower molding (if applicable)---4dpickup",
        ),
        "Replace right pickup panel" to listOf(
            "Blend right front door---2dpickup",
            "R&I right front door handle---2dpickup",
            "R&I right front door belt molding---2dpickup",
            "R&I right front door nameplate (if applicable)---2dpickup",
            "R&I right front door side molding (if applicable)---2dpickup",
            "R&I right front door lower molding (if applicable)---2dpickup",
            "Blend right rear door---4dpickup",
            "R&I right rear door handle---4dpickup",
            "R&I right rear door belt molding---4dpickup",
            "R&I right rear door side molding (if applicable)---4dpickup",
            "R&I right rear door lower molding (if applicable)---4dpickup",
        ),
        "Replace trunk lid" to listOf(
            "Clean and inspect recycled trunk lid---2dquartertrunk,4dquartertrunk"
        ),
        "Replace lift gate" to listOf(
            "Clean and inspect recycled lift gate---2dquarterliftgate,4dquarterliftgate,4dslidingliftgate"
        ),
        "Replace left tail lamp" to listOf(
            "Clean and inspect recycled left tail lamp---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
        ),
        "Replace right tail lamp" to listOf(
            "Clean and inspect recycled right tail lamp---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
        ),
        "Repair rear bumper cover" to listOf(
            "Overhaul rear bumper---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Flex additive---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
        ),
        "Replace rear bumper cover" to listOf(
            "Overhaul rear bumper---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
            "Flex additive---2dquartertrunk,2dquarterliftgate,2dpickup,4dquartertrunk,4dquarterliftgate,4dslidingliftgate,4dpickup",
        ),
    )

    fun createCategoriesForExtraRepairs(extraRepairsList: List<String>): List<ExtraRepairCategory>{
        //Map the repairs to categories
        var extraRepairsSet = extraRepairsList.toSet()
        var categoryRepairMap = mutableMapOf<String,MutableList<String>>()
        for(repair in extraRepairsSet){
            val category: String? = Commands.extraRepairCategoriesMap[repair]
            category?.let {
                if(categoryRepairMap.containsKey(category)) {
                    //Get the current list for that category and add the repair to it, assign it back to the category
                    categoryRepairMap[category]?.add(repair)
                }else{
                    //Create the first category and list item
                    categoryRepairMap[category] = mutableListOf(repair)
                }
            }
        }

        var extraRepairCategories: MutableList<ExtraRepairCategory> = mutableListOf()
        var categories = categoryRepairMap.keys.toList()
        for(category in categories){
            val repairList = categoryRepairMap[category]
            extraRepairCategories.add(ExtraRepairCategory(category, repairList!!))
        }

        return extraRepairCategories
    }

    fun createDetectionRepairs(label: String): List<String> {
        var repairList = listOf<String>()
        if(label == "front bumper cover"){
            repairList = listOf(
                "Repair front bumper cover",
                "Overhaul front bumper",
                "Hazardous waste removal",
                "Flex additive"
            )
        }else if(label == "hood"){
            repairList = listOf(
                "Repair hood",
                "Hazardous waste removal",
            )
        }else if(label == "left headlamp" || label == "right headlamp"){
            var position = ""
            if(label.contains("left")) position = "left" else position = "right"
            repairList = listOf(
                "Replace $position headlamp",
                "R&I front bumper cover"
            )
        }else if(label == "left fender" || label == "right fender"){
            var position = ""
            if(label.contains("left")) position = "left" else position = "right"
            repairList = listOf(
                "Repair $position fender",
                "Replace $position fender liner",
                "Replace $position fender nameplate (if applicable)",
                "Replace $position fender emblem (if applicable)",
                "Replace $position front wheel opening molding (if applicable)",
                "Replace $position fender lower molding (if applicable)",
                "Hazardous waste removal",
            )
        }else if(label == "left front wheel" || label == "right front wheel" || label == "left rear wheel" || label == "right rear wheel"){
            var position = ""
            if(label.contains("left front")){
                position = "left front"
            }else if(label.contains("left rear")){
                position = "left rear"
            }else if(label.contains("right front")){
                position = "right front"
            }else if(label.contains("right rear")){
                position = "right rear"
            }
            repairList =listOf(
                "Repair $position wheel",
                "R&I $position TPMS sensor"
            )
        }else if(label == "left front door" || label == "right front door"){
            var position = ""
            if(label.contains("left")) position = "left" else position = "right"
            repairList = listOf(
                "Repair $position front door",
                "R&I $position front door handle",
                "R&I $position front door belt molding",
                "R&I $position front door nameplate (if applicable)",
                "R&I $position front door side molding (if applicable)",
                "R&I $position front door lower molding (if applicable)",
                "Hazardous waste removal",
            )
        }else if(label == "left rear door" || label == "right rear door"){
            var position = ""
            if(label.contains("left")) position = "left" else position = "right"
            repairList = listOf(
                "Repair $position rear door",
                "R&I $position rear door handle",
                "R&I $position rear door belt molding",
                "R&I $position rear door side molding (if applicable)",
                "R&I $position rear door lower molding (if applicable)",
                "R&I $position rear door wheel opening molding (if applicable)",
                "Hazardous waste removal",
            )
        }else if(label == "left quarter panel" || label == "right quarter panel"){
            var position = ""
            if(label.contains("left")) position = "left" else position = "right"
            repairList = listOf(
                "Repair $position quarter panel",
                "R&I $position quarter panel belt molding (if applicable)",
                "R&I quarter panel fuel door (if applicable)",
                "R&I $position quarter panel wheelhouse liner (if applicable)",
                "R&I $position quarter panel wheel opening molding (if applicable)",
                "Mask $position quarter panel glass (if applicable)",
                "Hazardous waste removal",
            )
        }else if(label == "trunk lid"){
            repairList = listOf(
                "Repair trunk lid",
                "R&I trunk lid emblem",
                "R&I trunk lid spoiler (if applicable)",
                "R&I trunk lid nameplate(s)",
                "R&I trunk lid license bracket (if applicable)",
                "Mask back glass",
                "Hazardous waste removal",
            )
        }else if(label == "lift gate"){
            repairList = listOf(
                "Repair lift gate",
                "R&I lift gate emblem",
                "R&I lift gate nameplate(s)",
                "R&I lift gate license bracket (if applicable)",
                "Mask lift gate glass",
                "Hazardous waste removal",
            )
        }else if(label == "left tail lamp" || label == "right tail lamp"){
            var position = ""
            if(label.contains("left")) position = "left" else position = "right"
            repairList = listOf(
                "Replace $position tail lamp"
            )
        }else if(label == "rear bumper cover"){
            repairList = listOf(
                "Repair rear bumper cover",
                "Overhaul rear bumper",
                "Hazardous waste removal",
                "Flex additive"
            )
        }
        return repairList
    }

}

/*
   private const val REPAIR_FRONT_BUMPER_COVER_ONE_HR = Action.RPR + Position.FT + Part.BUMPER_COVER + Labor.ONE_HR
   private const val REPAIR_FRONT_BUMPER_COVER_TWO_HR = Action.RPR + Position.FT + Part.BUMPER_COVER + Labor.TWO_HR
   private const val REPAIR_FRONT_BUMPER_COVER_THREE_HR = Action.RPR + Position.FT + Part.BUMPER_COVER + Labor.THREE_HR
   private const val REPAIR_FRONT_BUMPER_COVER_FOUR_HR = Action.RPR + Position.FT + Part.BUMPER_COVER + Labor.FOUR_HR
   private const val REPAIR_FRONT_BUMPER_COVER_FIVE_HR = Action.RPR + Position.FT + Part.BUMPER_COVER + Labor.FIVE_HR
   private const val REPAIR_FRONT_BUMPER_COVER_SIX_HR = Action.RPR + Position.FT + Part.BUMPER_COVER + Labor.SIX_HR
   private const val REPAIR_FRONT_BUMPER_COVER_SEVEN_HR = Action.RPR + Position.FT + Part.BUMPER_COVER + Labor.SEVEN_HR
   private const val REPAIR_FRONT_BUMPER_COVER_EIGHT_HR = Action.RPR + Position.FT + Part.BUMPER_COVER + Labor.EIGHT_HR
   private const val REPAIR_FRONT_BUMPER_COVER_NINE_HR = Action.RPR + Position.FT + Part.BUMPER_COVER + Labor.NINE_HR
   private const val REPAIR_FRONT_BUMPER_COVER_TEN_HR = Action.RPR + Position.FT + Part.BUMPER_COVER + Labor.TEN_HR

   private const val REPAIR_REAR_BUMPER_COVER_ONE_HR = Action.RPR + Position.RE + Part.BUMPER_COVER + Labor.ONE_HR
   private const val REPAIR_REAR_BUMPER_COVER_TWO_HR = Action.RPR + Position.RE + Part.BUMPER_COVER + Labor.TWO_HR
   private const val REPAIR_REAR_BUMPER_COVER_THREE_HR = Action.RPR + Position.RE + Part.BUMPER_COVER + Labor.THREE_HR
   private const val REPAIR_REAR_BUMPER_COVER_FOUR_HR = Action.RPR + Position.RE + Part.BUMPER_COVER + Labor.FOUR_HR
   private const val REPAIR_REAR_BUMPER_COVER_FIVE_HR = Action.RPR + Position.RE + Part.BUMPER_COVER + Labor.FIVE_HR
   private const val REPAIR_REAR_BUMPER_COVER_SIX_HR = Action.RPR + Position.RE + Part.BUMPER_COVER + Labor.SIX_HR
   private const val REPAIR_REAR_BUMPER_COVER_SEVEN_HR = Action.RPR + Position.RE + Part.BUMPER_COVER + Labor.SEVEN_HR
   private const val REPAIR_REAR_BUMPER_COVER_EIGHT_HR = Action.RPR + Position.RE + Part.BUMPER_COVER + Labor.EIGHT_HR
   private const val REPAIR_REAR_BUMPER_COVER_NINE_HR = Action.RPR + Position.RE + Part.BUMPER_COVER + Labor.NINE_HR
   private const val REPAIR_REAR_BUMPER_COVER_TEN_HR = Action.RPR + Position.RE + Part.BUMPER_COVER + Labor.TEN_HR

   */