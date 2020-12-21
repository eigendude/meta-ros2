# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Heifu mavros interface"
AUTHOR = "João Pedro Carvalho <joao.m.carvalho@pdmfc.com>"
HOMEPAGE = "https://gitlab.pdmfc.com/drones/heifu/tree/master/heifu_simple_waypoint"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "heifu"
ROS_BPN = "heifu_simple_waypoint"

ROS_BUILD_DEPENDS = " \
    mavros \
    roscpp \
    roslib \
    sensor-msgs \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    mavros \
    roscpp \
    roslib \
    sensor-msgs \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    mavros \
    roscpp \
    roslib \
    sensor-msgs \
    std-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/amferreiraBEV/heifu-release/archive/release/melodic/heifu_simple_waypoint/0.7.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/heifu_simple_waypoint"
SRC_URI = "git://github.com/amferreiraBEV/heifu-release;${ROS_BRANCH};protocol=https"
SRCREV = "c3f625f01c6256a58cf5b9c8b6cceff02e4047d1"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
