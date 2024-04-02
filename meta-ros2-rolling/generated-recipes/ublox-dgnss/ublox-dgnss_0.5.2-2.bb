# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Provides a ublox_dgnss node for a u-blox GPS DGNSS receiver using Gen 9 UBX Protocol"
AUTHOR = "Nick Hortovanyi <nick@aussierobots.com>"
HOMEPAGE = "https://github.com/aussierobots/ublox_dgnss"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License, Version 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=e8978a5103d23266fc6f8ec03dc9eb16"

ROS_CN = "ublox_dgnss"
ROS_BPN = "ublox_dgnss"

ROS_BUILD_DEPENDS = " \
    ntrip-client-node \
    ublox-dgnss-node \
    ublox-nav-sat-fix-hp-node \
    ublox-ubx-interfaces \
    ublox-ubx-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ntrip-client-node \
    ublox-dgnss-node \
    ublox-nav-sat-fix-hp-node \
    ublox-ubx-interfaces \
    ublox-ubx-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ntrip-client-node \
    ublox-dgnss-node \
    ublox-nav-sat-fix-hp-node \
    ublox-ubx-interfaces \
    ublox-ubx-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ublox_dgnss-release/archive/release/rolling/ublox_dgnss/0.5.2-2.tar.gz
ROS_BRANCH ?= "branch=release/rolling/ublox_dgnss"
SRC_URI = "git://github.com/ros2-gbp/ublox_dgnss-release;${ROS_BRANCH};protocol=https"
SRCREV = "176c5f91a9a645e2c2e565a6f3d657f68603f2ec"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
