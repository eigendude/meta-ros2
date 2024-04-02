# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Contains a set of tools that can be used from a hard     realtime thread, without breaking the realtime behavior."
AUTHOR = "Bence Magyar <bence.magyar.robotics@gmail.com>"
ROS_AUTHOR = "Stuart Glaser <sglaser@willowgarage.com>"
HOMEPAGE = "http://ros.org/wiki/realtime_tools"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "3-Clause BSD"
LICENSE = "3-Clause-BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=86277dc780fe4e3edb08cd487093d9de"

ROS_CN = "realtime_tools"
ROS_BPN = "realtime_tools"

ROS_BUILD_DEPENDS = " \
    rclcpp \
    rclcpp-action \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    rclcpp \
    rclcpp-action \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXEC_DEPENDS = " \
    rclcpp \
    rclcpp-action \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gmock \
    test-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/realtime_tools-release/archive/release/rolling/realtime_tools/2.5.0-3.tar.gz
ROS_BRANCH ?= "branch=release/rolling/realtime_tools"
SRC_URI = "git://github.com/ros2-gbp/realtime_tools-release;${ROS_BRANCH};protocol=https"
SRCREV = "9277466a13e057780f92f0e6801fc6ed485e2c44"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
