# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "ROS2 Control boradcaster for battery state sensors."
AUTHOR = "Jonas Otto <jonas.otto@ipa.fraunhofer.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "ros_battery_monitoring"
ROS_BPN = "battery_state_broadcaster"

ROS_BUILD_DEPENDS = " \
    controller-interface \
    pluginlib \
    realtime-tools \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    controller-interface \
    pluginlib \
    realtime-tools \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    controller-interface \
    pluginlib \
    realtime-tools \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ros_battery_monitoring-release/archive/release/iron/battery_state_broadcaster/1.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/iron/battery_state_broadcaster"
SRC_URI = "git://github.com/ros2-gbp/ros_battery_monitoring-release;${ROS_BRANCH};protocol=https"
SRCREV = "84969eb43c52abd50c01ef6a3ae1624e0a85bd65"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}